/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main{
	
	
	 public static boolean isPrime(int num){
	        
	        if(num==0||num==1)
	            return false;
	           
	        for(int i=2;i<=num/2;i++){
	            if(num%i==0)
	                return false;
	        }
	        
	        return true;
	    }
	
	 
	public static long solve(long a[],long b[],long n) {
		
		long ans=0,p=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]>=a[j]||b[i]>b[j])
					p++;
				else
					break;
			}
			
			if(p>=n)
				ans++;
			p=0;
		}
		
		return ans;
	        
	 }
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0) {
			
       long n=sc.nextLong();
       long a[]=new  long[(int) n];
       long b[]=new long[(int)n];
       
       
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextLong();
       }
       
       for(int i=0;i<n;i++) {
    	   b[i]=sc.nextLong();
       }
       
       System.out.println(solve(a,b,n));
   }
		
	}

}
	
