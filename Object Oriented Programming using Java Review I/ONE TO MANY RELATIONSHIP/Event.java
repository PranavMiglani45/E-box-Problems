import java.util.*;


public class Event {
String name,detail,type,organiserName;
 Event(String name,String detail,String type,String organiserName){
     this.name=name;
     this.detail=detail;
     this.type=type;
     this.organiserName=organiserName;
 }
 String getName(){
     return this.name;
 }
 String getDetail(){
     return this.detail;
 }
 String getType(){
     return this.type;
 }
 String getOrganiserName(){
     return this.organiserName;
 }
 void setName(String name){
     this.name=name;
 }
 void setDetail(String detail){
     this.detail=detail;
 }
 void setType(String type){
     this.type=type;
 }
 void setOrganiserName(String organiserName){
     this.organiserName=organiserName;
 }


}
