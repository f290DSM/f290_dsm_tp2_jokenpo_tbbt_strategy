import java.util.Random;
import java.util.Scanner;

import domain.Algoritmo;
import domain.Jokenpo;
import domain.Papel;
import domain.TipoAlgoritmo;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione uma das opções:");
        System.out.println("PAPEL: 1");
        System.out.println("TESOURA: 2");
        System.out.println("PEDRA: 3");
        System.out.println("LAGARTO: 4");
        System.out.println("SPOCK: 5");
        System.out.println();

        //TODO: Criar funcao para converter int em Algoritmo
        Algoritmo papel = new Papel();

        //TODO: Gerar  jogada randomica e converter em Enum
        Integer random = new Random().nextInt(5) + 1;
        TipoAlgoritmo computador = TipoAlgoritmo.getTipo(random);

        Jokenpo jokenpo = new Jokenpo();
        jokenpo.setAlgoritmo(papel);

        jokenpo.jogar(computador);

        in.close();
    }

    static Algoritmo geAlgoritmo(Integer id) {
        TipoAlgoritmo tipo = TipoAlgoritmo.getTipo(id);
        switch(tipo) {
            case PAPEL:
                return new Papel();
            case TESOURA:
                return new Papel();
            case PEDRA:
                return new Papel();
            case LAGARTO:
                return new Papel();
            case SPOCK:
                return new Papel();
            default:
             throw new RuntimeException("Tipo inválido.");
        }
    }

}
