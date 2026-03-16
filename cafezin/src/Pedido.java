import java.util.ArrayList;

public class Pedido {
    private ArrayList<Cafe> listaCafe = new ArrayList<>();
    private ArrayList<Integer> listaQuantidade = new ArrayList<>();

    public ArrayList<Cafe> getCafe() {
        return null;
    }

    public ArrayList<Integer> getQuantidade() {
        return listaQuantidade;
    }

    public void setQuantidade(int quantidade) {
        this.listaQuantidade = listaQuantidade;
    }

    public Pedido(Cafe cafe, int quantidade) {
        this.listaCafe = listaCafe;
        this.listaQuantidade = listaQuantidade;
    }

    public double calcularTotal() {
        //return this.cafe.getPreco() * this.quantidade;
        double soma = 0.0;
//        for (Cafe cafe : listaCafe){
//            for (int quantidade : listaQuantidade){
//                soma += cafe.getPreco() * quantidade;
//            }
//        }
        for (int i = 0; i < listaCafe.size(); i++){
            soma += listaCafe.get(i).getPreco() * listaQuantidade.get(i);
        }
        return soma;
    }

    public void exibirResumo(){
        System.out.println("-----Resumo-----");
        for (Cafe cafe : listaCafe){
            System.out.printf("Pedido: %dx %s | Total: R$%.2f", this.listaQuantidade, cafe.getNome(), calcularTotal());
        }
    }

    public void adicionarItem(Cafe novoCafe){
        this.listaCafe.add(novoCafe);
    }
}
