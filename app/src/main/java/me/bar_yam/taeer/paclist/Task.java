package me.bar_yam.taeer.paclist;

public class Task {

  String room;
  String bedNum;
  String action;
  String time;

  public Task(String room, String bedNum, String action, String time){
    this.room = room;
    this.bedNum = bedNum;
    this.action = action;
    this.time = time;
  }

  public String getRoom(){
    return room;
  }
  public String getBedNum(){
    return bedNum;
  }
  public String getAction(){
    return action;
  }
  public String getTime(){
    return time;
  }
}
