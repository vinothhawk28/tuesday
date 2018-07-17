package guviset2;
import java.util.*;
public class power {
public static void main(String[] args) {
	int a,b,c=1;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	for(int i=0;i<b;i++){
		a=a*c;
		c=a;		
	}	
System.out.println(a);
}
}
 
