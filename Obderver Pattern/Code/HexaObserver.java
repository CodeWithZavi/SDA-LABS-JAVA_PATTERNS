public class HexaObserver extends Observer {

   public HexaObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this);
      this.isActive = true;
   }

   @Override
   public void update() {
      System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
   }
}