package com.example.pr5;

public class CardData {
    private String name;
    private String surname;
    private String middlename;
    private int pos;

    public CardData(String name, String surname, String middlename, int pos) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.pos = pos;
    }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getMiddlename() { return middlename; }
    public int getPos() { return pos; }
}
