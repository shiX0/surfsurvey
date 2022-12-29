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
    
    public Object[] nextquestoin(int question_no){
    ArrayList<ArrayList<String>> ls=readTheFile();
    int totalq=ls.size();
    ArrayList<String> ls1=ls.get(question_no);
    System.out.println(ls1);
    return new Object[]{ls1,totalq};
}
    
    public void writingTheFile(ArrayList<ArrayList> survey){
      try {
      PrintWriter writer = new PrintWriter("list.txt", "UTF-8");
      for (ArrayList<String> innerList : survey) {
          writer.println(innerList);
      }
      writer.close();
    } catch (FileNotFoundException | UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    }
    
public ArrayList<ArrayList<String>> readTheFile() {
  ArrayList<ArrayList<String>> survey = new ArrayList<>();
  try (Scanner scanner = new Scanner(new File("list.txt"))) {
    while (scanner.hasNextLine()) {
      ArrayList<String> innerList = new ArrayList<>();
      String line = scanner.nextLine();
      Scanner lineScanner = new Scanner(line);
      lineScanner.useDelimiter(",");
      while (lineScanner.hasNext()) {
        String s = lineScanner.next();
        s = s.trim();  // Remove leading and trailing whitespace
        innerList.add(s);
      }
      survey.add(innerList);
      lineScanner.close();
    }
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  }

  return survey;
}

public static ArrayList surveyNames(){
    Dbconnection db = new Dbconnection();
    String qwery="select distinct surveyname from questions";
    ResultSet result=db.retrieve(qwery);
    ArrayList survey=new ArrayList();
    try{
        while(result.next()){
            String ls=result.getString("Surveyname");
            survey.add(ls);
        }
    }catch (SQLException e){
        e.printStackTrace();
        return null;
    }
    return survey;
} 


    
}

