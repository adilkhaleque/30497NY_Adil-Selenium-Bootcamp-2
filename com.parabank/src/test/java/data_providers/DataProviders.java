package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testOpenCheckingAccount")
    public Object[][] getNewCheckingAccount() {
        return excel.readStringArrays("CheckingAccount");
    }

    @DataProvider(name = "testOpenSavingsAccount")
    public Object[][] getNewSavingsAccount() {
        return excel.readStringArrays("SavingsAccount");
    }

    @DataProvider(name = "testViewAccountBalance")
    public Object[][] getAccountBalance() {
        return excel.readStringArrays("AccountBalance");
    }

    @DataProvider(name = "testViewAccountType")
    public Object[][] getAccountType() {
        return excel.readStringArrays("AccountType");
    }

    @DataProvider(name = "testTransferFunds")
    public Object[][] getTransferAmount() {
        return excel.readStringArrays("TransferFunds");
    }

    @DataProvider(name = "testPayBill")
    public Object[][] getBillInfo() {
        return excel.readStringArrays("BillPayment");
    }

    @DataProvider(name = "testTransactionByDate")
    public Object[][] getTransactionInfo() {
        return excel.readStringArrays("TransactionDate");
    }

    @DataProvider(name = "testUpdateProfile")
    public Object[][] getUpdateProfileInfo() {
        return excel.readStringArrays("UpdateProfile");
    }

    @DataProvider(name = "testApplyForLoan")
    public Object[][] getLoanInfo() {
        return excel.readStringArrays("ApplyForLoan");
    }
}
