package com.aspose.slides.internal.k4y;

public class j4t extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "table:position", "table:start-position", "table:end-position"
   );

   public j4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j4t$1 var2 = new j4t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public j4t() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("table:position", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("table:start-position", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("table:end-position", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(j4t var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(j4t var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(j4t var0, int var1) {
      return var0.k5 = var1;
   }
}
