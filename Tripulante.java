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
public class Tripulante extends UsuarioMoodle{
    public double[] calificaciones;
    public boolean[] entregas;
    
    public Tripulante(String nombreCompleto, String documentoIdentidad,
            String password, String correo,String descripcion, int n){
        
        super(nombreCompleto,documentoIdentidad,password,correo,descripcion);
        this.entregas=new boolean[n];
        this.calificaciones=new double[n];
        for(int i=0;i<n;i++){
            entregas[i]=false;
            calificaciones[i]=0;
        }
        
    }
    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
    
    public void resolverReto(int retoAEntregar){
        this.entregas[retoAEntregar]=true;
    }
    
    
    
}
