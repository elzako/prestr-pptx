package com.aspose.slides.internal.k4y;

public class k1x extends b3 {
   private int n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("table:name", "table:index");

   public k1x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k1x$1 var2 = new k1x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k1x() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", u7e.n5(this.n5));
      var2.l6("table:index", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(k1x var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(k1x var0, long var1) {
      return var0.l6 = var1;
   }
}
