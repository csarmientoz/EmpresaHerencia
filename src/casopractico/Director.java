package casopractico;

public class Director extends Empleado {

    private int añosExp;

    public Director(int añosExp, String nombre, int identificacion, int edad, String estadoCivil, double salario) {
        super(nombre, identificacion, edad, estadoCivil, salario);
        this.añosExp = añosExp;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    @Override
    public String toString() {
        return "Director{" + "a\u00f1osExp=" + añosExp + '}' + super.toString();
    }

}
