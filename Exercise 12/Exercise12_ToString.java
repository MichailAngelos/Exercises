
public class Exercise12_ToString{
private  String name;
private  String surname;
private  String job;
private  int age;
private  String degree;

public Exercise12_ToString(String n,String s,String j,int a ,String d) {
    name=n;
    surname=s;
    job = j;
    age = a;
    degree = d;
    
    
} 


public String toString(){
    
return String.format("The employee %s %s his/her job is %s  ,\nHe/She is %s years old and he/she finished %s",name,surname,job,age,degree );
}


}