package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n1s extends b3 {
   private boolean n5;
   private long l6;
   private long k5;
   private long u3;
   private List<j5d> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "disablePrompts", "xWindow", "yWindow", "count", "dataValidation"
   );

   public n1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n1s$1 var2 = new n1s$1(this);
      n5(var1, var2);
      n5(var1, new n1s$2(this, var1));
   }

   public n1s() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("disablePrompts", this.n5 ? "1" : "0");
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("xWindow", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("yWindow", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            j5d var5 = (j5d)var4.next();
            var5.n5("ssml", var2, "dataValidation");
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
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(n1s var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(n1s var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(n1s var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long k5(n1s var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(n1s var0) {
      return var0.a6;
   }
}
