import Hotel.CheckinHotelBeiraMar;
import Hotel.Hotel_Type;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

                CheckinHotelBeiraMar checkingClient
                = new CheckinHotelBeiraMar(Hotel_Type.LUXURY, 5, 8);

                checkingClient.showInfoAboutYourStaying();
                checkingClient.showIndexAvailable();
    }
}