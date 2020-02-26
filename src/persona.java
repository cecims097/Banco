/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class persona {
    private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int nip;
    private int numTarjeta;
    private float fondos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public float getFondos() {
        return fondos;
    }

    public void setFondos(float fondos) {
        this.fondos = fondos;
    }
    
    @Override
    public String toString() {
        return "persona{" + "id= " + id + " Nombre: " + nombre + " ApellidoP: " + apellidoP + " ApellidoM: " + apellidoM + " nip: " + nip + " numTarjeta: " + numTarjeta + " fondos: " + fondos + '}';
    }
}
