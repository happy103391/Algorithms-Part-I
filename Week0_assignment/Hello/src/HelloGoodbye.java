//import java.util.Scanner;

public class HelloGoodbye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//        String name1 = scanner.next();
//        String name2 = scanner.next();
//
//		System.out.println("Hello " + name1 + " and " + name2 + ".");
//		System.out.println("Goodbye " + name2 + " and " + name1 + ".");
		
		 System.out.print( "Hello " );
		 // 在終端機內可以直接讀取字串
		 // commend line：java HelloGoodbye Kevin Bob
		 System.out.print(args[0]);
		 System.out.print(" and " );
		 System.out.println(args[1] + ".");
		 System.out.print("Goodbye ");
		 System.out.print(args[1]);
		 System.out.print(" and ");
		 System.out.println(args[0] + "." );
		 
	}

}
