package com.aspose.slides.internal.k4y;

public class v6p extends b3 {
   private byte n5;
   private long l6;
   private long k5;
   private long u3;
   private double a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("auto", "indexed", "rgb", "theme", "tint");

   public v6p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      v6p$1 var2 = new v6p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v6p() {
      this.a6();
   }

   private void a6() {
      this.n5 = -1;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
      this.a6 = 0.0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("auto", this.n5 == 1 ? "1" : "0");
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("indexed", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("rgb", com.aspose.slides.ms.System.l4.n5(this.k5 & 4294967295L & 4294967295L, "X8"));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("theme", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != 0.0) {
         var2.l6("tint", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      var2.s7();
   }

   public final long n5() {
      return this.k5;
   }

   public final long l6() {
      return this.u3;
   }

   public final double k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static byte n5(v6p var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(v6p var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(v6p var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long k5(v6p var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(v6p var0, double var1) {
      return var0.a6 = var1;
   }
}
