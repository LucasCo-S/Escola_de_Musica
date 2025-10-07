package pack01;

public class piano extends InstrumentoMusical{
    private int Netclas;

    public piano(String nome, String material, int Nteclas){
        this.nome = nome;
        this.material = material;
        this.Netclas = Nteclas;
    };

    public piano(){
        this("Piano", "Madeira", 88);
    };

    @Override
    public void tocar(){
        System.out.println("Tocando uma bela melodia no piano...");
    };

    public void afinar(){
        super.afinar(this.nome);
    };

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Teclas: " + this.Netclas);
    }
}
