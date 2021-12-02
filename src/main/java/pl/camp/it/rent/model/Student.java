package pl.camp.it.rent.model;

public class Student {
    private String name;
    private String surname;
    private int wiek;
    private String email;
    private String kierunek;

    public Student(String name, String surname, int wiek, String email, String kierunek) {
        this.name = name;
        this.surname = surname;
        this.wiek = wiek;
        this.email = email;
        this.kierunek = kierunek;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
}
