/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uniforme;

import dao.UsuariosJpaController;
import entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vbarrera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("LibreriaUniformePU");
        //EntityManager em = emf.createEntityManager();
        UsuariosJpaController u=new UsuariosJpaController(emf);
        Usuarios usuario =new Usuarios();
        usuario.setUsuario("Prueba");
        usuario.setContrasena("2015");
        u.create(usuario);
        List<Usuarios> lista=u.findUsuariosEntities();
        for (Usuarios usuarios : lista) {
            System.out.println(""+usuarios.getUsuario());
        }
    }
    
}
