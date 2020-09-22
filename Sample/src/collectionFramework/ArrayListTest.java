package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		String[] name = { "kim", "lee", "park", "jung", "oh" };
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("1 : " + lname);
		lname.add("ha");
		System.out.println("2 : " + lname);
		lname.set(0, "김");
		lname.add(3, "곽");
		System.out.println("3 : " + lname);
		Collections.shuffle(lname); // 리스트를 무작위로 재배열
		System.out.println("4 : " + lname);
		Collections.sort(lname);
		System.out.println("5 : " + lname);
		System.out.println("5번째 값 : " + lname.get(4));
		Collections.fill(lname, "p");
		System.out.println("모든 요소를 p으로 변경 값 : " + lname);
	}

}
