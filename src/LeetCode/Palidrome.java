package LeetCode;

public class Palidrome{
  public static void main(String[] args){
	
	String str = "abc";
	if(checkPalidrome(str)){
	   System.out.println(str + " is Palindrome");
	}else{
	 System.out.println(str + " is Not Palindrome");

	}
	  
}
public static boolean checkPalidrome(String str){
 
   int start = 0;
   int last = str.length()-1;
   
    while(start < last){
       if(str.charAt(start)!= str.charAt(last)){
	       return false;
	   }
	  start++;
	  last--;
    }
   
   return true;
}
}
