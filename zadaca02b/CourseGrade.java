package zadaca02b;

/**
 * Klasa koja predstavlja ocjenu kolegija.
 *
 * @author Petra Puljić
 * @version 1.0
 */
public class CourseGrade {
    private int code;
    private String title;
    private int grade;

    public CourseGrade(int code, String title, int grade) {
        this.code = code;
        this.title = title;
        this.grade = grade;
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }
}