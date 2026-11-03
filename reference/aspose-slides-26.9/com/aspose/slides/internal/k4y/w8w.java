package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w8w extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private List<l2h> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "count", "defaultTableStyle", "defaultPivotStyle", "tableStyle"
   );

   public w8w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      w8w$1 var2 = new w8w$1(this);
      n5(var1, var2);
      n5(var1, new w8w$2(this, var1));
   }

   public w8w() {
      this.k5();
   }

   private void k5() {
      this.n5 = 4294967295L;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("defaultTableStyle", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("defaultPivotStyle", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            l2h var5 = (l2h)var4.next();
            var5.n5("ssml", var2, "tableStyle");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final l2h[] n5() {
      return this.u3.toArray(new l2h[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(w8w var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(w8w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(w8w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(w8w var0) {
      return var0.u3;
   }
}
