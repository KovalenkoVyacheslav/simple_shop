package model;

import java.util.ArrayList;

public class SubscriptionManager {
  private ArrayList<User> subscriptionUsers = new ArrayList<User>();
    public void sendMessage(String message){
          for(int i = 0;i<subscriptionUsers.size();i++){
            System.out.println("To:"+subscriptionUsers.get(i).getEmail()+" Text:"+message);
          }
    }
    public void addUser(User user){
        subscriptionUsers.add(user);
    }
}
