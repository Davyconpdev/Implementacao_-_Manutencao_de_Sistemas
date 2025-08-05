package entidades;

public class Moto extends Veiculo{
    
    protected int cilindradas;
    
    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public String GetMarca(){
        return marca;
    }
    
    @Override
    public String GetModelo(){
        return modelo;
    }
   
    protected void SetCilindrada(int cilindradas){
        this.cilindradas = cilindradas;
    }
    public int GetCilindrada(){
        return this.cilindradas;
    }
 
    @Override
    public String Dirigir(){
        return "\nPilotando uma moto "+this.GetMarca()+" "+this.GetModelo()+" com "+this.GetCilindrada()+" cilindradas.";
    }
}
