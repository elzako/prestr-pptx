package com.aspose.slides.internal.k4y;

public class c0e extends b3 {
   private boolean n5;
   private z4 l6;
   private h7z k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("enabled", "clr", "illuminance", "extLst");

   public c0e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c0e$1 var2 = new c0e$1(this);
      n5(var1, var2);
      n5(var1, new c0e$2(this, var1));
   }

   public c0e() {
      this.l6();
      this.l6 = new z4();
      this.k5 = new h7z();
   }

   private void l6() {
      this.n5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("enabled", this.n5 ? "1" : "0");
      }

      this.l6.n5("am3d", var2, "clr");
      this.k5.n5("am3d", var2, "illuminance");
      if (this.u3 != null) {
         this.u3.n5("am3d", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(c0e var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z4 n5(c0e var0, z4 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static h7z n5(c0e var0, h7z var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(c0e var0, l8r var1) {
      return var0.u3 = var1;
   }
}
