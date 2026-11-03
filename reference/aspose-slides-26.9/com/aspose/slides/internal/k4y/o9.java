package com.aspose.slides.internal.k4y;

public class o9 extends b3 {
   private float n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("trans", "pencilSize");

   public o9(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o9$1 var2 = new o9$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o9() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0.025F;
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.025F) {
         if (var2.n5) {
            var2.l6("trans", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6(
               "trans", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14))
            );
         }
      }

      if ((this.l6 & 65535) != 0) {
         var2.l6("pencilSize", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static float n5(o9 var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(o9 var0, int var1) {
      return var0.l6 = var1;
   }
}
