/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Mongezi Thomo [ST10456400]
 */
public class ThomoLearnerTaskTwoPrj {
    //create the learner Object - instantiation/instatiate
    static Learner objLearner = new Learner();
    
    public static void main(String[] args) {
      // call method to get Learner input 
    getLeanerInput();  
    //call method to calculate and display the Full Marks
    displayFullMark();
   }
    public static void getLeanerInput() {
        //Using the JOptionPane and objectLearner to get learner's input
       objLearner.setSubject(JOptionPane.showInputDialog("Enter Full Name"));
        objLearner.setSubject(JOptionPane.showInputDialog("Enter Subject"));
        objLearner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter Assignment Mark")));
       
       objLearner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter Exam Mark")));
       objLearner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter Test Mark")));
       
        
        
    }
    //Display the calculations
    public static void displayFullMark() {
    double finalMark = objLearner.calcFinalMark();
    JOptionPane.showMessageDialog(null, "Final Mark: " +finalMark);
}
            
    
}
