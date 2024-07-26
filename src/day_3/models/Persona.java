package day_3.models;

import java.util.HashSet;
import java.util.Set;

public class  Persona {

    // Tengo la clase persona que tiene las propiedades nombre, apellido, etc. Unas de tipo String, int, bollean, DNI, Pet
    //Todas tienen un modificador de acceso privado
    private String nombre;
    private String apllido;
    private int edad;
    private double altura;
    private boolean casado;

    // Declaro un objeto dni a partir de la clase DNI que tiene el modificador de acceso privado
    private DNI dni;
    private Pet pet;
    private Set<Pet> mascotas = new HashSet<>();


    //----------------------COSTRUCTOR----------------------------------------------------------------------------
    public Persona(String nombre, String apellido, int edad, double altura, boolean casado){
        this.nombre = nombre;
        this.apllido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
    }
    //---------------------------------------------------------------------------------------------------------------


    //----------------------GETERS Y SETERS----------------------------------------------------------------------------
    //SON METODOS ACCESORES PARA MODIFICAR, OBTENER Y ASIGNAR LOS ATRIBUTOS DE LA CLASE
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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Set<Pet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Pet> mascotas) {
        this.mascotas = mascotas;
    }


    //---------------------------------------------------------------------------------------------------------------


    //-----------------------------A la persona le damos un DNI y Mascotas-----------------------------------------------------------
    public void addDni(DNI dni){
        this.dni = dni;
        dni.setPersona(this);
    }

    public void addPets(Pet pet){
       // this.pet = pet;
        pet.setPersona(this);
    }

    public void addMascotas(Set<Pet> mascotas){
        this.mascotas = mascotas;
        //pet.setPersona(this);
    }
    //---------------------------------------------------------------------------------------------------------------


    //------------------Mostrar Persona---------------------------------------------------------------------------------------------
    public void presentacionPersona(){
        System.out.println("Presentacion de " + nombre + ":");
        System.out.println("¡Hola! Mi nombre es " + nombre + " " + apllido);
        System.out.println("Tengo " + edad + " anios y mido " + altura + " metros de altura");
        if (casado) {
            System.out.println("Estoy casado/a");
        }
        else {
            System.out.println("No estoy casado/a");
        }
        System.out.println("Mi DNI es " + dni.getDni());
        if (mascotas.isEmpty()) {
            System.out.println("No tengo mascotas");
        }
        else {
            System.out.println("Mis mascotas son: ");
            for (Pet mascota : mascotas) {
                System.out.println(mascota);
            }
        }
    }



    //-------------------TO STRING-------------------------------------------------------------------------------------
    @Override  // Es una anotacion descriptiva que me dice que el metodo "toString()" ya existe y que se esta sobre escribiendo su comportamiento
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apllido='" + apllido + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", casado=" + casado +
                ", dni=" + dni + "\n" +
                ", mascotas=" + mascotas + "\n";
    }
    //---------------------------------------------------------------------------------------------------------------

}
