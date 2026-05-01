public class BecadoExcelencia extends EstudianteBecado {
    private double bono;

    public void setBono(double b) {
        if (b >= 0) bono = b;
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bono;
        if (pago < 0) pago = 0;
        return pago;
    }
}
