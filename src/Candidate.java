abstract class Candidate implements Talk { // Абстрактный класс Candidate реализует интерфейс Talk
    String name;
    int age;

    Candidate(String n, int b) {
        name = n;
        age = b;
    }

    public abstract void describeExperience(); // Декларируем метод, описывающий опыт кандидата
    public abstract void showAge(); // Декларируем метод, который будет показывать сколько лет кандидату
}
