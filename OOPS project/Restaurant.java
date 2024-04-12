
import java.util.Scanner;

public class Restaurant{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        DigitalRestaurant dish=new DigitalRestaurant("Royal Spice","Manglore");


        Dishes dish1=new Dishes("Biryani",360,"Non veg");
        Dishes dish2=new Dishes("Butter Chicken",180,"Non veg");
        Dishes dish3=new Dishes("Pav Bhaji",50,"veg");
        Dishes dish4=new Dishes("Aloo Paratha",60," veg");
        Dishes dish5=new Dishes("Masala Dosa",60,"veg");
        Dishes dish6=new Dishes("Fish Meal",100,"veg");

        dish.menu(dish1);
        dish.menu(dish2);
        dish.menu(dish3);
        dish.menu(dish4);
        dish.menu(dish5);
        dish.menu(dish6);



        dish.menu();



    }

}
