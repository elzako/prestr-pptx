package com.aspose.slides.internal.y9r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e2l.h0;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.ms.System.x8;

public class a6 extends l6 {
   @Override
   public boolean n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("streamContainer");
      }

      boolean var2 = false;
      byte[] var3 = new byte[2];
      if (var1.l6(var3) == var3.length) {
         var2 = com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) == 33 && com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) == 249;
      }

      return var2;
   }

   @Override
   public h0 n5(a0 var1, com.aspose.slides.internal.j3b.u3 var2) {
      byte[] var3 = com.aspose.slides.internal.e2l.a6.l6(var1, 8);
      if (com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)33, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension introducer is unexpected for graphics control block.");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)-7, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension label is unexpected for graphics control block.");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var3[2], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)4, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension block size is unexpected for graphics control block.");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var3[7], 6) != 0) {
         throw new com.aspose.slides.internal.g9t.n5("Extension block terminator value is unexpected for graphics control block.");
      }

      byte var4 = var3[3];
      int var5 = x8.n5(var3, 4);
      byte var6 = var3[6];
      return new com.aspose.slides.internal.v2x.u3(var4, var5, var6);
   }
}
