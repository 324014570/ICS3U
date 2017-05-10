package alKwiliy;

public class PennyPitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] board = new String[5][5];
		String [] prizes = {"puzzle","poster","game","doll","ball", " "};
		int [] counters = {0,0,0,0,0,0};
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int a = (int)(Math.random()*6);
				
				
				board[i][j] = prizes[a];
				if(){
//				if (a == 0){
//					board[i][j] = prizes[a];
//				}
//				if (a == 1){
//					board[i][j] = prizes[1];
//				}
//				if (a == 2){
//					board[i][j] = prizes[2];
//				}
//				if (a == 3){
//					board[i][j] = prizes[3];
//				}
//				if (a == 4){
//					board[i][j] = prizes[4];
//				}
//				if (a == 5){
//					board[i][j] = prizes[5];
				}
				System.out.print(board[i][j]+"|");
			}
			System.out.println();
		}
		
	}
}
	
		
