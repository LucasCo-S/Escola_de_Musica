package pack01;

public class saxofone extends InstrumentoMusical{
    private String tipo;

    public saxofone(String nome, String material, String tipo){
        this.nome = nome;
        this.material = material;
        this.tipo = tipo;
    };

    public saxofone(){
        this("Saxofone", "Latão", "Alto");
    };

    @Override

    public void tocar(){
        System.out.println("Tocando saxofone...");
    };

    public void afinar(){
        super.afinar(nome);
    };

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo:" + this.tipo);
    };
}
