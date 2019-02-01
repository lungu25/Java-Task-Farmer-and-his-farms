package farmers;

import farms.Farm;

public class Farmer {

    private String name;

    private int age;

    private int finance;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getFinance() {
        return finance;
    }

    public void setName(String name) {
        this. name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFinance(Integer finance) {
        this.finance = finance;
    }

    public boolean buy(Farm farm) {
        if (farm.getPrice() < finance) {
            // buy
            this.finance -= farm.getPrice();
            System.out.println("farms.Farm was assigned");
            return true; //Return true if transaction was completed
        } else {
            //buy

            System.out.println("Insuficient money");
            return false;
        }
    }

    public String toString() {
        return "Name: " + this.name + "\nAge:  " + this.age + "\nFinance: " + this.finance;
    }

}