package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v8 extends b3 {
   private String n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "documentID", "definitions", "context", "trace", "traceGroup", "traceView", "annotation", "annotationXML"
   );

   public v8(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      v8$1 var2 = new v8$1(this);
      n5(var1, var2);
      n5(var1, new v8$2(this, var1));
   }

   public v8() {
      this.k5();
   }

   private void k5() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("inkml", var3, "http://www.w3.org/2003/InkML");
      if (this.n5 != null) {
         var2.l6("documentID", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((z3s)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 2:
                  ((h8y)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 3:
                  ((o3x)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 4:
                  ((z9x)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 5:
                  ((l5u)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 6:
                  ((i3p)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 7:
                  ((s4z)var5.k5()).n5("inkml", var2, var5.n5());
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
      this.l6.addItem(var1);
   }

   public final List<g7> n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(v8 var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(v8 var0) {
      return var0.l6;
   }
}
