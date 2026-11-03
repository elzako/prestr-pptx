package com.aspose.slides.internal.c4z;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.d3v.a6;
import com.aspose.slides.internal.d3v.u3;
import com.aspose.slides.internal.d3v.u9;
import com.aspose.slides.internal.u2w.k5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class n5 {
   public static k5 n5(com.aspose.slides.internal.f2i.n5 var0, int var1, int var2) {
      k5 var3;
      switch (var0.m3()) {
         case 1:
            var3 = new com.aspose.slides.internal.j6e.k5(var0, var1, var2);
            break;
         case 2:
         case 3:
         case 4:
            var3 = new com.aspose.slides.internal.d3v.k5(var0, var1, var2);
            break;
         case 5:
            a6 var4 = new a6(var0, var1, var2);
            var4.k5(var0.o0());
            var4.a6(var0.s3() & 65535);
            var4.n5(var0.k7()[0] & 65535);
            var4.u3(var1 * (var0.s3() & 65535));
            var4.l6(8);
            var3 = var4;
            break;
         case 6:
         case 7:
            var3 = new u3(var0, var1, var2);
            break;
         case 8:
         case 32946:
            boolean var5 = true;
            com.aspose.slides.internal.j6e.l6 var6 = new com.aspose.slides.internal.j6e.l6(var0, var1, var2, true);
            var6.k5(var0.s3() & 65535);
            var6.n5(var0.k7()[0] & 65535);
            var6.l6(var1 * (var0.s3() & 65535));
            var3 = var6;
            break;
         case 32773:
            var3 = new u9(var0, var1, var2);
            break;
         default:
            throw new ArgumentOutOfRangeException(d1.n5(new String[]{"codec not supported - Codec #", s3.n5(com.aspose.slides.internal.w2a.a6.class, var0.m3())}));
      }

      return var3;
   }
}
