package Punto_2;

import java.util.Iterator;

import Punto_1.Instanciacion;



public class Cine {
	
			
	int[] numero = {1,2,3,4,5};
    int asiento =0;
    int valorVoleta=5000;
    

    public Cine(int [] numero) {
        this.numero = numero;
    }

    public int [] getNumero() {
        return numero;
    }
    
    public int Comprar(int cant) throws Exception {
    	for (int i = 0; i < cant; i++) {
    		asiento = asiento+1;
    		int asientoOcupado = 0;
            try{
            	asientoOcupado=numero[asiento-1];
            }catch(Exception ex){
                System.out.println("NO HAY SUFICIENTES >:V");
	                return 0;
	           }
			}
			return cant*valorVoleta;
	        
	    
		}
    
	    public static void main(java.lang.String[] args)throws Exception{
	    	int [] si = {1,2,3,4,5};
			Cine compra= new Cine(si);
			System.out.println(compra.Comprar(5));
		}
	}



 

