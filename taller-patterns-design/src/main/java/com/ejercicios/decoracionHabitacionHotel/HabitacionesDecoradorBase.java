package main.java.com.ejercicios.decoracionHabitacionHotel;

public abstract class HabitacionesDecoradorBase implements IDecorarHabitaciones{

    private IDecorarHabitaciones envoltorio;

    public HabitacionesDecoradorBase(IDecorarHabitaciones envoltorio) {
        this.envoltorio = envoltorio;
    }

    @Override
    public void agregarCortinas() {
        envoltorio.agregarCortinas();
    }

    @Override
    public void agregarBebidas() {
        envoltorio.agregarBebidas();
    }

    @Override
    public void agregarFlores() {
        envoltorio.agregarFlores();
    }

    @Override
    public void incluirServicios() {
        envoltorio.incluirServicios();
    }

    @Override
    public void agregarCamas() {
        envoltorio.agregarCamas();
    }
}
