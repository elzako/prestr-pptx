package com.aspose.slides.internal.k4y;

public class k1b extends b3 {
   private h6m n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("extLst");

   public k1b(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new k1b$1(this, var1));
   }

   public k1b() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(h6m var1) {
      this.n5 = var1;
   }

   public final h6m n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static h6m n5(k1b var0, h6m var1) {
      return var0.n5 = var1;
   }
}
