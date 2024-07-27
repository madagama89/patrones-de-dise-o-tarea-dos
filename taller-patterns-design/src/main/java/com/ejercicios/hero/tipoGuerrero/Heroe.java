package main.java.com.ejercicios.hero.tipoGuerrero;

import main.java.com.ejercicios.hero.habilidades.Ataque;
import main.java.com.ejercicios.hero.habilidades.Defensa;
import main.java.com.ejercicios.hero.habilidades.HabilidadMagica;

import java.util.List;

public abstract class Heroe {
    public String nombre;
    public String traje;
    public String cabello;
    public String colorOjos;
    public String tipoSombrero;
    public String tipoCapa;
    private int experiencia;
    private String nivel;
    private List<Ataque> ataques;
    private List<Defensa> defensa;
    private List<HabilidadMagica> habilidadMagica;
    private List<Integer> registroExperiencia;
    private List<String> registroNivel;

    public String getNivel() {
        return nivel;
    }

    public List<String> getRegistroNivel() {
        return registroNivel;
    }

    public List<Integer> getRegistroExperiencia() {
        return registroExperiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public List<Defensa> getDefensa() {
        return defensa;
    }

    public List<HabilidadMagica> getHabilidadMagica() {
        return habilidadMagica;
    }

    public Heroe(String nombre, String traje, String cabello, String colorOjos, String tipoSombrero, String tipoCapa, List<Ataque> ataques, List<Defensa> defensa, List<HabilidadMagica> habilidadMagica, List<Integer> registroExperiencia, List<String> registroNivel ) {
        this.nombre = nombre;
        this.traje = traje;
        this.cabello = cabello;
        this.colorOjos = colorOjos;
        this.tipoSombrero = tipoSombrero;
        this.tipoCapa = tipoCapa;
        this.experiencia = 0;
        this.nivel = "basico";
        this.ataques = ataques;
        this.defensa = defensa;
        this.habilidadMagica = habilidadMagica;
        this.registroExperiencia = registroExperiencia;
        this.registroNivel = registroNivel;
    }

    public Heroe(Heroe heroe)
    {
        if(heroe != null)
        {
            this.nombre = heroe.nombre;
            this.traje = heroe.traje;
            this.cabello = heroe.cabello;
            this.colorOjos = heroe.colorOjos;
            this.tipoSombrero = heroe.tipoSombrero;
            this.tipoCapa = heroe.tipoCapa;
            this.experiencia = heroe.experiencia;
            this.nivel = heroe.nivel;
            this.ataques = heroe.ataques;
            this.defensa = heroe.defensa;
            this.habilidadMagica = heroe.habilidadMagica;
            this.registroExperiencia = heroe.registroExperiencia;
            this.registroNivel = heroe.registroNivel;
        }
    }

    public void atacar(int tipoAtaque){
        for (Ataque ataques : this.ataques)
        {
            if (ataques.getTipo() == tipoAtaque)
            {
                System.out.println("Iniciando ataque " + ataques.getNombre());
            }

            this.experiencia += ataques.getPuntos();
            ajustarNivel(this.experiencia);
        }
        this.registroExperiencia.add(this.experiencia);
        System.out.println("Experiencia = " + this.experiencia);
        System.out.println("Nivel = " + this.nivel);

    }

    public void defender(int tipoDefensa){
        for (Defensa defensa : this.defensa)
        {
            if (defensa.getTipo() == tipoDefensa)
            {
                System.out.println("Iniciando defensa " + defensa.getNombre());
            }
            this.experiencia += defensa.getPuntos();
            ajustarNivel(this.experiencia);
        }
        this.registroExperiencia.add(this.experiencia);
        System.out.println("Experiencia = " + this.experiencia);
        System.out.println("Nivel = " + this.nivel);
    }

    public void usarHabilidadMagica(int tipoHabilidad)
    {
        for (HabilidadMagica habilidad : this.habilidadMagica)
        {
            if (habilidad.getTipo() == tipoHabilidad)
            {
                System.out.println("Iniciando habilidad magica " + habilidad.getNombre());
            }
            this.experiencia += habilidad.getPuntos();
            ajustarNivel(this.experiencia);
        }
        this.registroExperiencia.add(this.experiencia);
        System.out.println("Experiencia = " + this.experiencia);
        System.out.println("Nivel = " + this.nivel);
    }

    public void verCualidades() {
        System.out.println("\n"+ "======Ver cualidades======");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Cabello:" + this.cabello);
        System.out.println("Color ojos:" + this.colorOjos);
        System.out.println("Tipo sombrero:" + this.tipoSombrero);
        System.out.println("Tipo capa:" + this.tipoCapa);
        System.out.println("experiencia: "+ this.getExperiencia());
        System.out.println("nivel: "+ this.getNivel());
    }

    public void verHabilidadesDeCombate() {
        System.out.println("======Habilidades de Combate======");
        System.out.println("==="+this.nombre+"===");
        System.out.print("Ataques: ");
        for(Ataque ataque :  this.getAtaques())
        {
            System.out.print(" , "+ataque.getNombre());
        }
        System.out.print("\n"+"Defensa: ");
        for(Defensa defensa :  this.getDefensa())
        {
            System.out.print(" , "+defensa.getNombre());
        }
        System.out.print("\n"+"Habilidad magica: ");
        for(HabilidadMagica habilidad :  this.getHabilidadMagica())
        {
            System.out.print(" , "+habilidad.getNombre());
        }
        System.out.println();
    }

    public void verHistorialExperiencia() {
        System.out.println("\n"+ "Experiencia de: " + this.nombre);
        System.out.println("Experiencia: ");
        for(Integer registroExperiencia : this.getRegistroExperiencia())
        {
            System.out.print(registroExperiencia);
            System.out.print(" - ");
        }
        System.out.println();
    }


    public void verHistorialNivel() {
        System.out.println("\n"+ "Nivel de: " + this.nombre);
        System.out.println("Nivel: ");
        for(String registroNivel : this.getRegistroNivel())
        {
            System.out.print(registroNivel);
            System.out.print(" - ");
        }
        System.out.println();
    }

    public abstract Heroe clone();

    private void ajustarNivel(int experiencia) {
        if(experiencia > 5 && experiencia <= 10)
        {
            this.nivel = "Medio";
        } else if (experiencia > 10) {
            this.nivel = "Alto";
        }

        this.registroNivel.add(this.nivel);
    }
}

