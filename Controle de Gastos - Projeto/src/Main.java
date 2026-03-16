import java.util.ArrayList;

public class Main {

    private static ArrayList<Transacao> listaTransacoes = new ArrayList<>();
    private static ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        System.out.println("\n-----MENU PRINCIPAL------\n" +
                "1 - Transações\n" +
                "2 - Categorias\n" +
                "3 - Sair");
        String opcao = Leitura.dados("Digite a opção desejada: ");
        
        switch (opcao) {    
            case "1":
                menuTransacoes();
                break;
            case "2":
                menuCategorias();
                break;
            case "3":
                System.out.println("Obrigada por usar o nosso programa!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida, por favor digite uma opção válida");
                menuPrincipal();
        }
    }

    private static void menuTransacoes() {
        System.out.println("\n-----MENU TRANSAÇÃO------\n" +
            "1 - Listar transacoes\n" +
            "2 - Lançar transação\n" +
            "3 - Atualizar transação\n" +
            "4 - Deletar transação\n" +
            "5 - Saldo\n" +
            "6 - Voltar ao menu principal");
        String opcao = Leitura.dados("Digite a opção desejada: ");

        switch (opcao) {
            case "1":
                //listarTransacoes();
                menuTransacoes();
                break;
            case "2":
                //lancarTransacao();
                menuTransacoes();
                break;
            case "3":
                //atualizarTransacao();
                menuTransacoes();
                break;
            case "4":
                //deletarTransacao();
                menuTransacoes();
                break;
            case "5":
                menuSaldo();
                menuTransacoes();
                break;
            case "6":
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida, por favor digite uma opção válida");
                menuTransacoes();
        }
    }

    private static void menuCategorias(){
        System.out.println("\n-----MENU CATEGORIAS------\n" +
            "1 - Listar categorias\n" +
            "2 - Cadastrar categoria\n" +
            "3 - Atualizar categoria\n" +
            "4 - Deletar categoria\n" +
            "5 - Voltar ao menu principal");
        String opcao = Leitura.dados("Digite a opção desejada: ");

        switch (opcao) {
            case "1":
                //listarCategorias();
                menuCategorias();
                break;
            case "2":
                //cadastrarCategoria();
                menuCategorias();
                break;
            case "3":
                //atualizarCategoria();
                menuCategorias();
                break;
            case "4":
                //deletarCategoria();
                menuCategorias();
                break;
            case "5":
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida, por favor digite uma opção válida");
                menuTransacoes();
        }
    }

    private static void menuSaldo(){
        System.out.println("\n-----MENU SALDO------\n" +
            "1 - Resumo financeiro (saldo restante, totais entrada e saída)\n" +
            "2 - Ver saldo restante\n" +
            "3 - Listar histórico de entradas\n" +
            "4 - Listar histórico de saídas\n" +
            "5 - Voltar ao menu transação");
        String opcao = Leitura.dados("Digite a opção desejada: ");

        switch (opcao) {
            case "1":
                //resumoFinanceiro();
                menuSaldo();
                break;
            case "2":
                //saldoRestante();
                menuSaldo();
                break;
            case "3":
                //historicoEntrada();
                menuSaldo();
                break;
            case "4":
                //historicoSaida();
                menuSaldo();
                break;
            case "5":
                menuTransacoes();
                break;
            default:
                System.out.println("Opção inválida, por favor digite uma opção válida");
                menuSaldo();
        }
    }
}