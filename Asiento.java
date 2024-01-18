
import java.util.Scanner;

public class Asiento {
    public int fila;
    public int numero;
    public double precio;
    public boolean vip;
    //va a haber un array normal en el examen qeu sustituiria este ejercicio
    public Asiento(int fila, int numero, double precio, boolean vip) {
        this.fila = fila;
        this.numero = numero;
        this.precio = precio;
        this.vip = vip;
    }

    public double calcularPrecio (String diaSemana) {
        double precioEntrada = precio;
        //hacen falta que el if indique las opciones de si es martes y no es vip, etc
        if (diaSemana.equals("Martes")) {
            precioEntrada = 0.8 * precio;
        }

        if (vip) {
            precioEntrada = 1.2 * precio;
        }
        return precioEntrada;
    }
    @Override
    public String toString() {
        String salida = "";
        if (vip){
            salida = "F" + fila + " - V" + numero;
        }else {
            salida = "F" + fila + " - A" + numero;
        }
        return salida;
    }
