/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto5tosemestres;

/**
 *
 * @author Wine
 */
public class Vehiculo {
   
    private String placa;
    private String color;
    private String linea;
    private String modelo;
    private String propietario;
    public Vehiculo(String placa, String color, String linea, String modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }
    public String getPlaca (){
        return placa; 

    }
    public void setPlaca (String Placa){
        this.placa = placa; 
    }
    public String getColor(){
        return color; 
    }
    public void setColor (){
       this.color = color; 
    }
    public String getLinea (){
        return linea; 
    }
    public void setLinea (String linea){
        this.linea = linea; 
    }
    public String getModelo (){
        return modelo; 
    }
    public void setModelo (String modelo){
        this.modelo = modelo; 
    }
    public String getPropietario (){
        return propietario;
        
    }
    public void setPropietario (String propietario){
        this.propietario = propietario; 
    }
 @Override
        public String toString() {
            return "Vehiculo{" +
                    "placa='" + placa + '\'' +
                    ", color='" + color + '\'' +
                    ", línea='" + linea + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", propietario='" + propietario + '\'' +
                    '}';   
}

}

