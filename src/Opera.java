public class Opera extends MusicalShow{
    private String choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor, String librettoText,
                 String choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера '" + getTitle() + "' (хор: " + choirSize + " человек)";
    }
}

