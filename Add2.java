class Add2{
   void sum(int a,int b){
      System.out.println(a+b);
   }
   void sum(double a,double b){
      System.out.println(a+b);
   }
   public static void main(String args[]){
    Add2 num=new Add2();
    num.sum(10.5,10.5);
    num.sum(10,10);
  }
}
