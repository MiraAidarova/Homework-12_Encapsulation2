public class Fish {
    private String species;
    private String name;
    private String food;
    private String action;
    private String habitat;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getAction() {
        return action;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setSea() {

    }

    public String getSea() {
        return (getSpecies()+getName()+getFood()+getAction()+getHabitat());
    }
}
