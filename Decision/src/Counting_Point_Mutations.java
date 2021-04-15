import java.util.Scanner;

public class Counting_Point_Mutations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String DNA_STRING_1 = scanner.nextLine();
        String DNA_STRING_2 = scanner.nextLine();
        char[] Char_DNA_STRING_1 = DNA_STRING_1.toCharArray();
        char[] Char_DNA_STRING_2 = DNA_STRING_2.toCharArray();
        int count_of_mistakes =0;
        for(int i = 0; i<Char_DNA_STRING_1.length;i++){
            if (Char_DNA_STRING_1[i] != Char_DNA_STRING_2[i]){
                count_of_mistakes = count_of_mistakes+1;
            }
        }
        System.out.println(count_of_mistakes);
    }
}
