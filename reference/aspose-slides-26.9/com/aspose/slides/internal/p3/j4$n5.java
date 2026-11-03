package com.aspose.slides.internal.p3;

public class j4$n5 extends j8 {
   private j4 n5;
   private j8 l6;

   public j4$n5(j4 var1, z1 var2) {
      super(null);
      this.n5 = var1;
      this.l6 = var2.k7();

      while (com.aspose.slides.internal.v6g.k5.l6(this.l6, f0.class)) {
         this.l6 = this.l6.k5();
      }
   }

   public final void n5(boolean var1, v3 var2) {
      if (var1) {
         if (v3.n5 == var2) {
            for (int var3 = 0; var3 < j4.n5(this.n5).length; var3++) {
               j4.n5(this.n5)[var3].n5(j4.l6(this.n5)[var3]);
            }
         } else {
            for (int var4 = 0; var4 < j4.k5(this.n5).length; var4++) {
               j4.k5(this.n5)[var4].n5(j4.u3(this.n5)[var4]);
            }
         }
      } else {
         for (int var5 = 0; var5 < j4.a6(this.n5).length; var5++) {
            j4.a6(this.n5)[var5].n5(j4.u9(this.n5)[var5]);
         }
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("SpaceHandlingBreakPosition(");
      var1.n5(this.l6);
      var1.n5(")");
      return var1.toString();
   }

   public final j8 n5() {
      return this.l6;
   }

   @Override
   public j8 k5() {
      return this.l6;
   }
}
