/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author sean
 */
import java.sql.*;
import java.util.*;


public class dbConnect{
    
   
    
    //make the mothods static then you can declare it as dbconnect.getConnection
    public static Connection getConnection(){
        
        Connection con = null;
        try{
            
            
            String host = "jdbc:mysql://localhost:3306/spytter";
            String uName = "root";
            con = DriverManager.getConnection(host, uName, "");
            
             
    }
        
        catch(SQLException err ){
            System.out.println(err.getMessage());
        }
         return con;
        
    }
    
    public static void disConnect(Connection con){

try{    
    con.close();
}
catch(SQLException err ){
            System.out.println(err.getMessage());
        }
}
    
    public static void listTweets(Connection con){
           
        try{
            
            Statement stmt= con.createStatement();
            
            String sql = "SELECT tweet.tweets, users.user_name FROM tweets INNER JOIN users ON tweets.user_id = users.id ORDER BY DESC id LIMIT 50";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                   String tweet = rs.getString("tweet");
                   String user = rs.getString("username");
                   System.out.println(tweet); 
                   //System.out.println(username);
            }
       
           
            
    }
        
        catch(SQLException err ){
            System.out.println(err.getMessage());
        }
        
        
    }
    
    public static void listUsers(Connection con){
        
        try{
            
            Statement stmt= con.createStatement();
            String sql = "Select user_name FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
               
                   String userName = rs.getString("user_Name");
                   System.out.println(userName);
                   
                   System.out.println("");
            }
        
           
            
    }
        
        catch(SQLException err ){
            System.out.println(err.getMessage());
        }  
        
    }
 
    public static void searchFriends(String search, Connection con){
    
        
        
    
}
    
    public static void listFollowersTweets(String userid, Connection con){
           
        try{
            
            Statement stmt= con.createStatement();
            String view = "CREATE VIEW followView AS SELECT following FROM "
                    + "follow WHERE user_id = "+ "'" + userid + "'";
            stmt.executeUpdate(view);
            String sql = "Select Tweets.tweet. users.user_name FROM tweets "
                    + "INNER JOIN followView ON tweets.user_id = followView.following "
                    + "INNER JOIN users ON tweets.user_id = users.id";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                   String tweet = rs.getString("tweet");
                   String userName = rs.getString("user_Name");
                   System.out.println(userName);
                   System.out.println(tweet);
                   System.out.println("");
            }
        
           
            
    }
        
        catch(SQLException err ){
            System.out.println(err.getMessage());
        }
        
        
    }
    
    public static void addUser(String name,String password, String rank,String birthday,
            String missionLocation, String description, Connection con){    
           try{
               
               
            Statement insert = con.createStatement();
           
           
            Scanner user_input = new Scanner(System.in);
            String first_name;
            first_name = user_input.next();
            String inserter = "INSERT INTO user (username, password, rank, organization, description) VALUES (" + "'" + first_name + "'"+ 
            ", " + "'" + password + "'"+ 
            "," + "'" + rank + "'"+ 
            "," + "'" + birthday + "'"+ 
            "," + "'" + missionLocation + "'"+ 
            "," + "'" + description + "'"+ 
            ")";
            System.out.println(inserter);
            
          
            insert.executeUpdate(inserter);
           }catch(SQLException err ){
            System.out.println(err.getMessage());
        }
           
    }
 
    public static void getTrending(Connection con){
        
        try{
            
            Statement stmt= con.createStatement();
            String sql = "SELECT hashtag, count(hashtag) FROM hashtag GROUP BY "
                    + "hashtag ORDER BY count(hashtag) LIMIT 10";
            ResultSet rs = stmt.executeQuery(sql);
        
        
        while(rs.next()){
                   String hashtag = rs.getString("hastag");
                   System.out.println(hashtag); 
    
        
        }
        
        }
         catch(SQLException err ){
            System.out.println(err.getMessage());
        }
    

}
            
    public static int getUserid(String username, Connection con){
        int userid = 0;
        try{
            
            Statement stmt= con.createStatement();
            String sql = "SELECT id FROM users WHERE user_name = '" + username +"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            
                   userid = rs.getInt("unser_id");
                                 
            
       
           
            
    }catch(SQLException err ){
            System.out.println(err.getMessage());
        }
       return userid;
    }
      
    public static void tweet(Connection con, int userid, String tweet){
        
        
        try{
               
            Statement insert = con.createStatement();
            String inserter = "INSERT INTO tweets (user_id, tweet) VALUES (" + "'" 
                    + userid + "'"
                    + "'" + tweet + "' )";
            System.out.println(inserter);
            
          
            insert.executeUpdate(inserter);
           }catch(SQLException err ){
            System.out.println(err.getMessage());
        }
    }
    
    //insert hashtag
    //show followers
    //show following
    //follow
}







