package P005.exception;

public class DivisionByZeroException extends ArithmeticException {

  public DivisionByZeroException(String mensagem) {
    super(mensagem);
  }
}
