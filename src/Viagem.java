import java.util.List;

public class Viagem {
    private static int contadorID = 1; // Variável estática para controle do ID
    private int id;
    private String descricao;
    private String cidadeOrigem;
    private String cidadeDestino;
    private List<Produto> listaProdutos; // Lista de produtos a serem transportados
    private Motorista motorista;
    private Cliente cliente;
    private String status; // Pode ser "Iniciada" ou "Finalizada"

    // Construtor
    public Viagem(String descricao, String cidadeOrigem, String cidadeDestino, List<Produto> listaProdutos, Motorista motorista, Cliente cliente) {
        this.id = contadorID++;
        this.descricao = descricao;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.listaProdutos = listaProdutos;
        this.motorista = motorista;
        this.cliente = cliente;
        this.status = "Iniciada"; // Status inicial é "Iniciada"
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Iniciada") || status.equals("Finalizada")) {
            this.status = status;
        } else {
            System.out.println("Status inválido! Use 'Iniciada' ou 'Finalizada'.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao + ", Cidade Origem: " + cidadeOrigem +
                ", Cidade Destino: " + cidadeDestino + ", Status: " + status + ", Motorista: " + motorista.getNome() +
                ", Cliente: " + cliente.getNome();
    }
}
