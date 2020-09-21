package Generic;

public class Powder extends Meterial{
	public String toString() {
		return "재료는 powder 입니다.";
	}
	
	@Override
	public void doPriting() {
		System.out.println("powder 프린팅 합니다.");
		
	}

}
