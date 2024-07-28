package main.java.com.ejercicios.decoracionHabitacionHotel;

public class DecoracionesTipoA extends HabitacionesDecoradorBase{

    private int numberoCamas = 2;
    private String colorCortinas = "Verde";

    public int getNumberoCamas() {
        return numberoCamas;
    }

    public void setNumberoCamas(int numberoCamas) {
        this.numberoCamas = numberoCamas;
    }

    public DecoracionesTipoA(IDecorarHabitaciones envoltorio) {
        super(envoltorio);
    }

    @Override
    public String agregarCortinas(String tipoCortina) {
        return  super.agregarCortinas(cambiarColorCoritnas(tipoCortina));

    }

    @Override
    public void agregarBebidas(String tipoBebida) {
        super.agregarBebidas(tipoBebida);
    }

    @Override
    public void agregarFlores(String tipoFlores) {
        super.agregarFlores(tipoFlores);
    }

    public void adicionarCamas()
    {
        System.out.println("Camas adicionales: " + 2);
    }

    public String cambiarColorCoritnas(String tipoCortinas)
    {
       return tipoCortinas + colorCortinas;
    }

}
