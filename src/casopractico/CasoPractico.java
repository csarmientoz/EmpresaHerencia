package casopractico;

public class CasoPractico {

    public static void main(String[] args) {
        
        
        Empleado e1 = new Empleado("Cristian", 1119, 19, "soltero", 1000);
                Programador p1 = new Programador(2, "Java","Andres", 588, 0,"casado",0 );
                        Director d1 = new Director(10, "Pedro", 452, 40, "viudo", 10000);
                        Empresa enterprise = new Empresa();
                        enterprise.adicionarEmpleado(e1);
                        enterprise.adicionarEmpleado(p1);
                        enterprise.adicionarEmpleado(d1);
                        enterprise.imprimirEmpleados();
                        

    }

}
