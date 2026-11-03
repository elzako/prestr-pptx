package com.aspose.slides.internal.k4y;

public class w5c extends b3 {
   private g3y n5;
   private g3y l6;
   private g3y k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("sx", "sy", "sz");

   public w5c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w5c$1(this, var1));
   }

   public w5c() {
      this.n5 = new g3y();
      this.l6 = new g3y();
      this.k5 = new g3y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("am3d", var2, "sx");
      this.l6.n5("am3d", var2, "sy");
      this.k5.n5("am3d", var2, "sz");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static g3y n5(w5c var0, g3y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g3y l6(w5c var0, g3y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g3y k5(w5c var0, g3y var1) {
      return var0.k5 = var1;
   }
}
