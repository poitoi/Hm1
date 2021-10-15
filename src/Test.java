public class Test {
    public static void main(String[] args) {
        Candidate candidates[] = new Candidate[4]; // Декларируем массив типа Candidate
        Employer employer = new Employer(); // Создаем объект типа Employer

        candidates[0] = new Candidate1("Alex", 30);
        candidates[1] = new Candidate1("Jane", 24);
        candidates[2] = new Candidate2("Bob", 20);
        candidates[3] = new Candidate2("Mary", 34);

            for (Candidate candidate : candidates) { // Создаем цикл for each для обработки элементов массива
                employer.hello(); // Вызываем методы hello(), showAge(), describeExperience() у интервьюера и кандидатов
                candidate.hello();
                candidate.showAge();
                candidate.describeExperience();
            }
        }
    }

