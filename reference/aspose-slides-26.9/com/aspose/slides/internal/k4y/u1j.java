package com.aspose.slides.internal.k4y;

public class u1j extends b3 {
   private j0v n5;
   private w1x l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("soft-page-break", "table-row");

   public u1j(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new u1j$1(this, var1));
   }

   public u1j() {
      this.l6 = new w1x();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("text", var2, "soft-page-break");
      }

      this.l6.n5("table", var2, "table-row");
      var2.s7();
   }

   public final w1x n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static j0v n5(u1j var0, j0v var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w1x n5(u1j var0, w1x var1) {
      return var0.l6 = var1;
   }
}
