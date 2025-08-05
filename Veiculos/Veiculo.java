package entidades;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String GetMarca(){
        return marca;
    }
    
    public String GetModelo(){
        return modelo;
    }
    
    public void exibirDetalhes(){
        System.out.printf("\nMarca: "+this.GetMarca()+". Modelo: "+this.GetModelo()+".");
    }
    
    public String Dirigir(){
        return "";
    }
}
