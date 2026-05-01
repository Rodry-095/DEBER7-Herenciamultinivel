public class EstudianteRegular extends Estudiante{
    private int materias;

    public void setMaterias(int m) {
        if (m > 0) materias = m;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (materias * 10);
    }
}
