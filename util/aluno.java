package util;

public class aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediaDoTrimestre() {
        return nota1 + nota2 + nota3;
    }
    public double pontosRestantes() {
        if (mediaDoTrimestre() < 60.0) {
            return 60.0 - mediaDoTrimestre();
            }
            else {
            return 0.0;
            }
            }
            
}

