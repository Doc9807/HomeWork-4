public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int age = 1;
        if (age < 18)
        {
            System.out.printf("«Если возраст человека равен %s, то он не достиг совершеннолетия, нужно " +
                    "немного подождать».%n",age);
        } else {
            System.out.printf("«Если возраст человека равен %s, то он совершеннолетний».%n",age);
        }

        System.out.println("\nTask 2");
        int temperature = 5;
        if (temperature < 5)
        {
            System.out.printf("«На улице %s градусов, на улице холодно, нужно надеть шапку».%n",temperature);
        } else {
            System.out.printf("«На улице %s градусов, можно идти без шапки».%n",temperature);
        }

        System.out.println("\nTask 3");
        int speed = 60;
        if (speed > 60)
        {
            System.out.printf("«Если скорость %s, то придется заплатить штраф».%n",speed);
        } else {
            System.out.printf("«Если скорость %s, то можно ездить спокойно».%n",speed);
        }

        System.out.println("\nTask 4");
        if (age > 2 && age <= 6) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в детский сад».%n",age);
        } else if (age >= 7 && age <= 17) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в школу».%n",age);
        } else if (age >= 18 && age <= 24) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в университет».%n",age);
        } else if (age > 24) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить на работу».%n",age);
        } else {
            System.out.println("«Ошибка, недопустимый возраст.»");
        }

        System.out.println("\nTask 5");
        int childAge = 14;
        if (childAge < 5) {
            System.out.printf("«Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе».%n",childAge);
        } else if (childAge >= 5 && childAge < 14) {
            System.out.printf("«Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении " +
                    "взрослого».%n",childAge);
        } else if (childAge >= 14)
            System.out.printf("«Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождении " +
                    "взрослого».%n",childAge);


        System.out.println("\nTask 6");
        int amountOfPeople = 99;
        if (amountOfPeople < 60) {
            System.out.println("«Есть свободные сидячие места.»");
        }
        else if (amountOfPeople < 102) {
            System.out.println("«Сидячие места заняты. Остались только стоячие места.»");
        }
        if (amountOfPeople >= 102) {
            System.out.println("«Мест нет.»");
        }

        System.out.println("\nTask 7");
        int one = 4;
        int two = 3;
        int three = 0;
        if (one > two && one > three){
            System.out.println("«Самое большое число - первое.»");
        } else if (two > one && two > three) {
            System.out.println("«Самое большое число - второе.»");
        } else if (three > one && three > two) {
            System.out.println("«Самое большое число - третье.»");
        } else {
            System.out.println("«Нет большего числа.»");
        }
    }
}