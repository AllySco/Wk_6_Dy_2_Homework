import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  @Test
  public void bagStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(analogCamera);
    Printable camera = photographer.removeCamera();
    assertNotNull(camera);
  }


  @Test
  public void canPrintDetails() {
    photographer.addCamera(analogCamera);
    photographer.addCamera(digitalCamera);
    String details = photographer.printDetails();
    assertEquals("AC, So Hipster. DC, Much Pixels. ", details);
  }


}