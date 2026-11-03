package com.aspose.slides.internal.p3;

public class h2 extends j8 {
   private int n5;

   public h2(y2 var1, int var2) {
      super(var1);
      this.n5 = var2;
   }

   public h2(y2 var1, int var2, int var3) {
      super(var1, var3);
      this.n5 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   @Override
   public boolean w_() {
      return this.u3() != null;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("LeafPos:").k5(this.a6()).n5("(");
      var1.n5("pos=").k5(this.n5());
      var1.n5(", lm=").n5(this.u9()).n5(")");
      return var1.toString();
   }
}
