package p04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//������ȭ
public class SerializableReader {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/obj2.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		ClassA v = (ClassA) ois.readObject();
//		System.out.println("field1 : " + v.field1);
//		System.out.println("field2.field1 : " + v.field2.field1);
//		System.out.println("field3 : " + v.field3); //static�� ����ȭ�� ���� ����
//		System.out.println("field4 : " + v.field4); //transient�� ����ȭ�� �ȴ�
		
		ClassC v = (ClassC) ois.readObject();
		System.out.println("field1 : " + v.fieldC1);
		System.out.println("field2 : " + v.fieldC2);
		
	}
}
