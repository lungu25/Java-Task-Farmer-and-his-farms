package goods;

public abstract class Items{
    protected String breed = null;
    protected String type = null;

    public String getBreed() {
        return breed;
    }

    public void setBreed( String breed) {
        this.breed = breed;
    }

    public String getType() {
        return type;
    }

    public void setType( String type) {
        this.type = type;
    }
}