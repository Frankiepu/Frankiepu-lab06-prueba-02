/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02;

/**
 *
 * @author jacks
 */
public class TransactionAnalyzer {
        
    public String analyzeTransactions(double[] transactions, double balance, boolean accountFrozen) {
        String status = "Spending OK";
        double totalSpent = 0;
        if (accountFrozen) {
            status = "Account Frozen";
        } else {   
            for (double t : transactions) {
                if (t < 0) {
                    totalSpent += -t;
                }
            }
        }
        return status;
    }
}
