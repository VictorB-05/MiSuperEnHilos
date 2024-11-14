import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {



        Cliente cliente1 = new Cliente("Pepe");
        Cliente cliente2 = new Cliente("Paco");
        Cliente cliente3 = new Cliente("Marta");
        Cliente cliente4 = new Cliente("Diego");
        Cliente cliente5 = new Cliente("Nycko");
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        for (Cliente cliente : clientes){
            int tam = (int) ((Math.random()*4)+1);
            for(int i = 0; i<=tam;i++){
                int aux = (int) ((Math.random()*10)+1);
                cliente.carritoAdd(Producto.fromValor(aux));
            }
        }

        Caja caja1 = new Caja(1);
        Caja caja2 = new Caja(2);


        Iterator<Cliente> cola = clientes.iterator();
        Thread t = new Thread(()->{
            while (cola.hasNext()){
                String res = "";
                long initialTime = System.currentTimeMillis();
                res = caja1.run(cola.next());
                System.out.println(res+"Tiempo: "+(System.currentTimeMillis() - initialTime));
            }
        });
        Thread t1 = new Thread(()->{
            while (cola.hasNext()){
                String res = "";
                long initialTime1 = System.currentTimeMillis();
                res = caja2.run(cola.next());
                System.out.println(res+"Tiempo: "+(System.currentTimeMillis() - initialTime1));
            }
            System.currentTimeMillis();
        });
        t.start();
        t1.start();

    }
}