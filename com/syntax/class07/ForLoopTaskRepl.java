package com.syntax.class07;

import java.util.Scanner;

public class ForLoopTaskRepl {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
 	    int x = inp.nextInt();
	    
	    //write code under on step 8
 	    for (int y = 0; y < x; y++ ) {
 	    	System.out.print(y + " ");
 	    }
	    
	  }
}

