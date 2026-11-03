package com.aspose.slides.internal.k4y;

public class o6d extends b3 {
   private boolean n5;
   private double l6;
   private z4 k5;
   private h7z u3;
   private o5k a6;
   private l8r u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("enabled", "rad", "clr", "intensity", "pos", "extLst");

   public o6d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o6d$1 var2 = new o6d$1(this);
      n5(var1, var2);
      n5(var1, new o6d$2(this, var1));
   }

   public o6d() {
      this.l6();
      this.k5 = new z4();
      this.u3 = new h7z();
      this.a6 = new o5k();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("enabled", this.n5 ? "1" : "0");
      }

      com.aspose.slides.internal.f8y.n5.n5(!com.aspose.slides.ms.System.d2.k5(this.l6), "Required property \"Rad\" is uninitialized.");
      var2.l6("rad", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      this.k5.n5("am3d", var2, "clr");
      this.u3.n5("am3d", var2, "intensity");
      this.a6.n5("am3d", var2, "pos");
      if (this.u9 != null) {
         this.u9.n5("am3d", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static boolean n5(o6d var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(o6d var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static z4 n5(o6d var0, z4 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static h7z n5(o6d var0, h7z var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static o5k n5(o6d var0, o5k var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(o6d var0, l8r var1) {
      return var0.u9 = var1;
   }
}
