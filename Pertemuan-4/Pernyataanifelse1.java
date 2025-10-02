import java.io.*;
public class Pernyataanifelse1{
    @SuppressWarnings("deprecation")
 public static void main(String args[]){
 BufferedReader dataIn = new BufferedReader(new
InputStreamReader(System.in));
 String gradestring = "";
 Byte grade = 0;

 System.out.print("Ketik nilai Anda : ");
 try{
 gradestring = dataIn.readLine();
 }
 catch( IOException e ){
 System.out.println("Ada kesalahan !");
 }
 grade = new Byte (gradestring);

 if ( grade >= 80 ) System.out.println("Selamat Anda Lulus!");
 else System.out.println("Maaf Anda Belum Lulus!");
 }
} 
