package phoneTask;
/*
 * Phone ������ ��� �ڵ����� ����ϴ� �������
 * Phone2G, Phone3G, Phone4G �� ����
 * User Ŭ�������� 3���� ���� ����غ���
 */
public interface Phone {
	void msg(String num, String text);
	void	call(String num);
	void useInternet();
}
