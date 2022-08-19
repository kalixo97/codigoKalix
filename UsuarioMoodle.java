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
public class UsuarioMoodle {
    public String nombreCompleto;
    public String documentoIdentidad;
    public String password;
    public String correo;
    public String descripcion; 

    public UsuarioMoodle(String nombreCompleto, String documentoIdentidad,
            String password, String correo,String descripcion){
        
        //this.nombreCompleto=nombre;
        //this.documentoIdentidad=DI;
        //this.correo=email;
        
        this.nombreCompleto=nombreCompleto;
        this.documentoIdentidad=documentoIdentidad;
        this.password=password;
        this.correo=correo;
        this.descripcion=descripcion;
    }
    
    public void editarPerfil(String nombre, String DI, String password, String email,
    String descripcion){
        
        nombreCompleto=nombre;
        documentoIdentidad=DI;
        this.password=password;
        correo=email;
        this.descripcion=descripcion;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   
}
