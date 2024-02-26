package P006.exercicio4.services;

import java.util.ArrayList;
import java.util.List;

import P006.exercicio4.entities.Cobrador;
import P006.exercicio4.entities.Jornada;
import P006.exercicio4.entities.Motorista;
import P006.exercicio4.entities.Trajeto;
import P006.exercicio4.entities.Veiculo;
import P006.exercicio4.persistencia.ArquivoJornadas;
import P006.exercicio4.repositories.JornadaRepository;
import P006.exercicio4.views.Views;

public class JornadaService implements JornadaRepository {

  public static List<Jornada> jornadas = new ArrayList<Jornada>();

  @Override
  public void adicionar(Jornada jornada) {
    jornadas.add(jornada);
  }

  @Override
  public List<Jornada> getJornadas() {
    return jornadas;
  }

  @Override
  public void cadastrarJornada() {

    Views.limparTela();
    System.out.println("\n\t===== CADASTRAR JORNADA =====\n");

    Trajeto trajeto = selecionarOpcao("\tEscolha o trajeto: ", TrajetoService.trajetos);
    Veiculo veiculo = selecionarOpcao("\tEscolha o veículo: ", VeiculoService.veiculos);
    Motorista motorista = selecionarOpcao("\tEscolha o motorista: ", MotoristaService.motoristas);
    Cobrador cobrador = selecionarOpcao("\tEscolha o cobrador: ", CobradorService.cobradores);

    jornadas.add(new Jornada(trajeto, veiculo, motorista, cobrador));

    System.out.println("\n\tJornada cadastrada com sucesso!");
    Views.pausar(Views.scan);
  }

  private static <T> T selecionarOpcao(String mensagem, List<T> opcoes) {

    Views.limparTela();
    System.out.println(mensagem);
    System.out.println("\t============================");
    for (int i = 0; i < opcoes.size(); i++) {
      System.out.println("\t" + (i + 1) + "º" + opcoes.get(i));
      System.out.println("\t============================");
    }
    System.out.print("\tOpção: ");

    int opcao = Views.scan.nextInt();
    Views.scan.nextLine(); // Consumir a quebra de linha pendente

    if (opcao < 1 || opcao > opcoes.size()) {
      System.out.println("\n\tOpção inválida. Digite um número entre 1 e " + opcoes.size());
      Views.pausar(Views.scan);
      return selecionarOpcao(mensagem, opcoes); // Chamada recursiva em caso de opção inválida
    }

    return opcoes.get(opcao - 1);

  }

  public void listarJornadas() {

    Views.limparTela();
    System.out.println("\n\t===== LISTA DE JORNADAS =====");

    for (Jornada jornada : jornadas) {
      System.out.println(jornada.toString());
      System.out.print("\t============================");
    }
    Views.pausar(Views.scan);
  }

  @Override
  public void carregarArquivo(String nomeArquivo) {
    jornadas = ArquivoJornadas.carregarDeArquivo(nomeArquivo);

    if (jornadas != null) {
      jornadas = ArquivoJornadas.carregarDeArquivo(nomeArquivo);
    }

  }

  @Override
  public void salvarArquivo(String nomeArquivo) {
    ArquivoJornadas.salvarEmArquivo(jornadas, nomeArquivo);

  }
}