package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public abstract class f1s {
   protected long n5;

   protected f1s(long var1) {
      this.n5 = com.aspose.slides.internal.v6g.k5.a6(var1, 11);
   }

   protected f1s(long var1, long var3) {
      if (var3 == 0L) {
         throw new r7c("Trying to load table with zero offset");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.a6(var1 + var3, 11);
   }

   public final long n5() {
      return this.n5;
   }

   public abstract void n5(f3c var1);

   static Dictionary<String, Long> n5(int var0, f3c var1) {
      Dictionary var2 = new Dictionary();

      for (int var3 = 0; var3 < var0; var3++) {
         String var4 = var1.l6(4);
         long var5 = com.aspose.slides.internal.v6g.k5.u9(var1.n3(), 8);
         var2.addItem(var4, var5);
      }

      return var2;
   }

   static List<Integer> l6(f3c var0) {
      int var1 = var0.n3();
      List var2 = new List(com.aspose.slides.internal.v6g.k5.u3(var1, 8));

      for (int var3 = 0; var3 < com.aspose.slides.internal.v6g.k5.k5(var1, 8); var3++) {
         var2.addItem(var0.n3());
      }

      return var2;
   }

   static <T extends f1s> T n5(T var0, f3c var1) {
      if (com.aspose.slides.internal.v6g.k5.a6(var0.n5(), 10) == 0L) {
         throw new r7c("Trying to load table with zero offset");
      }

      var0.n5(var1);
      return (T)var0;
   }
}
