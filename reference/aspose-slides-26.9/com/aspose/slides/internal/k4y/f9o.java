package com.aspose.slides.internal.k4y;

public class f9o extends b3 {
   private e2l n5;
   private e2l l6;
   private e2l k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("minColor", "midColor", "maxColor");

   public f9o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new f9o$1(this, var1));
   }

   public f9o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "minColor");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "midColor");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "maxColor");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static e2l n5(f9o var0, e2l var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e2l l6(f9o var0, e2l var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static e2l k5(f9o var0, e2l var1) {
      return var0.k5 = var1;
   }
}
