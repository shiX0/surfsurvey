package controller;

import database.Dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.UserModel;

public class UserController{
    Dbconnection dbconnection;
    public int insertUser(UserModel user){
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String email= user.getEmail();
        String dob = user.getDob();
        String passwordd = user.getPasswordd();

    
    String insertQuery = String.format("insert into userdata(firstName,lastName,email,dob,passwordd) values ('%s','%s','%s','%s','%s')",firstName,lastName,email,dob,passwordd);
    System.out.println(insertQuery);
    dbconnection = new Dbconnection();
    int result = dbconnection.manipulate(insertQuery);
    return result;
}
    public int DeleteUser(int id){
        dbconnection=new Dbconnection();
        String DeleteQuerry= String.format("delete from userdata where id=%d",id);
        int result = dbconnection.manipulate(DeleteQuerry);
        return result;
    }
    public Boolean loginUser(String Email, String password) {
    String selectQuery = String.format(
      "select * from userdata where email = '%s' and passwordd = '%s' ",Email,password
    );
    dbconnection = new Dbconnection();
    ResultSet rs = dbconnection.retrieve(selectQuery);
    System.out.println(rs);
    try {
      while (rs.next()) {
        int fetchedid = rs.getInt("userid");
        String fetchedEmail = rs.getString("email");
        String fetchedPassword = rs.getString("passwordd");
        User.id=fetchedid;
        System.out.println(fetchedEmail + fetchedPassword);
        if (Email.equals(fetchedEmail) && password.equals(fetchedPassword)) {
          return true;
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
    return false;
  } 

        
}



