package com.aspose.slides.internal.w4w;

import java.util.HashMap;

public abstract class n5 {
   private static HashMap<Class, n5> n5 = new HashMap<>();
   private static n5 l6 = new n5$c8(null);

   public abstract int n5(Object var1);

   public abstract Object n5(Object var1, int var2);

   public abstract void n5(Object var1, int var2, Object var3);

   public static n5 n5(Class var0) {
      n5 var1 = n5.get(var0);
      return var1 == null ? l6 : var1;
   }

   public static n5 n5() {
      return l6;
   }

   static {
      n5.put(byte.class, new n5$l6(null));
      n5.put(short.class, new n5$t2(null));
      n5.put(int.class, new n5$u9(null));
      n5.put(long.class, new n5$h0(null));
      n5.put(char.class, new n5$k5(null));
      n5.put(float.class, new n5$a6(null));
      n5.put(double.class, new n5$u3(null));
      n5.put(boolean.class, new n5$n5(null));
   }
}
