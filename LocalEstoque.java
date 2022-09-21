import java.util.ArrayList;

public class LocalEstoque {
    /*
     Local de Estoque
        Id
        Detalhes
        Produto
        Quantidade
     */

    public int id;
    public String detalhes;
    public int quantidade;

    public Produto produto;

    public static ArrayList<LocalEstoque> locaisEstoque = new ArrayList<LocalEstoque>();

    public LocalEstoque(
        int id, 
        String detalhes, 
        int quantidade, 
        Produto produto
    ) {
        this.id = id;
        this.detalhes = detalhes;
        this.quantidade = quantidade;
        this.produto = produto;

        locaisEstoque.add(this);
    }

    public static void listaLocaisEstoque() {
        for (LocalEstoque localEstoque : locaisEstoque) {
            System.out.println(localEstoque.id + " - " + localEstoque.detalhes);
        }
    }

}
