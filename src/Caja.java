import java.util.ArrayList;

public class Caja {
    int id;
    public Caja(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String run(Cliente next) {

        String resp = "En la caja "+id+" esta "+next.getNombre()+" productos: \n" + next.quitarcarito();
        return resp ;
    }
}
