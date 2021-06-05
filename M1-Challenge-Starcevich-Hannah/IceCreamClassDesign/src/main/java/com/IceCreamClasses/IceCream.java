package com.IceCreamClasses;

public abstract class IceCream {

    private String name;
    private String color;
    private boolean hasChocolate;
    private boolean hasNuts;

    public IceCream(String name, String color, boolean hasChocolate, boolean hasNuts) {
        this.name = name;
        this.color = color;
        this.hasChocolate = hasChocolate;
        this.hasNuts = hasNuts;
    }

    public IceCream() {

    }

    public abstract double costOfIceCream();

    public abstract double saleOfIceCream();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasChocolate() {
        return hasChocolate;
    }

    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }
}
