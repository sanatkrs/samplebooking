import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class anagram
{
    @SuppressWarnings("deprecation")
	public static void main(String[] input) throws IOException
    {
        String str1, str2 = null;
        int str1Length; 
        int str2Length, Charfound, Charnot_found=0;
        int strLength;
        Scanner scan = new Scanner(System.in);
        
      //  System.out.print("Enter 1st String : ");
      //  str1 = scan.nextLine();
      //  System.out.print("Enter 2nd String : ");
      //  str2 = scan.nextLine();
        DataInputStream in = new DataInputStream(System.in); 
        str1 = in.readUTF();
       
        str1 = in.readLine();
        str1 = in.readLine();
        
        
        str1Length = str1.length();
        str2Length = str2.length();
		
        if(str1Length == str2Length)
        {
        	strLength = str1Length;
        	
            for(int i=0; i<strLength; i++)
            {
            	Charfound = 0;
                for(int j=0; j<strLength; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                    	Charfound = 1;
                        break;
                    }
                }
                if(Charfound == 0)
                {
                	Charnot_found = 1;
                    break;
                }
            }
            if(Charnot_found == 1)
            {
                System.out.print("0");
            }
            else
            {
                System.out.print("1");
            }
        }
        else
        {
            System.out.print("0");
        }
    }
}