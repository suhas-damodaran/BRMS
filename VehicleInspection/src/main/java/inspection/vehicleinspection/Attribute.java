package inspection.vehicleinspection;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Attribute implements java.io.Serializable {

    static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Attribute")
   @org.kie.api.definition.type.Position(0)
   private java.lang.String inputAttribute;

   @org.kie.api.definition.type.Label("Value")
   @org.kie.api.definition.type.Position(1)
   private java.lang.String inputValue;

   @org.kie.api.definition.type.Label("Result")
   @org.kie.api.definition.type.Position(3)
   private Integer resultValue;


   public java.lang.String getInputValue()
   {
      return this.inputValue;
   }

   public void setInputValue(java.lang.String inputValue)
   {
      this.inputValue = inputValue;
   }

   public java.lang.String getInputAttribute()
   {
      return this.inputAttribute;
   }

   public void setInputAttribute(java.lang.String inputAttribute)
   {
      this.inputAttribute = inputAttribute;
   }

   public java.lang.Integer getResultValue()
   {
      return this.resultValue;
   }

   public void setResultValue(java.lang.Integer resultValue)
   {
      this.resultValue = resultValue;
   }

   public Attribute(java.lang.String inputAttribute, java.lang.String inputValue,
         java.lang.Integer resultValue)
   {
      this.inputAttribute = inputAttribute;
      this.inputValue = inputValue;
      this.resultValue = resultValue;
   }

    public Attribute() {
    }

}