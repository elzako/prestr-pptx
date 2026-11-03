package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public abstract class p6r {
   protected long n5;
   protected int l6;
   protected m4d k5;
   protected int u3;
   protected List<c5q> a6 = new List<>();

   protected p6r() {
   }

   public final int n5() {
      return this.l6;
   }

   public final m4d l6() {
      return this.k5;
   }

   public final int k5() {
      return this.u3;
   }

   public final List<c5q> u3() {
      return this.a6;
   }

   public final void n5(long var1, f3c var3) {
      this.n5 = var1 & 4294967295L;
      var3.n5(this.n5 & 4294967295L);
      this.l6 = var3.n3();
      this.k5 = new m4d(var3.n3());
      List var4 = f1s.l6(var3);
      this.u3 = this.k5.l6() ? var3.n3() : 65535;
      this.n5(var4, var3);
   }

   public abstract void n5(List<Integer> var1, f3c var2);

   public static <T extends c5q> T n5(T var0, f3c var1) {
      if ((var0.n5() & 4294967295L) == 0L) {
         throw new r7c("Trying to load table with zero offset");
      }

      var0.n5(var1);
      return (T)var0;
   }
}
