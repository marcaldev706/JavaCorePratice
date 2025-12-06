package Hotel;

import java.util.ArrayList;

public abstract class HotelBeiraMar {
    protected double price;
    protected Hotel_Type hotelType;
    protected   boolean statusHotelRooms;
    private int daysToBeAtTheHotel;
    private double finalPrice;

    final ArrayList<Integer> roomRoomsHotel = new ArrayList<>(20);

    protected void setDaysToBeAtTheHotel(int daysToBeAtTheHotel) {
        this.daysToBeAtTheHotel = daysToBeAtTheHotel;
    }

    protected int getDaysToBeAtTheHotel() {
        return daysToBeAtTheHotel;
    }

    protected void setRoomStaying(int roomStaying) {
        this.roomStaying = roomStaying;
    }

    protected void setStatusHotelRooms(boolean statusHotelRooms) {
        this.statusHotelRooms = statusHotelRooms;
    }

    protected int roomStaying = roomRoomsHotel.size();

    protected Hotel_Type getHotelType() {
        return hotelType;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected double getPrice() {
        return price;
    }

    //setting up final Price
    protected void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }



    protected double getFinalPrice() {
        return finalPrice;
    }



    public void showInfoAboutYourStaying(){
        System.out.println("Room Staying: " + this.roomStaying);
        System.out.println("Hotel Type Staying: " + this.getHotelType());
        System.out.println("Price Daily: " + String.format("%.2f", this.getPrice()));
        System.out.println("Final Price: " + String.format("%.2f", this.getFinalPrice()));

    }

}
