package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public final class c7f extends b3 {
   private double l6 = 0.0;
   private double k5 = 0.0;
   private byte u3;
   private boolean a6;
   private boolean u9;
   private List<g7> h0;
   public static final byte n5 = i4.n5("norm");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "w", "h", "fill", "stroke", "extrusionOk", "close", "moveTo", "lnTo", "arcTo", "quadBezTo", "cubicBezTo"
   );

   public c7f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new c7f$1(this));
      n5(var1, new c7f$2(this, var1));
   }

   public c7f() {
      this.u3 = n5;
      this.a6 = true;
      this.u9 = true;
      this.h0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != 0.0) {
         var2.l6("w", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      }

      if (this.k5 != 0.0) {
         var2.l6("h", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
      }

      if (this.u3 != n5) {
         var2.l6("fill", i4.n5(this.u3));
      }

      if (!this.a6) {
         var2.l6("stroke", this.a6 ? "1" : "0");
      }

      if (!this.u9) {
         var2.l6("extrusionOk", this.u9 ? "1" : "0");
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (c8.n5(var5.n5())) {
               case 5:
                  ((g4u)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((p7x)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((c1x)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 8:
                  ((z6e)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 9:
                  ((o6t)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 10:
                  ((y8m)var5.k5()).n5("a", var2, var5.n5());
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
      switch (c8.n5(var1)) {
         case 5:
            var2 = new g7("close", new g4u());
            break;
         case 6:
            var2 = new g7("moveTo", new p7x());
            break;
         case 7:
            var2 = new g7("lnTo", new c1x());
            break;
         case 8:
            var2 = new g7("arcTo", new z6e());
            break;
         case 9:
            var2 = new g7("quadBezTo", new o6t());
            break;
         case 10:
            var2 = new g7("cubicBezTo", new y8m());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.h0.addItem(var2);
      return var2;
   }

   public final void n5(g7 var1) {
      this.h0.addItem(var1);
   }

   public final double n5() {
      return this.l6;
   }

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final double l6() {
      return this.k5;
   }

   public final void l6(double var1) {
      this.k5 = var1;
   }

   public final byte k5() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final boolean u3() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final boolean a6() {
      return this.u9;
   }

   public final void l6(boolean var1) {
      this.u9 = var1;
   }

   public final g7[] u9() {
      return this.h0.toArray(new g7[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return c8;
   }

   // $VF: synthetic method
   static double n5(c7f var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(c7f var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(c7f var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(c7f var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(c7f var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(c7f var0) {
      return var0.h0;
   }
}
