import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Ошибка: нельзя добавить null");
            return;
        }

        for (Actor existing : listOfActors) {
            if (existing.equals(actor)) {
                System.out.println("Актёр уже есть в спектакле: " + actor);
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Добавлен актёр: " + actor);
    }

    public void replaceActor(String surname, Actor newActor) {
        if (newActor == null) {
            System.out.println("Ошибка: новый актёр не может быть null");
            return;
        }
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }

        int count = 0;
        int index = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.getSurname().equals(surname)) {
                count++;
                index = i;
            }
        }

        if (count > 1) {
            System.out.println("В списке найдено несколько актёров с фамилией " + surname + ". Замена не выполнена.");
        } else if (count == 1) {
            listOfActors.set(index, newActor);
            System.out.println("Заменил: " + listOfActors.get(index) + " на " + newActor);
        } else {
            System.out.println("Актёр с фамилией " + surname + " не найден.");
        }
    }

    public void printActors() {
        System.out.println("Список актёров спектакля '" + title + "':");
        if (listOfActors.isEmpty()) {
            System.out.println("Актёры не назначены.");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля '" + title + "': " + director);
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }
}
