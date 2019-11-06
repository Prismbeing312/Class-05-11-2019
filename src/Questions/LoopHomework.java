package Questions;

import java.util.Arrays;
import java.util.Random;

public class LoopHomework {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if((i % 7 == 0) || (i % 10 == 7) ) {
				System.out.println("Booom!");
			}
			else {
				System.out.println(i);
			}
		}
		
		
		//Q9Homework
		//		Random rand = new Random();
//		int index = rand.nextInt(9)+1;
//        int fib[] = new int[index]; 
//		fib[0] = 1;
//		fib[1] = 1;
//		for (int i = 2; i < fib.length; i++) {
//			fib[i] = fib[i-1] + fib[i-2];
//		}
//		System.out.println(index );
//		System.out.println(Arrays.toString(fib));
		
		//Q8Homework
		//		Random rand = new Random();
//		int index = rand.nextInt(9)+1;
//		int fb1 = 1;
//		int fb2 = 1;
//		for (int i = 3; i <= index; i++) {
//			fb2 += fb1;
//			fb1 = fb2-fb1;
//		}
//		System.out.printf("The fibonacchi is pos %d is %d",index , fb2);
		
		
		//Q7Homework
		//		Random rand = new Random();
//        int num = rand.nextInt(9)+1;
//        System.out.println(num);
//		int sum = 1;
//		for (int i = 1; i <= num; i++) {
//			sum *= i;
//		}
//		System.out.println(sum);
//		
		
		
		//Q6Homework
		//		 Random rand = new Random();
//		 int num = rand.nextInt(100000);
//		 int newNum = 0;
//		 int temp = num;
//		 while(temp != 0) {
//			 newNum = newNum*10 + temp%10;
//			 temp /= 10;
//		 }
//		 if(newNum == num) {
//			 System.out.println("Palindium " +num+" "+newNum);
//		 }
//		 else {
//			 System.out.println("Nothing " +num+" "+newNum);
//		 }
//		
//		
		
		//Q5Homework
		//		 Random rand = new Random();
//		 int num = rand.nextInt(10000);
//		 int counter = 0;
//		 int temp = num;
//		 while(temp != 0) {
//			 counter++;
//			 temp /=10;
//		 }
//		 System.out.println(num);
//		 System.out.println("Number of dig is "+counter);
//		 //Left dig
//		 temp = num;
//		 int firstDig = 0;
//		 int sum = 0;
//		 while(temp != 0) {
//			 firstDig = temp%10;
//			 sum += firstDig;
//			 temp /=10;
//		 }
//		 System.out.println("Left dig is "+firstDig);
//		 System.out.println("Sum is "+sum);
//		 int newNum = 0;
//		 temp = num;
//		 while(temp != 0) {
//			newNum = newNum*10 + temp%10;
//			temp /=10;
//		 }
//		 System.out.println("new num is "+newNum);

	}

}
