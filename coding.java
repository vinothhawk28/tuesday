package guviset2;
import java.util.*;
public class arrayset {
public static void main(String[] args) {
	int a;
	int c=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	int d[]=new int[a];
	for(int i=0;i<a;i++){
		d[i]=in.nextInt();
	}
	int even=0,odd=0;
	for(int i=0;i<3;i++){
		if(d[i]%2==0){
			even++;
		}
		else{
			odd++;
		}
	}
	if(even>odd){
		for(int i=0;i<a;i++){
			if(d[i]%2!=0){
				even=d[i];
				break;
			}
		}
		System.out.println(even);
	}
	else{
		for(int i=0;i<a;i++){
			if(d[i]%2==0){
				even=d[i];
				break;
			}
		}
		System.out.println(even);
	}
}
}
