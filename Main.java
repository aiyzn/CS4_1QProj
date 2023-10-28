package pkg1qproj;

import java.util.*;
public class Main {


    public static void main(String[] args) {
        System.out.println("Instructions: Input C if the angle is complementary and S if the angle is supplementary.");
        System.out.println("Complementary: x°+y°=90°");
        System.out.println("Supplementary: x°+y°=180°");
        System.out.println();
        
        //Scanner cons=new Scanner(System.in);
        //String ans = cons.nextLine();
        int x;
        int y;
        
        do{
        Double m = Math.random();
        Double n = Math.random();
        x =(int)(n*91);
        y =(int)(m*91); 
        }while(x+y!=90);
        
        System.out.println("What is the angle if x = " + x + "° and if y = " + y + "°");
        System.out.println();
        
        //if(ans==C){
       // }
        
         
        do{
        Double m = Math.random();
        Double n = Math.random();
        x =(int)(n*181);
        y =(int)(m*181); 
        }while(x+y!=180);
        
        System.out.println("What is the angle if x = " + x + "° and if y = " + y + "°");
        
        
    }
    
}
