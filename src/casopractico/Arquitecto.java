package casopractico;

public class Arquitecto extends Empleado {

    private int cantProyPar;

    public Arquitecto(int cantProyPar, String nombre, int identificacion, int edad, String estadoCivil, double salario) {
        super(nombre, identificacion, edad, estadoCivil, salario);
        this.cantProyPar = cantProyPar;
    }

    public int getCantProyPar() {
        return cantProyPar;
    }

    public void setCantProyPar(int cantProyPar) {
        this.cantProyPar = cantProyPar;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "cantProyPar=" + cantProyPar + '}' + super.toString();
    }

}
