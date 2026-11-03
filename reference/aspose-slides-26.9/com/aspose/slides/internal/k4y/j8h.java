package com.aspose.slides.internal.k4y;

public class j8h extends b3 {
   private boolean n5;
   private double l6;
   private float k5;
   private z4 u3;
   private h7z a6;
   private o5k u9;
   private o5k h0;
   private l8r c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "enabled", "rad", "spotAng", "clr", "intensity", "pos", "lookAt", "extLst"
   );

   public j8h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j8h$1 var2 = new j8h$1(this);
      n5(var1, var2);
      n5(var1, new j8h$2(this, var1));
   }

   public j8h() {
      this.l6();
      this.u3 = new z4();
      this.a6 = new h7z();
      this.u9 = new o5k();
      this.h0 = new o5k();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = Double.NaN;
      this.k5 = 45.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("enabled", this.n5 ? "1" : "0");
      }

      com.aspose.slides.internal.f8y.n5.n5(!com.aspose.slides.ms.System.d2.k5(this.l6), "Required property \"Rad\" is uninitialized.");
      var2.l6("rad", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      var2.l6("spotAng", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 60000.0F), 14)));
      this.u3.n5("am3d", var2, "clr");
      this.a6.n5("am3d", var2, "intensity");
      this.u9.n5("am3d", var2, "pos");
      this.h0.n5("am3d", var2, "lookAt");
      if (this.c8 != null) {
         this.c8.n5("am3d", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static boolean n5(j8h var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(j8h var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float n5(j8h var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static z4 n5(j8h var0, z4 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static h7z n5(j8h var0, h7z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static o5k n5(j8h var0, o5k var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static o5k l6(j8h var0, o5k var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l8r n5(j8h var0, l8r var1) {
      return var0.c8 = var1;
   }
}
