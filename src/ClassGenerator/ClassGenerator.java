package ClassGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClassGenerator {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Package nomini kiriting: ");
        String packageName = scan.nextLine();
        System.out.println("Classni nomini kiriting: ");
        String nameOfClass = scan.nextLine();

        System.out.println("Classni boshlanish sonini kiriting: ");
        int j = scan.nextInt();

        System.out.println("Classni tugash sonini kiriting: ");
        int n = scan.nextInt();

        for (int i = j; i <= n; i++) {
            String nameOfClass2 = nameOfClass + i + ".java";
            File file = new File("C:\\Users\\User\\IdeaProjects\\HomeWorkForOneMonth\\src\\" + packageName + "\\" + nameOfClass2);
            System.out.println(file.createNewFile());

            FileWriter writer = new FileWriter(file);
            writer.write("package " + packageName + ";\n");
            writer.write("\n" +
                    "public class " + nameOfClass + i + "{\n" +
                    "}");
            writer.close();

        }
    }
}
