package JavaClassesMainTask;

import JavaClassesMainTask.Customer;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays.*;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Comparable;


public class CustomerPaymentInformation extends Customer {

    public CustomerPaymentInformation(int id, String surname, String name, String fathersName, String address, String creditCardNumber, String accountNumber) {
        super(id, surname, name, fathersName, address, creditCardNumber, accountNumber);
    }

    @Override
    public String toString() {
        return "CustomerPaymentInformation{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getFathersName() {
        return super.getFathersName();
    }

    @Override
    public void setFathersName(String fathersName) {
        super.setFathersName(fathersName);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getCreditCardNumber() {
        return super.getCreditCardNumber();
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        super.setCreditCardNumber(creditCardNumber);
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        super.setAccountNumber(accountNumber);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int getCustomerId() {
        return super.getCustomerId();
    }

    @Override
    public int compareTo(Customer customer) {
        return super.compareTo(customer);
    }

    @Override
    public String CompareTo(Customer compareCustomer) {
        return super.CompareTo(compareCustomer);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        Customer[] customer = new Customer[5];

        Customer ivanov = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "ul.Ya.Kolasa 28", "4147050502020101", "BY06MMBN30120000110100000000");
        Customer petrov = new Customer(2, "Petrov", "Pyotr", "Petrovich", "p-t Nezavisimosti, 101", "4141703030101000", "BY06MMBN30120000110100000001");
        Customer smirnova = new Customer(3, "Smirnova", "Svetlana", "Mikajlovna", "ul. Kozlova, 25", "4145058944369901", "BY06MMBN30120000110100000002");
        Customer sidorov = new Customer(4, "Sidorov", "Veniamin", "Aleksandrovich", "per. Kozlova, 2", "5859625922457189", "BY06MMBN30120000110100000003");
        Customer levin = new Customer(5, "Levin", "Ignat", "Borisovich", "ul. Zakharova, 4", "5159875624853356", "BY06MMBN30120000110100000004");

        customer[0] = ivanov;
        customer[1] = petrov;
        customer[2] = smirnova;
        customer[3] = sidorov;
        customer[4] = levin;

        Arrays.sort(customer);

        int i = 0;
        for (Customer temp : customer) {
            System.out.println("customer " + ++i + " : " + temp.getCustomerId() + ", " + temp.getSurname() + ", " + temp.getName() + ", " + temp.getFathersName() + ", " + temp.getAddress() + ", " + temp.getCreditCardNumber() + ", " + temp.getAccountNumber());
        }
    }

}





