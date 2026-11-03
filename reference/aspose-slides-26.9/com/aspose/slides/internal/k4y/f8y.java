package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f8y extends b3 {
   private int l6;
   private String k5;
   private List<g7> u3;
   public static final int n5 = t2d.n5("sib");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "type",
      "name",
      "cont",
      "effect",
      "alphaBiLevel",
      "alphaCeiling",
      "alphaFloor",
      "alphaInv",
      "alphaMod",
      "alphaModFix",
      "alphaOutset",
      "alphaRepl",
      "biLevel",
      "blend",
      "blur",
      "clrChange",
      "clrRepl",
      "duotone",
      "fill",
      "fillOverlay",
      "glow",
      "grayscl",
      "hsl",
      "innerShdw",
      "lum",
      "outerShdw",
      "prstShdw",
      "reflection",
      "relOff",
      "softEdge",
      "tint",
      "xfrm"
   );

   public f8y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f8y$1 var2 = new f8y$1(this);
      n5(var1, var2);
      n5(var1, new f8y$2(this, var1));
   }

   public f8y() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("type", t2d.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("name", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a6.n5(var5.n5())) {
               case 2:
                  ((f8y)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((j9e)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((p0)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((s1)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((g9)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((l9)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 8:
                  ((z2)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 9:
                  ((m5)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 10:
                  ((v5)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 11:
                  ((p2)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 12:
                  ((m7)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 13:
                  ((h4)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 14:
                  ((f9)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 15:
                  ((x4)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 16:
                  ((l3)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 17:
                  ((d4n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 18:
                  ((g8v)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 19:
                  ((k1d)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 20:
                  ((f3c)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 21:
                  ((l2p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 22:
                  ((t1z)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 23:
                  ((s5g)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 24:
                  ((k3h)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 25:
                  ((o3i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 26:
                  ((p2i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 27:
                  ((d2a)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 28:
                  ((c5q)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 29:
                  ((g9t)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 30:
                  ((j8o)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 31:
                  ((q6r)var5.k5()).n5("a", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(f8y var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(f8y var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(f8y var0) {
      return var0.u3;
   }
}
