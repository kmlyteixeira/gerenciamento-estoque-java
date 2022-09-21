import java.util.ArrayList;

public class Fabricante {
    /*
    fabricante
       Id
       Nome
     */

    int id;
    String nome;

    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(int id, String nome) {
        this.id = id;
        this.nome = nome;

        fabricantes.add(this);
    }

    public static void addFabricante(Fabricante fabricante) {
        fabricantes.add(fabricante);
    }

    public static void listaFabricantes() {
        for (Fabricante fabricante : fabricantes) {
            System.out.println(fabricante.id + " - " + fabricante.nome);
        }
    }

    public static Fabricante verificaId(int id) throws Exception {
        for (Fabricante fabricante: fabricantes) {
            if (fabricante.id == id) {
                return fabricante;
            }
        }

        throw new Exception("Fabricante não encontrado");
    } 
}
