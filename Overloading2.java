class Overloading2{
    void sum(int a,long b){
      System.out.println(a+b);}
    void sum(int a,int b,int c){
      System.out.println(a+b+c);}
  
    public static void main(String args[]){
      Overloading2 obj=new Overloading2();
      obj.sum(10,100);
      obj.sum(10,90,10);
 
   }
}