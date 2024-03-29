import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public interface IVolador {
    void despegar() throws AlturaInsuficienteException;

    void calcularAlturaMaxima(int velocidad, int tiempo) throws AlturaInsuficienteException;

    double calcularDistanciaRecorrida(int velocidad, int tiempo);

}
