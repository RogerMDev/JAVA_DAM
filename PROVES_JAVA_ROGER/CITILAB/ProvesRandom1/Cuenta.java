public class Cuenta {

    private int identificadorCuenta;
    private double saldo;
    
    public Cuenta(int identificadorCuenta){
        this.identificadorCuenta = identificadorCuenta;
        this.saldo = 0;
    }

    public int getIdentificadorCuenta(){
        return identificadorCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void ingresarSaldo(double cantidadAIngresar){
        saldo += cantidadAIngresar;
    }

    public void retirarSaldo(double cantidadARetirar) throws Exception{
        if (cantidadARetirar > saldo){
            throw new Exception("No hay suficiente saldo en la cuenta.");
        } 
        saldo -= cantidadARetirar;
    }

    @Override
    public String toString(){
        return "Cuenta nº " + identificadorCuenta +  " | " + "Saldo: " + saldo + " €";
    }


}
