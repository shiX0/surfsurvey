/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.Dbconnection;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author Subhash
 */
public class SurveyController {
    public  ArrayList getquestion(String sname){
        Dbconnection db = new Dbconnection();
        String qwery=String.format("select * from questions where surveyname='%s'",sname);
        ResultSet result=db.retrieve(qwery);
        ArrayList<ArrayList> survey=new ArrayList();
        try{
            while(result.next()){
                ArrayList<String> ls=new ArrayList();
                String respnse=result.getString("responce");
                String question=result.getString("question");
                String option1=result.getString("option1");
                String option2=result.getString("option2");
                String option3=result.getString("option3");
                String option4=result.getString("option4");
//                int id=result.getInt("Question_id");
          
                ls.add(respnse);
                ls.add(question);
                ls.add(option1);
                ls.add(option2);
                ls.add(option3);
                ls.add(option4);
                survey.add(ls);
                
                
                }
            writingTheFile(survey);
        }
        catch(SQLException e){
       
        }
        return survey;
    }
}