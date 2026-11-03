package com.aspose.slides.internal.k4y;

public class u3n extends b3 {
   private double n5;
   private double l6;
   private String k5;
   private int u3;
   private x4q a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "latitude", "longitude", "entityName", "entityType", "address"
   );

   public u3n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u3n$1 var2 = new u3n$1(this);
      n5(var1, var2);
      n5(var1, new u3n$2(this, var1));
   }

   public u3n() {
      this.l6();
   }

   private void l6() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.d2.k5(this.n5)) {
         var2.l6("latitude", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.l6)) {
         var2.l6("longitude", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      var2.l6("entityName", this.k5);
      var2.l6("entityType", u7o.n5(this.u3));
      if (this.a6 != null) {
         this.a6.n5("cx", var2, "address");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static double n5(u3n var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(u3n var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(u3n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(u3n var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static x4q n5(u3n var0, x4q var1) {
      return var0.a6 = var1;
   }
}
