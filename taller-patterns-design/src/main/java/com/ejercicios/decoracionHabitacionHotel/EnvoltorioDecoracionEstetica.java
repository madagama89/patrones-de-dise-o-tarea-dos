package main.java.com.ejercicios.decoracionHabitacionHotel;

public class EnvoltorioDecoracionEstetica extends HabitacionesDecoradorBase{

    private String tipoFlores = "Orquídea";
    private String bebidas = "Vino, Corona, Champagne";
    private String servicios = "Tender camas, Limpieza habitación, organizar habitación";

    public EnvoltorioDecoracionEstetica(IDecorarHabitaciones envoltorio) {
        super(envoltorio);
    }

    @Override
    public void agregarBebidas( ) {
        super.agregarBebidas();
        cambiarBebidas();
    }

    @Override
    public void agregarFlores( ) {
        super.agregarFlores();
        cambiarFloresPremium();
    }

    @Override
    public void incluirServicios( ) {
        super.incluirServicios();
        agregarFullServicio();
    }

    private void cambiarBebidas()
    {
        System.out.println("\n Se cambiaron las bebidas por "+ this.bebidas);
    }

    private void cambiarFloresPremium()
    {
        System.out.println("\n Se cambiaron las flores por "+ this.tipoFlores);
    }

    private void agregarFullServicio()
    {
        System.out.println("\n Se actualizarón los servicios de la habitación: "+ this.servicios);
    }
}
