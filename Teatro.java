import java.util.Arrays;

public class Teatro {
    public String nombre;
    public Asiento[][] asientos;

    public Teatro(String nombre, Asiento[][] asientos) {
        this.nombre = nombre;
        this.asientos = asientos;
    }

    public void agregarAsiento (int fila, int numero, double precio, boolean vip){
        if (fila>0 && fila<asientos.length && numero>0 && numero<asientos[0].length){
            asientos[fila][numero] = new Asiento(fila, numero,precio,vip);
            System.out.println("Se ha agregado correctamente el asiento");
        }else {
            System.out.println("La posicion introducida no es válida");
        }
    }
    public void calcularPrecios (String diaSemana){
        for (int i = 0; i<asientos.length;i++){
            for (int j = 0; j<asientos[i].length;j++){
                Asiento asiento = asientos [i][j];
                if (asiento!=null){
                    double precioFinal = asiento.calcularPrecio(diaSemana);
                    System.out.println("El asiento: " + asiento + " , con un valor de: " + precioFinal);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Teatro{" +
                "nombre='" + nombre + '\'' +
                ", asientos=" + Arrays.toString(asientos) +
                '}';
    }
}
