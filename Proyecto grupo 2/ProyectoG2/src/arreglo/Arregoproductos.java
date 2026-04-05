package arreglo;
import java.util.ArrayList;
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
}
