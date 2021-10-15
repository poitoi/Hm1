class Candidate2 extends Candidate { // Класс Candidate2 наследует класс Candidate
    Candidate2(String n, int b){
        super(n,b);
    }

    @Override // Переопределяем метод hello() из интерфейса Talk для Candidate2
    public void hello() {
        System.out.println("Hi, my name is " + name);
    }

    @Override // Переопределяем метод showAge() из абстрактного класса Candidate для Candidate2
    public void showAge() {
        System.out.println("I'm " + age + " years old");
    }

    @Override // Переопределяем метод describeExperience() из абстрактного класса Candidate для Candidate2
    public void describeExperience() {
        System.out.println("I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code");
        System.out.println();
    }

}
