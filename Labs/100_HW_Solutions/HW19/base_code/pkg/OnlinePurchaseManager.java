package pkg;
import java.util.ArrayList;

   public class OnlinePurchaseManager {
      private ArrayList<Gizmo> purchases;
   
      public OnlinePurchaseManager() {
         purchases = new ArrayList <Gizmo>();
      }
   
      public void add(String maker, boolean isE, double cost) {
         Gizmo g = new Gizmo(maker, isE, cost);
         purchases.add(g);
      }
   
      public int countElectronicsByMaker(String maker) {
          int count = 0;
       
          for (int i = 0; i < purchases.size(); i++) {
             if (purchases.get(i).getMaker() == maker && purchases.get(i).isElectronic()) {
                count = count + 1;
             }
          }
       
          return count;
      }
      public boolean hasAdjacentEqualPair() {
         Gizmo previousGizmo = purchases.get(0);
         Gizmo currentGizmo;
      
         for (int i = 1; i < purchases.size(); i++) {
            currentGizmo = purchases.get(i);
            if (previousGizmo.equals(currentGizmo)) {
               return true;
            }
            previousGizmo = currentGizmo;
         }
      
         return false;
      }
   
      public Gizmo getCheapestGizmoByMaker(String mkr) {
         Gizmo cheapestGizmo = purchases.get(0);
         int i;
      
         for (i = 0; i < purchases.size(); i++) {
            if (purchases.get(i).getMaker() == mkr) {
               cheapestGizmo = purchases.get(i);
               break;
            }
      }
   
      if (i < purchases.size() - 2) {
         for (i = i + 1; i < purchases.size(); i++) {
            if(purchases.get(i).getCost() < cheapestGizmo.getCost()) {
               cheapestGizmo = purchases.get(i);
            }
         }
      }
   
      return cheapestGizmo;
   }
   
   public String toString() {
   	return "" + purchases;
   }
}
