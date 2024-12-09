package Activity34;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class libraryRead {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("recall.json"));
            Type checkoutListType = new TypeToken<List<BookOut>>(){}.getType();
            List<BookOut> checkoutList = gson.fromJson(reader, checkoutListType);
            System.out.println("****** Checkout Details ******");
            for(BookOut bookOut : checkoutList) {
                System.out.printf("Book ID %d\nmodel: %s\nyear: %s\n",bookOut.getBookID(),bookOut.getTitle(),bookOut.getBorrowersName());
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
