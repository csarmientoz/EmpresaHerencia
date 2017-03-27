package casopractico;

public class Programador extends Empleado {

    private int numLinHora;
    private String lenguaje;

    public Programador(int numLinHora, String lenguaje, String nombre, int identificacion, int edad, String estadoCivil, double salario) {
        super(nombre, identificacion, edad, estadoCivil, salario);
        this.numLinHora = numLinHora;
        this.lenguaje = lenguaje;
    }

    public int getNumLinHora() {
        return numLinHora;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setNumLinHora(int numLinHora) {
        this.numLinHora = numLinHora;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Programador{" + "numLinHora=" + numLinHora + ", lenguaje=" + lenguaje + '}' + super.toString();
    }

}
