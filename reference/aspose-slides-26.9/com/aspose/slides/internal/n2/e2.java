package com.aspose.slides.internal.n2;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class e2 {
   public final boolean n5(com.aspose.slides.internal.b9.z3 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.b9.q0 var3 = (com.aspose.slides.internal.b9.q0)var1;
      var2.n5(var3.u9() & 4294967295L);
      var2.n5(var3.h0() & 4294967295L);
      boolean var4;
      switch ((int)var3.h0()) {
         case -2147483647:
            var4 = new z1().n5(var3, var2);
            break;
         case 2:
            var4 = new t2().n5(var3, var2);
            break;
         case 3:
            var4 = new n3().n5(var3, var2);
            break;
         case 64:
         case 128:
            throw new ArgumentOutOfRangeException("This comment record is reserved and MUST NOT be used in an EMF metafile.");
         case 1073741828:
            var4 = new y4().n5(var3, var2);
            break;
         default:
            throw new ArgumentOutOfRangeException("identefier");
      }

      return var4;
   }
}
