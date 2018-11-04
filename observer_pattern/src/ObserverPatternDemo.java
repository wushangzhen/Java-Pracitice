public class ObserverPatternDemo {
  public static void main(String[] args) {
    Subject subject = new Subject();
    HexaObserver hexaObserver = new HexaObserver(subject);
    OctalObeserver octalObeserver = new OctalObeserver(subject);
    BinaryObserver binaryObserver = new BinaryObserver(subject);

    subject.setState(15);
  }

}
