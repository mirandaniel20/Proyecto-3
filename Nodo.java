/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto5tosemestres;

/**
 *
 * @author Wine
 */
public class Nodo {
private Vehiculo vehiculo;
private Nodo arriba;
private Nodo abajo;
private Nodo izquierda;
private Nodo derecha;

public Nodo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
    this.arriba = null;
    this.abajo = null;
    this.izquierda = null;
    this.derecha = null; 
    
}
public Vehiculo getVehiculo() {
    return vehiculo;
}
public Nodo getArriba() {
    return arriba;
}
public void setArriba (Nodo arriba) {
    this.arriba = arriba;
}
public Nodo getAbajo() {
    return abajo;
}
public void setAbajo (Nodo abajo) {
    this.abajo = abajo;
}
public Nodo getIzquierda (){
    return izquierda;
}
public void setIzquierda (Nodo izquierda){
    this.izquierda = izquierda;
}
public Nodo getDerecha (){
    return derecha;
}
public void setDerecha (Nodo derecha){
    this.derecha = derecha;
}
}

