public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        var dog1 = dog + 4;
        System.out.println(dog1);
        var cat1 = cat + 4;
        System.out.println(cat1);
        var paper1 = paper + 4;
        System.out.println(paper1);
        var dog2 = dog1 - 3.5;
        System.out.println(dog2);
        var cat2 = cat1 - 1.6;
        System.out.println(cat2);
        var paper2 = paper1 - 7639;
        System.out.println(paper2);
//Задача про друзей
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Лгушка
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача про боксеров
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var generalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров составляет: " + generalWeight + " кг.");
        var differenceWeight = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов составляет " + differenceWeight + " кг.");
        var differenceWeight1 = boxer2 % boxer1;
        System.out.println("Разница в весе бойцов, через остаток от деления составляет " + differenceWeight1 + " кг" );
        //Задача про часы работы
        var generalHour = 640;
        var jobHour = 8;
        var generalWorks = generalHour / jobHour;
        System.out.println("Всего работников в компании - " + generalWorks + " человек");
        var generalWork1 = generalWorks + 94;
        var generalHour1 = generalWork1 * jobHour;
        System.out.println("Если в компании работает " + generalWork1 + ", то они поделят между собой " + generalHour1 + " часов работы, при условии что будут работать по 8 часов.");






    }
}