package Prac6;
public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title,author);
      this.composer = comp;
   }
   @Override
   public void display()
   {
      System.out.println("The performance is "  + title +
        " by " + author + "\nThe music for " + title  +
        " is by " + composer);
   }
}