public class Student {
    int idNo=101;
    int noOfSubjectsRegistered=4;
    int[] subjectCode={201,202,203,204};
    int[] subjectCredits={6,6,6,6};
    char[] gradeObtained={A,A,A,A};
    double spi;

    public Student(int idNo, int noOfSubjectsRegistered, int[] subjectCode, int[] subjectCredits, char[] gradeObtained) {
        this.idNo = idNo;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
    }

    public void calculateSpi() {
        double totalGradePoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            double gradePoint;
            switch (gradeObtained[i]) {
                case 'A+':
                    gradePoint = 10;
                    break;
                case 'A':
                    gradePoint = 9;
                    break;
                case 'B+':
                    gradePoint = 8;
                    break;
                case 'B':
                    gradePoint = 7;
                    break;
                case 'C+':
                    gradePoint = 6;
                    break;
                default:
                    gradePoint = 0;
            }
            totalGradePoints += gradePoint * subjectCredits[i];
            totalCredits += subjectCredits[i];
        }
        spi = totalGradePoints / totalCredits;
        System.out.println("SPI:"+spi);
    }

}