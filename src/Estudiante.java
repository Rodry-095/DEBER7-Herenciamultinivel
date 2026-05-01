public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    //Aplicar setters con validacion
    public void setCodigo(String c) {
        if (!c.isEmpty()) codigo = c;
    }

    public void setNombre(String n) {
        if (!n.isEmpty()) nombre = n;
    }

    public void setPromedio(double p) {
        if (p >= 0 && p <= 10) promedio = p;
    }

    public void setValorMatricula(double v) {
        if (v > 0) valorMatricula = v;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void mostrarDatos() {
        System.out.println(codigo + " - " + nombre + " - " + promedio);
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    // sobrecarga
    public double calcularPagoFinal(double extra) {
        return valorMatricula - extra;
    }
}
