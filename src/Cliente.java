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

    public String getNombre() {
        return nombre;
    }

    public int carritoSize(){
        return carrito.size();
    }

    public synchronized String quitarcarito(){
        StringBuilder listaProductos = new StringBuilder();
        if(iterator == null){
            iterator = carrito.iterator();
        }
        while(iterator.hasNext()) {
            listaProductos.append(iterator.next()).append("\n");
        }
        return listaProductos.toString();
    }
}
