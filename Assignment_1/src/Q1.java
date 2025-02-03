public class Q1 {

	public static void main(String[] args) {
		//int a= Integer.parseInt(args[40]);
		int a=40;
		System.out.println("the number is "+a);
		int count =0;
		while(a>2) {
			a/=2;
			count++;
		}
		System.out.println("the number of times is divided by 2 is  "+count);
		
	}

}
