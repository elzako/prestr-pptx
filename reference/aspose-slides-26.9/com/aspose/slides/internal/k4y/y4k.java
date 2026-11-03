package com.aspose.slides.internal.k4y;

public class y4k extends b3 {
   private g3y n5;
   private g3y l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("sx", "sy");

   public y4k(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new y4k$1(this, var1));
   }

   public y4k() {
      this.n5 = new g3y();
      this.l6 = new g3y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "sx");
      this.l6.n5("a", var2, "sy");
      var2.s7();
   }

   public final g3y n5() {
      return this.n5;
   }

   public final g3y l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static g3y n5(y4k var0, g3y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g3y l6(y4k var0, g3y var1) {
      return var0.l6 = var1;
   }
}
