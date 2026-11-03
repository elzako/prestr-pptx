package com.aspose.slides.internal.d4;

import com.aspose.slides.internal.v6g.k5;

public class n5 {
   public static <T> T[] n5(Class<T> var0, T[] var1, T var2) {
      Object[] var3 = (Object[])k5.n5(var0, new int[]{var1.length + 1});
      System.arraycopy(var1, 0, var3, 0, var1.length);
      var3[var1.length] = var2;
      return (T[])var3;
   }

   public static <T> T[] n5(Class<T> var0, T[] var1, T[] var2) {
      Object[] var3 = (Object[])k5.n5(var0, new int[]{var1.length + var2.length});
      System.arraycopy(var1, 0, var3, 0, var1.length);
      System.arraycopy(var2, 0, var3, var1.length + 0, var2.length);
      return (T[])var3;
   }
}
