package atvEmSala.P005.Repositories;

import java.util.List;

import atvEmSala.P005.entities.Veiculo;

public interface VeiculoRepository {
  
  public void adicionar(Veiculo veiculo);

  public List<Veiculo> getVeiculos();

  public void cadastrarVeiculo();

  public void listarVeiculos();
}