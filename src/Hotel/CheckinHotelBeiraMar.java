package Hotel;

import java.util.Arrays;
import java.util.InputMismatchException;

public class CheckinHotelBeiraMar extends HotelBeiraMar{




    public CheckinHotelBeiraMar(Hotel_Type hotelType, int roomStaying, int daysAtTheHotel) {
        this.hotelType = hotelType;

        //setting hotel type //daily price
        if (this.getHotelType() == Hotel_Type.COMMUM) {
            this.setPrice(70);
        } else if (this.getHotelType() == Hotel_Type.LUXURY) {
            this.setPrice(180);
        } else {
            //value to be defined and negociated
            this.setPrice(0);
        }

        //setting room
        if(roomStaying <= 0 || roomStaying > 20){
            System.out.println("There is no such room number!(1-20)");
            setRoomStaying(0);
        }else{
            setRoomStaying(roomStaying);
            setStatusHotelRooms(true);
            roomRoomsHotel.remove(Integer.valueOf(roomStaying));
        }

        this.setDaysToBeAtTheHotel(daysAtTheHotel);

        this.setFinalPrice(this.getDaysToBeAtTheHotel() * this.getPrice());

    }



    /// testing array indexs

    public void showIndexAvailable(){
        for(int i = 0; i < roomRoomsHotel.size(); i++){
                int temporaryVariable = roomRoomsHotel.get(i);
                System.out.println(temporaryVariable);
        }
    }
}
