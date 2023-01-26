import java.util.Scanner;

class SampleThread extends Thread{
 String name;
 long time;  
 SampleThread (String n,long t){
   name=n;
   time=t;
}

public void run(){
 for(int i=0;i<5;i++){
  try{
      Thread.sleep(time);
      System.out.println(name);
    }

catch(InterruptedException e){
  System.out.println("Thread is interrupted");
}
}
System.out.println("Exiting Thread:"+name);
}
}

class MultithreadingDemo {
 public static void main(String []args){
  SampleThread s1=new SampleThread("BMS College of Engineering",10000);
  SampleThread s2=new SampleThread("CSE",2000);
  s1.start();
  s2.start();
}
  
}
