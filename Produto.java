import java.util.ArrayList;

public class Produto {
    /*
      Produto
        Id
        Descrição
        Tamanho
        Cor
        Fabricante
     */

    int id;
    String descricao;
    String tamanho;
    String cor;
    Fabricante fabricante;

    public LocalEstoque locaisEstoque;

    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto (int id, String descricao, String tamanho, String cor, Fabricante fabricante) {
        this.id = id;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.fabricante = fabricante;

        produtos.add(this);
    }

    public static void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public static void listaProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.id + " - " + produto.descricao);
        }
    }

    public static Produto verificaId(int id) throws Exception {
      for (Produto produto : produtos) {
          if (produto.id == id) {
              return produto;
          }
      }

      throw new Exception("Fabricante não encontrado");
  } 
}
