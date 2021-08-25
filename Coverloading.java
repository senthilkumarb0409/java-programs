//constructor overloading
class Coverloading{
  int id;
  String name;
  int age;
  Coverloading(int i, String n){
  id=i;
  name=n;
  }
  Coverloading(int i,String n,int a){
  id=i;
  name=n;
  age=a;
  }
  void display(){
  System.out.println(id+" "+name+" "+age);}
  
  
   public static void main(String args[]){
   Coverloading s1=new Coverloading(121,"queen");
   Coverloading s2=new Coverloading(131,"princess",20);
 
    s1.display();
    s2.display();
  }
} 




















  
