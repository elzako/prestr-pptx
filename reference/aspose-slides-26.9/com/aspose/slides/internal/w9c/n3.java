package com.aspose.slides.internal.w9c;

import com.aspose.slides.internal.o9b.w1;

public class n3 {
   public static x8 n5(
      float var0, boolean var1, int var2, int var3, com.aspose.slides.internal.e6q.u3 var4, w1 var5, w1 var6, w1 var7, w1 var8, w1 var9, w1 var10
   ) {
      switch (var2) {
         case 0:
         case 16:
         case 240:
         case 255:
            return new s7();
         case 1:
            return new q0(var1, var0, var4, var5, var6, var7, var8);
         case 2:
            return new t9(var1, var0, var4, var5, var6, var7, var8, var9, var10, var3);
         case 3:
            return new z3(var1, var0, var4, var5, var6, var7, var8);
         case 17:
            return var1 ? new t4(var0, var4, var5, var6, var7, var8) : new z1(var0, var4, var5, var6, var7, var8);
         case 18:
            return var1 ? new e2(var0, var4, var5, var6, var7, var8) : new y4(var0, var4, var5, var6, var7, var8);
         case 19:
            return var1 ? new t2(var0, var4, var5, var6, var7, var8) : new c8(var0, var4, var5, var6, var7, var8);
         case 20:
            return var1 ? new h0(var0, var4, var5, var6, var7, var8) : new u9(var0, var4, var5, var6, var7, var8);
         default:
            throw new IllegalArgumentException("Undefined cap " + var2);
      }
   }
}
