public class Cliente {
    private static int contadorID = 1;
    private int id;
    private String nome;
    private String cpf;
    private String cidade;

    public Cliente(String nome, String cpf, String cidade) {
        this.id = contadorID++;
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf; // Setter para o CPF
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade; // Setter para a cidade
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Cidade: " + cidade;
    }
}
