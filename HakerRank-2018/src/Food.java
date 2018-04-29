
public class Food {
    private String foodName;
    
    public void serveFood(){
        System.out.println("I am serving "+foodName);
    }

	
    
	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public static void main(String[] str){
		FoodFactory myFoods = new FoodFactory();
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit");	
		System.out.println("My name is: " + food1.getClass().getName());
		System.out.println("My name is: " + food2.getClass().getName());
		System.out.println("Our superclass is: " 
		                    + food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
	}
    
}

class FoodFactory extends Food {
	public FoodFactory() {
		super();
	}
    public Food getFood(String foodName){
    	
    	Food f=new Food();
    	f.setFoodName(foodName);
    	return f;
    }
}