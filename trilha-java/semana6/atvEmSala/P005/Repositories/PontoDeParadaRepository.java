package atvEmSala.P005.Repositories;

import atvEmSala.P005.entities.PontosDeParada;

public interface PontoDeParadaRepository {
  
  public void adicionar(PontosDeParada pontoDeParada);

  public void cadastrarPontoDeParada();

  public void listarPontosDeParada();

  public String trajetoEmbarque();

  public String trajetoDesembarque();
}
