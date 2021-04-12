import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

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