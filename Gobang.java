import java.io.*;

public class Gobang{
	private static int BOARD_SIZE = 15;
	private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	public void initBoard(){
		for(int i=0; i<BOARD_SIZE; i++)
			for(int j=0; j<BOARD_SIZE; j++)
				board[i][j] = "+";
	}

	public void printBoard(){
		for(int i=0; i<BOARD_SIZE; i++){
			for(int j=0; j<BOARD_SIZE; j++)
				System.out.print(board[i][j]);
			System.out.print("\n");
		}
	}

	public static void main(String[] args){
		Gobang go = new Gobang();
		go.initBoard();
		go.printBoard();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		try{		
			while((inputStr = br.readLine()) != null){
				String[] posStrArr = inputStr.split(",");
				int xPos = Integer.parseInt(posStrArr[0]);
				int yPos = Integer.parseInt(posStrArr[1]);
				go.board[xPos-1][yPos-1] = "o";
				go.printBoard();
				System.out.print("please input the position(x,y) info:");
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}