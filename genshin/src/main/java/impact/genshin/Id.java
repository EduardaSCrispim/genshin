package impact.genshin;

public class Id {

    private static Integer contador = 0;
    private Integer id;

    public Id() {
        contador++;
        this.id = contador;
    }

    public Integer getId() {
        return id;
    }
}
