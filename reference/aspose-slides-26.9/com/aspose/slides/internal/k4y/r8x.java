package com.aspose.slides.internal.k4y;

public class r8x extends b3 {
   private long n5;
   private h7e l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("lvl", "tnLst");

   public r8x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r8x$1 var2 = new r8x$1(this);
      n5(var1, var2);
      n5(var1, new r8x$2(this, var1));
   }

   public r8x() {
      this.l6();
      this.l6 = new h7e();
   }

   private void l6() {
      this.n5 = 0L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 0L) {
         var2.l6("lvl", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      this.l6.n5("p", var2, "tnLst");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(r8x var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static h7e n5(r8x var0, h7e var1) {
      return var0.l6 = var1;
   }
}
