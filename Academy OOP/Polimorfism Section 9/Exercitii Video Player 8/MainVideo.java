import java.util.ArrayList;
import java.util.Arrays;

public class MainVideo {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>(Arrays.asList(" Lord ", " Star wars ", " Shutter "));

        VLCPlayer vlcPlayer = new VLCPlayer();
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer();
        Winamp winamp = new Winamp();

        for (int i = movies.size()-1; i >=0 ; i--) {

        vlcPlayer.PlayVideo(movies.get(i));
        windowsMediaPlayer.PlayVideo(movies.get(i));
        winamp.PlayVideo(movies.get(i));
        }
        }
    }

