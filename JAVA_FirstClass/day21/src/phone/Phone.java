package phone;

/*
 * Phone �������̽�(�߻�Ŭ����) ������ ��� �ڵ����� ����ϴ� ��� ����
 * Phone2G, Phone3G, Phone4G�� �����Ѵ�.
 * User Ŭ�������� 3���� ���� ����غ���
 */
public interface Phone {
	void msg (String tMsg, String telNum);
	void call (String telNum);
	void useInternet();


}
