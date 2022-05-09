package String;

public class StringProblem61 {
    public static void main(String[] args) {
        String str = "D:\\Qudrat_Abdurahimov\\Books\\My_Book.exe";
        int end = str.lastIndexOf("\\");
        int start = (str.substring(0, end)).lastIndexOf("\\");
        if (start == -1) {
            System.out.println("\\");
        } else {
            System.out.println(str.substring(start + 1, end));
        }
    }
}