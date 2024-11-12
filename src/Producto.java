public enum Producto {
    doritos(1), leche(2), chocoFlackes(3), platanos(4), jamon(5),
    yatekomo(6), legia(7), bacalao(8), mochi(9), papelHigienico(10);
    private final int valor;

    // Constructor
    Producto(int valor) {
        this.valor = valor;
    }

    // Getter para el valor
    public int getValor() {
        return valor;
    }

    // Método para obtener el nombre del enum a partir de su valor
    public static Producto fromValor(int valor) {
        for (Producto item : Producto.values()) {
            if (item.getValor() == valor) {
                return item;
            }
        }
        throw new IllegalArgumentException("Valor no encontrado: " + valor);
    }
}
