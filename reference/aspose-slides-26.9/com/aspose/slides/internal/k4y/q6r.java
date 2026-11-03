package com.aspose.slides.internal.k4y;

public class q6r extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private double a6;
   private double u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("sx", "sy", "kx", "ky", "tx", "ty");

   public q6r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q6r$1 var2 = new q6r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q6r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 100.0F;
      this.l6 = 100.0F;
      this.k5 = 0.0F;
      this.u3 = 0.0F;
      this.a6 = 0.0;
      this.u9 = 0.0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 100.0F) {
         if (var2.n5) {
            var2.l6("sx", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6("sx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
         }
      }

      if (this.l6 != 100.0F) {
         if (var2.n5) {
            var2.l6("sy", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
         } else {
            var2.l6("sy", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14)));
         }
      }

      if (this.k5 != 0.0F) {
         var2.l6("kx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 60000.0F), 14)));
      }

      if (this.u3 != 0.0F) {
         var2.l6("ky", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 60000.0F), 14)));
      }

      if (this.a6 != 0.0) {
         var2.l6("tx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.a6 * 12700.0), 14)));
      }

      if (this.u9 != 0.0) {
         var2.l6("ty", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u9 * 12700.0), 14)));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static float n5(q6r var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(q6r var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(q6r var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float u3(q6r var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(q6r var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double l6(q6r var0, double var1) {
      return var0.u9 = var1;
   }
}
