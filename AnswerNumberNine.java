import java.util.Scanner;

public class AnswerNumberNine {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int[] a = new int [5];
			for(int i = 0;i<a.length;i++){
			      System.out.println("Insert numbers["+i+"]: ");
			      a[i] = s.nextInt();
			    }
		    int t = a[4];
		    for(int i = 4; i>=1; i--)
		    {
		        a[i]=a[i-1];
		    }
		    a[0]=t;
		    for(int i = 0; i<=4; i++)
		    {
		        System.out.print(a[i] + " ");
		    }

	}

}
