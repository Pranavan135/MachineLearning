import com.inno.ml.datareader.FetchData;

import java.io.File;

/**
 * Created by banu on 18/06/2015.
 */
public class Main {
    public static void main(String[] args) {
        final File folder = new File(FetchData.class.getResource("TestMatches").getFile());
        FetchData.getAllMatchDetails(folder);

    }
}
