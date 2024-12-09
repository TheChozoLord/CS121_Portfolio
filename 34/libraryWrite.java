package Activity34;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class libraryWrite {
    public static void main(String[] args) {
        try {
            BookOut checkoutInfo = new BookOut("TO Kill a Moking Bird","Jane Doe",8434);
            Gson gson = new Gson();

            String jsonString = gson.toJson(checkoutInfo);
            System.out.println(jsonString);

            FileWriter filewriter = new FileWriter("checkout.json");
            filewriter.write(jsonString);
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
