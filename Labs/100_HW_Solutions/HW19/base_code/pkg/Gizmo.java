package pkg;

public class Gizmo {
   private String maker;
   private boolean isE;
   private double cost;
   
   public Gizmo(String maker, boolean isE) {
      this.maker = maker;
      this.isE = isE;
   }
   
   public Gizmo(String maker, boolean isE, double cost) {
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public String getMaker() {
      return maker;
   }
   
   public boolean isElectronic() {
      return isE;
   }
   
   public double getCost() {
      return cost;
   }
   
   public boolean equal(Gizmo g) {
      if(maker == g.getMaker() && isE == g.isElectronic() && cost == g.getCost()) {
         return true;
      }
      return false;
   }
   
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
