//membros estáticos (static)
package util;

public class ComverterDollar {
    public static double IOF = 0.06;

    public static double dollarToReal(double valor, double dollarPreço){
        return valor * dollarPreço * (1.0 + IOF);
    }
}
