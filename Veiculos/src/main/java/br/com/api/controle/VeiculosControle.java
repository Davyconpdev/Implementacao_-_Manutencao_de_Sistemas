package br.com.api.veiculos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.veiculos.modelos.VeiculosModelo;
import br.com.api.veiculos.modelos.RespostaModelo;
import br.com.api.veiculos.servico.VeiculosServico;

@RestController
@CrossOrigin(origins = "*")
public class VeiculosControle {

    @GetMapping("")
    public String rota(){
        return "A API está Funcionando";
    }

    @Autowired
    private VeiculosServico vs;

    @GetMapping("/listar")
    public Iterable <VeiculosModelo>listar(){
        return vs.listar();
    }

    //Cadastrar
    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody VeiculosModelo vm){
        return vs.cadastarAlterar(vm,"cadastrar");
    }

    //Alterar
    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody VeiculosModelo vm){
        return vs.cadastarAlterar(vm,"alterar");
    }

    //Rota Remover
    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<RespostaModelo>remover(@PathVariable long codigo){
        return vs.remover(codigo);
    }
}