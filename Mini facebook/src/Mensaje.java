/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Mensaje {

    private String Emisor;
    private String Receptor;
    private String Mesaje;

    public Mensaje() {
    }

    public Mensaje(String Emisor, String Receptor, String Mesaje) {
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Mesaje = Mesaje;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public String getMesaje() {
        return Mesaje;
    }

    public void setMesaje(String Mesaje) {
        this.Mesaje = Mesaje;
    }

}
