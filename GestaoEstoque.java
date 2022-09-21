import java.util.Scanner;

public class GestaoEstoque {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==========/GESTÃO ESTOQUE FRUTAS FELIZES/==========");
            System.out.println("[01] - Cadastrar Produto");
            System.out.println("[02] - Cadastrar Fabricante");
            System.out.println("[03] - Cadastrar Local de Estoque");
            System.out.println("[04] - Listar Produtos");
            System.out.println("[05] - Listar Fabricantes");
            System.out.println("[06] - Listar Locais de Estoque");
            System.out.println("[07] - Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: 
                    try {
                        System.out.println("Digite o ID do produto:");
                        int id = scanner.nextInt();
                        System.out.println("Digite a descrição do produto:");
                        String descricao = scanner.next();
                        System.out.println("Digite o tamanho do produto:");
                        String tamanho = scanner.next();
                        System.out.println("Digite a cor do produto:");
                        String cor = scanner.next();
                        System.out.println("Digite o ID do fabricante:");
                        int idFabricante = scanner.nextInt();
                        Fabricante fabricante = Fabricante.verificaId(idFabricante);
                        Produto produto = new Produto(id, descricao, tamanho, cor, fabricante); 
                        
                        System.out.println("Produto "+ produto.descricao +" cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro na operação: " + e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        System.out.println("Digite o ID do fabricante:");
                        int id = scanner.nextInt();
                        System.out.println("Digite o nome do fabricante:");
                        String nome = scanner.next();
                        Fabricante fabricante = new Fabricante(id, nome);

                        System.out.println("Fabricante "+ fabricante.nome +" cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println ("Erro na operação: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Digite o ID do local de estoque:");
                        int id = scanner.nextInt();
                        System.out.println("Digite os detalhes do local de estoque:");
                        String detalhes = scanner.next();
                        System.out.println("Digite a quantidade do local de estoque:");
                        int quantidade = scanner.nextInt();
                        System.out.println("Digite o ID do produto:");
                        int idProduto = scanner.nextInt();
                        Produto produto = Produto.verificaId(idProduto);
                        LocalEstoque localEstoque = new LocalEstoque(id, detalhes, quantidade, produto);

                        System.out.println("Local de estoque "+ localEstoque.detalhes +" cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println ("Erro na operação: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Lista de produtos:");
                        Produto.listaProdutos();
                        
                    } catch (Exception e) {
                        System.out.println ("Erro na operação: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Lista de fabricantes:");
                        Fabricante.listaFabricantes();
                        
                    } catch (Exception e) {
                        System.out.println ("Erro na operação: " + e.getMessage());
                    }
                    break;

                case 6:
                try {
                    System.out.println("Lista de locais de estoque:");
                    LocalEstoque.listaLocaisEstoque();   
                    
                } catch (Exception e) {
                    System.out.println ("Erro na operação: " + e.getMessage());
                }
                break;
                    
                case 7:
                    System.out.println("Saindo...");
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}

