package Pr2.Pr2Task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    ///
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}