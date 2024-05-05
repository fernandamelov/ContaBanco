public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        conta.setNumero();
        conta.setAgencia();
        conta.setNomeCliente();
        conta.setSaldo();
        conta.boasVindas();
    }
}
