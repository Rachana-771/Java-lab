import java.util.*;
import java.io.*;
class Box{
double width;
double height;
double depth;
}
class BoxDemo{
public static void main(String []args){
Box mybox=new Box();
mybox.width=10;
mybox.height=20;
mybox.depth=30;
double v=mybox.width*mybox.height*mybox.depth;
System.out.println("Volume="+v);
}
}
