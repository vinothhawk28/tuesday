package guviset2;
import java.util.*;
public class remvowel {
public static void main(String[] args) {
	int a;
	String b,k="",m="";
	char ch = 0;
	Scanner in=new Scanner (System.in);
	a=in.nextInt();
	b=in.next();
	if(b.length()==a){
	for(int i=a-1;i>=0;i--){
		ch=b.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		 k=k+ch;
		}
		else{
			m=String.valueOf(ch);
			System.out.print(m);}
}
}}}
