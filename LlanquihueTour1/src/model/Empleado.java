package model;

public class Empleado extends Persona {

    private String cargo;
    private double salarioBase;
    private String fechaIngreso;
    private String areaTrabajo;

    public Empleado(String rut, String nombre, String apellido, String telefono,
                    String email, Direccion direccion, String cargo,
                    double salarioBase, String fechaIngreso, String areaTrabajo) {
        super(rut, nombre, apellido, telefono, email, direccion);
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.areaTrabajo = areaTrabajo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getAreaTrabajo() { return areaTrabajo; }
    public void setAreaTrabajo(String areaTrabajo) { this.areaTrabajo = areaTrabajo; }

    @Override
    public String toString() {
        return "=== EMPLEADO ===" +
                "\n  RUT          : " + getRut() +
                "\n  Nombre       : " + getNombreCompleto() +
                "\n  Teléfono     : " + getTelefono() +
                "\n  Email        : " + getEmail() +
                "\n  Dirección    : " + getDireccion() +
                "\n  Cargo        : " + cargo +
                "\n  Área         : " + areaTrabajo +
                "\n  Salario Base : $" + String.format("%,.0f", salarioBase) +
                "\n  Fecha Ingreso: " + fechaIngreso;
    }
}