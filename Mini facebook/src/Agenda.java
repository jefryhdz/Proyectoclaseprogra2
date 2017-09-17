
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class Agenda {

    private String nombre;
    private Date fecha;
    private boolean mostar;
    private String anotaciones;
    private int minutos;

    public Agenda(String nombre, Date fecha, boolean mostar, String anotaciones, int minutos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.mostar = mostar;
        this.anotaciones = anotaciones;
        this.minutos = minutos;
    }

    public boolean isMostar() {
        return mostar;
    }

    public void setMostar(boolean mostar) {
        this.mostar = mostar;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.nombre + "\n " + this.anotaciones;
    }

}
