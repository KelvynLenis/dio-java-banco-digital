public class ContaPoupanca extends Conta {

  public ContaPoupanca(Client cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("*** Extrato Conta poupança ***");
    super.imprimirInfo();
  }
}
