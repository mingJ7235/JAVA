package sec05.exam01_state;

public class ThreadStateEx {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
		
		/* Ÿ�� ������ ���� : NEW
		  	Ÿ�� ������ ���� : RUNNABLE //targetThread�� 10��� �ݺ���
			Ÿ�� ������ ���� : TIMED_WAITING //���⼭ 1.5�ʵ��� time sleep
			Ÿ�� ������ ���� : TIMED_WAITING
			Ÿ�� ������ ���� : TIMED_WAITING
			Ÿ�� ������ ���� : RUNNABLE // timep sleep�� �ٽ� 10��� �ݺ�
			Ÿ�� ������ ���� : TERMINATED
			*/
	}
}
