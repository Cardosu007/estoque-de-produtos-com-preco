public class Main {
    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 50.0);
        estoque.adicionarProduto(2L, "Produto B", 15, 15.0);
        estoque.adicionarProduto(3L, "Produto C", 20, 555.0);
        estoque.adicionarProduto(7L, "Produto D", 30, 10.0);
        estoque.adicionarProduto(4L, "Produto E", 80, 255.0);

        System.out.println(estoque.calculaValorTotalEstoque());
        estoque.exibirProdutos();

    }
}