package controller;

import database.Dbconnection;
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


}