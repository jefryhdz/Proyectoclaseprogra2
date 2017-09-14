
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Solicitudes implements Serializable{
    private Usuario emisor;
    private Usuario receptor;
     private static final long SerialVersionUID = 771L;


    public Solicitudes(Usuario emisor, Usuario receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Solicitudes() {
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return emisor.toString();
    }
    
    
}
