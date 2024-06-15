import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile(); // new file created
            if (fo.delete()){ //to delete file
                System.out.println(fo.getName()+ " is deleted");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //FileWriter
        try(FileWriter fw= new FileWriter("note.txt",true)) {
            fw.write("This should be appended"); //overwritten the file
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





        //OutputStreamWriter
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("this is me");
            osw.write(97);
            osw.write('A');
            char[] arr = "Dalima".toCharArray();
            osw.write(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




        // creating a file---byte stream to char---displays char stream.
        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
            while(br.ready()){
            System.out.println("You typed: "+ br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }





        // reads the file in bytes but is converted into char
        try(FileReader fr = new FileReader("note.txt")){
            System.out.println("Enter some letters:");
            int letter = fr.read(); 
            while (fr.ready()) {
                System.out.println((char)letter);
                letter = fr.read();
            }
            fr.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




        // In this we are converting byte stream into character stream.
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some letters: ");
            int letters = isr.read(); 
            while (isr.ready()) {
                System.out.println((char)letters);
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
