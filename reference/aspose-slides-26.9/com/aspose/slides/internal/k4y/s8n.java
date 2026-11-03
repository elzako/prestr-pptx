package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s8n extends b3 {
   private long n5;
   private long l6;
   private String k5;
   private List<n0h> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("current", "show", "sqref", "scenario");

   public s8n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s8n$1 var2 = new s8n$1(this);
      n5(var1, var2);
      n5(var1, new s8n$2(this, var1));
   }

   public s8n() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("current", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("show", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("sqref", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            n0h var5 = (n0h)var4.next();
            var5.n5("ssml", var2, "scenario");
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
   static long n5(s8n var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(s8n var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(s8n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(s8n var0) {
      return var0.u3;
   }
}
