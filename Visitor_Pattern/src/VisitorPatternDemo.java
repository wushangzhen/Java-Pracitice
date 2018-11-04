public class VisitorPatternDemo {
  public static void main(String[] args) {
    ComputerPart computer = new Computer();
    ComputerPart mouse = new Mouse();
    mouse.accept(new ComputerPartDisplayVisitor());
    computer.accept(new ComputerPartDisplayVisitor());
  }

}
