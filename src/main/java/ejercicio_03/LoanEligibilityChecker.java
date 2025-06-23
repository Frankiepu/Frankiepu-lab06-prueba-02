/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author jacks
 */
public class LoanEligibilityChecker {
     public String checkEligibility(int age, double income, int creditScore) {
        if (age < 18) {
            return "Rejected: Underage";
        }

        if (income < 1500) {
            return "Rejected: Insufficient Income";
        }

        if (creditScore < 600) {
            return "Rejected: Low Credit Score";
        }

        return "Approved";
    }
}
