import java.util.Scanner;

public class Polimdromo {
    public static void main(String[] args) {
        System.out.println("Digite uma frase por favor ");
        Scanner Scanner = new Scanner(System.in);
        String fraseDigitada = Scanner.nextLine();
        fraseDigitada = fraseDigitada.toLowerCase();
        boolean ehpalindromo = true;
        for (int i = 0; i < fraseDigitada.length(); i++){
            char c = fraseDigitada.charAt(i);
            char cInvertido = fraseDigitada.charAt(fraseDigitada.length() - i - 1 );

            if (c !=cInvertido){
                ehpalindromo = false;
                break;
            }
        }
        if (ehpalindromo){
            System.out.println("ë um palindromo");

        }else {
            System.out.println("Nãom  é um palindromo");
        }

    }
}
