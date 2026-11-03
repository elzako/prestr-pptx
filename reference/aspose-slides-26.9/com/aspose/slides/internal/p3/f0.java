package com.aspose.slides.internal.p3;

public class f0 extends j8 {
   private j8 n5;

   public f0(y2 var1, j8 var2) {
      super(var1);
      this.n5 = var2;
   }

   @Override
   public j8 k5() {
      return this.n5;
   }

   @Override
   public boolean w_() {
      return this.n5 != null ? this.n5.w_() : false;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("NonLeafPos:").k5(this.a6()).n5("(");
      var1.n5(this.u9());
      var1.n5(", ");
      if (this.k5() != null) {
         var1.n5(this.k5().toString());
      } else {
         var1.n5("null");
      }

      var1.n5(")");
      return var1.toString();
   }
}
