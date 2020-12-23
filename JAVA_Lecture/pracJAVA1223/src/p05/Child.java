package p05;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable{
	public String field2;
	
	//�ڽİ�ü�� ����ȭ �� �� �ڵ�ȣ��� 
	private void writeObject (ObjectOutputStream out) throws Exception {
		out.writeUTF(field1);//�θ� ��ü�� �ʵ尪�� �����
		out.defaultWriteObject(); //�ڽ� ��ü�� �ʵ尪�� ����ȭ
	}
	//�ڵ�ȣ���
	private void readObject(ObjectInputStream in ) throws Exception {
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
