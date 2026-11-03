package com.aspose.slides.internal.k4y;

public class s6 extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("x1", "y1", "x2", "y2");

   public s6(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s6$1 var2 = new s6$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s6() {
      this.l6();
   }

   private void l6() {
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5) {
         var2.l6("x1", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
      } else {
         var2.l6("x1", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
      }

      if (var2.n5) {
         var2.l6("y1", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
      } else {
         var2.l6("y1", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14)));
      }

      if (var2.n5) {
         var2.l6("x2", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.k5), "%"}));
      } else {
         var2.l6("x2", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 1000.0F), 14)));
      }

      if (var2.n5) {
         var2.l6("y2", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u3), "%"}));
      } else {
         var2.l6("y2", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 1000.0F), 14)));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static float n5(s6 var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(s6 var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(s6 var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float u3(s6 var0, float var1) {
      return var0.u3 = var1;
   }
}
