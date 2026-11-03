package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class q4d extends b3 {
   private int n5;
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

   public q4d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      q4d$1 var2 = new q4d$1(this);
      n5(var1, var2);
      n5(var1, new q4d$2(this, var1));
   }

   public q4d() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", w9.n5(this.n5));
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

   public final g7 n5(String var1) {
      g7 var2;
      switch (k5.n5(var1)) {
         case 1:
            var2 = new g7("tint", new d2n());
            break;
         case 2:
            var2 = new g7("shade", new d2n());
            break;
         case 3:
            var2 = new g7("comp", new k0t());
            break;
         case 4:
            var2 = new g7("inv", new x7i());
            break;
         case 5:
            var2 = new g7("gray", new r5t());
            break;
         case 6:
            var2 = new g7("alpha", new d2n());
            break;
         case 7:
            var2 = new g7("alphaOff", new d2n());
            break;
         case 8:
            var2 = new g7("alphaMod", new d2n());
            break;
         case 9:
            var2 = new g7("hue", new v1());
            break;
         case 10:
            var2 = new g7("hueOff", new v1());
            break;
         case 11:
            var2 = new g7("hueMod", new d2n());
            break;
         case 12:
            var2 = new g7("sat", new d2n());
            break;
         case 13:
            var2 = new g7("satOff", new d2n());
            break;
         case 14:
            var2 = new g7("satMod", new d2n());
            break;
         case 15:
            var2 = new g7("lum", new d2n());
            break;
         case 16:
            var2 = new g7("lumOff", new d2n());
            break;
         case 17:
            var2 = new g7("lumMod", new d2n());
            break;
         case 18:
            var2 = new g7("red", new d2n());
            break;
         case 19:
            var2 = new g7("redOff", new d2n());
            break;
         case 20:
            var2 = new g7("redMod", new d2n());
            break;
         case 21:
            var2 = new g7("green", new d2n());
            break;
         case 22:
            var2 = new g7("greenOff", new d2n());
            break;
         case 23:
            var2 = new g7("greenMod", new d2n());
            break;
         case 24:
            var2 = new g7("blue", new d2n());
            break;
         case 25:
            var2 = new g7("blueOff", new d2n());
            break;
         case 26:
            var2 = new g7("blueMod", new d2n());
            break;
         case 27:
            var2 = new g7("gamma", new k9m());
            break;
         case 28:
            var2 = new g7("invGamma", new k4s());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.l6.addItem(var2);
      return var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final List<g7> l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(q4d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(q4d var0) {
      return var0.l6;
   }
}
