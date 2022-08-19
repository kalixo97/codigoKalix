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
public class Lanzadora {
    
    public static void main(String[] args) {
            
        Tripulante Kalix = new Tripulante(
                "Kalix Osorio",
                "1070981942",
                "konoha-123",
                "kalix530@gmail.com",
                "Soy una persona con muchas ganas de aprender",
                5
        );

        Formador Jane = new Formador(
                "3D",
                "Jane Di",
                "1678909342",
                "jane-86",
                "jane.di@hotmail.es",
                "Me apasiona enseñar"
        );        
        
        
        Kalix.resolverReto(1);
        Kalix.resolverReto(2);
        Kalix.resolverReto(3);
        
        for(int i=0;i<5;i++){
            Jane.calificar(Kalix, i);
        }
        
        Kalix.editarPerfil("Kalix Osorio","1070981942", "kalix123", "kjao1213@hotmail.com",
                            "Estoy muy feliz ene ste programa");
        Jane.editarPerfil("Jane de Maria Di","123456789","98765432","jane.di@udea.com",
                            "Enamorada de la vida!");
        
        
        System.out.println("Nombre completo: "+Kalix.getNombreCompleto());
        System.out.println("Documento Identificacion: "+Kalix.getDocumentoIdentidad());
        System.out.println("Contraseña: "+Kalix.getPassword());
        System.out.println("E-mail: "+Kalix.getCorreo());
        System.out.println("Descripcion: "+Kalix.getDescripcion());
        
        
        System.out.print("Entregas: "+Kalix.getEntregas()[0]+", "
                        +Kalix.getEntregas()[1]+", "
                        +Kalix.getEntregas()[2]+", "
                        +Kalix.getEntregas()[3]+", "
                        +Kalix.getEntregas()[4]+", ");
        System.out.println();
        System.out.print("Calificaciones: "+Kalix.getCalificaciones()[0]+", "
                        +Kalix.getCalificaciones()[1]+", "
                        +Kalix.getCalificaciones()[2]+", "
                        +Kalix.getCalificaciones()[3]+", "
                        +Kalix.getCalificaciones()[4]+", ");
        System.out.println();

        System.out.println("Nombre completo: "+Jane.getNombreCompleto());
        System.out.println("Documento Identificacion: "+Jane.getDocumentoIdentidad());
        System.out.println("Contraseña: "+Jane.getPassword());
        System.out.println("E-mail: "+Jane.getCorreo());
        System.out.println("Descripcion: "+Jane.getDescripcion());
        System.out.println("Escalafón: "+Jane.getEscalafon());
        
        
    }
}