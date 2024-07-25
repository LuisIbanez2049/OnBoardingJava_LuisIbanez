package day_3.models;

public class DNI {
    private String nombre;
    private String apllido;
    private int edad;
    private String dni;

    private Persona persona;


    //----------------------COSTRUCTOR----------------------------------------------------------------------------
    public DNI(String nombre, String apllido, int edad, String dni) {
        this.nombre = nombre;
        this.apllido = apllido;
        this.edad = edad;
        this.dni = dni;
    }
    //---------------------------------------------------------------------------------------------------------------



    //----------------------GETERS Y SETERS----------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    //---------------------------------------------------------------------------------------------------------------



    //-------------------TO STRING-------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "DNI{" +
                "nombre='" + nombre + '\'' +
                ", apllido='" + apllido + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }
    //---------------------------------------------------------------------------------------------------------------




}
