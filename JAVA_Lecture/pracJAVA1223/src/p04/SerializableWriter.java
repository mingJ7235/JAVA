package p04;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//����ȭ �ϴ� �ڵ�
public class SerializableWriter {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/temp/Obj2.dat");//����Ʈ ��� ��Ʈ�� ���Ϸ� ���� �� ����.
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA ();
		classA.field1 = 1;
		classA.field2.field1 =2; //ClassB�� �ʵ忡 �� �ֱ�
		ClassA.field3 = 3;
		classA.field4 = 4;
		
		ClassC classC = new ClassC();
		classC.fieldC1 =100;
		classC.fieldC2 =200;
		
		oos.writeObject(classA);
		oos.flush();oos.close();fos.close();
		
	}
}
