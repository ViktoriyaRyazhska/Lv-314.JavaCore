package t1;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class App {

	static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("¬ведте три числа");
	   float a = Float.parseFloat(br.readLine());
	   float b = Float.parseFloat(br.readLine());
	   float c = Float.parseFloat(br.readLine());
       
	   
		   if ((a<5&&a>-5)&&(b<5&&b>-5)&&(c<5&&c>-5)) {
			   System.out.println("„исла в диапазоне от 5 до -5");
		   }
		   else{
			   System.out.println("„исла не в диапазоне от 5 до -5");
			   }
		  
		   int d = Integer.parseInt(br.readLine());
		   int f = Integer.parseInt(br.readLine());
		   int e = Integer.parseInt(br.readLine());
		   int [] num = {d,e,f};
		   int max = num [0];
		   for (int i = 0;i < num.length-1;i++ ) {
             if (max < num[i]) {
            	 max = num[i];
             }
             int min = num [2];
      		 for (int u = 0;u < num.length-1;u++ ) {	 
				   if (min > num[u]) {
					   min = num[u];
					   
				   }
				   System.out.println("enter code");
			int code = Integer.parseInt(br.readLine());
			   System.out.println(Eror.WhatError(code));

			
				  
			   
			   }
		   }
		    
		    
	}
}
