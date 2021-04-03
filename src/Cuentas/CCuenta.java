package Cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    //Aqui inserto los encapsulamientos en orden.

    public void setCuenta(String nuevaCuenta) {
        cuenta = nuevaCuenta;
    }
    public String getCuenta() {
        return cuenta;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setTipoInteres(double nuevoTipoInteres) {
        tipoInteres = nuevoTipoInteres;
    }
    public double getTipoInteres() {
        return tipoInteres;
    }

    // Aqui se terminan los encapsulamientos.

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
        private static void operativa_cuenta() {

            CCuenta cuenta1;
            double saldoActual;
            cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
            saldoActual = cuenta1.estado();
            System.out.println("El saldo actual es"+ saldoActual );
            try {
                cuenta1.retirar(2300);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
            //Aqui inserto el nuevo parametro indicado.
            float cantidad;
        }


}