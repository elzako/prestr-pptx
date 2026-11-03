package com.aspose.slides.internal.l7h;

import java.util.concurrent.atomic.AtomicReference;

public abstract class t2 {
   private static AtomicReference<t2> n5 = new AtomicReference<>();
   private static AtomicReference<t2> l6 = new AtomicReference<>();

   public static t2 k5() {
      t2 var0 = n5.get();
      if (var0 != null) {
         return var0;
      }

      n5.set(new n3());
      t2 var1 = n5.get();
      return var1 != null ? var1 : n5.get();
   }

   public static t2 u3() {
      t2 var0 = l6.get();
      if (var0 != null) {
         return var0;
      }

      l6.set(new h0());
      t2 var1 = l6.get();
      return var1 != null ? var1 : l6.get();
   }

   public abstract s7 n5();

   public abstract int l6();
}
