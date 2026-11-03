package com.aspose.slides.internal.k4y;

public class i8f extends b3 {
   private h7z n5;
   private o7b l6;
   private w5c k5;
   private i9b u3;
   private o7b a6;
   private l8r u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "meterPerModelUnit", "preTrans", "scale", "rot", "postTrans", "extLst"
   );

   public i8f(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i8f$1(this, var1));
   }

   public i8f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("am3d", var2, "meterPerModelUnit");
      }

      if (this.l6 != null) {
         this.l6.n5("am3d", var2, "preTrans");
      }

      if (this.k5 != null) {
         this.k5.n5("am3d", var2, "scale");
      }

      if (this.u3 != null) {
         this.u3.n5("am3d", var2, "rot");
      }

      if (this.a6 != null) {
         this.a6.n5("am3d", var2, "postTrans");
      }

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
   static h7z n5(i8f var0, h7z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static o7b n5(i8f var0, o7b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w5c n5(i8f var0, w5c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static i9b n5(i8f var0, i9b var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static o7b l6(i8f var0, o7b var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(i8f var0, l8r var1) {
      return var0.u9 = var1;
   }
}
