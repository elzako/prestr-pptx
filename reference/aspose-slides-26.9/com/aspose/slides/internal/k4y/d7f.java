package com.aspose.slides.internal.k4y;

public class d7f extends b3 {
   private long n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("dxfId", "cellColor");

   public d7f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d7f$1 var2 = new d7f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d7f() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("dxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (!this.l6) {
         var2.l6("cellColor", this.l6 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(d7f var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d7f var0, boolean var1) {
      return var0.l6 = var1;
   }
}
