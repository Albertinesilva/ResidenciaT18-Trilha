package atvEmSala.P005.Repositories;

import java.util.List;

import atvEmSala.P005.entities.Cobrador;

public interface CobradorRepository {
  
  public void adicionar(Cobrador cobrador);
  
   public List<Cobrador> getCobradores();

  public void cadastrarCobrador();

  public void listarCobradores();
}
