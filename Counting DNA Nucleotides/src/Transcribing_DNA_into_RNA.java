import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

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
