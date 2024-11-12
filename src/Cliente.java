import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Producto> carrito = new ArrayList<Producto>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void carritoAdd(Producto producto){
        carrito.add(producto);
    }

    public int carritoSize(){
        return carrito.size();
    }
}
