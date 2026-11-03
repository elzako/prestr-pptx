package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o5o extends b3 {
   private long n5;
   private long l6;
   private List<h7x> k5;
   private l0k u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("count", "uniqueCount", "si", "extLst");

   public o5o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      o5o$1 var2 = new o5o$1(this);
      n5(var1, var2);
      n5(var1, new o5o$2(this, var1));
   }

   public o5o() {
      this.u3();
   }

   private void u3() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ssml", var3, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("uniqueCount", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            h7x var5 = (h7x)var4.next();
            var5.n5("ssml", var2, "si");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(h7x var1) {
      this.k5.addItem(var1);
   }

   public final void n5(l0k var1) {
      this.u3 = var1;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final h7x[] n5() {
      return this.k5.toArray(new h7x[0]);
   }

   public final l0k l6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(o5o var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(o5o var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(o5o var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static l0k n5(o5o var0, l0k var1) {
      return var0.u3 = var1;
   }
}
