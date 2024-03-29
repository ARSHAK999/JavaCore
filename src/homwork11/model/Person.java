//package homwork11.model;
//
//import java.util.Objects;
//
//
//public class Person {
//    private String id;
//    private String name;
//    private String surname;
//
//    private String phonNuumber;
//
//
//    public Person(String id, String name, String surname) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, surname);
//    }
//
//    public Person() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//}
