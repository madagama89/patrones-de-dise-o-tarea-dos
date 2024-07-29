package main.java.com.ejercicios.decoracionHabitacionHotel;

public class EnvoltorioDecoracionEstructural extends HabitacionesDecoradorBase{

    private int numberoCamas = 4;
    private String tipoCortinas = "Premium";
    private String colorCortinas = "Azul celeste";

    public EnvoltorioDecoracionEstructural(IDecorarHabitaciones envoltorio) {
        super(envoltorio);
    }

    @Override
    public void agregarCortinas() {
        super.agregarCortinas();
        cambiarTipoCoritinas();
        cambiarColorCortinas();
    }

    @Override
    public void agregarCamas() {
        super.agregarCamas();
        adicionarCamas();
    }

    public void adicionarCamas()
    {
        System.out.println("\n se agregan " + this.numberoCamas + " camas a la habitación");
    }

    public void cambiarTipoCoritinas()
    {
        System.out.println(" , se cambian las cortinas a "+this.tipoCortinas);
    }

    public void cambiarColorCortinas()
    {
        System.out.println("Color cortinas "+this.colorCortinas);
    }
}
