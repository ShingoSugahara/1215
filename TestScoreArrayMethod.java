package enshu7;
import java.util.Random;
public class TestScoreArrayMethod {


	public static int[] randomSelect(int num) {
		int[] randScores =new int[num];
		Random rand = new Random();
		for(int i = 0;i<randScores.length;i++) {
		randScores[i] = rand.nextInt(101);
		}
		return randScores;
	}

	public static int scoresSum(int []scores) {
		int sum = 0;
		for(int i = 0;i<scores.length;i++) {

		sum += scores[i];
		}
			return sum;
	}

	public static double scoresAve(int sum,int num) {
		double ave = 0;
		ave = (double)sum/num;
		return ave;
	}
	public static void print(int []scores,int sum,double ave,int max) {
		for(int i=0;i<scores.length;i++) {
		System.out.println(i+1+"番目の点数は"+scores[i]);
		}
		System.out.println("合計は"+sum);
		System.out.printf("平均は%.1f\n",ave);
		System.out.println("最高点は"+max+"です");
	}

	public static int maxScores(int[]scores) {
		int max =0;
		for(int i = 0;i<scores.length;i++) {
		if (max<scores[i]) {
			max = scores[i];
		}
		}
		return max;

	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 5; //配列個数
		int[] scores = new int[num];
		int sum = 0;
		double ave =0;
		int max =0;

		scores = randomSelect(num);//5要素の配列に乱数で点数を入れる。
		sum =scoresSum(scores);//5教科のテストの点数を足した合計を求める。
		ave =scoresAve(sum,num);//5教科のテストの平均を求める。
		max =maxScores(scores);//②最高点を求める機能追加
		print(scores,sum,ave,max);//5それぞれの点数と合計、平均を出力する。

	}

}
