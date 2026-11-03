package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l2h extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private long u3;
   private List<z2v> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("name", "pivot", "table", "count", "tableStyleElement");

   public l2h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      l2h$1 var2 = new l2h$1(this);
      n5(var1, var2);
      n5(var1, new l2h$2(this, var1));
   }

   public l2h() {
      this.u3();
   }

   private void u3() {
      this.l6 = true;
      this.k5 = true;
      this.u3 = 4294967295L;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      if (!this.l6) {
         var2.l6("pivot", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("table", this.k5 ? "1" : "0");
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            z2v var5 = (z2v)var4.next();
            var5.n5("ssml", var2, "tableStyleElement");
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

   public final z2v[] l6() {
      return this.a6.toArray(new z2v[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(l2h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l2h var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l2h var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(l2h var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(l2h var0) {
      return var0.a6;
   }
}
