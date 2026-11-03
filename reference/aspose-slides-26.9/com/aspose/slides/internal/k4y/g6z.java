package com.aspose.slides.internal.k4y;

public class g6z extends b3 {
   private long n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("rgb");

   public g6z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g6z$1 var2 = new g6z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g6z() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("rgb", com.aspose.slides.ms.System.l4.n5(this.n5 & 4294967295L & 4294967295L, "X8"));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static long n5(g6z var0, long var1) {
      return var0.n5 = var1;
   }
}
