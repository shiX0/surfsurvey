/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.Dbconnection;


/**
 *
 * @author ACER
 */
public class SurveyController {
    Dbconnection dbConnection;
    public void updateSurvey(String question, String name, int number,String first, String second, String third, String fourth){
        dbConnection = new Dbconnection();
        String updateQuery = String.format("Update questions set surveyname = '%s',question = '%s',option1='%s',option2='%s',option3='%s',option4='%s' where question_id =%d",name,question,first,second,third,fourth,number);
        dbConnection.manipulate(updateQuery);
    }
    
    
}
