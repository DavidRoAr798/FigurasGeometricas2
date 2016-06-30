import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica {

    private double base; //private hace que no se pueda acceder externamente
    private double altura;

    public Rectangulo(double base, double altura, long id) {
        super(id); //llamamos al constructor de fig geom.
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea()
    {
        return (base*altura);
    }


    public double calculaPerimetro()
    {
        return (2*base)+(2*altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "id=" + id +
                ", base=" + base +
                ", altura=" + altura +
                "}";
    }
}
