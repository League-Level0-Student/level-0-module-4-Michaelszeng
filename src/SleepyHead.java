//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.Messaging.SyncScopeHelper;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
         //Ask the user for these values using
         int x = JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         JOptionPane.YES_NO_OPTION);
    
if (x==0) {
	System.out.println("get up lazybones!");
}
if (x==1) {
	System.out.println("slep in");
}
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
