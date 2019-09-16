import java.io.*;
public class Application {
	
	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("tour.txt"));
		for(int i = 1; i <= 1000; i++) {
		NoHeuristic NoHeuristic = new NoHeuristic();
		NoHeuristic.board();

		}
		
		for(int i = 1; i <= 64; i++) {
			Heuristic Heuristic = new Heuristic();
			Heuristic.board();
			
		}
	}

}
