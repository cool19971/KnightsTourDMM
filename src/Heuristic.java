	import java.util.*;
	import java.io.*;

	public class Heuristic {
	Random rand = new Random();

	private int originalX;
	private int originalY;
	private int x;
	private int y;
	private int movePosition;
	private int numberMoves;
	private boolean movesLeft;
	private int [][] board; 
	private int [][] accessibilityBoard;
	private int [] triedMoves; 
	private int move;

	public Heuristic () {
		this.originalX = rand.nextInt(7);
		this.originalY = rand.nextInt(7);
		this.x= originalX;
		this.y= originalY;
		this.movePosition = 0;
		this.numberMoves = 0;
		this.movesLeft = true;
		this.board = new int[8][8];
		this.accessibilityBoard = new int[8][8];
		this.triedMoves = new int[8];
	}

	public Heuristic(int oX, int oY, int x, int y, int mP, boolean mL) {
		this.originalX = oX;
		this.originalY = oY;
		this.x = x;
		this.y = y;
		this.movePosition = mP;
		this.movesLeft = mL;
	}

	public void board () throws IOException {
			 tryMoves();
			 writeTour();
	}

	public void tryMoves() {
		while (movesLeft == true) {
			if (triedMoves[1] == 1 && triedMoves[2] == 1 && triedMoves[3] == 1 && triedMoves[4] == 1 && triedMoves[5] == 1 && triedMoves[6] == 1 && triedMoves[7] == 1) {
	        	movesLeft = false;
	        }//end if
			move = rand.nextInt(7);
			if (move == 0 && (y + 2) <= 7 && (x + 1) <= 7) {
				movePosition = board [x+1] [y+2];
				if (movePosition == 0) {
					y = y + 2;
		        	x = x + 1;
		        	board [x] [y] = 1;
		        	numberMoves ++ ;
		        	triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		        	//Move Up 2 Right 1
				}//end if
		} else {triedMoves [0] = 1;}
			
		if (move == 1 && (y + 2) <= 7 && (x - 1) >= 0) {
				movePosition = board [x-1] [y+2];
				if (movePosition == 0) {
					y = y + 2;
		        	x = x - 1;
		        	board [x] [y] = 1;
		        	numberMoves ++ ;
		        	triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		        	//Move Up 2 Left 1
				}
		} else {triedMoves [1] = 1;}

		if (move == 2 && (y - 2) >= 0 && (x + 1) <= 7) {
				movePosition = board [x+1] [y-2];
				if (movePosition == 0) {
					y = y - 2;
					x = x + 1;
					board [x] [y] = 1;
					numberMoves ++ ;
					triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		    		//Move Down 2 Right 1
				}
		}else {triedMoves [2] = 1;}

		if (move == 3 && (y - 2) >= 0 && (x - 1) >= 0) {
				movePosition = board [x-1] [y-2];
				if (movePosition == 0) {
					y = y - 2;
					x = x - 1;
					board [x] [y] = 1;
					numberMoves ++ ;
					triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		    		//Move Down 2 Left 1
				}
		}else {triedMoves [3] = 1;}

		if (move == 4 && (x + 2) <= 7 && (y + 1) <= 7) {
				movePosition = board [x+2] [y+1];
				if (movePosition == 0) {
					x = x + 2;
					y = y + 1;
					board [x] [y] = 1;
					numberMoves ++ ;
					triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		    		//Move Right 2 Up 1
				}
		}else {triedMoves [4] = 1;}

		if (move == 5 && (x + 2) <= 7 && (y - 1) >= 0) {
				movePosition = board [x+2] [y-1];
				if (movePosition == 0) {
					x = x + 2;
					y = y - 1;
		    		board [x] [y] = 1;
		    		numberMoves ++ ;
		    		triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		    		//Move Right 2 Down 1
				}
		}else {triedMoves [5] = 1;}

		if (move == 6 && (x - 2) >= 0 && (y + 1) <= 7) {
				movePosition = board [x-2] [y+1];
				if (movePosition == 0) {
					x = x - 2;
					y = y + 1;
					board [x] [y] = 1;
					numberMoves ++ ;
					triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
					//Move Left 2 Up 1
				}
		}else {triedMoves [6] = 1;}

		if (move == 7 && (x - 2) >= 0 && (y - 1) >= 0) {
				movePosition = board [x-2] [y-1];
				if (movePosition == 0) {
					x = x - 2;
		    		y = y - 1;
		    		board [x] [y] = 1;
		    		numberMoves ++ ;
		    		triedMoves [0] = 0;
		        	triedMoves [1] = 0;
		        	triedMoves [2] = 0;
		        	triedMoves [3] = 0;
		        	triedMoves [4] = 0;
		        	triedMoves [5] = 0;
		        	triedMoves [6] = 0;
		        	triedMoves [7] = 0;
		        	System.out.println("move 0");
		        	System.out.println(x);
		        	System.out.println(y);
		    		//Move Left 2 Down 1
				}
		}else {triedMoves [7] = 1;}
	}
		

	}

	public void writeTour() throws IOException {
		if(x == this.originalX && y == this.originalY) {
			String output = '\n' +  "Heuristic:" + '\n'+ "[" + originalX + "]" + "," + "[" + originalY + "]" + numberMoves + "[" + x + "]" + "," + "[" + y + "]" + "*" ;
			BufferedWriter writer = new BufferedWriter(new FileWriter("tour.txt",true));
			 writer.newLine();
			 writer.write(output);
			 writer.close();
		}else {
		String output = '\n' +  "Heuristic:" + '\n'+ "[" + originalX + "]" + "," + "[" + originalY + "]" + numberMoves + "[" + x + "]" + "," + "[" + y + "]" ;
		BufferedWriter writer = new BufferedWriter(new FileWriter("tour.txt",true));
		 writer.newLine();
		 writer.write(output);
		 writer.close();
		}
	}

	}

