class Employer implements Talk { // класс Employer реализует интерфейс Talk
    @Override // Переопределяем метод hello() из интерфейса Talk для Employer
    public void hello() {
        System.out.println("Hi! Introduce yourself and describe your java experience, please");
    }
}
