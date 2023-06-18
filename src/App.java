import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        // Buy and sell data structures
        minHeap sellOrders = new minHeap();
        maxHeap buyOrders = new maxHeap();

        System.out.println("Welcome to the stock market!");
        Thread.sleep(1000);


        

        // Option
        






        // Option 1
       while(true){

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();



            System.out.println("Please enter your option below.");
            Thread.sleep(1000);
            System.out.println("1. Buy");
            System.out.println("2. Sell");
            System.out.println("3. Remove a buy order");
            System.out.println("4. Remove a sell order");
            System.out.println("5. List all buy and sell orders");
            System.out.println("6. Exit");

            int option = sc.nextInt();


            // Buy // 
            if(option == 1){



            

                // Price
                System.out.println("Please enter the price you want to buy at.");
                int price = sc.nextInt();
                Thread.sleep(1500);
            

                if(sellOrders.size <= 0){
                    System.out.println("Your buy order has been placed at " + price + "!");
                    buyOrders.insert(price);
                }
                else if(sellOrders.size > 0){
                    int sellMin = sellOrders.getMin();
                    if(sellMin > price){
                        System.out.println("Your buy order has been placed at $" + price + "!");
                        buyOrders.insert(price);
                    }
                    else if(sellMin <= price){
                        System.out.println("Your buy order has been matched with a sell order at $" + sellMin + "!");
                        sellOrders.removeMin();
                    }
                }

                // Check if buy order can be matched
            
            


                // Back to menu
                System.out.println("You will now be taken back to the menu");
                Thread.sleep(3000);
            
            }

            else if(option == 2){

                // Price
                System.out.println("Please enter the price you want to sell at.");
                int price = sc.nextInt();
                Thread.sleep(2000);
            

                if(buyOrders.size <= 0){
                    System.out.println("Your sell order has been placed at $" + price + "!");
                    sellOrders.insert(price);
                }
                else if(buyOrders.size > 0){
                    int buyMax = buyOrders.getMax();
                    if(buyMax < price){
                        System.out.println("Your sell order has been placed at $" + price + "!");
                        sellOrders.insert(price);
                    }
                    else if(buyMax >= price){
                        System.out.println("Your sell order has been matched with a buy order at $" + buyMax + "!");
                        buyOrders.removeMax();
                    }
                    else{
                        System.out.println("Your sell order has been placed at $" + price + "!");
                        sellOrders.insert(price);
                    }

                }

                // Back to Menu
                System.out.println("You will now be taken back to the menu");
                Thread.sleep(3000);
            }

            else if(option == 3){
        
                // list buy order to pick from
                if(buyOrders.size <= 0){
                    System.out.println("You have no buy orders to remove!");
                    Thread.sleep(1000);
                    System.out.println("You will now be taken back to the menu");
                    Thread.sleep(1000);
                    continue;
                }
                else if(buyOrders.size > 0){

                    System.out.println("Here are your buy orders: ");
                    Thread.sleep(1000);
                    for(int i = 0; i < buyOrders.size; i++){
                        System.out.println(buyOrders.items.get(i));
                    }
                    Thread.sleep(1000);

                    System.out.println("Please enter the price you want to remove: ");
                    int price = sc.nextInt();

                    if(buyOrders.removeItem(price) == false){
                        System.out.println("You do not have a buy order at that price!");
                        Thread.sleep(1000);
                        System.out.println("You will now be taken back to the menu");
                        Thread.sleep(1000);
                        continue;
                    }
                    else{
                        Thread.sleep(1000);
                        System.out.println("Your buy order at $" + price + " has been removed!");
                    }
                    
                    Thread.sleep(1000);
                    

                }

                System.out.println("You will now be taken back to the menu");
                Thread.sleep(1000);
            
            }

            else if(option == 4){


                if(sellOrders.size <= 0){
                    System.out.println("There are no sell orders to remove!");
                    Thread.sleep(1000);
                    System.out.println("You will now be taken back to the menu");
                    Thread.sleep(1000);
                    continue;
                }
                else if(sellOrders.size > 0){

                    System.out.println("Here are your sell orders: ");
                    Thread.sleep(1000);
                    for(int i = 0; i < sellOrders.size; i++){
                        System.out.println(sellOrders.items.get(i));
                    }
                    Thread.sleep(1000);

                    System.out.println("Please enter the price you want to remove: ");
                    int price = sc.nextInt();

                    if(sellOrders.removeItem(price) == false){
                        System.out.println("You do not have a sell order at that price!");
                        Thread.sleep(1000);
                        System.out.println("You will now be taken back to the menu");
                        Thread.sleep(1000);
                        continue;
                    }
                    else{
                        Thread.sleep(1000);
                        System.out.println("Your sell order at $" + price + " has been removed!");
                    }
                    
                    Thread.sleep(1000);
                    

                }

                System.out.println("You will now be taken back to the menu");
                Thread.sleep(1000);  

            }

            else if(option == 5){

                System.out.println("Buy Orders: ");
                for(int i = 0; i < buyOrders.size; i++){
                   System.out.println(buyOrders.items.get(i));
                }

                Thread.sleep(1000);

                System.out.println("Sell Orders: ");
                for(int i = 0; i < sellOrders.size; i++){
                    System.out.println(sellOrders.items.get(i));
                }

                Thread.sleep(2000);

                System.out.println("You will now be taken back to the menu in 10 seconds");
                Thread.sleep(10000);  

            }

            else if(option == 6){
                System.out.println("Thank you for using the stock market!");
                break;
            }

            else{
                System.out.println("Please enter a valid option!");
                Thread.sleep(1000);
                System.out.println("You will now be taken back to the menu");
                Thread.sleep(1000);
            }

        }

    }


}
