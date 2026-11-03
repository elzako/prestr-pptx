package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a9t extends x8 {
   private List<z6y> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("ext");

   public a9t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(var1.n3())) {
                  case 0:
                     z6y var4 = new z6y(var1);
                     this.n5.addItem(var4);
                     var3 = true;
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public a9t() {
      this.a6();
   }

   private void a6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            z6y var5 = (z6y)var4.next();
            var5.n5("c", var2, "ext");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   @Override
   protected x8 k5() {
      return new a9t();
   }

   @Override
   public d3 l6() {
      z6y var1 = new z6y();
      this.n5.addItem(var1);
      return var1;
   }

   @Override
   public d3[] n5() {
      return this.n5.toArray(new z6y[0]);
   }
}
