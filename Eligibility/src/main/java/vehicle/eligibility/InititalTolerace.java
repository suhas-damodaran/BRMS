package vehicle.eligibility;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InititalTolerace implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Total Income")
   private java.lang.Integer total_Income;
   @org.kie.api.definition.type.Label("Is Joint")
   private java.lang.Boolean isJoint;
   @org.kie.api.definition.type.Label("Eligible")
   private java.lang.Boolean eligible;

   @org.kie.api.definition.type.Label(value = "Same Zip")
   private java.lang.Boolean samezip;

   public InititalTolerace()
   {
   }

   public java.lang.Integer getTotal_Income()
   {
      return this.total_Income;
   }

   public void setTotal_Income(java.lang.Integer total_Income)
   {
      this.total_Income = total_Income;
   }

   public java.lang.Boolean getIsJoint()
   {
      return this.isJoint;
   }

   public void setIsJoint(java.lang.Boolean isJoint)
   {
      this.isJoint = isJoint;
   }

   public java.lang.Boolean getEligible()
   {
      return this.eligible;
   }

   public void setEligible(java.lang.Boolean eligible)
   {
      this.eligible = eligible;
   }

   public java.lang.Boolean getSamezip()
   {
      return this.samezip;
   }

   public void setSamezip(java.lang.Boolean samezip)
   {
      this.samezip = samezip;
   }

   public InititalTolerace(java.lang.Integer total_Income,
         java.lang.Boolean isJoint, java.lang.Boolean eligible,
         java.lang.Boolean samezip)
   {
      this.total_Income = total_Income;
      this.isJoint = isJoint;
      this.eligible = eligible;
      this.samezip = samezip;
   }

}