import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
    private String nombre;
    private ArrayList<Producto> carrito = new ArrayList<Producto>();
    private Iterator<Producto> iterator = null;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void carritoAdd(Producto producto){
        if(carritoSize()<=5){
            carrito.add(producto);
        }else{
            System.out.println("Error carrito lleno");
        }
    }

    public int carritoSize(){
        return carrito.size();
    }
    public synchronized void quitarcarito(){
        if(iterator == null){
            iterator = carrito.iterator();
        }
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
