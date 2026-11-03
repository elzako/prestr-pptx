package com.aspose.slides.internal.k4y;

public class n6x extends b3 {
   private long n5;
   private long l6;
   private f9y k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("distT", "distB", "effectExtent");

   public n6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n6x$1 var2 = new n6x$1(this);
      n5(var1, var2);
      n5(var1, new n6x$2(this, var1));
   }

   public n6x() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("distT", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("distB", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (this.k5 != null) {
         this.k5.n5("wp", var2, "effectExtent");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(n6x var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(n6x var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f9y n5(n6x var0, f9y var1) {
      return var0.k5 = var1;
   }
}
