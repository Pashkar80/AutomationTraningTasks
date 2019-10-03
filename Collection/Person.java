package Collection;

/**
 * Created by user on 22.07.2019.
 */
public class Person {
    private  int id;
    private String name;

    public Person(String name,int id) {
        this.name = name;
        this.id = id;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (this.getId() != person.getId()) return false;
        return this.getName() != null ? this.getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = this.getId();
        result = 31 * result + (this.getName() != null ? this.getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
