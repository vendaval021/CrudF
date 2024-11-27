public class Produto {
    private static int contadorID = 1; // Variável estática para controle do ID
    private int id;
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.id = contadorID++;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; // Setter para o nome
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade; // Setter para a quantidade
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Quantidade: " + quantidade;
    }
}
