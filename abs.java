import java.io.*;
class abc
{
public static void main(String args[])
throws Exception{
  FileReader r = new FileReader("xyz.txt"); 
  int i; 
    while ((i=r.read()) != -1) 
    {
      System.out.print((char) i);
    }
    System.out.println("\n");
  File f  = new File("abc.txt");
  String path= f.getAbsolutePath();
  System.out.print(path);	
}	
}