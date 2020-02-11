package model;

import java.time.LocalDate;

public class Person {
    public enum SEX {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private SEX gender;
    private String email;

    public Person() {
    }

    public Person(String name, LocalDate birthday, SEX gender, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return LocalDate.now().compareTo(birthday);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public SEX getGender() {
        return gender;
    }

    public void setGender(SEX gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
