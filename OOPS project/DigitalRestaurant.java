import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalRestaurant
{
     String name;                    //(Attributes)
     String location;
     List<Dishes> dishes = new ArrayList<>();

    public DigitalRestaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void menu(Dishes dish)

    {
          dishes.add(dish);

    }


    public void menu()
    {
        System.out.println("");
        System.out.println("|| Menu List:||");
        System.out.println("");
        System.out.println("==============================");
//        System.out.println("");
        for (Dishes d:dishes)
        {

            System.out.println(d);
            System.out.println("==============================");

        }

        Scanner sc=new Scanner(System.in);
//        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("==============================");
        System.out.println("|| Add Items to Cart: ||");
        System.out.println("==============================");
        String item1=sc.nextLine();
        String item2=sc.nextLine();
        System.out.println("==============================");
        for (Dishes d1:dishes)
        {
            for (Dishes d2:dishes) {

                int paymentOption = 0;
                if(d1.Name.equals(item1) && d2.Name.equals(item2)) {
                    long item1Price = d1.price;
                    long item2Price = d2.price;
                    long totalPrice = item1Price + item2Price;
                    System.out.println("Total Bill :" + totalPrice);
                    System.out.println("==============================");
                    System.out.println(System.lineSeparator());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("==============================");
                    System.out.println("Select Payment Mode ");
                    System.out.println("==============================");
                    System.out.println("1.Online  ");
                    System.out.println("2.COD ");
                    System.out.println("==============================");
                    paymentOption = sc.nextInt();
                    System.out.println("==============================");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
//                    System.out.println("");
//                    System.out.println("");

                    if (paymentOption == 1) {
                        System.out.println("==============================");
                        System.out.println("Select Payment Option:");
                        System.out.println("==============================");
                        System.out.println("1.Phonepay");
                        System.out.println("2.GooglePay");
                        System.out.println("3.Paytm");
                        System.out.println("==============================");
                        int option = sc.nextInt();
                        System.out.println("==============================");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
//                        System.out.println("");
//                        System.out.println("");


                        if (option == 1) {
                            System.out.println("==============================");
                            System.out.println("Redirecting to PhonePay");
                            System.out.println("Pay total Bill :" + totalPrice);
                            System.out.println("Enter your UPI Pin");
                            System.out.println("==============================");
                            long pin=sc.nextLong();
                            System.out.println("==============================");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("==============================");
                            System.out.println("Payment SuccessFul");
                            System.out.println("Order Confirmed");
                            System.out.println("Order Details :"+d1+" , "+d2);
                            System.out.println("Thank you for Ordering");
                            System.out.println("==============================");
                        }
                        if (option == 2) {
                            System.out.println("==============================");
                            System.out.println("Redirecting to GooglePay");
                            System.out.println("Pay total Bill :" + totalPrice);
                            System.out.println("Enter your UPI Pin");
                            System.out.println("==============================");
                            long pin=sc.nextLong();
                            System.out.println("==============================");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("==============================");
                            System.out.println("Payment SuccessFul");
                            System.out.println("Order Confirmed");
                            System.out.println("Order Details :"+d1+" , "+d2);
                            System.out.println("Thank you for Ordering");
                            System.out.println("==============================");


                        }
                        if (option == 3) {
                            System.out.println("==============================");
                            System.out.println("Redirecting to Paytm");
                            System.out.println("Pay total Bill :" + totalPrice);
                            System.out.println("Enter your UPI Pin");
                            System.out.println("==============================");
                            long pin=sc.nextLong();
                            System.out.println("==============================");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("==============================");
                            System.out.println("Payment SuccessFul");
                            System.out.println("Order Confirmed");
                            System.out.println("Order Details :"+d1+" , "+d2);
                            System.out.println("Thank you for Ordering");
                            System.out.println("==============================");
                        }

                    }

                    if (paymentOption == 2) {
                        System.out.println("==============================");
                        System.out.println("Order Details:"+d1+" , "+d2);
                        System.out.println("Pay your Bill once order has Recived");
                        System.out.println("Thank you for Ordering");
                        System.out.println("==============================");
                    }
                    return;

                }

            }

        }


    }



}

