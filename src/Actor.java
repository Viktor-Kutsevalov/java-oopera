import java.util.Objects;

public class Actor extends Person{
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (рост: " + height + " м)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname()) &&
                getGender() == actor.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getGender(), height);
    }
}
