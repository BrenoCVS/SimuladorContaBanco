import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        ContaBanco contaBanco = new ContaBanco();

        System.out.print("Insira seu nome: ");
        contaBanco.setNomeCliente(scanner.nextLine());

        System.out.print("Insira a agência do banco: ");
        contaBanco.setAgencia(scanner.nextLine());

        System.out.print("Insira o número da conta: ");
        contaBanco.setNumero(scanner.nextInt());

        System.out.print("Insira o saldo da conta: ");
        contaBanco.setSaldo(scanner.nextDouble());

        contaBanco.mensagem();

        scanner.close(); 
    }
}
