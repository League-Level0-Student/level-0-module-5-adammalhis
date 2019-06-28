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
String city =JOptionPane.showInputDialog(null, "What city do you live in?");
if (city .equals ("San Diego")) {
JOptionPane.showMessageDialog(null, "You live in Amaricas finest city.");
}
else {
JOptionPane.showMessageDialog(null, "You should move to San Diego");
}
String cars =JOptionPane.showInputDialog(null, "How many cars does you family own?");
if (cars .equals ("0")) {
JOptionPane.showMessageDialog(null, "I bet you use public transportation");
}
else if (cars .equals ("1")) {
JOptionPane.showMessageDialog(null, "Tesla Model X P100D 2019");
}
else {
int cars2 =Integer.parseInt(cars);
int wheels = cars2 * 4;
JOptionPane.showMessageDialog(null, "Your car has " + wheels + " wheels.");
}
String school =JOptionPane.showInputDialog(null, "What school do you go to?");
JOptionPane.showMessageDialog(null, school + " is a fantastic school!");

}
}
