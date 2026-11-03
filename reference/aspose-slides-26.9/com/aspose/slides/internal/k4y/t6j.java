package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class t6j extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
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

   public t6j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new t6j$1(this, var1));
   }

   public t6j() {
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
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 1:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 2:
                  ((k0t)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((x7i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((r5t)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 8:
                  ((v1)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 9:
                  ((v1)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 10:
                  ((d2n)var5.k5()).n5("a", var2, var5.n5());
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
                  ((k9m)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 27:
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

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(t6j var0) {
      return var0.n5;
   }
}
