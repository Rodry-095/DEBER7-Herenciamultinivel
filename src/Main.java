import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante e;

        System.out.println("1. Becado");
        System.out.println("2. Regular");
        int op = sc.nextInt();
        sc.nextLine();

        if (op == 1) {
            BecadoExcelencia b = new BecadoExcelencia();

            System.out.print("Codigo: ");
            b.setCodigo(sc.nextLine());

            System.out.print("Nombre: ");
            b.setNombre(sc.nextLine());

            System.out.print("Promedio: ");
            b.setPromedio(sc.nextDouble());

            System.out.print("Matricula: ");
            b.setValorMatricula(sc.nextDouble());

            System.out.print("Beca: ");
            b.setPorcentajeBeca(sc.nextDouble());

            System.out.print("Bono: ");
            b.setBono(sc.nextDouble());

            e = b;

        } else {
            RegularConRecargo r = new RegularConRecargo();

            System.out.print("Codigo: ");
            r.setCodigo(sc.nextLine());

            System.out.print("Nombre: ");
            r.setNombre(sc.nextLine());

            System.out.print("Promedio: ");
            r.setPromedio(sc.nextDouble());

            System.out.print("Matricula: ");
            r.setValorMatricula(sc.nextDouble());

            System.out.print("Materias: ");
            r.setMaterias(sc.nextInt());

            System.out.print("Recargo: ");
            r.setRecargo(sc.nextDouble());

            e = r;
        }

        System.out.println("\nPago final: " + e.calcularPagoFinal());
        System.out.println("Pago con descuento extra: " + e.calcularPagoFinal(20));
    }
}