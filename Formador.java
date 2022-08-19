/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3;

/**
 *
 * @author USER
 */
public class Formador extends UsuarioMoodle{

    /**
     *
     */
    public String escalafon;

    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad,
            String password, String correo, String descripcion){
        super(nombreCompleto,documentoIdentidad,password,correo,descripcion);
        this.escalafon=escalafon;
    }
    
    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }

    public void calificar(Tripulante tripulanteACalificar, int k){
        
        if(tripulanteACalificar.getEntregas()[k]==false){
            tripulanteACalificar.calificaciones[k]=0;
        }
        else{
            tripulanteACalificar.calificaciones[k]=5;
        }
    }
    
}
