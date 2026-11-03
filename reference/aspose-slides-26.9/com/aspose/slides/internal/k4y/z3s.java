package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z3s extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "brush", "canvas", "canvasTransform", "context", "inkSource", "mapping", "timestamp", "trace", "traceFormat", "traceGroup", "traceView"
   );

   public z3s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new z3s$1(this, var1));
   }

   public z3s() {
      this.k5();
   }

   private void k5() {
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
                  ((n8o)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 1:
                  ((u4z)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 2:
                  ((n1d)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 3:
                  ((h8y)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 4:
                  ((c6l)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 5:
                  ((p1n)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 6:
                  ((o6m)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 7:
                  ((o3x)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 8:
                  ((o0s)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 9:
                  ((z9x)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 10:
                  ((l5u)var5.k5()).n5("inkml", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(g7 var1) {
      this.n5.addItem(var1);
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(z3s var0) {
      return var0.n5;
   }
}
