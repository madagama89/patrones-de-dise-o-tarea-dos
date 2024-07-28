package main.java.com.ejercicios;

import main.java.com.ejercicios.decoracionHabitacionHotel.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class mainDecoracionHabitaciones {

    static boolean activarMejoraComida = false;
   static  boolean activarMejoraEstetica = true;

    public static void main(String[] args) {

        IDecorarHabitaciones habitacion = new IDecorarHabitaciones();

       /* Habitaciones habitacion = new Habitaciones("uno");
        HabitacionesDecoradorBase habitacionP = new DecoracionesTipoB(
                new DecoracionesTipoA(
                        new Habitaciones("Uno")
                )
        );*/

        System.out.println("Habitacion sencilla ");
        habitacion.mostrarHabitacion();

        if (activarMejoraComida)
        {
            habitacion = new DecoracionesTipoB(habitacion);
        }
        if (activarMejoraEstetica)
        {
            new DecoracionesTipoA(habitacion);
        }

        /*habitacion.agregarCortinas("Sencilla");
        habitacion.agregarFlores("Rosa");
        habitacion.agregarBebidas("CocaCola");
*/

        System.out.println("Ajsute coritnas");
        System.out.println(habitacion.agregarCortinas("Medio"));

        System.out.println("Habitacion Premiun ");
        habitacion.mostrarHabitacion();
    }
}
