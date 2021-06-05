package com.IceCreamClasses;

public class App {
    public static void main(String[] args) {

        IceCreamFactory breyersFrechVanilla = new IceCreamFactory("FrechVanilla", "white", false, false, "Breyers", "233 Dreary Lane", 400000, 3.00, 1.00, 300000);
        IceCreamFactory breyersMooseTracks = new IceCreamFactory("MooseTracks", "white", true, true, "Breyers", "233 Dreary Lane", 300000, 5.00, 2.00, 200000);
        IceCreamFactory breyersCookieNCream = new IceCreamFactory("CookiesNCreme", "white", true, false, "Breyers", "233 Dreary Lane", 350000, 5.00, 2.00, 250000);

        double costFrenchVanilla = breyersFrechVanilla.costOfIceCream();
        double salesFrenchVanilla = breyersFrechVanilla.saleOfIceCream();
        double revenueFrenchVanilla = breyersFrechVanilla.monthlyProfit();

        double costMooseTracks = breyersMooseTracks.costOfIceCream();
        double salesMooseTracks = breyersMooseTracks.saleOfIceCream();
        double revenueMooseTracks = breyersMooseTracks.monthlyProfit();

        double costCookieNCream = breyersCookieNCream.costOfIceCream();
        double salesCookieNCream = breyersCookieNCream.saleOfIceCream();
        double revenueCookieNCream = breyersCookieNCream.monthlyProfit();

        System.out.println("Breyers French Vanilla | " + " Sales " + salesFrenchVanilla + " Cost " + costFrenchVanilla + " Revenue " + revenueFrenchVanilla);
        System.out.println("Breyers Moose Tracks | " + " Sales " + salesMooseTracks + " Cost " + costMooseTracks + " Revenue " + revenueMooseTracks);
        System.out.println("Breyers Cookies N Cream | " + " Sales " + salesCookieNCream + " Cost " + costCookieNCream + " Revenue " + revenueCookieNCream);

        IceCreamShop benNJerriesOrder1 = new IceCreamShop("Chunky Chocolate Mocha", "Brown", true, true, "Ben n Jerry's", "P. Sherman 42 Walaby Way", 4000, true, false, true, false, true, 2.5, 5.0, 5.5, 2.5, 0.5, 20, 6);
        IceCreamShop benNJerriesOrder2 = new IceCreamShop("Salted Caramel Brownie", "Mixed", true, true, "Ben n Jerry's", "P. Sherman 42 Walaby Way", 5000, true, true, false, true, false, 2.5, 4.0, 4.5, 2.5, 0.5, 20, 7);
        IceCreamShop benNJerriesOrder3 = new IceCreamShop("Americone Dream", "Mixed", true, false, "Ben n Jerry's", "P. Sherman 42 Walaby Way", 1000, true, false, true, true, false, 2.5, 4.5, 5.5, 2.5, 0.5, 20, 8);

        System.out.println("You ordered the " + benNJerriesOrder1.getName() + " at Ben n Jerry's, your total is " + benNJerriesOrder1.saleOfIceCream());
        System.out.println("You ordered the " + benNJerriesOrder2.getName() + " at Ben n Jerry's, your total is " + benNJerriesOrder2.saleOfIceCream());
        System.out.println("You ordered the " + benNJerriesOrder3.getName() + " at Ben n Jerry's, your total is " + benNJerriesOrder3.saleOfIceCream());

    }
}
