import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int str1,temp = 1,temp2 = 0;
		
		Scanner scan = new Scanner(System.in);
        
	       System.out.print("Enter 1st String : ");
	       str1 = scan.nextInt();
	       
	       for(int i =0; i<str1;i++) {
	    	   
	    	
	    	  temp2 = str1-1;
	    	  temp =  temp*str1*temp2;
	    	  str1 = temp2-1;
	    	  
	       }
	       System.out.println(temp);
	}

}
