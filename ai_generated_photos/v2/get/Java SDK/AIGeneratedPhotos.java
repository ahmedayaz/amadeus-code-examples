// How to install the library at https://github.com/amadeus4dev/amadeus-java

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.GeneratedPhoto;

public class AIGeneratedPhotos {

  public static void main(String[] args) throws ResponseException {

    Amadeus amadeus = Amadeus
        .builder("YOUR_AMADEUS_API_KEY","YOUR_AMADEUS_API_SECRET")
        .build();

    // Generates a fake beach image
    GeneratedPhoto photo = amadeus.media.files.generatedPhotos.get(Params
        .with("category", "MOUNTAIN"));

    if (photo.getResponse().getStatusCode() != 200) {
        System.out.println("Wrong status code: " + photo.getResponse().getStatusCode());
        System.exit(-1);
    }

    System.out.println(photo);
  }
}
