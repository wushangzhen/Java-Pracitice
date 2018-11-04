public class OctalObeserver extends Observer{
  public OctalObeserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }


  @Override
  public void update() {
    System.out.println("Octal String"
        + Integer.toOctalString(subject.getState()));
  }
}
