import java.util.*;

public class AnswerNumberTwo {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		
	    for(int i = 0;i<a.length;i++){
	      System.out.println("Insert numbers ["+i+"]");
	      int nomor = s.nextInt();
	      a[i] = nomor;
	      

	    }
	    
	    System.out.print("Enter a new number to check: ");
	    int nomor = s.nextInt();
	    int counter = 0;
	    for(int i= 0; i<10; i++) {
	    	if(nomor == a[i]) {
	    		counter +=1;
	    	}
	    }
	    
	    
	    
	    	if(counter > 0) {
	    		System.out.println("The number u just entered is present.");
	    		
	    	}
	    	else {
	    		System.out.println("The number u entered is not inside the array.");
	    		
	    	}
	    
	   

	}
}