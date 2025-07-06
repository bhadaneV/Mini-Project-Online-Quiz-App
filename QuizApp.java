import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void display() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    boolean checkAnswer(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of India?", new String[]{"Delhi", "Mumbai", "Chennai", "Kolkata"}, 1));
        questions.add(new Question("Which is a valid Java loop?", new String[]{"for", "when", "repeat", "foreach"}, 1));
        questions.add(new Question("What is ArrayList in Java?", new String[]{"Primitive", "Object", "Collection", "Loop"}, 3));
        questions.add(new Question("How to sort a list?", new String[]{"Collections.sort()", "Arrays.swap()", "List.reverse()", "Set.sort()"}, 1));

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1));
            questions.get(i).display();
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();
            if (questions.get(i).checkAnswer(answer)) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong!");
            }
        }

        System.out.println("\nQuiz Completed! ");
        System.out.println("Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}
