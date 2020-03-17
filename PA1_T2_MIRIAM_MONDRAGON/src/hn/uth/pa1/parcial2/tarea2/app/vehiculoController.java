/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.tarea2.app;


import hn.uth.pa1.parcial2.tarea2.app.objetos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miriam
 */
public class vehiculoController {
    
    private static List<Vehiculo> listaVehiculos
            = new ArrayList<>();
    
    public static Object[][] getListaAlumnosComoArreglo(){
        Object arreglo[][]=new Object[listaVehiculos.size()][9];
        
        int indice=0;
        for (Vehiculo vehiculoTmp : listaVehiculos) {
            arreglo[indice][0]=vehiculoTmp.getPlaca();
            arreglo[indice][1]=vehiculoTmp.getMarca();
            arreglo[indice][2]=vehiculoTmp.getModelo();
            arreglo[indice][3]=vehiculoTmp.getAnio();
            arreglo[indice][4]=vehiculoTmp.getMotor();
            arreglo[indice][5]=vehiculoTmp.getPrecio();
            arreglo[indice][6]=vehiculoTmp.getNombre();
            arreglo[indice][7]=vehiculoTmp.getDescripcion();
            arreglo[indice][8]=vehiculoTmp.getImagen();
            indice++;
        }
        
        return arreglo;
    }
    
}
