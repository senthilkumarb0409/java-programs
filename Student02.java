class Student02{
    int id;
    String name;
   
    Student02(int i,String n){
     id=i;
     name=n;
     }
     void display(){
     System.out.println(id+" "+name);}
  
     public static void main(String args[]){
     Student02 s1=new Student02(121,"prince");
     Student02 s2=new Student02(131,"king");
     s1.display();
     s2.display();

   }
}