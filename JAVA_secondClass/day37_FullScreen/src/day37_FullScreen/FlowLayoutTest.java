package day37_FullScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest extends Frame{
	
	Label label1 = new Label("�ƴ� �׷��� ���ӱ� ?  ");
	Label label2 = new Label("df");
	Label label3 = new Label("�۾���");
	Label label4 = new Label("�ڳ���");
	
	public FlowLayoutTest() {
		setTitle("FlowLayoutTest");
		setBounds(1200, 300 , 600, 600);
		
		BorderLayout flow = new BorderLayout();
		//BorderLayout => ������ ������ ����. 
		setLayout(flow);
		
		label1.setBackground(Color.PINK);
		//��׶����
		label1.setForeground(Color.WHITE);
		//���ڻ�
		label1.setAlignment(Label.CENTER);
		//����
		
		Dimension d1 = new Dimension(this.getWidth(), 200);
		
		Font font = new Font("Serif", Font.BOLD, 30);
							//�۲�, ����, �ȼ�
		label1.setFont(font);
		
		label1.setPreferredSize(d1);
		
		add(label1, BorderLayout.SOUTH);
		//�Ұ� ���ϰ� ���̺��� ���̴� ����.
		
		//label1�� add�ϸ� �ٿ����ϱ� labe2�� ���� ��������
		
		label2.setBackground(Color.RED);
		label2.setForeground(Color.GREEN);
		label2.setAlignment(Label.CENTER);
		label2.setFont(new Font( "Monospaced", Font.ITALIC,20));
		label2.setPreferredSize(d1);
		
		add(label2, BorderLayout.NORTH);
	
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose ();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
	
}
;