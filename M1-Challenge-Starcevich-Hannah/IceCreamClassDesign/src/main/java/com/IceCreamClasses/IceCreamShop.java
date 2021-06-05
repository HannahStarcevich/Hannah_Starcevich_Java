package com.IceCreamClasses;

import java.util.Objects;

public class IceCreamShop extends IceCream {

    private String shopName;
    private String shopAddress;
    private int numberOfSalesMonthly;

    private boolean smallServing;
    private boolean mediumServing;
    private boolean largeServing;
    private boolean addIceCreamSundae;
    private boolean addSprinkles;

    private double priceSmallServing;
    private double priceMediumServing;
    private double priceLargeServing;
    private double priceIceCreamSundae;
    private double priceSprinkles;

    private double gallonsPurchasedMonthlyFromDistributor;
    private double costPerGallonFromDistributor;

    public IceCreamShop() {
        super();
    }

    public IceCreamShop(String name, String color, boolean hasChocolate, boolean hasNuts, String shopName, String shopAddress, int numberOfSalesMonthly, boolean smallServing, boolean mediumServing, boolean largeServing, boolean addIceCreamSundae, boolean addSprinkles, double priceSmallServing, double priceMediumServing, double priceLargeServing, double priceIceCreamSundae, double priceSprinkles, double gallonsPurchasedMonthlyFromDistributor, double costPerGallonFromDistributor) {
        super(name, color, hasChocolate, hasNuts);
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.numberOfSalesMonthly = numberOfSalesMonthly;
        this.smallServing = smallServing;
        this.mediumServing = mediumServing;
        this.largeServing = largeServing;
        this.addIceCreamSundae = addIceCreamSundae;
        this.addSprinkles = addSprinkles;
        this.priceSmallServing = priceSmallServing;
        this.priceMediumServing = priceMediumServing;
        this.priceLargeServing = priceLargeServing;
        this.priceIceCreamSundae = priceIceCreamSundae;
        this.priceSprinkles = priceSprinkles;
        this.gallonsPurchasedMonthlyFromDistributor = gallonsPurchasedMonthlyFromDistributor;
        this.costPerGallonFromDistributor = costPerGallonFromDistributor;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getNumberOfSalesMonthly() {
        return numberOfSalesMonthly;
    }

    public void setNumberOfSalesMonthly(int numberOfSalesMonthly) {
        this.numberOfSalesMonthly = numberOfSalesMonthly;
    }

    public boolean isSmallServing() {
        return smallServing;
    }

    public void setSmallServing(boolean smallServing) {
        this.smallServing = smallServing;
    }

    public boolean isMediumServing() {
        return mediumServing;
    }

    public void setMediumServing(boolean mediumServing) {
        this.mediumServing = mediumServing;
    }

    public boolean isLargeServing() {
        return largeServing;
    }

    public void setLargeServing(boolean largeServing) {
        this.largeServing = largeServing;
    }

    public boolean isAddIceCreamSundae() {
        return addIceCreamSundae;
    }

    public void setAddIceCreamSundae(boolean addIceCreamSundae) {
        this.addIceCreamSundae = addIceCreamSundae;
    }

    public boolean isAddSprinkles() {
        return addSprinkles;
    }

    public void setAddSprinkles(boolean addSprinkles) {
        this.addSprinkles = addSprinkles;
    }

    public double getPriceSmallServing() {
        return priceSmallServing;
    }

    public void setPriceSmallServing(double priceSmallServing) {
        this.priceSmallServing = priceSmallServing;
    }

    public double getPriceMediumServing() {
        return priceMediumServing;
    }

    public void setPriceMediumServing(double priceMediumServing) {
        this.priceMediumServing = priceMediumServing;
    }

    public double getPriceLargeServing() {
        return priceLargeServing;
    }

    public void setPriceLargeServing(double priceLargeServing) {
        this.priceLargeServing = priceLargeServing;
    }

    public double getPriceIceCreamSundae() {
        return priceIceCreamSundae;
    }

    public void setPriceIceCreamSundae(double priceIceCreamSundae) {
        this.priceIceCreamSundae = priceIceCreamSundae;
    }

    public double getPriceSprinkles() {
        return priceSprinkles;
    }

    public void setPriceSprinkles(double priceSprinkles) {
        this.priceSprinkles = priceSprinkles;
    }

    public double getGallonsPurchasedMonthlyFromDistributor() {
        return gallonsPurchasedMonthlyFromDistributor;
    }

    public void setGallonsPurchasedMonthlyFromDistributor(double gallonsPurchasedMonthlyFromDistributor) {
        this.gallonsPurchasedMonthlyFromDistributor = gallonsPurchasedMonthlyFromDistributor;
    }

    public double getCostPerGallonFromDistributor() {
        return costPerGallonFromDistributor;
    }

    public void setCostPerGallonFromDistributor(double costPerGallonFromDistributor) {
        this.costPerGallonFromDistributor = costPerGallonFromDistributor;
    }

    @Override
    public double costOfIceCream() {
        return gallonsPurchasedMonthlyFromDistributor * costPerGallonFromDistributor;
    }

    @Override
    public double saleOfIceCream() {
        double total = 0;

        if(smallServing == true){ total += priceSmallServing; }
        if(mediumServing == true){ total += priceMediumServing; }
        if(largeServing == true){ total += priceLargeServing; }
        if(addIceCreamSundae == true){ total += priceIceCreamSundae; }
        if(addSprinkles == true){ total += priceSprinkles; }

        return total;
    }

    public double revenueFromInStoreSales() {
        return numberOfSalesMonthly * saleOfIceCream();
    }

    public double monthlyProfit() {
        return revenueFromInStoreSales() - costOfIceCream();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamShop)) return false;
        IceCreamShop that = (IceCreamShop) o;
        return getNumberOfSalesMonthly() == that.getNumberOfSalesMonthly() && isSmallServing() == that.isSmallServing() && isMediumServing() == that.isMediumServing() && isLargeServing() == that.isLargeServing() && isAddIceCreamSundae() == that.isAddIceCreamSundae() && isAddSprinkles() == that.isAddSprinkles() && Double.compare(that.getPriceSmallServing(), getPriceSmallServing()) == 0 && Double.compare(that.getPriceMediumServing(), getPriceMediumServing()) == 0 && Double.compare(that.getPriceLargeServing(), getPriceLargeServing()) == 0 && Double.compare(that.getPriceIceCreamSundae(), getPriceIceCreamSundae()) == 0 && Double.compare(that.getPriceSprinkles(), getPriceSprinkles()) == 0 && Double.compare(that.getGallonsPurchasedMonthlyFromDistributor(), getGallonsPurchasedMonthlyFromDistributor()) == 0 && Double.compare(that.getCostPerGallonFromDistributor(), getCostPerGallonFromDistributor()) == 0 && Objects.equals(getShopName(), that.getShopName()) && Objects.equals(getShopAddress(), that.getShopAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShopName(), getShopAddress(), getNumberOfSalesMonthly(), isSmallServing(), isMediumServing(), isLargeServing(), isAddIceCreamSundae(), isAddSprinkles(), getPriceSmallServing(), getPriceMediumServing(), getPriceLargeServing(), getPriceIceCreamSundae(), getPriceSprinkles(), getGallonsPurchasedMonthlyFromDistributor(), getCostPerGallonFromDistributor());
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", numberOfSalesMonthly=" + numberOfSalesMonthly +
                ", smallServing=" + smallServing +
                ", mediumServing=" + mediumServing +
                ", largeServing=" + largeServing +
                ", addIceCreamSundae=" + addIceCreamSundae +
                ", addSprinkles=" + addSprinkles +
                ", priceSmallServing=" + priceSmallServing +
                ", priceMediumServing=" + priceMediumServing +
                ", priceLargeServing=" + priceLargeServing +
                ", priceIceCreamSundae=" + priceIceCreamSundae +
                ", priceSprinkles=" + priceSprinkles +
                ", gallonsPurchasedMonthlyFromDistributor=" + gallonsPurchasedMonthlyFromDistributor +
                ", costPerGallonFromDistributor=" + costPerGallonFromDistributor +
                '}';
    }
}
