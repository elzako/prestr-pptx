package com.aspose.slides.internal.k4y;

public class k1e extends b3 {
   private o5k n5;
   private o7b l6;
   private o5k k5;
   private g7 u3;
   private l8r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "pos", "up", "lookAt", "orthographic", "perspective", "extLst"
   );

   public k1e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new k1e$1(this, var1));
   }

   public k1e() {
      this.n5 = new o5k();
      this.l6 = new o7b();
      this.k5 = new o5k();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("am3d", var2, "pos");
      this.l6.n5("am3d", var2, "up");
      this.k5.n5("am3d", var2, "lookAt");
      if (this.u3 != null) {
         switch (u9.n5(this.u3.n5())) {
            case 3:
               ((h3m)this.u3.k5()).n5("am3d", var2, this.u3.n5());
               break;
            case 4:
               ((f1b)this.u3.k5()).n5("am3d", var2, this.u3.n5());
         }
      }

      if (this.a6 != null) {
         this.a6.n5("am3d", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static o5k n5(k1e var0, o5k var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static o7b n5(k1e var0, o7b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static o5k l6(k1e var0, o5k var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(k1e var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l8r n5(k1e var0, l8r var1) {
      return var0.a6 = var1;
   }
}
