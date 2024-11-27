import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaTransporte {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Motorista> motoristas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Viagem> viagens = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        while (true) {
            System.out.println("\n ------------ Menu: -----------");
            System.out.println("1. Gerenciar Cliente");
            System.out.println("2. Gerenciar Motorista");
            System.out.println("3. Gerenciar Produto");
            System.out.println("4. Gerenciar Viagens");
            System.out.println("5. Sair");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma das opções: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar buffer

            switch (opcao) {
                case 1:
                    gerenciarCliente();
                    break;
                case 2:
                    gerenciarMotorista();
                    break;
                case 3:
                    gerenciarProduto();
                    break;
                case 4:
                    gerenciarViagem();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void gerenciarCliente() {
        while (true) {
            System.out.println("\n ------------ SubMenu: -----------");
            System.out.println("Gerenciar Cliente:");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Cadastrar Clientes");
            System.out.println("3. Editar Clientes");
            System.out.println("4. Remover Clientes");
            System.out.println("5. Voltar");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma das opções: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    listarClientes();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    editarCliente();
                    break;
                case 4:
                    removerCliente();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void listarClientes() {
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        clientes.add(new Cliente(nome, cpf, cidade));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void editarCliente() {
        System.out.print("Digite o ID do Cliente para editar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada
    
        Cliente cliente = buscarClientePorID(id);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
            
            System.out.print("Novo Nome: ");
            cliente.setNome(scanner.nextLine()); // Usando setter para o nome
            
            System.out.print("Novo CPF: ");
            cliente.setCpf(scanner.nextLine()); // Usando setter para o CPF
            
            System.out.print("Nova Cidade: ");
            cliente.setCidade(scanner.nextLine()); // Usando setter para a cidade
    
            System.out.println("Cliente editado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }
    

    public void removerCliente() {
        System.out.print("Digite o ID do Cliente para remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = buscarClientePorID(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public Cliente buscarClientePorID(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    // GERENCIAR MOTORISTA
    public void gerenciarMotorista() {
        while (true) {
            System.out.println("\n ------------ SubMenu: -----------");
            System.out.println("Gerenciar Motorista:");
            System.out.println("1. Listar Motoristas");
            System.out.println("2. Cadastrar Motoristas");
            System.out.println("3. Editar Motoristas");
            System.out.println("4. Remover Motoristas");
            System.out.println("5. Voltar");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma das opções: ");
    
            int opcao = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcao) {
                case 1:
                    listarMotoristas();
                    break;
                case 2:
                    cadastrarMotorista();
                    break;
                case 3:
                    editarMotorista();
                    break;
                case 4:
                    removerMotorista();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    public void listarMotoristas() {
        System.out.println("Motoristas:");
        for (Motorista motorista : motoristas) {
            System.out.println(motorista);
        }
    }
    
    public void cadastrarMotorista() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("CNH: ");
        String cnh = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
    
        motoristas.add(new Motorista(nome, cpf, cnh, cidade));
        System.out.println("Motorista cadastrado com sucesso!");
    }
    
    public void editarMotorista() {
        System.out.print("Digite o ID do Motorista para editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        Motorista motorista = buscarMotoristaPorID(id);
        if (motorista != null) {
            System.out.println("Motorista encontrado: " + motorista);
            
            // Usando setters para editar o motorista
            System.out.print("Novo Nome: ");
            motorista.setNome(scanner.nextLine());
            
            System.out.print("Novo CPF: ");
            motorista.setCpf(scanner.nextLine());
            
            System.out.print("Nova CNH: ");
            motorista.setCnh(scanner.nextLine());
            
            System.out.print("Nova Cidade: ");
            motorista.setCidade(scanner.nextLine());
    
            System.out.println("Motorista editado com sucesso!");
        } else {
            System.out.println("Motorista não encontrado!");
        }
    }
    
    public void removerMotorista() {
        System.out.print("Digite o ID do Motorista para remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        Motorista motorista = buscarMotoristaPorID(id);
        if (motorista != null) {
            motoristas.remove(motorista);
            System.out.println("Motorista removido com sucesso!");
        } else {
            System.out.println("Motorista não encontrado!");
        }
    }
    
    // GERENCIAR PRODUTO
    public void gerenciarProduto() {
        while (true) {
            System.out.println("\n ------------ SubMenu: -----------");
            System.out.println("\nGerenciar Produto:");
            System.out.println("1. Listar Produtos");
            System.out.println("2. Cadastrar Produtos");
            System.out.println("3. Editar Produtos");
            System.out.println("4. Remover Produtos");
            System.out.println("5. Voltar");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma das opções: ");
    
            int opcao = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcao) {
                case 1:
                    listarProdutos();
                    break;
                case 2:
                    cadastrarProduto();
                    break;
                case 3:
                    editarProduto();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    public void listarProdutos() {
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    
    public void cadastrarProduto() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
    
        produtos.add(new Produto(nome, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }
    
    public void editarProduto() {
        System.out.print("Digite o ID do Produto para editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        Produto produto = buscarProdutoPorID(id);
        if (produto != null) {
            System.out.println("Produto encontrado: " + produto);
            
            // Usando setters para editar o produto
            System.out.print("Novo Nome: ");
            produto.setNome(scanner.nextLine());
            
            System.out.print("Nova Quantidade: ");
            produto.setQuantidade(scanner.nextInt());
            scanner.nextLine();
    
            System.out.println("Produto editado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
    
    public void removerProduto() {
        System.out.print("Digite o ID do Produto para remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        Produto produto = buscarProdutoPorID(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public Produto buscarProdutoPorID(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // BUSCAR POR IDS
    public Viagem buscarViagemPorID(int id) {
        for (Viagem viagem : viagens) {
            if (viagem.getId() == id) {
                return viagem;
            }
        }
        return null;
    }

    public Motorista buscarMotoristaPorID(int id) {
        for (Motorista motorista : motoristas) {
            if (motorista.getId() == id) {
                return motorista;
            }
        }
        return null;
    }

    public Viagem buscarViagemPorIDOuDescricao(String input) {
        for (Viagem viagem : viagens) {
            if (String.valueOf(viagem.getId()).equals(input) || viagem.getDescricao().equalsIgnoreCase(input)) {
                return viagem;
            }
        }
        return null;
    }
    
    
    // GERENCIAR VIAGEM
    public void gerenciarViagem() {
        while (true) {
            System.out.println(" ------------ SubMenu: -----------");
            System.out.println("Gerenciar Viagem:");
            System.out.println("1. Iniciar Viagem");
            System.out.println("2. Finalizar Viagem");
            System.out.println("3. Voltar");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma das opções: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    iniciarViagem();
                    break;
                case 2:
                    finalizarViagem();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void iniciarViagem() {
        if (viagens.isEmpty()) {
            System.out.println("Nenhuma viagem cadastrada.");
        } else {
            System.out.println("Viagens já cadastradas:");
            for (Viagem viagem : viagens) {
                System.out.println(viagem);
            }
        }
    
        System.out.println("\n----- Cadastro de Nova Viagem ------");
        System.out.print("Descrição da Viagem: ");
        String descricao = scanner.nextLine();
    
        System.out.print("Cidade de Origem: ");
        String cidadeOrigem = scanner.nextLine();
    
        System.out.print("Cidade de Destino: ");
        String cidadeDestino = scanner.nextLine();
    
        System.out.print("Escolha o ID do Motorista: ");
        int idMotorista = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer
        Motorista motorista = buscarMotoristaPorID(idMotorista); // Método de busca do motorista
    
        if (motorista == null) {
            System.out.println("Erro: Motorista não encontrado.");
            return;  
        }
    
        System.out.print("Escolha o ID do Cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        Cliente cliente = buscarClientePorID(idCliente); // Método de busca do cliente
    
        if (cliente == null) {
            System.out.println("Erro: Cliente não encontrado.");
            return; 
        }
    
        System.out.print("Quantidade de produtos: ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
    
        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Nome do Produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Quantidade do Produto: ");
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            produtos.add(new Produto(nomeProduto, quantidadeProduto));
        }

        Viagem novaViagem = new Viagem(descricao, cidadeOrigem, cidadeDestino, produtos, motorista, cliente);
        novaViagem.setStatus("Iniciada"); // Definir o status como "Iniciada"
        viagens.add(novaViagem);
        System.out.println("Viagem cadastrada com sucesso!");
    }
    
    
    public void finalizarViagem() {
        if (viagens.isEmpty()) {
            System.out.println("Nenhuma viagem cadastrada.");
            return;
        }
    
        System.out.println("Viagens Iniciadas:");
        for (Viagem viagem : viagens) {
            if (viagem.getStatus().equals("Iniciada")) {
                System.out.println(viagem);
            }
        }

        System.out.print("Informe o ID ou Descrição da viagem para finalizar: ");
        String input = scanner.nextLine();


        Viagem viagemEncontrada = null;
        for (Viagem viagem : viagens) {
            if (String.valueOf(viagem.getId()).equals(input) || viagem.getDescricao().equalsIgnoreCase(input)) {
                viagemEncontrada = viagem;
                break;
            }
        }
    
        if (viagemEncontrada == null) {
            System.out.println("Viagem não encontrada.");
            return;
        }
    
        if (viagemEncontrada.getStatus().equals("Iniciada")) {
            viagemEncontrada.setStatus("Finalizada");
            System.out.println("Viagem finalizada com sucesso!");
        } else {
            System.out.println("A viagem já foi finalizada.");
        }
    }
    
}
