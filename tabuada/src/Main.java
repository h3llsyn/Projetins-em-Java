import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.println("Digite um número");
                int numero = sc.nextInt();
                sc.nextLine();
                System.out.println("-----TABUADA-----");
                for(int i=0; i<=10; i++){
                    int resultado = numero * i;
                    System.out.printf("%d x %d = %d\n", numero, i, resultado);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor digite apenas números");
                sc.nextLine();
            }
        }
    }
}