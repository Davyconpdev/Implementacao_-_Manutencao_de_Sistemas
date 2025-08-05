package entidades;

public class Carro extends Veiculo {
      
    protected int numPortas;
    
    public Carro(String marca, String modelo, int numPortas){
        super(marca,modelo);
        this.numPortas = numPortas;   
    }
    
    @Override
    public String GetMarca(){
        return marca;
    }
    
    @Override
    public String GetModelo(){
        return modelo;
    }
    
    protected void SetNumPorta(int numPortas){
        this.numPortas = numPortas;
    }
    public int GetNumPorta(){
        return numPortas;
    }
     
    @Override
    public String Dirigir(){
        return "\nDirigindo um Carro "+this.GetMarca()+" "+this.GetModelo()+" com "+this.GetNumPorta()+" portas.";
    }
}
