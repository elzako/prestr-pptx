package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public final class c8q extends b3 {
   private boolean n5 = true;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   c8q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      String var2 = var1.y4();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (l6.n5(com.aspose.slides.ms.System.d1.a6(var1.n5(var1.e2()), var2) ? var1.n3() : var1.x8())) {
               case 0:
                  this.n5 = com.aspose.slides.ms.System.Xml.f4.t2(var1.z1());
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown attribute \"", var1.x8(), "\""}));
            }
         }
      }

      var1.a6();
      l6(var1);
   }

   c8q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", this.n5 ? "1" : "0");
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }
}
