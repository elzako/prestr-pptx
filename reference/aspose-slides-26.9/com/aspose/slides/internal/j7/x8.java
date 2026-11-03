package com.aspose.slides.internal.j7;

import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;

public class x8 {
   private static final m1 n5 = new m1();

   public static a0 n5(com.aspose.slides.internal.z0k.n5 var0) {
      long var1 = var0.c4();
      long var3 = var0.c4();
      long var5 = var0.c4();
      var0.c4();
      l6(var0);
      com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();

      for (int var8 = 0; var8 < (var5 & 4294967295L); var8++) {
         var7.l6(l6(var0).y4());
      }

      return new a0(var7);
   }

   private static y1 l6(com.aspose.slides.internal.z0k.n5 var0) {
      int var1 = var0.m3();
      int var2 = var0.m3();
      int var3 = var0.m3();
      int var4 = var0.m3();
      return y1.n5(var1, var2, var3, var4);
   }

   public static r4 n5(a0 var0) {
      r4 var1 = new r4();
      com.aspose.slides.internal.x4g.s7 var2 = com.aspose.slides.internal.x4g.s7.n5((Object)(var0));
      if (com.aspose.slides.internal.r5w.n5.n5(var2)) {
         var1.n5(c4.n5(var2.a6(), true));
      }

      return var1;
   }
}
