import java.util.HashMap;

public class TrackList {
  public void trackList() {
    HashMap<String, String> tracks = new HashMap<>();
    tracks.put("You right", "HHHHH");
    tracks.put("Save your Tears", "MMMMMM");
    tracks.put("Triator", " NNNNNN");
    tracks.put("My Universe", "OOOOOO");
    System.out.println( tracks.get("Triator"));
  }
}