public class RegularConRecargo extends EstudianteRegular {
    private double recargo;

    public void setRecargo(double r) {
        if (r >= 0) recargo = r;
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargo;
    }
}
