public class BankAccount {
  private double checkingBalance = 0;
  private double savingBalance = 0;
  private static int accountsCreated = 0;
  private static Double totalAmount = 0;
  

  public Double getCheckingBalance() {
    return checkingBalance;
  }

  public Double getSavingsBalance() {
    return savingsBalance;
  }

  public void accountDeposit() {
    System.out.println("Please choose your account type");
    if (accounttupe == "checking") {
      setCheckingBalance(getCheckingBalance() + depositAmount);
      totalMoney += depositAmount;
    }
    if (accounttupe == "savings") {
      setSavingsBalance(getSavingsBalance() + depositAmount);
      totalMoney += depositAmount;
    }
  }

  public void Withdrawal() {
    if (accounttupe == "checking" ) {
      if (getCheckingBalance() > withdrawalAmount) {
        System.out.println("Take your money");
      } else {
        System.out.println("Sorry your balance is not enough");
      }
    }
    if (accounttupe == "savings") {
      System.out.println("Sorry you can check with the accountant");
      }
    }
  }
