package com.aspose.slides.internal.w9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class e2 {
   public final boolean n5(com.aspose.slides.internal.b9.z3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);
      com.aspose.slides.internal.b9.q0 var4 = new com.aspose.slides.internal.b9.q0(var1[0]);
      var4.l6(var3.c4() & 4294967295L);
      var4.k5(var3.c4() & 4294967295L);
      boolean var6;
      switch ((int)var4.h0()) {
         case -2147483647:
            com.aspose.slides.internal.b9.q0[] var10 = new com.aspose.slides.internal.b9.q0[]{var4};
            var6 = new t4().n5(var10, var2);
            var4 = var10[0];
            break;
         case 2:
            com.aspose.slides.internal.b9.q0[] var9 = new com.aspose.slides.internal.b9.q0[]{var4};
            var6 = new t2().n5(var9, var2);
            var4 = var9[0];
            break;
         case 3:
            com.aspose.slides.internal.b9.q0[] var8 = new com.aspose.slides.internal.b9.q0[]{var4};
            var6 = new n3().n5(var8, var2);
            var4 = var8[0];
            break;
         case 64:
         case 128:
            throw new ArgumentOutOfRangeException("This comment record is reserved and MUST NOT be used in an EMF metafile.");
         case 1073741828:
            com.aspose.slides.internal.b9.q0[] var5 = new com.aspose.slides.internal.b9.q0[]{var4};
            var6 = new y4().n5(var5, var2);
            var4 = var5[0];
            break;
         default:
            throw new ArgumentOutOfRangeException("identefier");
      }

      var1[0] = var4;
      return var6;
   }
}
