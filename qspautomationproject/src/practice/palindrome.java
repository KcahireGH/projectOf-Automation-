package practice;

public class palindrome {
public static void main(String[] args) {

	String s = "nayak";
	String rev = "";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("the String is palindrome");
	}
	else
	{
		System.out.println("the string is not palindrome");
	}
}
}
