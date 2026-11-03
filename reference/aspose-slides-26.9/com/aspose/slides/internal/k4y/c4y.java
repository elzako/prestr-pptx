package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c4y extends b3 {
   private String n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "val",
      "tint",
      "shade",
      "comp",
      "inv",
      "gray",
      "alpha",
      "alphaOff",
      "alphaMod",
      "hue",
      "hueOff",
      "hueMod",
      "sat",
      "satOff",
      "satMod",
      "lum",
      "lumOff",
      "lumMod",
      "red",
      "redOff",
      "redMod",
      "green",
      "greenOff",
      "greenMod",
      "blue",
      "blueOff",
      "blueMod",
      "gamma",
      "invGamma"
   );

   public c4y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      c4y$1 var2 = new c4y$1(this);
      n5(var1, var2);
      n5(var1, new c4y$2(this, var1));
   }

   public c4y() {
      this.k5();
   }

   private void k5() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("val", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 2:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((k0t)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((x7i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((r5t)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 8:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 9:
                  ((v1)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 10:
                  ((v1)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 11:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 12:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 13:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 14:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 15:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 16:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 17:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 18:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 19:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 20:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 21:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 22:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 23:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 24:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 25:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 26:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 27:
                  ((k9m)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 28:
                  ((k4s)var5.k5()).n5("a", var2, var5.n5());
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
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(c4y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(c4y var0) {
      return var0.l6;
   }
}
