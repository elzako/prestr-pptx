package com.aspose.slides.internal.k4y;

public class i9b extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("ax", "ay", "az");

   public i9b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i9b$1 var2 = new i9b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i9b() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0.0F;
      this.l6 = 0.0F;
      this.k5 = 0.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0F) {
         var2.l6("ax", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 60000.0F), 14)));
      }

      if (this.l6 != 0.0F) {
         var2.l6("ay", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 60000.0F), 14)));
      }

      if (this.k5 != 0.0F) {
         var2.l6("az", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 60000.0F), 14)));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static float n5(i9b var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(i9b var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(i9b var0, float var1) {
      return var0.k5 = var1;
   }
}
