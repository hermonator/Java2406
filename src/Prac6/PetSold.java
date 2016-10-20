package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class PetSold extends ItemSold {

    private boolean petVaccinated;
    private boolean petNeutered;
    private boolean petHouseBroken;

    public void setPetHouseBroken(boolean petHouseBroken) {
        this.petHouseBroken = petHouseBroken;
    }

    public void setPetNeutered(boolean petNeutered) {
        this.petNeutered = petNeutered;
    }

    public void setPetVaccinated(boolean petVaccinated) {
        this.petVaccinated = petVaccinated;
    }

    public boolean getPetVaccinated(){
        return petVaccinated;
    }

    public boolean getPetNeutered(){
        return petNeutered;
    }

    public boolean getPetHouseBroken(){
        return petHouseBroken;
    }
}
