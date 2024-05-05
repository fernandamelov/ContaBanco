import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    Integer numero;
    String agencia;
    String nomeCliente;
    Double saldo;
    Scanner scanner = new Scanner(System.in);

    public void setNumero(){
        System.out.println("Digite o número da conta: ");
        this.numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        return;
    }

    public void setAgencia(){
        System.out.println("Digite a agência da conta: ");
        this.agencia = scanner.next();
        scanner.nextLine(); // Consome a quebra de linha
        return;
    }

    public void setNomeCliente(){
        System.out.println("Digite o nome do cliente: ");
        this.nomeCliente = scanner.nextLine();
        return;
    }

    public void setSaldo(){
        System.out.println("Digite o saldo da conta: ");
        try {
            this.saldo = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Digite um número válido para o saldo: " + e.getMessage());
            scanner.next(); // consume the invalid input
            setSaldo(); // recursively call the method to retry input
        }
        return;
    }

    public void boasVindas(){
        this.scanner.close();
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo de " + this.saldo + " já está disponível para saque");
    }
}
