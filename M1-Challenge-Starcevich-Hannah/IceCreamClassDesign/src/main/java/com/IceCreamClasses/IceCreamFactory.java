package com.IceCreamClasses;

import java.util.Objects;

public class IceCreamFactory extends IceCream {

    private String factoryName;
    private String factoryAddress;
    private int gallonsProducedMonthly;
    private double salePrice1Gallon;
    private double costPerGallon;
    private double  gallonsSoldMonthly;

    public IceCreamFactory() {
        super();
    }

    public IceCreamFactory(String name, String color, boolean hasChocolate, boolean hasNuts, String factoryName, String factoryAddress, int gallonsProducedMonthly, double salePrice1Gallon, double costPerGallon, double gallonsSoldMonthly) {
        super(name, color, hasChocolate, hasNuts);
        this.factoryName = factoryName;
        this.factoryAddress = factoryAddress;
        this.gallonsProducedMonthly = gallonsProducedMonthly;
        this.salePrice1Gallon = salePrice1Gallon;
        this.costPerGallon = costPerGallon;
        this.gallonsSoldMonthly = gallonsSoldMonthly;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    public int getGallonsProduced() {
        return gallonsProducedMonthly;
    }

    public void setGallonsProduced(int gallonsProduced) {
        this.gallonsProducedMonthly = gallonsProduced;
    }

    public double getSalePrice1Gallon() {
        return salePrice1Gallon;
    }

    public void setSalePrice1Gallon(double salePrice1Gallon) {
        this.salePrice1Gallon = salePrice1Gallon;
    }

    public double getCostPerGallon() {
        return costPerGallon;
    }

    public void setCostPerGallon(double costPerGallon) {
        this.costPerGallon = costPerGallon;
    }

    public double getGallonsSoldMonthly() {
        return gallonsSoldMonthly;
    }

    public void setGallonsSoldMonthly(double gallonsSoldMonthly) {
        this.gallonsSoldMonthly = gallonsSoldMonthly;
    }

    @Override
    public double costOfIceCream() {
        return costPerGallon * gallonsProducedMonthly;
    }

    @Override
    public double saleOfIceCream() {
        return salePrice1Gallon * gallonsSoldMonthly;
    }

    public double monthlyProfit() {
        return saleOfIceCream() - costOfIceCream();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamFactory)) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return gallonsProducedMonthly == that.gallonsProducedMonthly && Double.compare(that.getSalePrice1Gallon(), getSalePrice1Gallon()) == 0 && Double.compare(that.getCostPerGallon(), getCostPerGallon()) == 0 && Double.compare(that.getGallonsSoldMonthly(), getGallonsSoldMonthly()) == 0 && Objects.equals(getFactoryName(), that.getFactoryName()) && Objects.equals(getFactoryAddress(), that.getFactoryAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFactoryName(), getFactoryAddress(), gallonsProducedMonthly, getSalePrice1Gallon(), getCostPerGallon(), getGallonsSoldMonthly());
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "factoryName='" + factoryName + '\'' +
                ", factoryAddress='" + factoryAddress + '\'' +
                ", gallonsProducedMonthly=" + gallonsProducedMonthly +
                ", salePrice1Gallon=" + salePrice1Gallon +
                ", costPerGallon=" + costPerGallon +
                ", gallonsSoldMonthly=" + gallonsSoldMonthly +
                '}';
    }
}
