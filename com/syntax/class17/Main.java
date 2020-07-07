package com.syntax.class17;

public class Main {
		  public static void main(String[] args) {
		    Main obj = new Main();
		    int y = obj.sumEvenToX(5);
		    System.out.println(y);
		  }
		  
		  int sumEvenToX (int x){
			  int sum = 0;
		    for (int i = 1; i<=x; i++) {
		      
		      if (i % 2 == 0) {
		      sum+=i;
		      }
		    }
		    return sum;
		  }
		}



