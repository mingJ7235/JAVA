package generic;
//Generic Method
public class GTest2 {
	
//	public static <T1, T2> T2 function (T1 data) {	//���׸��� �̷��� 2���ᵵ�ȴ�. T1, T2
//		T2 result;
//		if (data instanceof Integer) {
//			result = (T2) "����";
//		} else if (data instanceof Double || data instanceof Float) {
//			result = (T2) "�Ǽ�";
//		} else if (data instanceof Character) {
//			result = (T2) "����";
//		} else if (data instanceof String) {
//			result = (T2) "���ڿ�";
//		} else {
//			result = null;
//		}
//		return result;
//	}
	
	public static <T> T function (T data) {
		T result;
		if (data instanceof Integer) {
			result = (T) "����";
		} else if (data instanceof Double || data instanceof Float) {
			result = (T) "�Ǽ�";
		} else if (data instanceof Character) {
			result = (T) "����";
		} else if (data instanceof String) {
			result = (T) "���ڿ�";
		} else {
			result = null;
		}
		return result;
	}
	

	//���� : (T) "����" ...? �̰� ��� �Ǵ°ɱ�
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
