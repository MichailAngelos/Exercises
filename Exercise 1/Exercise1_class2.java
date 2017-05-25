
class Exercise1_class2 {
    
   int Am,kod_math;
   double theoria,ergastiria,telikos;

//default Constrauctor   
   Exercise1_class2 (){}

   //full constructor
               Exercise1_class2(int ar,int kod , double theory,double erg){
       
                              this.Am=ar;
                              this.ergastiria=erg;
                               this.kod_math=kod;
                                 this.theoria=theory;
       
                                      }
   
                       public void Grade(){
      
                            telikos = theoria * 0.6 + ergastiria * 0.4 ;    
 
                  System.out.println("The final grade of Student with the student ID : "+ Am + "is : "+ telikos);
                                  }
   
                            }