package com.aspose.slides.internal.p3;

public class g7 extends s4 {
   private int n5;

   public g7(j8 var1, com.aspose.slides.internal.h2.f0 var2, v3 var3, boolean var4, boolean var5, com.aspose.slides.internal.f2.u9 var6) {
      super(var1, var2.z1().k_().n5(var6), var3, var2.z3(), var4, var5);
      int var7 = var2.z1().e2().a6();
      if (var7 == 53) {
         this.n5 = Integer.MAX_VALUE;
      } else {
         this.n5 = com.aspose.slides.internal.v6g.k5.u3(var2.z1().e2().h0(), int.class);
      }
   }

   public final boolean h0() {
      return this.n5 == Integer.MAX_VALUE;
   }

   public final int t2() {
      return this.n5;
   }

   @Override
   public void n5(com.aspose.slides.internal.v8.u9 var1) {
      y2 var2 = this.y4();
      c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, c4.class);
      if (var3 != null) {
         var3.n5(this.x8(), var1);
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5("Space[");
      var1.n5(super.toString());
      var1.n5(", precedence=");
      if (this.h0()) {
         var1.n5("forcing");
      } else {
         var1.k5(this.t2());
      }

      var1.n5("]");
      return var1.toString();
   }
}
