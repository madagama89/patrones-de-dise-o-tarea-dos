package main.java.com.ejercicios;

import main.java.com.ejercicios.decoracionHabitacionHotel.*;

public class mainDecoracionHabitaciones {

    static boolean activarMejoraEstrucutral = false;
   static  boolean activarMejoraEstetica = false;

    public static void main(String[] args) {

       //Implementacion 1
        Habitaciones habitacion = new Habitaciones("Suite");
        HabitacionesDecoradorBase habitacionuite = new EnvoltorioDecoracionEstructural(
                new EnvoltorioDecoracionEstetica(
                        habitacion
                )
        );

        habitacionuite.agregarCortinas();
        habitacionuite.agregarCamas();

        habitacionuite.agregarFlores();
        habitacionuite.agregarBebidas();
        habitacionuite.incluirServicios();

        
        //Implementacion 2
        IDecorarHabitaciones habitacionPrincipal ;
        habitacionPrincipal = new Habitaciones("Principal");


        //Cambiar el valor de las variables para activar las modificaciones
        if (activarMejoraEstrucutral)
        {
            System.out.println("Personalizar estrucutra habitación");
            habitacionPrincipal = new EnvoltorioDecoracionEstructural(habitacionPrincipal);
        }
        if (activarMejoraEstetica)
        {
            System.out.println("Personalizar estetica habitación");
            habitacionPrincipal =  new EnvoltorioDecoracionEstetica(habitacionPrincipal);
        }

        habitacionPrincipal.agregarCortinas();
        habitacionPrincipal.agregarCamas();

        habitacionPrincipal.agregarFlores();
        habitacionPrincipal.agregarBebidas();
        habitacionPrincipal.incluirServicios();
    }
}
