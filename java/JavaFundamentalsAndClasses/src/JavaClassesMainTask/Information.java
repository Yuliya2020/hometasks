package JavaClassesMainTask;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Information extends Student {

    public Information(int id, String surname, String name, String fathersName, Date dateOfBirth, String address, long phoneNumber, String faculty, int yearOfStudy, int groupID) {
        super(id, surname, name, fathersName, dateOfBirth, address, phoneNumber, faculty, yearOfStudy, groupID);
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
    public Date getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
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
    public long getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(long phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getFaculty() {
        return super.getFaculty();
    }

    @Override
    public void setFaculty(String faculty) {
        super.setFaculty(faculty);
    }

    @Override
    public int getYearOfStudy() {
        return super.getYearOfStudy();
    }

    @Override
    public void setYearOfStudy(int yearOfStudy) {
        super.setYearOfStudy(yearOfStudy);
    }

    @Override
    public int getGroupID() {
        return super.getGroupID();
    }

    @Override
    public void setGroupID(int groupID) {
        super.setGroupID(groupID);
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", groupID=" + groupID +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(); {}

    }
}
