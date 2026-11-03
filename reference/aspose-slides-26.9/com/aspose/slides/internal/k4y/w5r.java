package com.aspose.slides.internal.k4y;

public class w5r extends b3 {
   private long l6;
   private String k5;
   private byte u3;
   private double a6;
   private boolean u9;
   private z4 h0;
   private y1g c8;
   public static final byte n5 = q1.n5("vert");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "id", "name", "orient", "pos", "userDrawn", "clr", "extLst"
   );

   public w5r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      w5r$1 var2 = new w5r$1(this);
      n5(var1, var2);
      n5(var1, new w5r$2(this, var1));
   }

   public w5r() {
      this.a6();
      this.h0 = new z4();
   }

   private void a6() {
      this.k5 = "";
      this.u3 = n5;
      this.a6 = 0.0;
      this.u9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (!"".equals(this.k5)) {
         var2.l6("name", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("orient", q1.n5(this.u3));
      }

      if (this.a6 != 0.0) {
         var2.l6("pos", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.a6 * 12700.0), 14)));
      }

      if (this.u9) {
         var2.l6("userDrawn", this.u9 ? "1" : "0");
      }

      this.h0.n5("p15", var2, "clr");
      if (this.c8 != null) {
         this.c8.n5("p15", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final byte n5() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final double l6() {
      return this.a6;
   }

   public final void n5(double var1) {
      this.a6 = var1;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final z4 k5() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return t2;
   }

   // $VF: synthetic method
   static long n5(w5r var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(w5r var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(w5r var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(w5r var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(w5r var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static z4 n5(w5r var0, z4 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static y1g n5(w5r var0, y1g var1) {
      return var0.c8 = var1;
   }
}
