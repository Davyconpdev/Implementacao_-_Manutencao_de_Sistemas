package br.com.api.veiculos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.veiculos.modelos.VeiculosModelo;
import br.com.api.veiculos.modelos.RespostaModelo;
import br.com.api.veiculos.repositorio.VeiculosRepositorio;

@Service
public class VeiculosServico {
    @Autowired
    private VeiculoRepositorio vr;
    @Autowired
    private RespostaModelo rm;

    public Iterable<VeiculoModelo> listar(){
        return vr.findAll();
    }

    //Metodo para cadastar Veiculo

    public ResponseEntity<?> cadastarAlterar(VeiculosModelo vm,String acao){
        if(vm.getModelo().equals("")){
            rm.setMensage("O modelo do veiculo é obrigatório");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);

        }else if(vm.getMarca().equals("")){
            rm.setMensage("A marca do veiculo é obrigatória");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);

        //Cadastrar e Alterar
        }else if(acao.equals("cadastrar")){
            return new ResponseEntity<VeiculosModelo>(vr.save(vm),HttpStatus.CREATED);
        
        }else{

            return new ResponseEntity<VeiculosModelo>(vr.save(vm),HttpStatus.OK);

        }
    }
    //Remover veiculos
    public ResponseEntity<RespostaModelo> remover (long codigo){
        vr.deleteById(codigo);
        rm.setMensage("O Veiculo foi Removido Com Sucesso");
        return new ResponseEntity<RespostaModelo>(rm,HttpStatus.OK);
    }
}