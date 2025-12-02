public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Константин", "Хабенский", Gender.MALE, 1.75);
        Actor actor2 = new Actor("Анна", "Павлова", Gender.FEMALE, 1.68);
        Actor actor3 = new Actor("Марис", "Лиепа", Gender.MALE, 1.72);
        Actor actor4 = new Actor("Борис", "Лиепа", Gender.MALE, 1.80);

        Director director1 = new Director("Дмитрий","Бертман", Gender.MALE, 10);
        Director director2 = new Director("Франко", "Дзеффирелли", Gender.MALE,15 );

        String musicAuthor = "Родион Щедрин";
        String choreographer = "Юрий Григорович";
        String librettoOpera = "Представление высшего света: на балу Анна знакомится с Вронским";
        String librettoBallet = "Бал в замке: Зигфрид равнодушен к невестам, так как все его мысли об Одетте.";

        Show show = new Show("Война и Мир", 200, director1);
        Opera opera = new Opera("Анна Каренина", 120, director2, musicAuthor, librettoOpera, "40");
        Ballet ballet = new Ballet("Лебединое озеро", 180, director1,musicAuthor, librettoBallet,
                choreographer);

        show.printDirector();
        show.addActor(actor1);
        show.addActor(actor3);
        show.addActor(actor4);
        System.out.println();

        opera.printDirector();
        opera.addActor(actor1);
        opera.addActor(actor2);
        System.out.println();

        ballet.printDirector();
        ballet.addActor(actor2);
        ballet.addActor(actor1);
        System.out.println();

        System.out.println("СПИСКИ ВСЕХ АКТЁРОВ:");
        show.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();
        System.out.println();

        System.out.println("Замена актёра в спектакле");
        show.replaceActor("Лиепа", actor2);
        System.out.println("Обновленный список актёров в спектакле");
        show.printActors();
        System.out.println();

        System.out.println("Попытка заменить несуществующего актера");
        opera.replaceActor("Данилова", actor1);
        System.out.println();

        System.out.println("Либретто оперы");
        opera.printLibretto();
        System.out.println();

        System.out.println("Либретто балета");
        ballet.printLibretto();
    }
}
