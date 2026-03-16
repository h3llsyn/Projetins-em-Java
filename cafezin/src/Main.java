public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Expresso", 5.00);
        Cafe cafe2 = new Cafe("Cappuccino", 8.00);

        Pedido pedido1 = new Pedido(cafe1, 3);

        cafe1.exibirDetalhes();
        pedido1.exibirResumo();
    }
}