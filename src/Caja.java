public class Caja {
    int id;
    public Caja(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void run(Cliente cliente){
        Thread t = new Thread(cliente::quitarcarito);
    }
}
