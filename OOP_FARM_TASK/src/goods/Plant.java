package goods;

public class Plant extends Items {
    private boolean isEatable;
    private String color; //dublicated methods
    boolean isCarnivore;

    public void setIsEatable(boolean isEatable) { this.isEatable = isEatable; }
    public boolean getIsEatable() { return this.isEatable; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
    public void setIsCarnivor(boolean isCarnivor) { this.isCarnivore = isCarnivor; }
    public boolean getIsCarnivor() { return this.isCarnivore; }

    public String toString() {
        return "Eatable: " + this.isEatable + "\nColor:  " + this.color + "\nCarnivor: " + this.isCarnivore + "\nBreed: " + this.breed + "\nType: " + this.type;
    }
}