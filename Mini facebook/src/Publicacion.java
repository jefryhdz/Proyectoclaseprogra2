
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
public class Publicacion implements Serializable {

    private Usuario user;
    private post p;
    private static final long SerialVersionUID = 771L;
    
    public Publicacion(Usuario user, post p) {
        this.user = user;
        this.p = p;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public post getP() {
        return p;
    }

    public void setP(post p) {
        this.p = p;
    }

  

}
