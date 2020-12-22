package p03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		Student [] strArr = {
				new Student("���ڹ�", true, 1, 1, 300), 
				new Student("������", false, 1, 1, 250), 
				new Student("���ڹ�", true, 1, 1, 200), 
				new Student("������", false, 1, 2, 150), 
				new Student("���ڹ�", true, 1, 2, 100), 
				new Student("������", false, 1, 2, 50), 
				new Student("Ȳ����", false, 1, 3, 100), 
				new Student("������", false, 1, 3, 150), 
				new Student("���ڹ�", true, 1, 3, 200), 
				
				new Student("���ڹ�", true, 2, 1, 300), 
				new Student("������", false, 2, 1, 250), 
				new Student("���ڹ�", true, 2, 1, 200), 
				new Student("������", false, 2, 2, 150), 
				new Student("���ڹ�", true, 2, 2, 100), 
				new Student("������", false, 2, 2, 50), 
				new Student("Ȳ����", false, 2, 3, 100), 
				new Student("������", false, 2, 3, 150), 
				new Student("���ڹ�", true, 2, 3, 200) 
		};
		
		System.out.println("1. �ܼ��� �׷�ȭ (�ݺ��� �׷�ȭ)");
		
		Map<Integer, List<Student>> stuByBan = Arrays.stream(strArr)
				.collect(Collectors.groupingBy(Student::getBan));
		
		for(List<Student> ban : stuByBan.values()) {
			for (Student s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.println("2.�������� �׷�ȭ - ���� : ������ 200�̻��̸� HIGH, 100���̻� MID, �̿� LOW");
		
		Map<Student.Level, List<Student>> stuByLevel = Stream.of(strArr)
				.collect(Collectors.groupingBy(s->{
					if(s.getScore() >=200) return Student.Level.HIGH;
					else if (s.getScore() >= 100 ) return Student.Level.MID;
					else return Student.Level.LOW;
				}));
		
		TreeSet <Student.Level> keySet = new TreeSet<> (stuByLevel.keySet());
	
		for(Student.Level key : keySet) {
			System.out.println("[ " + key + " ]");
			for (Student s : stuByLevel.get(key)) {
				System.out.println(s);
			}
		}
		
		System.out.println("3.�ܼ��� �׷�ȭ + ��� (������ �л���)");
		Map<Student.Level, Long> stuCntByLevel = Stream.of(strArr)
				.collect(Collectors.groupingBy(s-> {
					if(s.getScore() >=200) return Student.Level.HIGH;
					else if (s.getScore () >= 100) return Student.Level.MID;
					else return Student.Level.LOW;
				}, Collectors.counting()
				));
		for(Student.Level key : stuCntByLevel.keySet()) {
			System.out.println(" " + key + " " + stuCntByLevel.get(key) + " ��");
		}
		
		System.out.println("4. ���� �׷�ȭ + ��� (�г⺰, �ݺ�)");
		Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan =
				Stream.of(strArr)
				.collect(Collectors.groupingBy(Student::getHak,
							Collectors.groupingBy(Student::getBan)					
						));
		
		for (  Map<Integer, List<Student>> hak : stuByHakAndBan.values() ) {
			for ( List <Student> ban : hak.values() ) {
				System.out.println();
				for (Student s : ban) {
					System.out.println(s);
				}
			}
		}
		
		System.out.println("5. ���� �׷�ȭ + ��� (�г⺰, �ݺ� 1��");
		
		Map<Integer, Map<Integer, Student>> topStuByHakAndBan =
				Stream.of(strArr)
				.collect(Collectors.groupingBy(Student :: getHak,
						Collectors.groupingBy(Student :: getBan,
								Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student :: getScore)), 
										Optional :: get))
						));
		for(Map<Integer, Student> ban : topStuByHakAndBan.values()) {
			for(Student s : ban.values()) {
				System.out.println(s);
			}
		}
		
		System.out.printf("%n6. ���߱׷�ȭ + ���(�г⺰, �ݺ� �����׷�)%n");
		Map<String, Set<Student.Level>> stuByScoreGroup = 
				Stream.of(strArr)
				.collect(Collectors.groupingBy(s -> s.getHak()+"-"+s.getBan(),
						Collectors.mapping(s -> {
							if(s.getScore() >= 200) return Student.Level.HIGH;
							else if (s.getScore() >= 100) return Student.Level.MID;
							else return Student.Level.LOW;
						}, Collectors.toSet())
						));

		for(String key : stuByScoreGroup.keySet()) {
			System.out.println("["+key+"]"+stuByScoreGroup.get(key));
		}
		
		
		
	}
}
class Student {
	private String name;
	private boolean isMale;
	private int hak;
	private int ban;
	private int score;

	public Student(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("[ %s, %s %d�г� %d��, %3d�� ]", name, isMale ? "��" : "��", hak, ban, score);
	}
	
	enum Level{
		HIGH, MID, LOW
	}
}
