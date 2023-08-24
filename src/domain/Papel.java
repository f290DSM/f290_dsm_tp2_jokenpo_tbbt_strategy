package domain;

public class Papel implements Algoritmo {

    @Override
    public void excecutar(TipoAlgoritmo tipo) {
        switch (tipo) {
            case PEDRA:
                System.out.println("Ganhou! Papel embrulha Pedra.");
                break;
            case SPOCK:
                System.out.println("Ganhou! Papel refuta o Spock.");
                break;
            case TESOURA:
                System.out.println("Perdeu! Tesoura corta o Papel.");
                break;
            case LAGARTO:
                System.out.println("Perdeu! Lagarto come o Papel.");
                break;
            default:
                System.out.println("Empatou! Papel empata com Papel.");

        }
    }

}
