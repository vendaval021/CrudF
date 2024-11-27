public class Motorista {
    private static int contadorID = 1; // Variável estática para controle do ID
    private int id;
    private String nome;
    private String cpf;
    private String cnh; // Carteira Nacional de Habilitação
    private String cidade;

    public Motorista(String nome, String cpf, String cnh, String cidade) {
        this.id = contadorID++;
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", CNH: " + cnh + ", Cidade: " + cidade;
    }
}
