import java.util.*;

public class AnswerNumberOne {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int[] m = new int[10];
	    for(int i = 0;i<m.length;i++){
	      System.out.println("Print the value of m["+i+"]: ");
	      m[i] = s.nextInt();
	    }
	    for(int i = 0;i<m.length;i++){
	      System.out.println("The value of m["+i+"] is "+m[i]);
	    }
	  }
	

}


