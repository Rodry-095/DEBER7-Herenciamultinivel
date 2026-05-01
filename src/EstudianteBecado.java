public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public void setPorcentajeBeca(double p) {
        if (p >= 0 && p <= 100) porcentajeBeca = p;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() - (getValorMatricula() * porcentajeBeca / 100);
    }
}
