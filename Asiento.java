import java.util.Scanner;

public class Asiento {
    public int fila;
    public int numero;
    public double precio;
    public boolean vip;

    public Asiento(int fila, int numero, double precio, boolean vip) {
        this.fila = fila;
        this.numero = numero;
        this.precio = precio;
        this.vip = vip;
    }

    public double calcularPrecio (String diaSemana){
        Scanner sc = new Scanner(System.in);
        diaSemana = sc.nextLine();
        double precioEntrada = sc.nextInt();
        if (diaSemana.equals("Martes")){
            precioEntrada = (precioEntrada-(precioEntrada*0.2));
        }else {
            precioEntrada = precioEntrada;
        }
        boolean entradaVip = true;
        if (!entradaVip){
            precioEntrada = precioEntrada;
        }else {
            precioEntrada = (precioEntrada+(precioEntrada*0.2));
        }
        return precioEntrada;
    }

    @Override
    public String toString() {
        return "Asiento =b" +
                "F: " + fila +
                ", numero" + "A: " + " + numero " +
                ", vip=" + vip +
                '}';
    }
}
