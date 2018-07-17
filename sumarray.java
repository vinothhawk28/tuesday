package guviset2;
import java.util.*;
public class sumofarray {
public static void main(String[] args) {
	int a;
	int sum=0,n=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	while(a!=0)
	{
		n=a%10;
		sum=sum+(n*n);
		a=a/10;		
	}
	System.out.println(sum);
}
}
