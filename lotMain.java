package lottery;

public class lotMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Numbers lot = new Numbers();
		int[] numbers3= Numbers.Numbers3();
		int[] numbers4= Numbers.Numbers4();
		Numbers.printNumbers(numbers3);
		Numbers.printNumbers(numbers4);

		/* Numbers lot = new Numbers();

		 Numbers3 = lot.numbers3();
		 //Numbers4 =lot.numbers4();

		 lot.showResult(Numbers3);*/
	}

}
