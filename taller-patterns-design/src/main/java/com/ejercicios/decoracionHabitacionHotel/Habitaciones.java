package main.java.com.ejercicios.decoracionHabitacionHotel;

public class Habitaciones implements IDecorarHabitaciones {

    private String habitacion;
    private String flores = "Margaritas";
    private String bebidas = "Agua";
    private String servicios = "Tender camas";
    private String tipoCortinas = "Sencillas";
    private int camas = 2;

    public Habitaciones(String habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void agregarCortinas() {
        System.out.print("\n La habitacion tiene cortinas: " + this.tipoCortinas);
    }

    @Override
    public void agregarBebidas() {
        System.out.print("\n Se agregaron bebidas " + this.bebidas + " a la habitación");
    }

    @Override
    public void agregarFlores() {
        System.out.print("\n Se agregaron flores " + this.flores + " a la habitación");
    }

    @Override
    public void incluirServicios() {
        System.out.print("\n Se agregaron estos servicios a la habitación: " + this.servicios);
    }

    @Override
    public void agregarCamas() {
        System.out.print("\n La habitación tiene " + this.camas + " camas");
    }
}
