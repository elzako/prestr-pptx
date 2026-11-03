package com.aspose.slides.internal.k4y;

public class n1w extends b3 {
   private d2c n5;
   private y1g l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cSldViewPr", "extLst");

   public n1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n1w$1(this, var1));
   }

   public n1w() {
      this.n5 = new d2c();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("p", var2, "cSldViewPr");
      if (this.l6 != null) {
         this.l6.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final d2c n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static d2c n5(n1w var0, d2c var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(n1w var0, y1g var1) {
      return var0.l6 = var1;
   }
}
