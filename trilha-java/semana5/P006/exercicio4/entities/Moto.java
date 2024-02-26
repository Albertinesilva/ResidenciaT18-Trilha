package P006.exercicio4.entities;

public class Moto extends Veiculo {

  public Moto() {
    super();
  }

  public Moto(String modelo, String cor, int ano, boolean isEletrico) {
    super(modelo, cor, ano, isEletrico);
  }

  @Override
  public void acelerar() {
    System.out.println("\tMoto acelerando");
  }

  @Override
  public void ligar() {
    System.out.println("\tMoto ligada");
  }

  @Override
  public void parar() {
    System.out.println("\tMoto parada");
  }
}