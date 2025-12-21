package ApplicationsPKG.Functions;

import ApplicationsPKG.ClientData.Client;

import java.util.Arrays;
import java.util.Scanner;

public  class FunctionsApp {
    public FunctionsApp(int quantityFunctionsAppMethod) {

        Client[] temporaryVariable = new Client[quantityFunctionsAppMethod];

        for(int index = 0; index < quantityFunctionsAppMethod; index++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name: ");
            String temporaryName = scanner.next();
            System.out.println("Email: ");
            String temporaryEmail = scanner.next();
            System.out.println("Age: ");
            int temporaryAge = scanner.nextInt();
            System.out.println("Gender: ");
            char temporaryChar = scanner.next().charAt(0);

            Client clientObject = new Client(temporaryAge, temporaryEmail, temporaryChar, temporaryName);

            clientObject.setIdCode(index);

            //adding objects to array
            Client[] arrayClientsInerhance = new Client[quantityFunctionsAppMethod];
            arrayClientsInerhance[index] = clientObject;


            if(index != quantityFunctionsAppMethod){

            }else{
                System.out.println("Clients Registered: ");
                Arrays.stream(arrayClientsInerhance).forEach(System.out::println);
            }

        }


    }




}
