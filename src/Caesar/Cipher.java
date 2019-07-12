package Caesar;

import java.util.ArrayList;
import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);  
          System.out.print("Enter your string: ");  
          String org = in.nextLine();  
          System.out.println("Enter cipher:");
          String cipher = in.nextLine();
          int numc = Integer.parseInt(cipher);
//          if(numc > 25)
//          {
//        	  System.out.println("Too big cipher num");
//        	  return;s
//          }
          
       ArrayList <String> arr = new ArrayList<String>();
       arr.add("a");
       arr.add("b");
       arr.add("c");
       arr.add("d");
       arr.add("e");
       arr.add("f");
       arr.add("g");
       arr.add("h");
       arr.add("i");
       arr.add("j");
       arr.add("k");
       arr.add("l");
       arr.add("m");
       arr.add("n");
       arr.add("o");
       arr.add("p");
       arr.add("q");
       arr.add("r");
       arr.add("s");
       arr.add("t");
       arr.add("u");
       arr.add("v");
       arr.add("w");
       arr.add("x");
       arr.add("y");
       arr.add("z");

       ArrayList <String> bzz = new ArrayList <String>();
       for(int i =0; i<org.length();i++)
       {  
    	  if( i+numc >= arr.size())
    	  {
           arr.add("a");
           arr.add("b");
           arr.add("c");
           arr.add("d");
           arr.add("e");
           arr.add("f");
           arr.add("g");
           arr.add("h");
           arr.add("i");
           arr.add("j");
           arr.add("k");
           arr.add("l");
           arr.add("m");
           arr.add("n");
           arr.add("o");
           arr.add("p");
           arr.add("q");
           arr.add("r");
           arr.add("s");
           arr.add("t");
           arr.add("u");
           arr.add("v");
           arr.add("w");
           arr.add("x");
           arr.add("y");
           arr.add("z");
    	  }
    	   bzz.add(i,arr.get(i+numc-1));
       }
       String s ="";
       
       for(int i =0;i<org.length();i++)
       {
    	   s += bzz.get(i);
       }
       System.out.println("Shifted: "+s);
	}
	
	
}
