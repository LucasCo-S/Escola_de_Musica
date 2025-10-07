package pack01;

public class Orquestra {

    public static void apresentar(InstrumentoMusical[] banda){
        for(InstrumentoMusical instr : banda){
            instr.afinar(instr.nome);
        }

        System.out.print("\n");

        for(InstrumentoMusical instr : banda){
            instr.tocar();
        }
    }

    public static void conferir(InstrumentoMusical[] instrumentos){
        for(InstrumentoMusical instr : instrumentos){
            instr.mostrarInfo();
        }
    }

        public static void main(String[] args){
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new violao();
        banda[1] = new saxofone();
        banda[2] = new piano();
        banda[3] = new bateria();

        Orquestra.apresentar(banda);
    }
}
