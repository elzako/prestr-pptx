package com.aspose.slides.internal.y9r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e2l.h0;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.y5s.a0;

public class n5 extends l6 {
   @Override
   public boolean n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("streamContainer");
      }

      boolean var2 = false;
      byte[] var3 = new byte[2];
      if (var1.l6(var3) == var3.length) {
         var2 = com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) == com.aspose.slides.internal.v6g.k5.u3((byte)33, 6)
            && com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) == com.aspose.slides.internal.v6g.k5.u3((byte)-1, 6);
      }

      return var2;
   }

   @Override
   public h0 n5(a0 var1, com.aspose.slides.internal.j3b.u3 var2) {
      byte[] var3 = com.aspose.slides.internal.e2l.a6.l6(var1, 14);
      if (com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)33, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension introducer is unexpected for gif application extension block.");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)-1, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension label is unexpected for gif application extension block.");
      }

      int var4 = com.aspose.slides.internal.v6g.k5.u3(var3[2], 6);
      if (var4 != com.aspose.slides.internal.v6g.k5.u3((byte)11, 6)) {
         String var5 = j5.e2().l6(var3, 3, 11);
         if (!var5.equals("ICCRGBG1012") || var4 <= 11) {
            throw new com.aspose.slides.internal.g9t.n5("Block size is incorrect for gif application extension block.");
         }

         var1.n5(var4 - 11, 1);
      }

      String var8 = j5.e2().l6(var3, 3, 8);
      byte[] var6 = new byte[3];
      com.aspose.slides.ms.System.u3.n5(var3, 11, var6, 0, 3);
      byte[] var7 = com.aspose.slides.internal.e2l.a6.n5(var1);
      return new com.aspose.slides.internal.v2x.n5(var8, var6, var7);
   }
}
