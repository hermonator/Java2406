package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class DemoItemsAndPets {

    public static void main(String[] args) {


        System.out.println("Demonstrating the ItemSold class...");
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();

        // Item1
        item1.setDescription("plays music");
        item1.setInvoiceNumber(123422);
        item1.setPrice(4.32);
        System.out.println("Description: " + item1.getDescription() + " Invoice Number: " + item1.getInvoiceNumber() + " Price: " + item1.getPrice());

        // Item2
        item2.setDescription("pours water");
        item2.setPrice(5.56);
        item2.setInvoiceNumber(547389);
        System.out.println("Description: " + item2.getDescription() + " Invoice Number: " + item2.getInvoiceNumber() + " Price: " + item2.getPrice());




        System.out.println("Demonstrating the PetSold class...");
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();

        // Pet1
        pet1.setDescription("hairy");
        pet1.setInvoiceNumber(2321456);
        pet1.setPrice(3.33);
        pet1.setPetHouseBroken(true);
        pet1.setPetNeutered(false);
        pet1.setPetVaccinated(true);
        System.out.println("Description: " + pet1.getDescription() + " Invoice Number: " + pet1.getInvoiceNumber() + " Price: " + pet1.getPrice() + " is the pet vaccinated: " + pet1.getPetVaccinated() + " is the pet neutered: " + pet1.getPetNeutered() + " is the pet house broken: " + pet1.getPetHouseBroken());

        // Pet2
        pet2.setDescription("hairless");
        pet2.setInvoiceNumber(4324556);
        pet2.setPrice(6.66);
        pet2.setPetNeutered(true);
        pet2.setPetVaccinated(false);
        pet2.setPetHouseBroken(false);
        System.out.println("Description: " + pet2.getDescription() + " Invoice Number: " + pet2.getInvoiceNumber() + " Price: " + pet2.getPrice() + " is the pet vaccinated: " + pet2.getPetVaccinated() + " is the pet neutered: " + pet2.getPetNeutered() + " is the pet house broken: " + pet2.getPetHouseBroken());

    }


}
