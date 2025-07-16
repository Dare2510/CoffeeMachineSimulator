package machine;

enum CoffeSorts{
    espresso("espresso",250,0,16,4),
    latte("latte",350,75,20,7),
    cappuccino("cappuccino",200,100,12,6);

    final String name;
    final int water;
    final int milk;
    final int coffeeBeans;
    final int price;

    CoffeSorts(String name, int water, int milk, int coffeeBeans, int price){
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getWater(){
        return water;
    }
    public int getMilk(){
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }
    public int getPrice(){
        return price;
    }
}
