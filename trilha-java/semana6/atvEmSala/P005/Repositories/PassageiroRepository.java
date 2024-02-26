package atvEmSala.P005.Repositories;

import java.util.List;

import atvEmSala.P005.entities.Passageiro;

public interface PassageiroRepository {
  
  public void adicionar(Passageiro passageiro);

  public List<Passageiro> getPassageiros();

  public void cadastrarPassageiro();

  public void listarPassageiros();

  public void registroDePassageiroEmbarcadoComCartao();

  public void registroDePassageiros();

}