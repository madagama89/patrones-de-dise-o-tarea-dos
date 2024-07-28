package main.java.com.ejercicios.decoracionHabitacionHotel;

public class Habitaciones implements IDecorarHabitaciones{

    private String habitacion;
    private String flores = "Margaritas";
    private String cortinas = "Sencillas";
    private String bebidas = "Agua";

    public Habitaciones(String habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String agregarCortinas(String tipoCortina) {
        this.cortinas = tipoCortina;
        System.out.println("Se agregaron cortinas " + tipoCortina + "a la habitación");
        return  this.cortinas;
    }

    @Override
    public void agregarBebidas(String tipoBebida) {
        System.out.println("Se agregaron bebidas " + tipoBebida + "a la habitación");
        this.bebidas = tipoBebida;
    }

    @Override
    public void agregarFlores(String tipoFlores) {
        this.flores = tipoFlores;
        System.out.println("Se agregaron flores " + tipoFlores + "a la habitación");
    }

    @Override
    public void mostrarHabitacion() {
        System.out.println("---Habitacion---");
        System.out.println(this.bebidas);
        System.out.println(this.cortinas);
        System.out.println(this.flores);
    }

    public  void verHbitaciones()
    {

    }

}
