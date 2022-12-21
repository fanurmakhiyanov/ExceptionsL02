package fanur;

import java.io.*;

public class SomeClass {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("sdafgdsaf.txt")){
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[1];
            test();
            int a = 0;
        } catch (ArithmeticException e) {
            System.out.println("Divided unsupported");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Я жив!");
    }

    public static void test() {
        File file = new File("1.txt");
        try (FileReader reader = new FileReader(file)) {
            if (file.createNewFile()){
                System.out.println("Create new file");
            }
            else {
                System.out.println("Reuse this file");
            }
            if (reader.read() == -1 ){
                throw new IOException("Can't read file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
