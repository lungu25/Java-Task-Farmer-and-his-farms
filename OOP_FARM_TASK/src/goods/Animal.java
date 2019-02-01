package goods;

public class Animal extends Items {
    private Integer age;
    private boolean isMeat;
    private boolean isFur;
    private String color;

    public void setAge(Integer age) { this.age = age; }
    public Integer getAge() { return age; }
    public void setIsMeat(boolean isMeat) { this.isMeat = isMeat; }
    public boolean getIsMeat() { return this.isMeat; }
    public void setIsFur(boolean isFur) { this.isFur = isFur; }
    public boolean getIsFur() { return this.isFur; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

    public String toString() {
        return "Age: " + this.age + "\nMeat:  " + this.isMeat + "\nFur: " + this.isFur + "\nColor: " + this.color + "\nBreed: " + this.breed + "\nType: " + this.type;
    }
}