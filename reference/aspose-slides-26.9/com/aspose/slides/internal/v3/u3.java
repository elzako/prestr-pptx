package com.aspose.slides.internal.v3;

public class u3 {
   public static boolean n5(Object var0, Object var1) {
      return var0 == null ? var1 == null : var0 == var1 || var0.equals(var1);
   }

   public static int n5(Object var0) {
      return var0 == null ? 0 : var0.hashCode();
   }

   public static boolean n5(double var0, double var2) {
      return com.aspose.slides.ms.System.x8.l6(var0) == com.aspose.slides.ms.System.x8.l6(var2);
   }

   public static int n5(double var0) {
      long var2 = com.aspose.slides.ms.System.x8.l6(var0);
      return (int)(var2 ^ var2 >> 32);
   }
}
