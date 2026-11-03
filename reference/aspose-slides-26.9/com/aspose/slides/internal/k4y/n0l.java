package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n0l extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private int u3;
   private int a6;
   private List<h0> u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "style:column-width", "style:rel-column-width", "style:use-optimal-column-width", "fo:break-before", "fo:break-after"
   );

   public n0l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n0l$1 var2 = new n0l$1(this);
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
               switch (h0.n5(var1.n3())) {
                  default:
                     h0 var5 = new h0(var1);
                     this.u9.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public n0l() {
      this.k5();
   }

   private void k5() {
      this.k5 = -1;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("style:column-width", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("style:rel-column-width", this.l6);
      }

      if (this.k5 != -1) {
         var2.l6("style:use-optimal-column-width", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != 0) {
         var2.l6("fo:break-before", g4c.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("fo:break-after", w7s.n5(this.a6));
      }

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            h0 var5 = (h0)var4.next();
            var5.n5("", var2, "");
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

   public final void n5(String var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(n0l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(n0l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(n0l var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(n0l var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(n0l var0, int var1) {
      return var0.a6 = var1;
   }
}
