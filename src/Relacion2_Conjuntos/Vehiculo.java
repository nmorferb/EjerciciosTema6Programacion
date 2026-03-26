package Relacion2_Conjuntos;
import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private String nombreTitular;
    private int numPlaza;

    public Vehiculo(String matricula, String nombreTitular) {
        this.matricula = matricula;
        this.nombreTitular = nombreTitular;
        this.numPlaza = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", titular='" + nombreTitular + '\'' +
                ", plaza=" + numPlaza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo v = (Vehiculo) o;
        return matricula.equals(v.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
