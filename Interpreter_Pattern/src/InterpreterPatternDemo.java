public class InterpreterPatternDemo {
  public static Expression getMaleExpression() {
    Expression robert = new TerminalExpression("robert");
    Expression john = new TerminalExpression("john");
    return new OrExpression(robert, john);
  }
  public static Expression getMarried() {
    Expression julie = new TerminalExpression("julie");
    Expression married = new TerminalExpression("married");
    return new AndExpression(julie, married);
  }
  public static void main(String[] args) {
    Expression isMale = getMaleExpression();
    Expression isMarried = getMarried();
    System.out.println(isMale.interpret("john"));
    System.out.println(isMarried.interpret("julie married"));
  }

}
