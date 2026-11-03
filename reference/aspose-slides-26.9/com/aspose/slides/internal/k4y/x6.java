package com.aspose.slides.internal.k4y;

public class x6 extends b3 {
   private float n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("trans", "numberOfShades");

   public x6(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x6$1 var2 = new x6$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x6() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0.0F;
      this.l6 = 2;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0F) {
         if (var2.n5) {
            var2.l6("trans", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6(
               "trans", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14))
            );
         }
      }

      if ((this.l6 & 65535) != 2) {
         var2.l6("numberOfShades", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static float n5(x6 var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(x6 var0, int var1) {
      return var0.l6 = var1;
   }
}
