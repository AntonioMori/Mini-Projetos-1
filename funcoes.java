// Funções para o programa principal
import java.util.Scanner;
public class funcoes {
    
    public static String saida(String text){
        System.out.println("\n"+text);
        return text;
    }

    public static String entrada(String text){
        saida(text);
        Scanner input = new Scanner(System.in);
        String entrada = input.next();
        return entrada;
    }

    public static int entradaInt(String text){
        saida(text);
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        return entrada;
    }
}
