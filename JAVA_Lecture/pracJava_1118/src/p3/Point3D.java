package p3;

public class Point3D extends Point{
	int z;
	
	@Override	 //@ ������̼� -> �Ʒ� �޼ҵ忡 ���� ������ �ִ� ����
	String getLocation ()throws Exception {
		return "x = " + x + " y = " + y + " z =" + z;
	}
	
	@Override
	public String toString() {
		return "�̰��� �ڽ� point3d �κ��Դϴ�.";
	}
	
//	String superGetLocation() {
//		return super.getLocation();
	}
	
//}