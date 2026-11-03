package com.aspose.slides.internal.k4y;

public class z8u extends b3 {
   private int l6;
   private long k5;
   private double u3;
   public static final int n5 = m5n.n5("disable");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("table:status", "table:steps", "table:maximum-difference");

   public z8u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z8u$1 var2 = new z8u$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public z8u() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = 100L;
      this.u3 = 0.001;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("table:status", m5n.n5(this.l6));
      }

      if ((this.k5 & 4294967295L) != 100L) {
         var2.l6("table:steps", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != 0.001) {
         var2.l6("table:maximum-difference", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(z8u var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(z8u var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double n5(z8u var0, double var1) {
      return var0.u3 = var1;
   }
}
