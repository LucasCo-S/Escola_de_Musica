package pack01;

public class bateria extends InstrumentoMusical{
    private int Npecas;

    public bateria(String nome, String material, int Npecas){
        this.nome = nome;
        this.material = material;
        this.Npecas = Npecas;
    };

    public bateria(){
        this("Bateria", "Lítio", 4);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando uma bateria...");
    }

    public void afinar(){
        super.afinar(this.nome);
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Pecas: " + this.Npecas);
    }
}
