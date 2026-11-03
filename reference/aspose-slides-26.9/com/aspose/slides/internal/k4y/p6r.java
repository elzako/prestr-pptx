package com.aspose.slides.internal.k4y;

public class p6r extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("l", "t", "r", "b");

   public p6r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      p6r$1 var2 = new p6r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p6r() {
      this.u9();
   }

   private void u9() {
      this.n5 = 0.0F;
      this.l6 = 0.0F;
      this.k5 = 0.0F;
      this.u3 = 0.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != 0.0F) {
         if (var2.n5) {
            var2.l6("l", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6("l", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
         }
      }

      if (this.l6 != 0.0F) {
         if (var2.n5) {
            var2.l6("t", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
         } else {
            var2.l6("t", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14)));
         }
      }

      if (this.k5 != 0.0F) {
         if (var2.n5) {
            var2.l6("r", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.k5), "%"}));
         } else {
            var2.l6("r", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 1000.0F), 14)));
         }
      }

      if (this.u3 != 0.0F) {
         if (var2.n5) {
            var2.l6("b", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u3), "%"}));
         } else {
            var2.l6("b", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 1000.0F), 14)));
         }
      }

      var2.s7();
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void k5(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void u3(float var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static float n5(p6r var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(p6r var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(p6r var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float u3(p6r var0, float var1) {
      return var0.u3 = var1;
   }
}
