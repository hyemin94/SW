package CodingEverday;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	public static void main(String[] args) throws IOException {
		
		// 클래스 : System, FileWriter, Math
		// 인스턴스 : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		// data.txt 에 내용을 저장하겠다는 상태
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello");
		f1.write("Java");
		f1.close();

		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello2");
		f2.write("Java2");
		f2.close();
	}

}
