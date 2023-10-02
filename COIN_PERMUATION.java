package home_work;
import java.util.*;

public class COIN_PERMUATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5};
		int a=8;
		List<List<Integer>>ans=new ArrayList<>();
		List<Integer>l=new ArrayList<>();
		print(arr,a,0,ans,0,l);
		

	}
public static void print(int arr[],int a,int ca,	List<List<Integer>>ans,int idx,List<Integer>l) {
	
	if(ca==a) {
		 
		 ans.add(new ArrayList(l));
		 System.out.println(ans);
		 return ;
		
	}
	
	if(ca>a) {
		return ;
	}
//	print(arr,a,ca+arr[0],ans+arr[0]);
//	print(arr,a,ca+arr[1],ans+arr[1]);
//	print(arr,a,ca+arr[2],ans+arr[2]);
	
	for(int i=idx;i<arr.length;i++) {
		l.add(arr[i]);
		print(arr,a,ca+arr[i],ans,i,l);
		l.remove(l.size()-1);
	}
	
	
}
}
