package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class q9u extends b3 {
   private double l6;
   private double k5;
   private double u3;
   private int a6;
   private h8 u9;
   private h8 h0;
   private z4 c8;
   private z4 t2;
   private l8r s7;
   public static final int n5 = d9.n5("warmMatte");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "z", "extrusionH", "contourW", "prstMaterial", "bevelT", "bevelB", "extrusionClr", "contourClr", "extLst"
   );

   public q9u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.e2();
      q9u$1 var2 = new q9u$1(this);
      n5(var1, var2);
      n5(var1, new q9u$2(this, var1));
   }

   public q9u() {
      this.e2();
   }

   private void e2() {
      this.l6 = 0.0;
      this.k5 = 0.0;
      this.u3 = 0.0;
      this.a6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.l6 != 0.0) {
         var2.l6("z", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      }

      if (this.k5 != 0.0) {
         var2.l6(
            "extrusionH", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14))
         );
      }

      if (this.u3 != 0.0) {
         var2.l6(
            "contourW", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u3 * 12700.0), 14))
         );
      }

      if (this.a6 != n5) {
         var2.l6("prstMaterial", d9.n5(this.a6));
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "bevelT");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "bevelB");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "extrusionClr");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "contourClr");
      }

      if (this.s7 != null) {
         this.s7.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final h8 n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <bevelT> element can be added.");
      }

      this.u9 = new h8();
      return this.u9;
   }

   public final h8 l6() {
      if (this.h0 != null) {
         throw new Exception("Only one <bevelB> element can be added.");
      }

      this.h0 = new h8();
      return this.h0;
   }

   public final z4 k5() {
      if (this.c8 != null) {
         throw new Exception("Only one <extrusionClr> element can be added.");
      }

      this.c8 = new z4();
      return this.c8;
   }

   public final z4 u3() {
      if (this.t2 != null) {
         throw new Exception("Only one <contourClr> element can be added.");
      }

      this.t2 = new z4();
      return this.t2;
   }

   public final double a6() {
      return this.l6;
   }

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final double u9() {
      return this.k5;
   }

   public final void l6(double var1) {
      this.k5 = var1;
   }

   public final double h0() {
      return this.u3;
   }

   public final void k5(double var1) {
      this.u3 = var1;
   }

   public final int c8() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final h8 t2() {
      return this.u9;
   }

   public final h8 s7() {
      return this.h0;
   }

   public final z4 x8() {
      return this.c8;
   }

   public final z4 n3() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y4() {
      return x8;
   }

   // $VF: synthetic method
   static double n5(q9u var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(q9u var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double k5(q9u var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(q9u var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static h8 n5(q9u var0, h8 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static h8 l6(q9u var0, h8 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static z4 n5(q9u var0, z4 var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static z4 l6(q9u var0, z4 var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l8r n5(q9u var0, l8r var1) {
      return var0.s7 = var1;
   }
}
