package machine;
import java.util.Scanner;

public class CoffeeMachine {
    int money = 550;
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;

    public int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public static void main(String[] args) {


        CoffeeMachine c = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);
        int cleanCounter = 0;

       // c.standing(c.water, c.milk, c.coffeeBeans, c.cups, c.money);
        System.out.println();
        String chosen;
        String menu1 = "Write action (buy, fill, take, clean, remaining, exit): ";
      //  System.out.println("Write action (buy, fill, take, remaining, exit): ");
        do {
          //  System.out.println();
            System.out.println(menu1);
            chosen = sc.nextLine();

            switch (chosen){
                case "buy":
                    if(cleanCounter >= 10){
                        System.out.println("I need cleaning!");
                        break;
                    }
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    chosen = sc.nextLine();
                    //sc.nextLine();
                    if(chosen.equals("back")){
                        break;
                    }

                    c.buy(chosen);
                    System.out.println();
                    cleanCounter++;
                    break;
                // c.standing(c.water,c.milk,c.coffeeBeans,c.cups,c.money);

                case "fill":
                    c.fill(sc);
                    System.out.println();

                    break;
                    //   c.standing(c.water,c.milk,c.coffeeBeans,c.cups,c.money);

                case "clean":
                    System.out.println("I have been cleaned!");
                    cleanCounter =0;
                    break;

                case "take":
                    System.out.println();
                    c.take(c.money);
                    break;
                    //   c.standing(c.water,c.milk,c.coffeeBeans,c.cups,c.money);
                case "remaining":
                    System.out.println();
                    c.standing(c.water,c.milk,c.coffeeBeans,c.cups,c.money);

                case "exit" : break;
            }
        } while (!chosen.equals("exit"));

    }

        //buy Methode
        public void buy (String sc) {
            if (Integer.parseInt(sc) == 1) {
                if (getWater() < CoffeSorts.espresso.getWater()) {
                    System.out.println("Sorry, not enough water!");
                }
                if (getCoffeeBeans() < CoffeSorts.espresso.getCoffeeBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(getWater() >= CoffeSorts.espresso.getWater()&&
                        getCoffeeBeans() >= CoffeSorts.espresso.getCoffeeBeans()){
                    System.out.println("I have enough resources, making you a coffee!");
                    this.money = getMoney() + CoffeSorts.espresso.getPrice();
                    this.water = getWater() - CoffeSorts.espresso.getWater();
                    this.milk = getMilk() - CoffeSorts.espresso.getMilk();
                    this.coffeeBeans = getCoffeeBeans() - CoffeSorts.espresso.getCoffeeBeans();
                    setCups(getCups() - 1);
                }
            }
            if (Integer.parseInt(sc) == 2) {
                if (getWater() < CoffeSorts.latte.getWater()) {
                    System.out.println("Sorry, not enough water!");
                }
                if (getCoffeeBeans() < CoffeSorts.latte.getCoffeeBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                if (getMilk() < CoffeSorts.latte.getMilk()) {
                    System.out.println("Sorry, not enough milk!");
                } else if(getWater() >= CoffeSorts.latte.getWater()&&
                        getCoffeeBeans() >= CoffeSorts.latte.getCoffeeBeans() && getMilk() >= CoffeSorts.latte.getMilk()){
                    System.out.println("I have enough resources, making you a coffee!");
                    this.money = getMoney() + CoffeSorts.latte.getPrice();
                    this.water = getWater() - CoffeSorts.latte.getWater();
                    this.milk = getMilk() - CoffeSorts.latte.getMilk();
                    this.coffeeBeans = getCoffeeBeans() - CoffeSorts.latte.getCoffeeBeans();
                    setCups(getCups() - 1);
                }
            }
            if (Integer.parseInt(sc) == 3) {
                if (getWater() < CoffeSorts.cappuccino.getWater()) {
                    System.out.println("Sorry, not enough water!");
                }
                if (getCoffeeBeans() < CoffeSorts.cappuccino.getCoffeeBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                if (getMilk() < CoffeSorts.cappuccino.getMilk()) {
                    System.out.println("Sorry, not enough milk!");
                } else if(getWater() >= CoffeSorts.cappuccino.getWater()&&
                        getCoffeeBeans() >= CoffeSorts.cappuccino.getCoffeeBeans() && getMilk() >= CoffeSorts.cappuccino.getMilk()){
                    System.out.println("I have enough resources, making you a coffee!");
                    this.money = getMoney() + CoffeSorts.cappuccino.getPrice();
                    this.water = getWater() - CoffeSorts.cappuccino.getWater();
                    this.milk = getMilk() - CoffeSorts.cappuccino.getMilk();
                    this.coffeeBeans = getCoffeeBeans() - CoffeSorts.cappuccino.getCoffeeBeans();
                    setCups(getCups() - 1);
                }
            }

        }


    // fill Methode
    public void fill(Scanner sc ){
       // Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int waterAdd = sc.nextInt();
        sc.nextLine();
        setWater(getWater()+waterAdd);
        System.out.println("Write how many ml of milk you want to add: : ");
        int milkAdd = sc.nextInt();
        sc.nextLine();
        setMilk(getMilk()+milkAdd);
        System.out.println("Write how many grams of coffee beans you want to add:: ");
        int coffeeAdd = sc.nextInt();
        sc.nextLine();
        setCoffeeBeans(getCoffeeBeans()+coffeeAdd);
        System.out.println("Write how many disposable cups you want to add: ");
        int cupAdd = sc.nextInt();
        sc.nextLine();
        setCups(getCups()+cupAdd);
    }
    // take Methode
    public void take(int money){
        System.out.println("I gave you $"+money);
        setMoney(0);

    }
    //standing Methode
    public void standing(int water, int milk, int coffeeBeans, int cups, int money){
        System.out.println("The coffee machine has:");
        System.out.println(water +" ml of water");
        System.out.println(milk +" ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$"+money + " of money");



    }


}
