import java.util.*;

public class Photographer {

  private ArrayList<Printable> bag;

  public Photographer() {
    this.bag = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return this.bag.size();
  }

  public void addCamera(Printable printable) {
    this.bag.add(printable);
  }

  public Printable removeCamera() {
    if (cameraCount() > 0) {
      return this.bag.remove(0);
    }
    return null;
  }

  public String printDetails() {
    String cameraDetails = "";
    for (Printable details : this.bag) {
      cameraDetails += details.printDetails();
    }
    return cameraDetails;
  }
}
