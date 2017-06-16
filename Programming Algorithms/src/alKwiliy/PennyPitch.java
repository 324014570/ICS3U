package alKwiliy;

public class PennyPitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] board = new String[5][5];
		String [] prizes = {"[PUZZLE]","[POSTER]","[ GAME ]","[ DOLL ]","[ BALL ]", "[      ]"};
		int [] counters = {0,0,0,0,0,0};
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int a = (int)(Math.random()*5);
				
				
//					if(a == 5){
//						board[i][j] = prizes[5];
//						counters[j]++;
//					}
//					if(counters[j] == 10){
//						a = (int)(Math.random()*4);
//					}
//					else if(a == 4){
//						board[i][j] = prizes[4];
//						counters[j]++;
//					}
//					if(counters[j] == 3){
//						a = (int)(Math.random()*3);
//					}
//					else if(a == 3){
//						board[i][j] = prizes[3];
//						counters[j]++;
//					}
//					if(counters[j] == 3){
//						a = (int)(Math.random()*2);
//					}
//					else if(a == 2){
//						board[i][j] = prizes[2];
//						counters[j]++;
//					}
//					if(counters[j] == 3){
//						a = (int)(Math.random()*1);
//					}
//					else if(a == 1){
//						board[i][j] = prizes[1];
//						counters[j]++;
//					}
//					if(counters[j] == 10){
//						a = 0;
//					}
//					else if(a == 0){
//						board[i][j] = prizes[0];
//					}
//					
//					
//					
//					board[i][j] = prizes[a];
//				
//				
//				
//				
//				
//				
//				
				
				
				
				
				
				
				
				
				
				
				
				
				//				int a = (int)(Math.random()*5);
//				board[i][j] = prizes[a];
//				for(int w=0; w<10; w++){
//					if(a == 5){
//						board[i][j] = prizes[5];
//					}
//				}
//					for(int z = 0; z<3; z++){
//				
//				if (a == 0){
//					board[i][j] = prizes[0];
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
//			
//				}
		
					
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	public static boolean isEmpty(String[][] arr){
	int x = (int)(Math.random()*5);
	int y = (int)(Math.random()*5);
	if(!arr[x][y].equals(null)){
		
		
	}
	}
}
	
		
