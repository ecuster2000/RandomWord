/********************************************************************
 * Name:		Ed
 * Coursera: 	Algorithms Part1
 * Project:		RandomWord
 ********************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/*
 * Read in a list of words and pick one at random.
 * 
 * param args will be the sequence of words
 */

public class RandomWord {
    public static void main(String[] args) {

        String strWinner = "";
        int i = 0;

        /* While there are words to read */
        while (!StdIn.isEmpty()) {
            String strWord = StdIn.readString();
            i++;

            boolean bRandom = StdRandom.bernoulli(1.0 / i);
            if (bRandom == true) {
                strWinner = strWord;
            }
        }

        StdOut.println(strWinner);
    }
}