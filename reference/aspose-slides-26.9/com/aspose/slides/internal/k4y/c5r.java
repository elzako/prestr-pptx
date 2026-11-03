package com.aspose.slides.internal.k4y;

public class c5r extends b3 {
   private double k5;
   private double u3;
   private String a6;
   private int u9;
   private int h0;
   public static final int n5 = m2u.n5("topLeft");
   public static final int l6 = c5a.n5("split");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("xSplit", "ySplit", "topLeftCell", "activePane", "state");

   public c5r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c5r$1 var2 = new c5r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public c5r() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0.0;
      this.u3 = 0.0;
      this.u9 = n5;
      this.h0 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != 0.0) {
         var2.l6("xSplit", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 0.0) {
         var2.l6("ySplit", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("topLeftCell", this.a6);
      }

      if (this.u9 != n5) {
         var2.l6("activePane", m2u.n5(this.u9));
      }

      if (this.h0 != l6) {
         var2.l6("state", c5a.n5(this.h0));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static double n5(c5r var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double l6(c5r var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(c5r var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(c5r var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(c5r var0, int var1) {
      return var0.h0 = var1;
   }
}
