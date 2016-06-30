/**
 * Created by professor on 14/06/2016.
 */
public  abstract class FiguraGeometrica {
    protected long id;
    private String color;

    public FiguraGeometrica(long id, String color) {
        this.id = id;
        this.color = color;
    }

    public FiguraGeometrica(long id) {
        this.id = id;
        this.color = "blue";
    }

    public long getId() {
        return id;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();

}
