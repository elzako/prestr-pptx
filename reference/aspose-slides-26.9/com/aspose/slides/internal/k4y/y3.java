package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class y3 extends b3 {
   private int n5;
   private float l6;
   private float k5;
   private v2x u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("prst", "fov", "zoom", "rot");

   public y3(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      y3$1 var2 = new y3$1(this);
      n5(var1, var2);
      n5(var1, new y3$2(this, var1));
   }

   public y3() {
      this.h0();
   }

   private void h0() {
      this.n5 = -1;
      this.l6 = 45.0F;
      this.k5 = 100.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("prst", n7.n5(this.n5));
      if (this.l6 != 45.0F) {
         var2.l6("fov", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 60000.0F), 14)));
      }

      if (this.k5 != 100.0F) {
         if (var2.n5) {
            var2.l6("zoom", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.k5), "%"}));
         } else {
            var2.l6(
               "zoom", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 1000.0F), 14))
            );
         }
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "rot");
      }

      var2.s7();
   }

   public final v2x n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <rot> element can be added.");
      }

      this.u3 = new v2x();
      return this.u3;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final float k5() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float u3() {
      return this.k5;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final v2x a6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(y3 var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float n5(y3 var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float l6(y3 var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v2x n5(y3 var0, v2x var1) {
      return var0.u3 = var1;
   }
}
