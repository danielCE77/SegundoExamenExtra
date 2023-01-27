/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra;

/**
 *
 * @author DANIC
 */
public class Acciones extends Telefono{
    private char llamada;
    private char mensaje;
    
    public Acciones(char llamada, char mensaje, String tipoDeTelefono, String marcaDeTelefono, String numeroDeTelefono, String operador, 
            String tipoDecontrato){
        super(tipoDeTelefono, marcaDeTelefono, numeroDeTelefono, operador, tipoDecontrato);
        this.llamada = llamada;
        this.mensaje = mensaje;
    }
    
    public char recibirLlamada(char llamada){
        return llamada;
    }
    
    public char realizarLlamada(char llamada){
        return llamada;
    }
    public char recibirMensaje(char mensaje){
        return mensaje;
    }
    
    public char enviarMensaje(char mensaje){
        return mensaje;
    }
}
