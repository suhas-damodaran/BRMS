package inspection.vehicleinspection;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Inspection implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Score One")
   private java.lang.Integer scoreOne;
   @org.kie.api.definition.type.Label(value = "Score Two")
   private java.lang.Integer scoreTwo;
   @org.kie.api.definition.type.Label(value = "Total Score")
   private java.lang.Integer totalScore;
   @org.kie.api.definition.type.Label(value = "Status")
   private java.lang.String status;

   public Inspection()
   {
   }

   public java.lang.Integer getScoreOne()
   {
      return this.scoreOne;
   }

   public void setScoreOne(java.lang.Integer scoreOne)
   {
      this.scoreOne = scoreOne;
   }

   public java.lang.Integer getScoreTwo()
   {
      return this.scoreTwo;
   }

   public void setScoreTwo(java.lang.Integer scoreTwo)
   {
      this.scoreTwo = scoreTwo;
   }

   public java.lang.Integer getTotalScore()
   {
      return this.totalScore;
   }

   public void setTotalScore(java.lang.Integer totalScore)
   {
      this.totalScore = totalScore;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public Inspection(java.lang.Integer scoreOne, java.lang.Integer scoreTwo,
         java.lang.Integer totalScore, java.lang.String status)
   {
      this.scoreOne = scoreOne;
      this.scoreTwo = scoreTwo;
      this.totalScore = totalScore;
      this.status = status;
   }

}