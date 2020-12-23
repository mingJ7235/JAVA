package p05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableEx {
	public static void main(String[] args) throws Exception{
		//����ȭ�ϱ�
		FileOutputStream fos = new FileOutputStream("c:/temp/nonObj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "�θ��̸�";
		child.field2 = "�ڽ��̸�";
		oos.writeObject(child);
		oos.flush();oos.close();fos.close();
		
		
		//������ȭ�ϱ�
		
		FileInputStream fis = new FileInputStream("c:/temp/nonObj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child child2 = (Child) ois.readObject();
		System.out.println(child2.field1);
		System.out.println(child2.field2);
				
	}
}
