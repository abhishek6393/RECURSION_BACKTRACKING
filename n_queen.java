package BACK_TRACKING;

public class n_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=4;
		int tq=2;
		boolean []board=new boolean[n];

		 permutation(board,0,tq,"");
		

	}
public static void permutation(boolean[]board,int qpsf,int tq,String ans) {
	
	
	 
	
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
		
		if(board[i]==false) {
			board[i]=true;
			permutation(board,qpsf+1,tq,ans+"b"+i+"q"+qpsf);
			board[i]=false;
		}
	}
}
}
