package com.aspose.slides.internal.k4y;

public class t3c extends b3 {
   private n4b n5;
   private b9q l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("geoDataEntityQuery", "geoData");

   public t3c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t3c$1(this, var1));
   }

   public t3c() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "geoDataEntityQuery");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "geoData");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static n4b n5(t3c var0, n4b var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b9q n5(t3c var0, b9q var1) {
      return var0.l6 = var1;
   }
}
