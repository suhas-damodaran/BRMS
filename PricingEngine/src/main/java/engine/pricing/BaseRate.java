package engine.pricing;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BaseRate implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Base Rate")
   private java.lang.Float baseRate;

   public BaseRate()
   {
   }

   public java.lang.Float getBaseRate()
   {
      return this.baseRate;
   }

   public void setBaseRate(java.lang.Float baseRate)
   {
      this.baseRate = baseRate;
   }

   public BaseRate(java.lang.Float baseRate)
   {
      this.baseRate = baseRate;
   }

}