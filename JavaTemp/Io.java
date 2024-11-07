import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io {
    public static void main(String args[]){
    //    int i =  System.in.read();
    //    System.out.println((char)i);
   try{    
            //  FileOutputStream fout=new FileOutputStream("D:\\Temp.txt");    
            //  fout.write(97);    
            //  fout.close();    
            //  System.out.println("success...");    

            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome ";    
     byte b[]=s.getBytes();    
     bout.write(b);    
    //  bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    

            }catch(Exception e){System.out.println(e);}    
      }    

    
    }

