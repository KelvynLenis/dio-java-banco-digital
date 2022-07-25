public class Main {
  public static void main(String[] args) {
    Client kelvyn = new Client();
    kelvyn.setNome("Kelvyn");

    Conta cc = new ContaCorrente(kelvyn);
    Conta poupanca = new ContaPoupanca(kelvyn);

    cc.depositar(100);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}
