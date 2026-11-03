package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r1w extends b3 {
   private int n5;
   private int l6;
   private List<g7> k5;
   private List<h0> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("style:ruby-position", "style:ruby-align");

   public r1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r1w$1 var2 = new r1w$1(this);
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
               switch (a6.n5(var1.n3())) {
                  default:
                     h0 var5 = new h0(var1);
                     this.u3.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public r1w() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = new List<>();
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("style:ruby-position", w0g.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("style:ruby-align", o5m.n5(this.l6));
      }

      List$Enumerator var4 = this.k5.iterator();

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

      List$Enumerator var14 = this.u3.iterator();

      try {
         while (var14.hasNext()) {
            h0 var6 = (h0)var14.next();
            var6.n5("", var2, "");
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
      return a6;
   }

   // $VF: synthetic method
   static int n5(r1w var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(r1w var0, int var1) {
      return var0.l6 = var1;
   }
}
