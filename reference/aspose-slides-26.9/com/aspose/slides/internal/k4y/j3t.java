package com.aspose.slides.internal.k4y;

public class j3t extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "style:condition", "style:apply-style-name", "style:base-cell-address"
   );

   public j3t(com.aspose.slides.ms.System.Xml.c7 var1) {
      j3t$1 var2 = new j3t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public j3t() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:condition", this.n5);
      var2.l6("style:apply-style-name", this.l6);
      if (this.k5 != null) {
         var2.l6("style:base-cell-address", this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(j3t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(j3t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(j3t var0, String var1) {
      return var0.k5 = var1;
   }
}
