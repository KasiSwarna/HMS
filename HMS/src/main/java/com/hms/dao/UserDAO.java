package com.hms.dao;
import com.hms.factory.*;
import com.hms.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UserDAO {
Connection connection;
PreparedStatement ps;
public void updateUser(User user) {

try {

connection=DBConnection.getConnection();

PreparedStatement ps=connection.prepareStatement("INSERT INTO Patient_Details VALUES(?,?,?,?,?,?,?,?)");
ps.setInt(1, user.getId());
ps.setString(2, user.getName());
ps.setString(3, user.getPhoneNumber());
ps.setString(4, user.getEmailId());
ps.setInt(5, user.getAge());
ps.setString(6, user.getGender());
ps.setString(7, user.getAddress());
ps.setString(8, user.getMedicalHistory());
ps.executeUpdate();

} catch (SQLException |ClassNotFoundException e) {

System.out.println(e);
}
}
public List<User> getAllUser() {
List<User> userList = new ArrayList<User>();
try {
Connection connection=DBConnection.getConnection();
PreparedStatement ps=connection.prepareStatement("SELECT * FROM Patient_Details");
ResultSet rs =ps.executeQuery();
while(rs.next()) {
User user= new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8));

userList.add(user);
}

} catch (ClassNotFoundException | SQLException e) {

System.out.println(e);
}
return userList;


}



}


