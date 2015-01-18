package java2_Hashtable;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//se define la variable hash para la clase hashtable
		Hashtable<String,String> hash =new Hashtable<String,String>();
		
		//el metodo put sirve para insertar elementos 
		//el primero es la clave y el segundo los elementos que contiene
		hash.put("a", "anthony");
		hash.put("b", "eduardo");
		hash.put("c", "perez");
		hash.put("d", "serrano");
		
		//el siguiente metodo sirve para mostrar las claves creadas
		Enumeration<String> claves = hash.keys();
		while (claves.hasMoreElements()) {
		  System.out.println(""+"hashtable llaves: " + claves.nextElement());
		}
		//se muestra los elementos que contienen las claves
		System.out.println(hash.get("a"));
		System.out.println(hash.get("c"));
		
	}

}
