package farms;

public class Farm {

    protected String name = null;

    protected int price = 0;

    protected int area;

    protected boolean isWater;

    protected boolean isForest;

    protected String groundType;


    public int getPrice() { return price; }
    protected void setPrice(int price) { this.price = price; }


    public void setArea(int area) { this.area = area; }
    public int getArea() { return this.area; }
    public void setIsWater(boolean isWater) { this.isWater = isWater; }
    public boolean getIsWater() { return isWater; }
    public void setIsForest(boolean isForest) { this.isForest = isForest; }
    public boolean getIsForest() { return this.isForest; }
    public void setGroundType(String groundType) { this.groundType = groundType; }
    public String getGroundType() { return groundType; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

     Farm(){
       price = 0;

    }



    public String toString(){
        return "Name: " + this.name + "\nArea: " + this.area + "\nWater:  " + this.isWater + "\nForest: " + this.isForest  + "\nGround Type: " + this.groundType + "\nPrice: " + this.price;
    }

}


