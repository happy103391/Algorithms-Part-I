//import java.util.Scanner;

//import javax.print.attribute.standard.PrinterLocation;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
//import edu.princeton.cs.algs4.*;


public class RandomWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdOut.println(StdIn.readString());

			int i = 1;
			String string = "";
			while (!StdIn.isEmpty()) {
				String word = StdIn.readString();
				boolean bool = StdRandom.bernoulli((double) 1 / i);

				if (bool == true) {
					string = word;
					}
				i++;

		}

		StdOut.println(string);

		}
	
}
