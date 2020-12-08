package sec06.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList <Message> ();
		//LinkedList�� Queue�� �����ϰ�����
		
		messageQueue.offer(new Message("send Mail", "ȫ�浿"));
		messageQueue.offer(new Message("send SMS", "�ſ��"));
		messageQueue.offer(new Message("send Kakaotalk", "ȫ�β�"));
		
		while (!messageQueue.isEmpty() ) {
			Message message = messageQueue.poll(); //�޼��� �������� ť���� ����
			switch (message.command) {
			case "send Mail" : 
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "send SMS" :
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "send Kakaotalk" :
				System.out.println(message.to + "�Կ��� ī���� �����ϴ�.");
				break;
			}
		}
	}
}
