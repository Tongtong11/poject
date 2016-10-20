/* Tongtong Tang
 midexam
 */
import java.util.*;
import java.io.*;
public class test{
    public staticvoid main(String[] args){
        File f = new File(args[0]);
        try{
            Scanner in = new Scanner(f);
            while(it.hasNext()){
                String s = (in.nextLine());
                if(s.equals(reverse)){
                    System.out.println(s+"is a palindrome");
                else
                    System.out.println(s+"is not a palindrome, reversed"+ reverse);
                
              }
            }
            in.close();
         }
        catch(IoException e){
            
        }
    }
    public static String reverse(String s){
        if(s.length() <= 1)
            return s;
        else
            return(S.charAt(s.length()-1)+reverse(s.substring(0, s.length)));
        
    }
}