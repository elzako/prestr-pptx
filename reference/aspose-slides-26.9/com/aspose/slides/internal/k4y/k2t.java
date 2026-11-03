package com.aspose.slides.internal.k4y;

public class k2t extends b3 {
   private long n5;
   private long l6;
   private long k5;
   private boolean u3;
   private boolean a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("id", "min", "max", "man", "pt");

   public k2t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k2t$1 var2 = new k2t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k2t() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0L;
      this.l6 = 0L;
      this.k5 = 0L;
      this.u3 = false;
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 0L) {
         var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 0L) {
         var2.l6("min", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 0L) {
         var2.l6("max", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3) {
         var2.l6("man", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("pt", this.a6 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(k2t var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(k2t var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long k5(k2t var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(k2t var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(k2t var0, boolean var1) {
      return var0.a6 = var1;
   }
}
