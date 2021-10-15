class Candidate1 extends Candidate { // Класс Candidate1 наследует класс Candidate
    Candidate1(String n, int b){
        super(n,b);
    }

    @Override // Переопределяем метод hello() из интерфейса Talk для Candidate1
    public void hello() {
        System.out.println("Hi, my name is " + name);
    }

    @Override // Переопределяем метод showAge() из абстрактного класса Candidate для Candidate1
    public void showAge() {
        System.out.println("I'm " + age + " years old");
    }

    @Override // Переопределяем метод describeExperience() из абстрактного класса Candidate для Candidate1
    public void describeExperience() {
        System.out.println("I passed successfully getJavaJob exams and code reviews");
        System.out.println();
    }
}
