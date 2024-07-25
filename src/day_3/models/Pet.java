package day_3.models;

public class Pet {
    private String name;
    private int age;
    private Persona persona;

    private TipoDeMascota tipoDeMascota;


    //----------------------COSTRUCTOR----------------------------------------------------------------------------
    public Pet(String name, int age, TipoDeMascota tipoDeMascota) {
        this.name = name;
        this.age = age;
        this.tipoDeMascota = tipoDeMascota;
    }
    //---------------------------------------------------------------------------------------------------------------


    //----------------------GETERS Y SETERS----------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoDeMascota getTipoDeMascota() {
        return tipoDeMascota;
    }

    public void setTipoDeMascota(TipoDeMascota tipoDeMascota) {
        this.tipoDeMascota = tipoDeMascota;
    }
    //---------------------------------------------------------------------------------------------------------------


//    public void mostrarMascotas(){
//        for (int i = 0; i < tipoDeMascota; i++) {
//
//        }
//    }


    //-------------------TO STRING-------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "- " +
                "" + name + " es un " + tipoDeMascota+
                " y tiene " + age + " anios ";
    }
}
