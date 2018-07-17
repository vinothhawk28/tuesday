package guviset2;
import java.util.*;
public class greater {
public static void main(String[] args) {
	int a;
	int cnt=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	int d[]=new int[a];
	for(int i=0;i<a;i++){
		d[i]=in.nextInt();
	}
	for(int j=0;j<a;j++){
		for(int k=j+1;k<a;k++){
			if(d[j]<d[k]){
				cnt++;
			}
		}
	}System.out.println(cnt);
}
}
