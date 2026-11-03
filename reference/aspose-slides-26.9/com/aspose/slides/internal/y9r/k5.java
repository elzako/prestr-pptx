package com.aspose.slides.internal.y9r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e2l.h0;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.y5s.a0;

public class k5 extends l6 {
   @Override
   public boolean n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("streamContainer");
      }

      boolean var2 = false;
      byte[] var3 = new byte[2];
      if (var1.l6(var3) == var3.length) {
         var2 = com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) == com.aspose.slides.internal.v6g.k5.u3((byte)33, 6)
            && com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) == com.aspose.slides.internal.v6g.k5.u3((byte)-2, 6);
      }

      return var2;
   }

   @Override
   public h0 n5(a0 var1, com.aspose.slides.internal.j3b.u3 var2) {
      byte[] var3 = com.aspose.slides.internal.e2l.a6.l6(var1, 2);
      if (com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)33, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension introducer is unexpected for gif comment block.");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)-2, 6)) {
         throw new com.aspose.slides.internal.g9t.n5("Extension label is unexpected for gif comment block.");
      }

      byte[] var4 = com.aspose.slides.internal.e2l.a6.n5(var1);
      String var5 = j5.e2().l6(var4, 0, var4.length);
      return new com.aspose.slides.internal.v2x.l6(var5);
   }
}
