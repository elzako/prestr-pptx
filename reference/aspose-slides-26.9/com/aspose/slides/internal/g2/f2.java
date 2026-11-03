package com.aspose.slides.internal.g2;

import com.aspose.slides.exceptions.ArgumentException;

public class f2 {
   public final boolean n5(com.aspose.slides.internal.i3.i1[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);
      long var4 = var3.c4();
      if ((var4 & 4294967295L) != 2596720087L) {
         return false;
      }

      var1[0].n5(var4);
      short var6 = var3.k7();
      var1[0].n5(var6);
      com.aspose.slides.internal.k1.m1 var7 = (com.aspose.slides.internal.k1.m1)new com.aspose.slides.internal.s8.q0().n5(var3);
      var1[0].n5(var7);
      int var8 = var3.r4();
      var1[0].n5(var8);
      int var9 = var3.m3();
      if (var9 != 0) {
         throw new ArgumentException("MUST be 0x00000000");
      }

      var1[0].l6(var9);
      short var10 = var3.k7();
      var1[0].l6(var10);
      return true;
   }
}
