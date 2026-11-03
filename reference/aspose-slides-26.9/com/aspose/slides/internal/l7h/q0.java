package com.aspose.slides.internal.l7h;

import java.util.concurrent.atomic.AtomicReference;

public abstract class q0 {
   private static AtomicReference<q0> n5 = new AtomicReference<>();
   private static AtomicReference<q0> l6 = new AtomicReference<>();

   public static q0 k5() {
      if (n5.get() == null) {
         n5.set(new m3());
      }

      return n5.get();
   }

   public static q0 u3() {
      if (l6.get() == null) {
         l6.set(new z1());
      }

      return l6.get();
   }

   public abstract z3 n5();

   public abstract int l6();
}
