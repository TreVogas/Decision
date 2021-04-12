import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
/*Problem
A string is simply an ordered collection of symbols selected from some alphabet and formed into a word; the length of a string is the number of symbols that it contains.

An example of a length 21 DNA string (whose alphabet contains the symbols 'A', 'C', 'G', and 'T') is "ATGCTTCAGAAAGGTCTTACG."

Given: A DNA string s of length at most 1000 nt.

Return: Four integers (separated by spaces) counting the respective number of times that the symbols 'A', 'C', 'G', and 'T' occur in s.*/
public class FirstAttempt
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Input = scanner.nextLine();
        char[] Data = {'A', 'C', 'G', 'T'};
        char[] Char_line = Input.toCharArray();
        int[] array = new int[4] ;
        for (int i = 0; i < Data.length; i++) {
            int key =0;
            for (int j = 0; j < Char_line.length; j++) {
                if (Data[i] == Char_line[j]){
                    key = key+1;
        array[i] = key;
                }
            }
        }
        String Output = new String();
        for(int i = 0; i<array.length; i++){
            Output = Output + array[i] + " ";
        }
        System.out.println(Output);
    }
}