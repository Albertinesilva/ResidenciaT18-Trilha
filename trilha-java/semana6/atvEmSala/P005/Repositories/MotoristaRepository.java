package atvEmSala.P005.Repositories;

import java.util.List;

import atvEmSala.P005.entities.Motorista;

public interface MotoristaRepository {
  
  public void adicionar(Motorista motorista);

  public List<Motorista> getMotoristas();

  public void cadastrarMotorista();

  public void listarMotoristas();
}
