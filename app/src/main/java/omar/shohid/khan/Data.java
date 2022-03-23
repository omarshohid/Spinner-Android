package omar.shohid.khan;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAmount() {
        return price;
    }

    public void setAmount(int amount) {
        this.price = amount;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String name;
    public int image;
    public int price;
    public int category;

    Data(String name,int image,int amount,int category){
        this.name = name;
        this.image = image;
        this.price = amount;
        this.category = category;
    }

    Data(){

    }
    public List<Data> get_food_items(int category) {
        List<Data> data = new ArrayList<>();
        //Appetizer
        data.add(new Data("Nachos (1:2)", R.drawable.nachos,190,1));
        data.add(new Data("Crispy Strip Chicken with French Fry", R.drawable.chicken_fry,200,1));
        data.add(new Data("Garlic Bread with Cheese", R.drawable.garlic_braed,70,1));
        data.add(new Data("Chicken Lollipop (6pcs)", R.drawable.chicken_lolipop,180,1));
        data.add(new Data("B.B.Q Chicken Wings (6pcs)", R.drawable.chicken_wings,150,1));
        data.add(new Data("Spicy Chicken Bomb (6pcs)", R.drawable.chicken_lolipop,160,1));
        data.add(new Data("Buffalo Wings (6pcs)", R.drawable.chicken_wings,170,1));
        data.add(new Data("Beef Shawarma", R.drawable.shawarma,140,1));
        data.add(new Data("BBQ Chicken Shawarma", R.drawable.shawarma,140,1));
        data.add(new Data("Vegetable Shawarma", R.drawable.shawarma,100,1));

        //Burger
        data.add(new Data("Smoked B.B.Q Burger", R.drawable.burger,180,2));
        data.add(new Data("Mega Burger", R.drawable.burger,250,2));
        data.add(new Data("Beef Burger with Cheese & Egg", R.drawable.burger,180,2));
        data.add(new Data("Mushroom Burger with Beef", R.drawable.burger,200,2));
        data.add(new Data("Grilled Chicken Burger", R.drawable.burger,160,2));
        data.add(new Data("Chicken Cheese Burger", R.drawable.burger,170,2));
        data.add(new Data("Crispy Chicken Burger", R.drawable.burger,200,2));

        //Pasta
        data.add(new Data("Oven Baked Pasta", R.drawable.pasta,250,3));
        data.add(new Data("Spicy Pasta", R.drawable.pasta,200,3));
        data.add(new Data("Chilli Sauce Pasta", R.drawable.pasta,220,3));
        data.add(new Data("Beef Oven Baked Pasta", R.drawable.pasta,250,3));
        data.add(new Data("Tiger Garden Special Pasta", R.drawable.pasta,259,3));

        //Sandwich
        data.add(new Data("Ultimate Club Sandwich", R.drawable.sandwich,250,4));
        data.add(new Data("Supreme Club Sandwich", R.drawable.sandwich,180,4));
        data.add(new Data("Garden Club Sandwich", R.drawable.sandwich,300,4));
        data.add(new Data("Chicken & Cheese Club Sandwich", R.drawable.sandwich,300,4));
        data.add(new Data("Cheese Club Sandwich", R.drawable.sandwich,225,4));

        //Crab
        data.add(new Data("Fried Crab", R.drawable.crab,200,5));
        data.add(new Data("Chilli Crab", R.drawable.crab,250,5));
        data.add(new Data("B.B.Q Crab Small", R.drawable.crab,200,5));
        data.add(new Data("B.B.Q Crab Large", R.drawable.crab,300,5));

        //Pizza
        data.add(new Data("Italian Pizza", R.drawable.pizza,625,6));
        data.add(new Data("Texas Pizza", R.drawable.pizza_slice,599,6));
        data.add(new Data("B.B.Q Pizza", R.drawable.pizza,799,6));
        data.add(new Data("Beef Lovers Pizza", R.drawable.pizza_slice,799,6));
        data.add(new Data("Tiger Garden Special Pizza", R.drawable.pizza,799,6));
        data.add(new Data("Max Chicken Pizza", R.drawable.pizza_slice,649,6));
        data.add(new Data("Spicy Chicken Pizza", R.drawable.pizza,650,6));
        data.add(new Data("Cheese Pizza", R.drawable.pizza_slice,599,6));

        List<Data> filteredData = new ArrayList<>();
        for (int i=0; i<data.size(); i++){
            Data item = data.get(i);
            if(item.category == category){
                filteredData.add(item);
            }
        }
        return filteredData;
    }

}
