package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y5g extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private String a6;
   private List<g7> u9;
   public static final int n5 = w4h.n5("b");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "name", "styleLbl", "chOrder", "moveWith", "alg", "shape", "presOf", "constrLst", "ruleLst", "varLst", "forEach", "layoutNode", "choose", "extLst"
   );

   public y5g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      y5g$1 var2 = new y5g$1(this);
      n5(var1, var2);
      n5(var1, new y5g$2(this, var1));
   }

   public y5g() {
      this.h0();
   }

   private void h0() {
      this.l6 = "";
      this.k5 = "";
      this.u3 = n5;
      this.a6 = "";
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.l6)) {
         var2.l6("name", this.l6);
      }

      if (!"".equals(this.k5)) {
         var2.l6("styleLbl", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("chOrder", w4h.n5(this.u3));
      }

      if (!"".equals(this.a6)) {
         var2.l6("moveWith", this.a6);
      }

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (h0.n5(var5.n5())) {
               case 4:
                  ((p5i)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 5:
                  ((r6v)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 6:
                  ((d4w)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 7:
                  ((n8z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 8:
                  ((k5r)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 9:
                  ((s3p)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 10:
                  ((c5z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 11:
                  ((y5g)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 12:
                  ((i9l)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 13:
                  ((l8r)var5.k5()).n5("dgm", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final String l6() {
      return this.k5;
   }

   public final int k5() {
      return this.u3;
   }

   public final String u3() {
      return this.a6;
   }

   public final List<g7> a6() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(y5g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(y5g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(y5g var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(y5g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(y5g var0) {
      return var0.u9;
   }
}
