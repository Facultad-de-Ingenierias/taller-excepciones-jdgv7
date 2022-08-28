package Punto_1;

public class Instanciacion {
	public Object crearObjeto()  throws InstantiationException,IllegalAccessException  {
		Class<?> clase = this.getClass();
		return clase.newInstance();
	}

	public static void main(java.lang.String[] args){
		Instanciacion creador = new Instanciacion();
		try {
			Object creado = creador.crearObjeto();
			System.out.println(creado);
			
		} catch (InstantiationException | IllegalAccessException errorCrea) {
			System.out.println("No se pudo crear el objeto");
		}
	}
}

/* agregar el throws en el objeto crearObeto para pode identificar cuales son las excepciones 
 * que generaran el mensaje
 * */
 