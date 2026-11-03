package com.aspose.slides.internal.f8y;

import java.util.HashMap;

public enum t2 {
   Hidden(1),
   Maximized(3),
   Minimized(2),
   Normal(0);

      // Preserve original obfuscated fields while restoring Enum.name()/valueOf().
      public static final t2 n5 = Hidden;
      public static final t2 l6 = Maximized;
      public static final t2 k5 = Minimized;
      public static final t2 u3 = Normal;
      private static final t2[] h0 = {Hidden, Maximized, Minimized, Normal};


   private int a6;
   private static HashMap<Integer, t2> u9;

   private static synchronized HashMap<Integer, t2> n5() {
      if (u9 == null) {
         u9 = new HashMap<>();
      }

      return u9;
   }

   t2(int var3) {
      this.a6 = var3;
      n5().put(var3, this);
   }
}
