package space.t3space;

/**
 * Created by elk85 on 4/30/2017.
 */

    public class SolarPanel {

    public static void main(String[] args) {
        solarpanel1 Trina_Solar = new solarpanel1(4.38, 3.64, 20.83, 1500);  //creats object of solarpanel

        solarpanel1 Candadian_Solar = new solarpanel1(4.08, 3.39, 20.6, 1200);

        solarpanel1 Jinko_Solar = new solarpanel1(2.7, 2.24, 14.26, 880);
    }
}

 class solarpanel1 {
    double SKWH;  //Sunny Killo watt hour
    double CKWh; //Cloudy Killo watt hour
    double Size;  //Size of solar panel
    int price;    //Price of Solar panel

    public solarpanel1(double v, double v1, double v2, int i) {
    }
}
