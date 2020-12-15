package lottery;
import java.util.Random;
public class Numbers {


	   static int[] Numbers3() {

		int[]numbers3;
		numbers3 = new int[3];
		for(int i =0;i<numbers3.length;i++) {
			Random rand = new Random();
			numbers3[i] = rand.nextInt(3);

		}
		return numbers;

	  }
	   static int[] Numbers4() {
	   int[]numbers4;
		numbers4 = new int[4];
		for(int i =0;i<numbers4.length;i++) {
			Random rand = new Random();
			numbers4[i] = rand.nextInt();

		}
		return numbers;

	   }
	   static void printNumbers(int []numbers) {
		   System.out.println("今回の当選番号は");
		   for(int i =0;i<numbers.length;i++) {
		   System.out.print(+numbers[i]);
		   }
		   System.out.println("\n");
	   }
	   }

