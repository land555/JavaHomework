package github10;
import java.io.*;
import java.util.Scanner;
 
public class CopyFile {

	public static void run () {
		try{
			Scanner input = new Scanner(System.in);
			System.out.print("Input the filename you want to copy: ");
			String copy =input.nextLine();
			System.out.print("Input the filename you copy to: ");
			String copyto = input.nextLine();
			BufferedReader rd = new BufferedReader(new FileReader(copy));
			PrintWriter wd = new PrintWriter(new BufferedWriter(new FileWriter(copyto)));
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				wd.println(line);
			}
			rd.close();
			wd.close();
		} catch (IOException ex) {
			throw new RuntimeException(ex.toString());
		}
	}
	public static void main(String[] args) {
		run();
	}

}
