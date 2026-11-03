package com.aspose.slides.internal.k4y;

public class j6b extends b3 {
   private int n5;
   private y8d l6;
   private c7h k5;
   private y8d u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("count", "min", "mid", "max");

   public j6b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j6b$1 var2 = new j6b$1(this);
      n5(var1, var2);
      n5(var1, new j6b$2(this, var1));
   }

   public j6b() {
      this.l6();
   }

   private void l6() {
      this.n5 = 2;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 2) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "min");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "mid");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "max");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(j6b var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y8d n5(j6b var0, y8d var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c7h n5(j6b var0, c7h var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y8d l6(j6b var0, y8d var1) {
      return var0.u3 = var1;
   }
}
