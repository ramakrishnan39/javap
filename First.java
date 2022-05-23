class First{
  public First(int x, int y){
    System.out.println("Welcome");
  }
  public static void main(String args[]){
    System.out.println("This is inside method");
  }
}

class Second{
  First f=new First(5,10);

}