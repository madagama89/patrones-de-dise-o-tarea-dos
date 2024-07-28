package main.java.com.ejercicios.decoracionHabitacionHotel;

public class DecoracionesTipoB extends HabitacionesDecoradorBase{

    private String tipoMesa;

    public String getTipoMesa() {
        return tipoMesa;
    }

    public void setTipoMesa(String tipoMesa) {
        this.tipoMesa = tipoMesa;
    }

    public DecoracionesTipoB(IDecorarHabitaciones envoltorio) {
        super(envoltorio);
    }

    @Override
    public String agregarCortinas(String tipoCortina) {
        return super.agregarCortinas(tipoCortina);
    }

    @Override
    public void agregarBebidas(String tipoBebida) {
        super.agregarBebidas(tipoBebida);
    }

    @Override
    public void agregarFlores(String tipoFlores) {
        super.agregarFlores(tipoFlores);
    }

    public void agregarMesa(String tipoMesa) {
        this.tipoMesa = tipoMesa;
    }


}
