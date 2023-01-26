import java.io.*;
import java.util.*;


class fatherAgeException extends Exception{
 int a;
 fatherAgeException(int age){
   a=age;
}
 public String toString(){
  
   return ("Father's age is less than 0");
 
}
}


class sonAgeException extends Exception{
	int a;
	sonAgeException(int age){
		a=age;
	}
	public String toString(){
		if(a<0)
			return ("Son's age is less than 0");
		else
			return ("Son's age is more than father's age");
	}
}


class Father{
 Scanner s=new Scanner(System.in);
 int agef;
 Father()
{
  System.out.print("Enter Father's age: ");
  agef=s.nextInt();
}
 
void exf() throws fatherAgeException{

  if (agef<=0)
  throw new fatherAgeException(agef);

}
}
class Son extends Father{
	int ages;
	Son(){
		System.out.print("Enter son's age: ");
		ages=s.nextInt();
	}
	void exs() throws sonAgeException{
		if(ages<0 || ages>super.agef)
			throw new sonAgeException(ages);
	}
}


class WrongAgeException{
 public static void main(String []args){
  Son s=new Son(); 
  try{
   s.exf();
  }
 catch(fatherAgeException e){
   System.out.println();
   System.out.println(e);
 }

 

  try{
   s.exs();
  }
  catch(sonAgeException e){
   System.out.println();
   System.out.println(e);
 }
}
}
 

 
   