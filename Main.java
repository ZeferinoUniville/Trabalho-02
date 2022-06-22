import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PessoaDAO DAO = new PessoaDAO();
        Pessoa pessoa = new Pessoa();

        Integer params1 = 0;
        String params2 = "";
        String escolha = "";
        boolean sair = false;

        do{
            System.out.println("--------------------------------------------");
            System.out.println("Qual a proxima escolha?");
            System.out.println("============================================");
            System.out.println(" 1    - Encontrar um registro pelo ID");
            System.out.println(" 2    - Mostrar Todos");
            System.out.println(" 3    - Adicionar um novo registro");
            System.out.println(" 4    - Remover um registro");
            System.out.println(" ESC  - Para encerrar o processo");
            System.out.println("============================================\n");
            Scanner leitor  = new Scanner (System.in);
            Scanner leitor2 = new Scanner (System.in);
            escolha = leitor.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("Qual seria o id que deseja buscar?");
                    params1 = leitor.nextInt();
                    DAO.getById(params1);
                    break;
                case "2":
                    DAO.getAll();
                    break;
                case "3":
                    System.out.println("Qual seria o id do Registro que deseja adicionar");
                    params1 = leitor.nextInt();
                    System.out.println("Qual seria o nome do Registro  que deseja adicionar?");
                    params2 = leitor2.nextLine();
                    DAO.add(params1,params2);
                    break;
                case "4":
                    System.out.println("Qual seria o id do Registro que deseja remover?");
                    params1 = leitor.nextInt();
                    DAO.delete(params1);
                    break;
                case "ESC":
                    System.out.println("\nEncerrando Processo.......\n");
                    sair = true;
                    break;
                default:
                    System.out.println(" Essa nao e uma opcao valida ");
            }
        }while(sair != true);
    }

}
