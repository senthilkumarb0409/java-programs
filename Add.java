class Add{
   void sum(int a,int b){
      System.out.println(a+b);
   }
   void sum(int a,int b,int c){
      System.out.println(a+b+c);
   }
   public static void main(String args[]){
    Add num=new Add();
    num.sum(30,30);
    num.sum(10,20,30);
  }
}
