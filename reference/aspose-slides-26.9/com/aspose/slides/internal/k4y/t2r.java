package com.aspose.slides.internal.k4y;

public class t2r extends b3 {
   private int n5;
   private long l6;
   private long k5;
   private long u3;
   private long a6;
   private f9y u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "wrapText", "distT", "distB", "distL", "distR", "effectExtent"
   );

   public t2r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t2r$1 var2 = new t2r$1(this);
      n5(var1, var2);
      n5(var1, new t2r$2(this, var1));
   }

   public t2r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
      this.a6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("wrapText", f8u.n5(this.n5));
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("distT", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("distB", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("distL", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("distR", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9 != null) {
         this.u9.n5("wp", var2, "effectExtent");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(t2r var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(t2r var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(t2r var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long k5(t2r var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long u3(t2r var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static f9y n5(t2r var0, f9y var1) {
      return var0.u9 = var1;
   }
}
