package p04;

import java.io.Serializable;
//����ȭ �Ϸ��� Ŭ���� �����ϱ� -> Serializable�� implements�ؾ��Ѵ�.  
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4; 
}
