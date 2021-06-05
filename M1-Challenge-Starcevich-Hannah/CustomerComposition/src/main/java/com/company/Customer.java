package com.company;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean rewardsMember;

    private Address billingAddress;
    private Address shippingAddress;

    public Customer() {}

    public Customer(String firstName, String lastName, String email, String phoneNumber, boolean rewardsMember, Address billingAddress, Address shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rewardsMember = rewardsMember;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return isRewardsMember() == customer.isRewardsMember() && Objects.equals(getFirstName(), customer.getFirstName()) && Objects.equals(getLastName(), customer.getLastName()) && Objects.equals(getEmail(), customer.getEmail()) && Objects.equals(getPhoneNumber(), customer.getPhoneNumber()) && Objects.equals(getBillingAddress(), customer.getBillingAddress()) && Objects.equals(getShippingAddress(), customer.getShippingAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getPhoneNumber(), isRewardsMember(), getBillingAddress(), getShippingAddress());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rewardsMember=" + rewardsMember +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}
