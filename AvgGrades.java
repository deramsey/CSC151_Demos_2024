import java.util.Scanner;

class AvgGrades {
    Scanner in = new Scanner(System.in);
    int arrLength;
    double[] grades;
    double resultFull;
    double resultDrop;

    AvgGrades() {
        System.out.print("Enter number of grades: ");
        arrLength = in.nextInt();
        grades = new double[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = in.nextDouble();
        }
        resultFull = fullAverage(grades);
        resultDrop = droppedAverage(grades);
    }

    public static void main(String[] args) {
        AvgGrades calc = new AvgGrades();
        System.out.println(calc.resultFull);
        System.out.println(calc.resultDrop);

    }

    double fullAverage(double[] grades) {
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    double droppedAverage(double[] grades) {
        double smallest = 1000;
        double total = 0;
        for (double grade : grades) {
            if (grade < smallest) {
                smallest = grade;
            }
        }
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == smallest) {
                grades[i] = 0;
                break;
            }
        }
        for (double grade : grades) {
            total += grade;
        }
        return total / (grades.length - 1);
    }

}
