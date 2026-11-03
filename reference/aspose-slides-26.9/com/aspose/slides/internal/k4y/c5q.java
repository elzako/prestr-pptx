package com.aspose.slides.internal.k4y;

public class c5q extends b3 {
   private float n5;
   private float l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("tx", "ty");

   public c5q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c5q$1 var2 = new c5q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public c5q() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0.0F;
      this.l6 = 0.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0F) {
         if (var2.n5) {
            var2.l6("tx", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6("tx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
         }
      }

      if (this.l6 != 0.0F) {
         if (var2.n5) {
            var2.l6("ty", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
         } else {
            var2.l6("ty", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14)));
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static float n5(c5q var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(c5q var0, float var1) {
      return var0.l6 = var1;
   }
}
