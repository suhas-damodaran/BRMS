package condition.application;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BorrowerDriversLicenseDecision implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   public BorrowerDriversLicenseDecision()
   {
   }

   @org.kie.api.definition.type.Label("Transaction Type")
   private java.lang.String transactionType;

   @org.kie.api.definition.type.Label("State")
   private java.lang.String state;

   @org.kie.api.definition.type.Label("Required Status")
   private java.lang.String requiredStatus;

   public java.lang.String getTransactionType()
   {
      return this.transactionType;
   }

   public void setTransactionType(java.lang.String transactionType)
   {
      this.transactionType = transactionType;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.String getRequiredStatus()
   {
      return this.requiredStatus;
   }

   public void setRequiredStatus(java.lang.String requiredStatus)
   {
      this.requiredStatus = requiredStatus;
   }

   public BorrowerDriversLicenseDecision(java.lang.String transactionType,
         java.lang.String state, java.lang.String requiredStatus)
   {
      this.transactionType = transactionType;
      this.state = state;
      this.requiredStatus = requiredStatus;
   }
}