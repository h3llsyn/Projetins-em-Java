import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Integer> codigosValidos = Arrays.asList(0, 100, 101, 102, 103, 104, 105, 200, 201);
    static ArrayList<String> carrinho = new ArrayList<>();
    static String descricao = "";
    static double total = 0;
    static int quantidade = 0;
    static double preco = 0;
    static Scanner sc = new Scanner(System.in);
    static int codigo = 1;

    public static void main(String[] args) {
        System.out.println("Bem Vindo a Lanchonete da Lavíz uau\n" +
        "=================Cardápio=================\n" +
        "| Código |       Descrição       | Valor |\n" +
        "|   100  |    Cachorro Quente    |  9,00 |\n" +
        "|   101  | Cachorro Quente Duplo | 11,00 |\n" +
        "|   102  |         X-Egg         | 12,00 |\n" +
        "|   103  |       X-Salada        | 12,00 |\n" +
        "|   104  |        X-Bacon        | 14,00 |\n" +
        "|   105  |        X-Tudo         | 17,00 |\n" +
        "|   200  |   Refrigerante Lata   |  5,00 |\n" +
        "|   201  |       Chá Gelado      |  4,00 |");

        while(codigo != 0){
            System.out.println("\nDigite o código que deseja pedir ou 0 para sair: ");
            codigo = validacaoNumero();
            while(!codigosValidos.contains(codigo)){
                System.out.println("Por favor digite um código válido: ");
                codigo = validacaoNumero();
            }
            if (codigo == 0){
                extrato();
                break;
            }
            System.out.println("Digite a quantidade desejada: ");
            quantidade = validacaoNumero();
            if (codigo == 100){
                descricao = "Cachorro Quente";
                preco = 9.00;
                adicionarProduto();
            }
            else if(codigo == 101){
                descricao = "Cachorro Quente Duplo";
                preco = 11.00;
                adicionarProduto();
            }
            else if(codigo == 102){
                descricao = "X-Egg";
                preco = 12.00;
                adicionarProduto();
            }
            else if(codigo == 103){
                descricao = "X-Salada";
                preco = 12.00;
                adicionarProduto();
            }
            else if(codigo == 104){
                descricao = "X-Bacon";
                preco = 14.00;
                adicionarProduto();
            }
            else if(codigo == 105){
                descricao = "X-Tudo";
                preco = 17.00;
                adicionarProduto();
            }
            else if(codigo == 200){
                descricao = "Refrigerante Lata";
                preco = 5.00;
                adicionarProduto();
            }
            else if(codigo == 201){
                descricao = "Chá Gelado";
                preco = 4.00;
                adicionarProduto();
            }
        }
    }

    public static void adicionarProduto(){
        total += quantidade * preco;
        preco = preco * quantidade;
        String itens = quantidade + "x " + descricao + " - " + "R$" + preco;
        carrinho.add(itens);
        System.out.printf("Você pediu %s %s(s). Valor: %s", quantidade, descricao, preco);
    }

    public static int validacaoNumero(){
        while (true){
            try {
                String codigoValidacao = sc.next();
                return Integer.parseInt(codigoValidacao);
            }
            catch (NumberFormatException erro){
                System.out.println("Por favor digite um código válido: ");
            }
        }
    }

    public static void extrato(){
        System.out.printf("=====EXTRATO=====\n");
        for (String produtos : carrinho){
            System.out.println(produtos);
        }
        System.out.printf("Total: R$%s", total);
    }
}