package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		String data = "�ȳ� �ڹ� ���α׷�";
		
		writer.write(data, 3,2);
		writer.flush();
		writer.close();
	}
}
