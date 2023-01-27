/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra;

/**
 *
 * @author DANIC
 */
public class Telefono {
    private String tipoDeTelefono;
    private String marcaDeTelefono;
    private String numeroDeTelefono;

    public String getTipoDeTelefono() {
        return tipoDeTelefono;
    }

    public String getMarcaDeTelefono() {
        return marcaDeTelefono;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public String getOperador() {
        return operador;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }
    private String operador;
    private String tipoDeContrato;
    
    public Telefono(String tipoDeTelefono, String marcaDeTelefono, String numeroDeTelefono, String operador, 
            String tipoDecontrato){
        this.tipoDeTelefono= tipoDeTelefono;
        this.marcaDeTelefono = marcaDeTelefono;
        this.numeroDeTelefono = numeroDeTelefono;
        this.operador = operador;
        this.tipoDeContrato = tipoDeContrato;
    }
    
}
