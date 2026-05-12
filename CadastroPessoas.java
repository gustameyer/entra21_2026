import java.util.ArrayList;
import java.util.Scanner;


    class Pessoa {

        String nome;

        Pessoa(String nome) {
            this.nome = nome;
        }

        void mostrarInfo() {
            System.out.println("Nome: " + nome);
        }
    }

    public class CadastroPessoas {

    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                ArrayList<Pessoa> listaPessoas = new ArrayList<>();
                int opcao=0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Incluir");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // limpar buffer
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    listaPessoas.add(new Pessoa(nome));
                    break;
                case 2:
                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = entrada.nextLine();
                    boolean removido = false;
                    for (Pessoa p : listaPessoas) {
                        if (p.nome.equalsIgnoreCase(nomeRemover)) {
                            listaPessoas.remove(p);
                            removido = true;
                            break;
                        }
                    }
                    if (removido) {
                        System.out.println("Nome removido com sucesso!");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        }while (opcao != 3);

        entrada.close();
    }
}

