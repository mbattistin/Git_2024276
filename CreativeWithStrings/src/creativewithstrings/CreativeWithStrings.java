/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creativewithstrings;

import inpututilities.InputUtilities;

/**
 *
 * @author Mariana
 */
public class CreativeWithStrings {

    public static void main(String[] args) {
        //Creates a new instance of the class InputUtilities
        InputUtilities utilities = new InputUtilities();
        
        //Calls the InputUtilities class to ask for the user a valid text
        String name = utilities.askUserForOneWordText("Please, insert your name:");
        
        //Transforms all the text in lower case to avoid problems with the methods that are case sensitive
        name = name.toLowerCase();
        
        //Checks if the length of the name is less than 5
        if(name.length() < 5){
            name = transformNameBackwards(name);
        }
        //Checks if the name contains the char b or l in any position
        else if(name.contains("b") || name.contains("l")){
            name = replaceNameLettersBandL(name);
        }
        //If it goes false to the previous 2 conditions, goes here
        else{
            name = cutName(name);
        }
        
        //ToUpperCase transform all the letters in upper case 
        System.out.println("Your new name is " + name.toUpperCase());
    }
    
    private static String transformNameBackwards(String name){
        String backwardsName = "";
        //Starts the loop in the last letter of the name and goes until the first position
        for(int position = name.length() -1; position >=0; position --){
            //CharAt return the char at the current position of the String
            backwardsName= backwardsName + name.charAt(position);
        }
        
        return backwardsName;
    }
    
    private static String replaceNameLettersBandL(String name){
        //Replaces all the letter b to letter d in the String
        name= name.replaceAll("b", "d");
        //Replaces all the letter l to letter p in the String
        name = name.replaceAll("l", "p");
        return name;
    }
    
    //I didn't validade for error at using the lengths amount because the if that calls it, won't allow the name be lower than 4 caracteres 
    private static String cutName(String name){
        //Gets the first 2 letters of the name
        String newName = name.substring(0,2);
        //Concat is another method to joing Strings
        //Substring gets the last 2 letters of the name, that's why the length is minus 2
        return newName.concat(name.substring(name.length()-2,name.length()));
    }
}
