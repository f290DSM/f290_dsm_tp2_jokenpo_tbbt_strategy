package domain;

public enum TipoAlgoritmo {
    PAPEL(1),
    TESOURA(2),
    PEDRA(3),
    LAGARTO(4),
    SPOCK(5);

    private Integer id;

    TipoAlgoritmo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public static TipoAlgoritmo getTipo(Integer pId) {
        for(TipoAlgoritmo t: TipoAlgoritmo.values()) {
            if(t.getId().equals(pId)) return t;
        }
        throw new RuntimeException("Tipo algoritmo inválido.");
    }

}
