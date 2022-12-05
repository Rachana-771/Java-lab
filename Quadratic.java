import java.io.*;
import java.util.*;

class Quadratic{
 public static void main(String []args){
 	double r1,r2;
 	Scanner q=new Scanner(System.in);
 	System.out.println("Enter the co-efficients of quadratic equation");
	System.out.println("Enter a:");
	int a=q.nextInt();
	System.out.println("Enter b:");
	int b=q.nextInt();
	System.out.println("Enter c:");
	int c=q.nextInt();
	if(a==0){
	System.out.println("Enter valid inputs");
	}
	double d=Math.pow(b,2)-(4*a*c);
	if(d>0)
	{
	  r1=(-b+Math.sqrt(d))/(2*a);
	  r2=(-b-Math.sqrt(d))/(2*a);
	  System.out.println("Roots r1 and r2 are:"+r1+" "+r2);
	}
	else if(d==0)
	{
	  r1=r2=-b/(2*a);
	  System.out.println("Roots r1 and r2 are:"+r1+" "+r2);
	}
	else
	{
	
	  System.out.println("Roots are imaginary");
	}

	
}
}


	 