package Punto_5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Producto {
    String tipo;
    double Precio;
    String nombre;

    public Producto(String tipo, double Precio, String nombre) {
        this.tipo = tipo;
        this.Precio = Precio;
        this.nombre = nombre;
    }

    public Producto(String tipo, double Precio) {
        this.tipo = tipo;
        this.Precio = Precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public double calcularIva(){
        try{
            if (this.Precio < 0) {
                throw new  Exception("no se puede calcular un valor negativo");
            }
           if(tipo.equals("Basico")){
               return  Precio+(Precio*0.10);
           }else if(tipo.equals("Cultural")){
               return  Precio;
           }else {
               return  Precio+(Precio*0.19);
           }
    
        }catch(Exception ex){
            System.out.println(ex);
        }
        return 0;         
    }
    
    public static void main(String[] args) {
        Producto producto = new Producto("Basico", -19000,"telefono");
        
        producto.calcularIva();
    }
}