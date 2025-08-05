package br.com.api.veiculos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.veiculos.modelos.VeiculosModelo;

@Repository
public interface VeiculosRepositorio extends CrudRepository<VeiculosModelo,Long>{

    
}