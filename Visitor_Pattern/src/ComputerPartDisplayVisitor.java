public class ComputerPartDisplayVisitor
    implements ComputerPartVisitor {

  @Override
  public void visit(Computer computer) {
    System.out.println("Computer");
  }

  @Override
  public void visit(Mouse mouse) {
    System.out.println("mouse");

  }

  @Override
  public void visit(KeyBoard keyBoard) {
    System.out.println("keyBoard");
  }

  @Override
  public void visit(Monitor monitor) {
    System.out.println("monitor");
  }
}
