import java.util.*;

public class Aula0903Fila {
    public static void main(String[]args){
        Queue<Integer> fila = new LinkedList<>();
        Scanner cliente = new Scanner(System.in);
        ArrayList<String> nome1 = new ArrayList<>();
        List<String> contatos1 = new ArrayList<>();

        int escolha = 0;
        int i = 0;

        while (escolha != 3) {
            System.out.println("Digite 1 para cadastrar um cliente, 2 para ligar para cliente ou 3 para voltar ao menu principal.");
            int opcao = Integer.parseInt(cliente.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Informe os dados do cliente!");
                    System.out.println("Nome: ");
                    String nomes = cliente.nextLine();
                    nome1.add(nomes);

                    System.out.println("Contato: ");
                    String contatos = cliente.nextLine();
                    contatos1.add(contatos);

                    System.out.println("Digite 1 para concluir e 2 para cancelar.");
                    int opcao2 = Integer.parseInt(cliente.nextLine());

                    if (opcao2 == 1) {
                        fila.add(i);
                        i++;
                        System.out.println("Cadastro realizado com sucesso!");
                    } else if (opcao2 == 2) {
                        System.out.println("Cadastro não gravado!");
                    }
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há clientes na fila!");
                        break;
                    } else {
                        System.out.println(nome1.get(0) + " - " + contatos1.get(0));
                        System.out.println("O cliente " + nome1.get(0) + " já foi atendido? Digite 4 para confirmar ou 5 para que ele volte para a fila.");
                        int simounao = Integer.parseInt(cliente.nextLine());
                        if (simounao == 4) {
                            fila.remove();
                            contatos1.remove(0);
                            nome1.remove(0);
                        } else if (simounao == 5) {
                            fila.remove();
                            fila.add(i);
                            nome1.add(nome1.get(0));
                            contatos1.add(contatos1.get(0));
                            nome1.remove(0);
                            contatos1.remove(0);
                            i++;
                        }
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (opcao == 3) {
                break;
            }
        }

        System.out.println("Programa finalizado!");
    }
}



//fila.add(1);
//fila.add(2);
//fila.add(3);
//System.out.println(fila);
//System.out.println(fila.peek());
// System.out.println(fila.remove());
// System.out.println(fila);