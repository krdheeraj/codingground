import java.text.SimpleDateFormat;
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       String date="23:31";
       int strlen=date.length();
       System.out.println(strlen);
       SimpleDateFormat ft=new SimpleDateFormat("hh:mm");
       SimpleDateFormat ft1=new SimpleDateFormat("mm");
       
       try{
           
           String upmin;
           String uphr;
           if(strlen == 5){
           String min=date.substring(3);
           String hr=date.substring(0,2);
           Date time=ft.parse(date);
           Date min1=ft1.parse(min);
           System.out.println("hr:"+hr);
           System.out.println("min :"+ft1.format(min1));
           System.out.println("..............."+ft.format(time));
           int rehr=Integer.parseInt(hr);
           int remin=Integer.parseInt(min);
           if(remin>=0 && remin<=25){
                upmin="00";
                uphr=hr.concat(":").concat(upmin);
               System.out.println(uphr);
           }
           else if(remin>=26 && remin<=55){
               upmin="30";
               uphr=hr.concat(":").concat(upmin);
               System.out.println(uphr);
           }
           else if(remin>=56 && remin<=59){       
               int uprehr=rehr+1;
               upmin="00";
               String uprehr1=String.valueOf(uprehr);
               uphr=uprehr1.concat(":").concat(upmin);
            System.out.println(uphr);
       }
       }
       else if(strlen==4){
           String min=date.substring(2);
           String hr=date.substring(0,1);
           Date time=ft.parse(date);
           Date min1=ft1.parse(min);
           System.out.println("hr:"+hr);
           System.out.println("min :"+ft1.format(min1));
           System.out.println("..............."+ft.format(time));
           int rehr=Integer.parseInt(hr);
           int remin=Integer.parseInt(min);
           if(remin>=0 && remin<=25){
                upmin="00";
                uphr=hr.concat(":").concat(upmin);
               System.out.println(uphr);
           }
           else if(remin>=26 && remin<=55){
               upmin="30";
               uphr=hr.concat(":").concat(upmin);
               System.out.println(uphr);
           }
           else if(remin>=56 && remin<=59){       
               int uprehr=rehr+1;
               upmin="00";
               String uprehr1=String.valueOf(uprehr);
               uphr=uprehr1.concat(":").concat(upmin);
            System.out.println(uphr);
       }
       }
       }
       catch(Exception e){
           
       }
     }
}
