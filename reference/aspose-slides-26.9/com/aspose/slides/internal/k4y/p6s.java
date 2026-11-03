package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p6s extends b3 {
   private List<g7> n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("_AnyElement", "_TEXT");

   public p6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p6s$1 var2 = new p6s$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (k5.n5(var1.n3())) {
                  default:
                     h0 var6 = new h0(var1);
                     this.l6.addItem(new g7("_AnyElement", var6));
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               String var5 = var1.z1();
               this.l6.addItem(new g7("_TEXT", var5));
            }
         }
      }
   }

   public p6s() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            var2.l6(var5.n5(), (String)var5.k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.l6.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (k5.n5(var6.n5())) {
               case 0:
                  ((h0)var6.k5()).n5("", var2, var6.n5());
                  break;
               case 1:
                  var2.l6((String)var6.k5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }
}
