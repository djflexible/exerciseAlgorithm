package A_20160718;

public class T_test {

	public static void main(String[] args) {

		System.out.println("하하");
		
		int a=4;
		int b=2;
		int c=2;
		boolean d = false;
		boolean f = true;
		
		System.out.println(d==f);
		System.out.println((b==c));
		
		System.out.println((b==c)&&(a==b));
		
		
		System.out.println(true==(c==b));
		
	
		try {
			System.out.println("트라이1");
			int k = 0/0;
			System.out.println("트라이2");

		} catch (Exception e) {
			System.out.println("예외발생");
			
		}
		finally{
			System.out.println("퐈이널리");
			
		}
		
	}

}
