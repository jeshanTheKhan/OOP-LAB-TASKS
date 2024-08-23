import java.util.*;

// Base class for all question types
class Question {
    private String question;
    private int difficultyLevel;

    // Constructor
    public Question(String question, int difficultyLevel) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
    }

    // Getter methods
    public String getQuestion() {
        return question;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    // Setter methods
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    // Polymorphic methods
    public void displayQuestion() {
        System.out.println("Question: " + question);
        System.out.println("Difficulty Level: " + difficultyLevel);
    }

    public int scoreQuestion() {
        // Default scoring logic (can be overridden in subclasses)
        return 0;
    }
}

// Subclass for multiple-choice questions
class MultipleChoiceQuestion extends Question {
    private String[] choices;
    private int correctChoiceIndex;

    // Constructor
    public MultipleChoiceQuestion(String question, int difficultyLevel, String[] choices, int correctChoiceIndex) {
        super(question, difficultyLevel);
        this.choices = choices;
        this.correctChoiceIndex = correctChoiceIndex;
    }

    // Getter methods
    public String[] getChoices() {
        return choices;
    }

    public int getCorrectChoiceIndex() {
        return correctChoiceIndex;
    }

    // Polymorphic method overriding

    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("Choices:");
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    public int scoreQuestion() {
        // Specific scoring logic for multiple-choice questions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (1-" + choices.length + "): ");
        int userChoice = scanner.nextInt();

        if (userChoice == correctChoiceIndex + 1) {
            System.out.println("Correct!");
            return getDifficultyLevel();
        } else {
            System.out.println("Incorrect!");
            return 0;
        }
    }
}

// Subclass for true/false questions
class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    // Constructor
    public TrueFalseQuestion(String question, int difficultyLevel, boolean correctAnswer) {
        super(question, difficultyLevel);
        this.correctAnswer = correctAnswer;
    }

    // Getter method
    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    // Polymorphic method overriding

    public int scoreQuestion() {
        // Specific scoring logic for true/false questions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your answer (true/false): ");
        boolean userAnswer = scanner.nextBoolean();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            return getDifficultyLevel();
        } else {
            System.out.println("Incorrect!");
            return 0;
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        // Example usage of the quiz application
        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion(
                "What is the capital of France?",
                2,
                new String[] { "Paris", "Berlin", "London", "Madrid" },
                0);

        TrueFalseQuestion tfq = new TrueFalseQuestion(
                "Java is a programming language.",
                1,
                true);

        // Display and solve questions
        System.out.println("Multiple Choice Question:");
        mcq.displayQuestion();
        int mcqScore = mcq.scoreQuestion();
        System.out.println("Score: " + mcqScore);

        System.out.println("\nTrue/False Question:");
        tfq.displayQuestion();
        int tfqScore = tfq.scoreQuestion();
        System.out.println("Score: " + tfqScore);
    }
}
