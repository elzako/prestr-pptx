package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v3x extends b3 {
   private List<x8c> n5;
   private List<v6p> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cfvo", "color");

   public v3x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new v3x$1(this, var1));
   }

   public v3x() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            x8c var5 = (x8c)var4.next();
            var5.n5("ssml", var2, "cfvo");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.l6.iterator();

      try {
         while (var14.hasNext()) {
            v6p var6 = (v6p)var14.next();
            var6.n5("ssml", var2, "color");
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
      return k5;
   }

   // $VF: synthetic method
   static List n5(v3x var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static List l6(v3x var0) {
      return var0.l6;
   }
}
