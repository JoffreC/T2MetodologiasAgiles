/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carol
 */
public class Ejemplar {

    private int idEjemplar;
    private String idLibro, estadoEjemplar;

    public Ejemplar(int idEjemplar, String idLibro, String estadoEjemplar) {
        this.idEjemplar = idEjemplar;
        this.idLibro = idLibro;
        this.estadoEjemplar = estadoEjemplar;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getEstadoEjemplar() {
        return estadoEjemplar;
    }

    public void setEstadoEjemplar(String estadoEjemplar) {
        this.estadoEjemplar = estadoEjemplar;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", idLibro=" + idLibro + ", estadoEjemplar=" + estadoEjemplar + '}';
    }
    
    

}
