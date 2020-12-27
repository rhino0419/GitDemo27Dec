package coreJava;

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="rahul";
		String b="";
		//dhnivara
		for(int i =a.length()-1;i>=0;i--) {
			 b=b+ a.charAt(i);
			 
			 
		}
		 System.out.println(b);
		 if(a.equals(b)) {
			 System.out.println("palindrome");
		 }
		 
	}

}
