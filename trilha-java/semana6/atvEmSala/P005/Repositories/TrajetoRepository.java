package atvEmSala.P005.Repositories;

import java.util.List;

import atvEmSala.P005.entities.Trajeto;

public interface TrajetoRepository {
  

  public void adicionar(Trajeto trecho);

  public List<Trajeto> getTrajetos();

  public void cadastrarTrajeto();

  public void registroDeTrajeto();

  public void listarTrajetos();
}
