
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class Usuario implements Serializable{

    private String nombre;
    private String nickname;
    private String password;
    private String fecha;
    private String pais;
    private ArrayList<Mensaje> mensajes = new ArrayList();
    private ArrayList<Notificacion> notificaciones = new ArrayList();
    private ArrayList<Usuario> amigos = new ArrayList();
    private ArrayList<Solicitudes> solicitudes = new ArrayList();
    private ArrayList<Publicacion> publicaciones = new ArrayList();
    private ArrayList<Publicacion> muro = new ArrayList();
    private Icon fotografia;

    private static final long SerialVersionUID = 771L;

    public Usuario() {
    }

    public Usuario(String nombre, String nickname, String password, String fecha, String pais, Icon fotografia) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.password = password;
        this.fecha = fecha;
        this.pais = pais;
        this.fotografia = fotografia;
    }

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
        this.fotografia = fotografia;
    }

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<Publicacion> getMuro() {
        return muro;
    }

    public void setMuro(ArrayList<Publicacion> muro) {
        this.muro = muro;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ArrayList<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Solicitudes> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitudes> solicitudes) {
        this.solicitudes = solicitudes;
    }


    @Override
    public String toString() {
        return nombre;
    }

}
