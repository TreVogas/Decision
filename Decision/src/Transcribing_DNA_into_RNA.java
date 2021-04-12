import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
/*An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.

Given a DNA string t corresponding to a coding strand, its transcribed RNA string u is formed by replacing all occurrences of 'T' in t with 'U' in u.

Given: A DNA string t having length at most 1000 nt.

Return: The transcribed RNA string of t.*/
public class Transcribing_DNA_into_RNA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();
        char[] Char_line = Input.toCharArray();
        char T = 'T';
        for(int i = 0; i<Char_line.length; i++){
            if (Char_line[i] == T) {
                Char_line[i] ='U';
            }
        }
        System.out.println(Char_line);
    }
}
