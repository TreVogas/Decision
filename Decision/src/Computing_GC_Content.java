import java.util.Scanner;
import java.io.*;
/*
Problem
The GC-content of a DNA string is given by the percentage of symbols in the string that are 'C' or 'G'. For example, the GC-content of "AGCTATAG" is 37.5%. Note that the reverse complement of any DNA string has the same GC-content.

DNA strings must be labeled when they are consolidated into a database. A commonly used method of string labeling is called FASTA format. In this format, the string is introduced by a line that begins with '>', followed by some labeling information. Subsequent lines contain the string itself; the first line to begin with '>' indicates the label of the next string.

In Rosalind's implementation, a string in FASTA format will be labeled by the ID "Rosalind_xxxx", where "xxxx" denotes a four-digit code between 0000 and 9999.

Given: At most 10 DNA strings in FASTA format (of length at most 1 kbp each).

Return: The ID of the string having the highest GC-content, followed by the GC-content of that string. Rosalind allows for a default error of 0.001 in all decimal answers unless otherwise stated; please see the note on absolute error below.
 */

public class Computing_GC_Content {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\Владимир\\Desktop\\Txt\\example.txt");
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);
        StringBuilder All_Lines = new StringBuilder();
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            char [] Char_line = line.toCharArray();
            if (Char_line[0] == '>'){
                All_Lines.append("\n").append(line).append("\n");
                line = scan.nextLine();
            }
            All_Lines.append(line);
        }
        fr.close();
        System.out.println(All_Lines);
        Scanner scan_OK = new Scanner(All_Lines.toString());
        float count_in_line;
        float general_count;
        while(scan_OK.hasNextLine()){
            count_in_line=0;
            general_count=0;
            String Line_counter = scan_OK.nextLine();
            char[] Char_counter = Line_counter.toCharArray();
            general_count += Char_counter.length;
            for (char c : Char_counter) {
                if (c == 'C' || c == 'G') {
                    count_in_line++;
                }
            }
            System.out.println(count_in_line*100/general_count);
        }
    }
}

