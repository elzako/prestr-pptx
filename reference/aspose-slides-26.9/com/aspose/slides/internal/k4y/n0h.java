package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n0h extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private long u3;
   private String a6;
   private String u9;
   private List<d0n> h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "name", "locked", "hidden", "count", "user", "comment", "inputCells"
   );

   public n0h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n0h$1 var2 = new n0h$1(this);
      n5(var1, var2);
      n5(var1, new n0h$2(this, var1));
   }

   public n0h() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = 4294967295L;
      this.h0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      if (this.l6) {
         var2.l6("locked", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("hidden", this.k5 ? "1" : "0");
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("user", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("comment", this.u9);
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            d0n var5 = (d0n)var4.next();
            var5.n5("ssml", var2, "inputCells");
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
      return c8;
   }

   // $VF: synthetic method
   static String n5(n0h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n0h var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n0h var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(n0h var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(n0h var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(n0h var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(n0h var0) {
      return var0.h0;
   }
}
