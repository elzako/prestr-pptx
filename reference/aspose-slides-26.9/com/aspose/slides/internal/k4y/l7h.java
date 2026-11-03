package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public final class l7h extends b3 {
   private m6n n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("graphicData");

   l7h(com.aspose.slides.ms.System.Xml.c7 var1) {
      String var2 = var1.n3();
      if (!var1.m1()) {
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(var1.n3())) {
                  case 0:
                     this.n5 = new m6n(var1);
                     var3 = com.aspose.slides.ms.System.d1.a6(var1.n3(), var2);
                     break;
                  default:
                     throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n3(), "\""}));
               }
            }
         }
      }
   }

   l7h() {
      this.n5 = new m6n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      this.n5.n5("a", var2, "graphicData");
      var2.s7();
   }

   public final m6n n5() {
      return this.n5;
   }
}
