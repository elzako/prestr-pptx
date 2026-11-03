package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e5f extends b3 {
   private int l6;
   private long k5;
   private List<l4t> u3;
   public static final int n5 = g5x.n5("f");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("recolorstate", "numcolors", "recolorinfoentry");

   public e5f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      e5f$1 var2 = new e5f$1(this);
      n5(var1, var2);
      n5(var1, new e5f$2(this, var1));
   }

   public e5f() {
      this.a6();
   }

   private void a6() {
      this.l6 = n5;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("recolorstate", g5x.n5(this.l6));
      }

      var2.l6("numcolors", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            l4t var5 = (l4t)var4.next();
            var5.n5("ppt", var2, "recolorinfoentry");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final l4t n5() {
      l4t var1 = new l4t();
      this.u3.addItem(var1);
      return var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final l4t[] k5() {
      return this.u3.toArray(new l4t[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(e5f var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(e5f var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(e5f var0) {
      return var0.u3;
   }
}
