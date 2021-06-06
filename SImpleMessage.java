import java.awt.*;
import java.applet.*;
/*<applet code=weeka height=400 width=400>
</applet> */
class week extends Applet
{
 public static void init()
 {
  setForeground(Color.yellow);
 }
 public static void paint(Graphics g)
 {
  g.drawString(" Hello World ",80,40);
 }
}