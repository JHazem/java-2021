public class Calculater {
  private Double operandOne = 0.0;
  private Double operandTwo = 0.0;
  private Double mathTotal = 0.0;
  private String oprationType = "";

  public Calculater() {
    this.operandOne = operandOne;
    this.operandTwo = operandTwo;
    this.oprationType = oprationType;
  }

  public Double getOperandOne() {
    return operandOne;
  }

  public Double getOperandTwo() {
    return operandTwo;
  }

  public Double getMathTotal() {
    return mathTotal;
  }

  public String getOprationType() {
    return oprationType;
  }
  
  public void setOperandOne(Double operandOne) {
    this.operandOne = operandOne;
  }

  public void setOperandTwo(Double operandTwo) {
    this.operandTwo = operandTwo;
  }

  public void setMathTotal(Double mathTotal) {
    this.mathTotal = mathTotal;
  }

  public void setOprationType(String oprationType) {
    this.oprationType = oprationType;
  }

  public void performOperation() {
    if (getOperation().equals("+")) {
      Double total = getOperandOne() + getOperandTwo();
      setMathTotal(total);
    } else if (getOperation().equals("-")) {
      Double total = getOperandOne() - getOperandTwo();
      setMathTotal(total);
    }
  }

  public void getResults() {
    System.out.println(getMathTotal());
  }
}
