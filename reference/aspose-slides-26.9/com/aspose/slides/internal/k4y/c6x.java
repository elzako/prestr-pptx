package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c6x extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("script:event-listener", "presentation:event-listener");

   public c6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n5();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.e2(), ":", var1.n3()}))) {
                  case 0:
                     e8e var4 = new e8e(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"script:", "event-listener"}), var4));
                     break;
                  case 1:
                     u2t var5 = new u2t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"presentation:", "event-listener"}), var5));
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public c6x() {
      this.n5();
   }

   private void n5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((e8e)var5.k5()).n5("script", var2, "event-listener");
                  break;
               case 1:
                  ((u2t)var5.k5()).n5("presentation", var2, "event-listener");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }
}
