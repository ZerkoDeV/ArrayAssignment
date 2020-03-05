import java.util.Scanner;
import java.util.Arrays;

public class AnswerNumberSeven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] newdata = new int[10];
		int[] one = new int[5];
		int[] two = new int[5];
		var count = 1;
		
		for(int i = 0;i<newdata.length;i++){
		      System.out.println("Insert numbers["+i+"]: ");
		      newdata[i] = s.nextInt();
		    }
		one = Arrays.copyOfRange(newdata, 0, 5);
		two = Arrays.copyOfRange(newdata, 5, 10);
		
		System.out.println("The first array " + Arrays.toString(one));
        System.out.println("The second array " + Arrays.toString(two));
	}
	
	

}
