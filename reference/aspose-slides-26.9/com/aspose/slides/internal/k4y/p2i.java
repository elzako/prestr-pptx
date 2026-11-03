package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class p2i extends b3 {
   private int n5;
   private double l6;
   private float k5;
   private g7 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "prst", "dist", "dir", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public p2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      p2i$1 var2 = new p2i$1(this);
      n5(var1, var2);
      n5(var1, new p2i$2(this, var1));
   }

   public p2i() {
      this.u9();
   }

   private void u9() {
      this.l6 = 0.0;
      this.k5 = 0.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("prst", t5.n5(this.n5));
      if (this.l6 != 0.0) {
         var2.l6("dist", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      }

      if (this.k5 != 0.0F) {
         var2.l6("dir", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 60000.0F), 14)));
      }

      if (this.u3 != null) {
         switch (a6.n5(this.u3.n5())) {
            case 3:
               ((e4w)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 4:
               ((e8p)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 5:
               ((d0p)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 6:
               ((s0i)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 7:
               ((q4d)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 8:
               ((x4a)this.u3.k5()).n5("a", var2, this.u3.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("Color already is initialized.");
      }

      switch (a6.n5(var1)) {
         case 3:
            this.u3 = new g7("scrgbClr", new e4w());
            break;
         case 4:
            this.u3 = new g7("srgbClr", new e8p());
            break;
         case 5:
            this.u3 = new g7("hslClr", new d0p());
            break;
         case 6:
            this.u3 = new g7("sysClr", new s0i());
            break;
         case 7:
            this.u3 = new g7("schemeClr", new q4d());
            break;
         case 8:
            this.u3 = new g7("prstClr", new x4a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final double l6() {
      return this.l6;
   }

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final g7 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(p2i var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(p2i var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float n5(p2i var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(p2i var0, g7 var1) {
      return var0.u3 = var1;
   }
}
