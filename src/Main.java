import jmapps.ui.JMFrame;

import java.awt.*;
import java.io.IOException;
import javax.media.*;

public class Main {
    public static void main(String[] args) throws IOException, NoPlayerException {
        Frame demoFrame = new Frame("Demo Frame");

        //JVM not functioning as expected. Looking into other APIs
        Player demoPlayer = Manager.createPlayer(new MediaLocator("C:\\Users\\Owner\\Desktop\\sams_song.mpeg"));

        demoFrame.setVisible(true);
    }
}