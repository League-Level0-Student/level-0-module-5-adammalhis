package _08_code_4_life;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
String Dimes =JOptionPane.showInputDialog(null, "how many dimes do you have?");
Integer.parseInt(Dimes);
int Dimes2 = Integer.parseInt(Dimes);
int cents = Dimes2*10;
String.valueOf(cents);
JOptionPane.showMessageDialog(null, "You have " + cents + " cents.");
String tall =JOptionPane.showInputDialog(null, "How tall are you?");
int tall2 =Integer.parseInt(tall);
if (tall2 < 36) {
JOptionPane.showMessageDialog(null, "Eat your weaties.");
}
for (int i = 0; i <= 30; i++) {
if (i%3 == 0) {
System.out.println(i);
}
}
Random bob = new Random();
int bob2 = bob.nextInt(20);
int bob3 = bob.nextInt(10);
System.out.println(bob2);
System.out.println(bob3);
int difference = bob2 - bob3;
int difference2 = bob3 - bob2;
if (difference > difference2) {
JOptionPane.showMessageDialog(null, "the difference beetween the two numbers is " + difference);
}
else {
JOptionPane.showMessageDialog(null, "the difference beetween the two numbers is" + difference2);
}
}
}
