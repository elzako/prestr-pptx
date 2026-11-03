package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class t2f extends b3 {
   private long n5;
   private String l6;
   private q5p k5;
   private List<x1n> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("fo:column-count", "fo:column-gap", "column-sep", "column");

   public t2f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t2f$1 var2 = new t2f$1(this);
      n5(var1, var2);
      n5(var1, new t2f$2(this, var1));
   }

   public t2f() {
      this.l6();
   }

   private void l6() {
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("fo:column-count", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("fo:column-gap", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("style", var2, "column-sep");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            x1n var5 = (x1n)var4.next();
            var5.n5("style", var2, "column");
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
   static long n5(t2f var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(t2f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q5p n5(t2f var0, q5p var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(t2f var0) {
      return var0.u3;
   }
}
