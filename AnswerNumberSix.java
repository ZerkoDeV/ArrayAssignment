import java.util.*;

public class AnswerNumberSix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[5];
		
		for(int i = 0;i<a.length;i++){
		      System.out.println("Insert numbers["+i+"]: ");
		      a[i] = s.nextInt();
		    }
		var same = true;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != a[a.length-1-i]) {
				same = false;
				break;
			}
		}
		
		System.out.println(same ? "Number sequence is same when reversed" : "Number sequence is not same when reversed");

	}
}