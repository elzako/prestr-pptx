package com.aspose.slides.internal.k0t;

import com.aspose.slides.internal.v6g.c8;

public class n5 {
   private final byte[] n5;
   private final byte[] l6;
   private int k5;
   private static final c8<n5> u3 = new c8<>(null);

   private n5(int var1, int var2) {
      this.n5 = new byte[var1];
      this.l6 = new byte[var2];
   }

   public static n5 n5(int var0, int var1) {
      if (u3.get() == null) {
         u3.set(new n5(var0, var1));
      }

      return u3.get();
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }
}
