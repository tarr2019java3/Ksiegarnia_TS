package pl.sda.student;

public class Author {
    private String name;
    private String lastName;

    public Author() {
    }

    public Author(String name, String lastname) {
        this.name = name;
        this.lastName = lastname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
