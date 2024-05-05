import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    Integer numero;
    String agencia;
    String nomeCliente;
    Double saldo;
    Scanner scanner = new Scanner(System.in);

    public void setNumero(){
        System.out.println("Digite o n�mero da conta: ");
        this.numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        return;
    }

    public void setAgencia(){
        System.out.println("Digite a ag�ncia da conta: ");
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
            System.out.println("Valor inv�lido. Digite um n�mero v�lido para o saldo: " + e.getMessage());
            scanner.next(); // consume the invalid input
            setSaldo(); // recursively call the method to retry input
        }
        return;
    }

    public void boasVindas(){
        this.scanner.close();
        System.out.println("Ol� " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + this.agencia + ", conta " + this.numero + " e seu saldo de " + this.saldo + " j� est� dispon�vel para saque");
    }
}
