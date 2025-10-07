package pack01;

public class violao extends InstrumentoMusical{
    private int Ncordas;

    public violao(String nome, String material, int Ncordas){
        this.nome = nome;
        this.material = material;
        this.Ncordas = Ncordas;
    };

    public violao(){
        this("Violao", "Madeira", 6);
    };

    
    @Override
    public void tocar(){
        System.out.println("Tocando as cordas do violao...");
    };

    public void afinar(String nome){
        super.afinar(super.nome);
    };

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Cordas: " + this.Ncordas);
    };
}
