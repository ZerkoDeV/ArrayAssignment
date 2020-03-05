import java.util.*;
public class AnswerNumberEight {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int [5];
		for(int i = 0;i<a.length;i++){
		      System.out.println("Insert numbers["+i+"]: ");
		      a[i] = s.nextInt();
		    }
		int[] b = new int[a.length+1];
	    int highest = a[0];
	    int second_highest = a[0];
	    int j = 0;
	    for(int i=0;i<a.length;i++){
	      if(a[i]>highest){
	        highest = a[i];
	        j = i;
	      }
	    }
	    for(int i = 0;i<a.length;i++){
	      if(a[i]<highest && a[i]>second_highest){
	        second_highest = a[i];
	      }
	    }

	    for(int i = 0;i<j;i++){
	      b[i] = a[i];
	    }
	    b[j] = second_highest;
	    b[j+1] = highest-second_highest;
	    for(int i = j+2;i<b.length;i++){
	      b[i] = a[i-1];
	    }
	    for(int i = 0;i<b.length;i++){
	      System.out.print(b[i] + " ");
	    }
	    
}

}

