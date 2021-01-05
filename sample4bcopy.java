class sample4b
{
       public static void main(String[] args) 
         {
          int a = 100;
          int b = 20;
          int c = 80;
          //String larger = (a>b) ? ((a>c) ? "a is larger" : "c is larger") : ((b>c) ? "b is larger" : "c is larger");
          String larger = (a>b) ? ((a>c) ? a + " is larger" : c + " is larger") : ((b>c) ? b + " is larger" : c + " is larger");
          System.out.println(larger);
         
          }
}
       
            