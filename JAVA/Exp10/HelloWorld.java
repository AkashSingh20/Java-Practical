import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, world!", 20,10);

    }
}
/*
<HTML>
<APPLET code="HelloWorld.class" WIDTH="200" HEIGHT="40">
</APPLET>
</HTML>
*/
