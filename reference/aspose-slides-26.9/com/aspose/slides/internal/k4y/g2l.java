package com.aspose.slides.internal.k4y;

public class g2l extends b3 {
   private String n5;
   private z8r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("table:cell-range-address", "filter");

   public g2l(com.aspose.slides.ms.System.Xml.c7 var1) {
      g2l$1 var2 = new g2l$1(this);
      n5(var1, var2);
      n5(var1, new g2l$2(this, var1));
   }

   public g2l() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:cell-range-address", this.n5);
      if (this.l6 != null) {
         this.l6.n5("table", var2, "filter");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(g2l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z8r n5(g2l var0, z8r var1) {
      return var0.l6 = var1;
   }
}
