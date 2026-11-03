package com.aspose.slides.internal.l6j;

class a6 {
   public static n5 n5(Object var0, int var1, int var2) {
      if (var0 == null || var1 < 0 || var2 < 0) {
         return new k5(var1, var2);
      } else if (var0 instanceof byte[]) {
         return new u9((byte[])var0, var1, var2);
      } else if (var0 instanceof short[]) {
         return new s7((short[])var0, var1, var2);
      } else if (var0 instanceof int[]) {
         return new h0((int[])var0, var1, var2);
      } else {
         return var0 instanceof long[] ? new c8((long[])var0, var1, var2) : new t2<>(var0, var1, var2);
      }
   }
}
