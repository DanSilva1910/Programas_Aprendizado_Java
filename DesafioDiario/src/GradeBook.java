public class GradeBook {

    private String courseName;
    private int[] grades;

    // costrutor
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // configurar o nome do curso
    public void setCourseName() {
        this.courseName = courseName;
    }

    // retornar o nome do curso
    public String getCourseName() {
        return courseName;
    }

    // realiza várias operações nos dados
    public void processGrades() {
        // gera saída de array de notas
        outputGrades();

        // chama método getAverage para calcular a nota média
        System.out.printf("%nClass average is %.2f%n", getMediaGrade());

        // chama métodos getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
                getMaxGrade(), getMinGrade());

        // chama outputBarChart para imprimir gráfico de distribuição de nota
        outputBarChart();
    }

    // média da turma
    public double getMediaGrade() {
        double media = 0;
        for (int grade : grades) {
            media += grade;
        }
        media = media / grades.length;
        return media;
    }

    // nota mais alta
    public int getMaxGrade() {
        int maxGrade = grades[0];
        for (int grade : grades) {
            if (maxGrade < grade) {
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    // nota mais baixa
    public int getMinGrade() {
        int minGrade = grades[0];
        for (int grade : grades) {
            if (minGrade > grade) {
                minGrade = grade;
            }
        }
        return minGrade;
    }

    // gera a saída do gráfico
    public void outputBarChart() {
        System.out.println("Grade distribution: ");
        // armazena a frequancia de notas
        int[] frequency = new int[11];

        for (int grade : grades) {
            ++frequency[grade / 10];
        }
        for (int count = 0; count < frequency.length; count++) {
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int star = 0; star < frequency[count]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.printf("The grades are: %n%n");

        // gera a saída da nota do aluno
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);

        }
    }

}
