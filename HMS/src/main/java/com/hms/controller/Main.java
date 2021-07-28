package com.hms.controller;
import com.hms.model.*;
import com.hms.dao.*;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
int id;
String name;
String phoneNumber;
String emailId;
int age;
String gender;
String address;
String medicalHistory;
System.out.println("enter the ID of Patient");
id=sc.nextInt();
System.out.println("Enter the name of the patient");
name=sc.nextLine();
System.out.println("Enter the Phone Number");
phoneNumber=sc.nextLine();
System.out.println("Enter the email Id");
emailId=sc.nextLine();
System.out.println("Enter the age of the Patient");
age=sc.nextInt();
System.out.println("Enter the gender of Patient");
gender =sc.nextLine();
System.out.println("Enter the address of Patient");
address=sc.nextLine();
System.out.println("Enter the Patient medical History");
medicalHistory=sc.nextLine();
User user=new User(id, name, phoneNumber, emailId, age, gender, address, medicalHistory);
UserDAO dao=new UserDAO();
dao.getAllUser();



}
}


