package JavaClassesMainTask;

import java.math.BigInteger;
import java.util.Objects;
import java.lang.Comparable;
import java.math.BigInteger;


    public class Customer implements Comparable<Customer>{

        public int id;
        public String surname;
        public String name;
        public String fathersName;
        public String address;
        public String creditCardNumber;
        public String accountNumber;

        public Customer(int id, String surname, String name, String fathersName, String address, String creditCardNumber, String accountNumber) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.fathersName = fathersName;
            this.address = address;
            this.creditCardNumber = creditCardNumber;
            this.accountNumber = accountNumber;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFathersName() {
            return fathersName;
        }

        public void setFathersName(String fathersName) {
            this.fathersName = fathersName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCreditCardNumber() {
            return creditCardNumber;
        }

        public void setCreditCardNumber(String creditCardNumber) {
            this.creditCardNumber = creditCardNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Customer)) return false;
            Customer customer = (Customer) o;
            return getId() == customer.getId() &&
                    Objects.equals(getSurname(), customer.getSurname()) &&
                    Objects.equals(getName(), customer.getName()) &&
                    Objects.equals(getFathersName(), customer.getFathersName()) &&
                    Objects.equals(getAddress(), customer.getAddress()) &&
                    Objects.equals(getCreditCardNumber(), customer.getCreditCardNumber()) &&
                    Objects.equals(getAccountNumber(), customer.getAccountNumber());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getSurname(), getName(), getFathersName(), getAddress(), getCreditCardNumber(), getAccountNumber());
        }

        public int getCustomerId() {
        return id;
    }

                public int compareTo(Customer customer) {
            return 0;
        }

    public String CompareTo(Customer compareCustomer) {
        String compareSurname = ((Customer) compareCustomer).getSurname();
        return this.surname = compareSurname;
    }

    }