package com.hms.model;

public class User {
int id;
String name;
String phoneNumber;
String emailId;
int age;
String gender;
String address;
String medicalHistory;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPhoneNumber() {
return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}
public String getEmailId() {
return emailId;
}
public void setEmailId(String emailId) {
this.emailId = emailId;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getMedicalHistory() {
return medicalHistory;
}
public void setMedicalHistory(String medicalHistory) {
this.medicalHistory = medicalHistory;
}
public User(int id, String name, String phoneNumber, String emailId, int age, String gender, String address,
String medicalHistory) {
super();
this.id = id;
this.name = name;
this.phoneNumber = phoneNumber;
this.emailId = emailId;
this.age = age;
this.gender = gender;
this.address = address;
this.medicalHistory = medicalHistory;
}
public User() {
super();
// TODO Auto-generated constructor stub
}
}


