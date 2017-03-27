package casopractico;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();

    }

    public void adicionarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void imprimirEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
