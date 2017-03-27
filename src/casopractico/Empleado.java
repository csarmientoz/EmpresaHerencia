package casopractico;

public class Empleado {

    protected String nombre;
    protected int identificacion;
    protected int edad;
    protected String estadoCivil;
    protected double salario;

    public Empleado(String nombre, int identificacion, int edad, String estadoCivil, double salario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", salario=" + salario + '}';
    }

}
