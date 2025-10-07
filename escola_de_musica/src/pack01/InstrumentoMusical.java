package pack01;

public abstract class InstrumentoMusical {  
    protected String nome;
    protected String material;


    public abstract void tocar();

    public void mostrarInfo(){
        System.out.println("Nome:" + this.nome + " Material: " + this.material);
    };

    public void afinar(String nome){
        System.out.println("Afinando o " + this.nome);
    };
}
