import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/Home/Documents/programming/Джава/lab_9/src/poem.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            String vowels = "аеёищуыэюя";
            String consonants = "бвгджзйклмнпрстфхцчшщ";
            int k = 0;
            int totalV = 0;
            int totalC = 0;

            while ((line = br.readLine()) != null) {
                k += 1;//номер строчки
                int countVowels = 0; //счет для 1 строчки гласных
                int countConsonants = 0;//счет для 1 строчки согласных
                for (char simvol : line.toLowerCase().toCharArray()) {
                    if (vowels.indexOf(simvol) != -1) {
                        countVowels++;
                        totalV++;
                    } else if (consonants.indexOf(simvol) !=-1){
                        countConsonants++;
                        totalC++;
                    }
                }
                try (FileWriter writer = new FileWriter("C:/Users/Home/Documents/programming/Джава/lab_9/src/poem_rez.txt", true)) {
                    writer.write("\n Строчка " + k + " гласных: " + countVowels + ", согласных: " + countConsonants);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try (FileWriter writer = new FileWriter("C:/Users/Home/Documents/programming/Джава/lab_9/src/poem_rez.txt", true)) {
                writer.write("\n Общее количество гласных: " + totalV + ", согласных: " + totalC);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}