package day_3;
import java.util.HashSet;
import java.util.Set;
import day_3.models.DNI;
import day_3.models.Persona;
import day_3.models.Pet;
import day_3.models.TipoDeMascota;

public class Main {
    public static void main(String[] args){


        //-------------------Primer persona-------------------------------------------------------------------------------------
        Persona julian = new Persona("Julian", "Rota", 25, 1.77, false);
        DNI dniJulian = new DNI("Julian", "Rota", 25, "94706444");

        julian.addDni(dniJulian);

        julian.presentacionPersona();
        //-------------------------------------------------------------------------------------------------------------------------


        System.out.println("\n");
        System.out.println("\n");



        //-------------------Segunda persona-------------------------------------------------------------------------------------
        Persona tomas = new Persona("Tomas", "Alvarez", 22, 1.82, true);
        DNI dniTomas = new DNI("Tomas", "Alvarez", 22, "94706888");
        Pet petTomas = new Pet("SUS", 4, TipoDeMascota.DOG);
        Pet pet2Tomas = new Pet("PUTSON", 3, TipoDeMascota.CAT);

        Set<Pet> mascotas = new HashSet<Pet>();
        mascotas.add(petTomas);
        mascotas.add(pet2Tomas);


        tomas.addDni(dniTomas);
        tomas.addMascotas(mascotas);

        tomas.presentacionPersona();
        //-------------------------------------------------------------------------------------------------------------------------

    }
//    Aqui van los metodos









}
