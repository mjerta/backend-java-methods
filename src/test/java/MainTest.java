import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void testA_Monoloog() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    A_Monoloog.main(new String[]{});
    verify(mockedPrintStream).println("Hey");
    verify(mockedPrintStream).println("Welcome to this wonderful conversation");
    verify(mockedPrintStream).println("How about this weather?");
    verify(mockedPrintStream).println("And did you see that random program on that random channel?");
    verify(mockedPrintStream).println("Thank you for a wonderful conversation!");
    verify(mockedPrintStream).println("Cya");
  }

  @Test
  public void testB_Dialoog() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    B_Dialoog.main(new String[]{});
    verify(mockedPrintStream).println("Bert says: Hey");
    verify(mockedPrintStream).println("Hey says Ernie");
    verify(mockedPrintStream).println("Bert says: Welcome to this wonderful conversation");
    verify(mockedPrintStream).println("Thnx, I'm looking forward to it says Ernie");
    verify(mockedPrintStream).println("Bert says: How about this weather?");
    verify(mockedPrintStream).println("I really don't mind the cold.... says Ernie");
    verify(mockedPrintStream).println("Bert says: And did you see that random program on that random channel?");
    verify(mockedPrintStream).println("Well... I did watch a random program on a random channel... says Ernie");
    verify(mockedPrintStream).println("Bert says: Thank you for a wonderful conversation!");
    verify(mockedPrintStream).println("Cya says Ernie");
  }

  @Test
  public void testC_Oppervlakte() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    C_Oppervlakte.main(new String[]{});
    verify(mockedPrintStream).println("De oppervlakte van een rechthoek met lengte 2 en breedte 8 is 16");
    verify(mockedPrintStream).println("De oppervlakte van een vierkant met zijden van 5 cm is 25");
    verify(mockedPrintStream).println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 is 132");
    verify(mockedPrintStream).println("De oppervlakte van een kubus met zijden van 5 cm is 150");
  }
}
