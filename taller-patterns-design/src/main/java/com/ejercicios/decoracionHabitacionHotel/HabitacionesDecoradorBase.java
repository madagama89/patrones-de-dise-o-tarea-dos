package main.java.com.ejercicios.decoracionHabitacionHotel;

public class HabitacionesDecoradorBase implements IDecorarHabitaciones{

    private IDecorarHabitaciones envoltorio;


    public HabitacionesDecoradorBase(IDecorarHabitaciones envoltorio) {
        this.envoltorio = envoltorio;
    }

    @Override
    public String agregarCortinas(String tipoCortina) {
        return envoltorio.agregarCortinas(tipoCortina);
    }

    @Override
    public void agregarBebidas(String tipoBebida) {
        envoltorio.agregarBebidas(tipoBebida);
    }

    @Override
    public void agregarFlores(String tipoFlores) {
        envoltorio.agregarFlores(tipoFlores);
    }

    @Override
    public void mostrarHabitacion() {
        envoltorio.mostrarHabitacion();
    }
}
