package arreglo;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import clases.Producto;
public class Arregoproductos 
{
	
	private ArrayList<Producto>lista;

    public Arregoproductos() {
    lista = new ArrayList<Producto>();
    }
    
    public void adicionar(Producto p){
        lista.add(p);
    }
    
    public int Tamaño(){
        return lista.size();
    }

    public Producto Obtener(int x){ //x es la posición 
        return lista.get(x);
    }
    public String GenerarCod()    
    {
    	int num = Tamaño() + 1;
        return String.format("P%03d", num);
    }
    public Producto Buscar(String Nom) {
    	for (int i = 0; i<Tamaño();i++) {
    		if(lista.get(i).getNombre().equalsIgnoreCase(Nom)) return lista.get(i);
    	}
    	return null;
    }
    public boolean Modificar(String Nom1, String txtNuevoNombre,String Cate2,double Pre2, int Stock2) {
    	Producto P = Buscar(Nom1);
    	if (P != null) {
    		P.setNombre(txtNuevoNombre);
    		P.setCategoria(Cate2);
    		P.setPrecio(Pre2);
    		P.setStock(Stock2);
    		return true;
    	}
    	else JOptionPane.showInputDialog("Nombre de producto no encontrado, ingreselo correctamente.");
    	return false;
    }
}

