package guvi;
import java.util.*;
public class holiday {
public static void main(String[] args) {
	String a;
	Scanner in=new Scanner(System.in);
	a=in.next();
	char ch=a.charAt(0);
	if(ch=='s'||ch=='S'){
		System.out.println("yes");
	}
	else{
		System.out.println("No");
	}
}
}
