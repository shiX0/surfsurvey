package controller;

import database.Dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.UserModel;
import constraints.User;

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
        String DQuerry= String.format("delete from userdata where id=%d",id);
        int result = dbconnection.manipulate(DQuerry);
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
    public String[] UserDetails(int id){
        dbconnection=new Dbconnection();
        String getquerry=String.format("select * from userdata where userid=%d", id);
        ResultSet result=dbconnection.retrieve(getquerry);
        String[] sd=new String[4];
        try{
        while(result.next()){
            sd[0]=result.getString("firstName");
            sd[1]=result.getString("lastName");
            sd[2]=result.getString("email");
            sd[3]=result.getString("dob");
            return sd;
        }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
public String[] getUserDetails(String email){
        dbconnection=new Dbconnection();
        String getquerry=String.format("select * from userdata where email='%s'", email);
        ResultSet result=dbconnection.retrieve(getquerry);
        String[] sd=new String[2];
        try{
        while(result.next()){
            sd[0]=result.getString("se_question");
            sd[1]=result.getString("se_answer");
            
            return sd;
        }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
public int UpdateUserPass(String email,String Password){
        dbconnection=new Dbconnection();
        String UpdateQuerry= String.format("Update userdata set passwordd='%s' where email='%s'",Password,email);
        int result = dbconnection.manipulate(UpdateQuerry);
        return result;
        }
        
}



