package com.aspose.slides.internal.w9;

import com.aspose.slides.exceptions.InvalidDataException;

public class f2 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.b9.v4 var3 = new com.aspose.slides.internal.b9.v4(var0[0]);
      var3.n5(var2.c4());
      var3.l6(var2.c4() & 4294967295L);
      if ((var3.n5() & 4294967295L) > 0L) {
         long var4 = var2.x8().getPosition();
         var3.n5((com.aspose.slides.internal.t5.m1)new com.aspose.slides.internal.m8.t4().n5(var2));
         int var6 = (int)(var2.x8().getPosition() - var4);
         if (var6 != (var3.n5() & 4294967295L)) {
            throw new InvalidDataException();
         }
      }

      var0[0] = var3;
      return true;
   }
}
