import java.util.Scanner;

public class Complementing_a_Strand_of_DNA  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();
        char[] Char_line = Input.toCharArray();
        char[] Char_Invert = new char[Char_line.length];
        for (int i =0;i<Char_Invert.length;i++){
            Char_Invert[i] = Char_line[i];
        }
        for(int i=0;i<Char_line.length;i++){
            Char_Invert[i] = Char_line[Char_Invert.length-i-1];
        }
        for (int i=0; i<Char_line.length;i++){
            if (Char_Invert[i] == 'A')
                 Char_Invert[i] = 'T';
            else {
                if (Char_Invert[i] == 'T') {
                    Char_Invert[i] = 'A';
                }
            }
            if (Char_Invert[i] == 'C')
                Char_Invert[i] = 'G';
            else {
                if (Char_Invert[i] == 'G'){
                    Char_Invert[i] = 'C';
                }
            }
        }
        System.out.println(Char_Invert);
    }
}
