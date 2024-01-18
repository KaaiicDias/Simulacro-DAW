import java.util.Arrays;
import java.util.Scanner;

public class Teatro {
    public String nombre;
    public Asiento[][] asientos;

    public Teatro(String nombre) {
        this.nombre = nombre;
        //el teatro siempre tendra un valor por defecto de 10 * 10, por lo que lo declaramos vacio
        //en el constructor
        this.asientos = new Asiento[10][10];
    }

    public void agregarAsiento (int fila, int numero, double precio, boolean vip){
        if (fila>0 && fila<=10 && numero>0 && numero<=10){
            Asiento a = asientos[fila-1][numero-1];
            if (a == null){
                asientos[fila-1][numero-1]=new Asiento(fila,numero,precio,vip);
                System.out.println("asiento insertadp");
            }else {
                System.out.println("Asiento ya en uso");
            }
        }else {
            System.out.println("Asiento no existe");
        }
    }
        /*if (fila>0 && fila<asientos.length && numero>0 && numero<asientos[0].length){
            asientos[fila][numero] = new Asiento(fila, numero,precio,vip);
            System.out.println("Se ha agregado correctamente el asiento");
        }else {
            System.out.println("La posicion introducida no es válida");
        }
    }*/
    public void calcularPrecios (String diaSemana){
        for (int i = 0; i<asientos.length;i++){
            for (int j = 0; j<asientos[i].length;j++){
                Asiento asiento = asientos [i][j];
                if (asientos[i][j]!=null){
                    double precioFinal = asientos[i][j].calcularPrecio(diaSemana);
                    System.out.println(asientos[i][j] + ", precio: " + precioFinal);
                }
            }
        }
    }

    @Override
    public String toString() {
        String salida= "";
        for (int i = 0; i<asientos.length;i++){
            for (int j = 0; j<asientos[i].length;j++){
                Asiento asiento = asientos [i][j];
                if (asientos[i][j]!=null){
                    salida += asientos[i][j];
                }else{
                    salida+= "   -   ";
                }
            }
            salida += "\n";
        }
        return salida;
    }
}
