import java.util.ArrayList;
import java.util.List;

public class Subject {
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }s

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer) {
      observers.add(observer);
   }

   public void detach(Observer observer) {
      observers.remove(observer);
   }

   public void notifyAllObservers() {
      for (Observer observer : observers) {
         if (observer.isActive) {
            observer.update();
         }
      }
   }

   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");
      subject.setState(15);

      // Deactivate OctalObserver
      octalObserver.changeState(false);

      System.out.println("Second state change: 50");
      subject.setState(50);
   }
}