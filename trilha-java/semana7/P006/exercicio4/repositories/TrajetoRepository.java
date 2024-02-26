package P006.exercicio4.repositories;

import java.util.List;

import P006.exercicio4.entities.Trajeto;

public interface TrajetoRepository {
  

  public void adicionar(Trajeto trecho);

  public List<Trajeto> getTrajetos();

  public void cadastrarTrajeto();

  public void registroDeTrajeto();

  public void listarTrajetos();

  public void carregarArquivo(String nomeArquivo);

  public void salvarArquivo(String nomeArquivo);
}
