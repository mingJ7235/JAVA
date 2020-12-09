package sec02.stream_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentEx {
	public static void main(String[] args) throws IOException{
		//�������Ͼȿ� �ִ� ���κ��� ó���ϴ� ��Ʈ��
		Path path = Paths.get("src/sec02/stream_kind/linedata.txt");
		Stream <String> stream; //���ڿ��̹Ƿ� String
		
		//1. Files.lines() �̿�
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out :: println); //�޼ҵ� ������
//		stream.forEach(s -> System.out.println(s)); //���ٽ� �̿��
		stream.close();
		System.out.println();
		
		//2. BufferedReader�� lines() �̿�
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		//���ڸ� ������ ����ϴ� ��Ʈ�� : FileReader
		BufferedReader br = new BufferedReader(fileReader); //�ӵ������ ���� bufferedreader���
		stream = br.lines();
		stream.forEach(System.out :: println);
		stream.close();
	}
}
