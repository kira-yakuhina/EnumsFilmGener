//public class DescriptionFilm {
//    public static void main(String[] args){
////        FilmGenre interstellarGenre = FilmGenre.DRAMA;
////        System.out.println(interstellarGenre);
//    }
//}


//Метод equals() сравнивает значения
//public class DescriptionFilm {
//    public static void main (String[] args){
//        System.out.println(actionOfTheFilm(FilmGenre.ADVENTURES));
//        System.out.println(actionOfTheFilm(FilmGenre.DRAMA));
//    }
//    public static boolean actionOfTheFilm (FilmGenre genre){
//        return FilmGenre.DRAMA.equals(genre)  || FilmGenre.FANTASTIC.equals(genre) || FilmGenre.ADVENTURES.equals(genre);
//    }
//}

// Метод values() возвращает массив элементов в том же порядке, в котором перечислены.
//public class DescriptionFilm {
//    public static void main(String[] args){
//        for (FilmGenre genre: FilmGenre.values()){
//            System.out.println(genre);
//        }
//    }
//}

// Вызвав valueOf(), вернётся константа перечисления
//public class DescriptionFilm {
//    public static void main(String[] args){
//        System.out.println(FilmGenre.valueOf(" "));
//    }
//}

// Метод ordinal() помогает получить номер элемента перечисления. Значения начинаются с нуля.
//public class DescriptionFilm {
//    public static void main(String[] args){
//        for (FilmGenre genre: FilmGenre.values()){
//            System.out.println("Жанр фильма: " + genre + ". Номер: " + (genre.ordinal()+1));
//        }
//    }
//}

// Метод name()возвращает имя элемента перечисления, как System.out.println()
public class DescriptionFilm {
    public static void main(String[] args){
        FilmGenre fantastic = FilmGenre.FANTASTIC;
        System.out.println(fantastic);// вывод значения переменной
        System.out.println(fantastic.name()); // вызов метода name
    }
}