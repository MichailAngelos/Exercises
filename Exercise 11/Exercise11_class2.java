
/*Project was created by Michael-Angelo Georgiou 
Exercise 11 */

//This is the class where we gonna use our Methods and constructors (SET and GET)
class Exercise11_class2{
    
    private String Name;
    private String Surname;
    private int Id;
    private int years;
   
       //Default Constractor
  public  Exercise11_class2(){}
  
  
  
//Full Constructor
       public Exercise11_class2(String n,String s ,int id,int y){

              this.Name=n;
              this.Surname=s;
              this.Id=id;
              this.years=y;
              
        
          }
       
       //calling Set method 
       
       public void Empoyee(String n,String s,int id,int y){
           
              setName(n);
              setSurname(s);
              setId(id);
              setYear(y);
         
       }
       
        //Setter and Getter methods
       public  void setName(String n){
          Name = n; 
          
       }
          public  void setSurname(String s){
          Surname = s; 
          
       }
       
          public  void setId(int id){
          Id = id; 
          
       }
       
          public  void setYear(int y){
          years = y; 
          
       }
       public String getName(){
           
       return Name;    
       }
           public String getSurname(){
           
       return Surname;    
       }
               public int getId(){
           
       return Id;    
       }
                   public int getYear(){
           
       return years;    
       }
       
       //method that we gonna call on our main to Display 
                   
         public void display(){
             
             System.out.println("========>Employee<=======");
             System.out.println("|Name| "+" |Surname|   "+"  |ID| "+" |Years| ");
             System.out.println("\n"+Name +" "+ Surname +"  "+ Id +"  "+ years);
         }          

}
    
    
    
