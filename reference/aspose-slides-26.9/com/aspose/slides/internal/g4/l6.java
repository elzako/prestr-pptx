package com.aspose.slides.internal.g4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;

public class l6 {
   public static t2 n5(com.aspose.slides.internal.z2.k5 var0, m1 var1) {
      com.aspose.slides.internal.m5.h0 var2 = var0.n5();
      if (var2.n5() == 2 && com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.m5.n5.class)) {
         com.aspose.slides.internal.m5.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.m5.n5.class);
         com.aspose.slides.internal.v2.n5 var4 = var3.l6();
         w1[] var5 = new w1[]{new w1(var4.u3(0), var4.u3(1)), new w1(var4.u3(2), var4.u3(3))};
         var1.n5(var5);
         com.aspose.slides.internal.j0.l6 var6 = var3.a6();
         com.aspose.slides.internal.v2.n5 var7 = var3.k5();
         return new t2(var5[0].u3(), var5[1].u3(), var6, var7);
      } else {
         return null;
      }
   }

   public static n3 l6(com.aspose.slides.internal.z2.k5 var0, m1 var1) {
      com.aspose.slides.internal.m5.h0 var2 = var0.n5();
      if (var2.n5() == 3 && com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.m5.t2.class)) {
         com.aspose.slides.internal.m5.t2 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.m5.t2.class);
         com.aspose.slides.internal.v2.k5 var4 = (com.aspose.slides.internal.v2.k5)var0.t2();
         com.aspose.slides.internal.v2.s7 var5 = var4.u9(com.aspose.slides.internal.v2.c8.e6);
         m1 var6 = com.aspose.slides.internal.t8.u3.n5(var5);
         com.aspose.slides.internal.v2.n5 var7 = var3.l6();
         w1[] var8 = new w1[]{new w1(var7.u3(0), var7.u3(1)), new w1(var7.u3(3), var7.u3(4))};
         var6.n5(var8);
         var1.n5(var8);
         float var9 = var7.u3(2) * var6.n5()[0];
         float var10 = var7.u3(5) * var6.n5()[0];
         com.aspose.slides.internal.j0.l6 var11 = var3.a6();
         com.aspose.slides.internal.v2.n5 var12 = var3.k5();
         return new n3(var8[0].u3(), var9, var8[1].u3(), var10, var11, var12);
      } else {
         return null;
      }
   }

   public static com.aspose.slides.internal.l9.u3 n5(com.aspose.slides.internal.z2.u3 var0) {
      com.aspose.slides.internal.e7.t2 var1 = var0.n5();
      Dictionary var2 = var1.h0();
      com.aspose.slides.internal.l9.h0 var3 = null;
      Dictionary$ValueCollection$Enumerator var4 = var2.getValues().iterator();

      try {
         if (var4.hasNext()) {
            var3 = (com.aspose.slides.internal.l9.h0)var4.next();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.l9.u3.class)
         ? com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.l9.u3.class)
         : null;
   }

   public static List<com.aspose.slides.internal.o9b.c8> n5(float[] var0, com.aspose.slides.internal.j0.l6 var1) {
      List var2 = new List(var0.length);

      for (float var6 : var0) {
         float[] var7 = var1.n5(new float[]{var6});
         com.aspose.slides.internal.o9b.c8 var8 = com.aspose.slides.internal.o9b.c8.n5(
               255,
               com.aspose.slides.internal.v6g.k5.u3(var7[0] * 255.0F, 13),
               com.aspose.slides.internal.v6g.k5.u3(var7[1] * 255.0F, 13),
               com.aspose.slides.internal.v6g.k5.u3(var7[2] * 255.0F, 13)
            )
            .o8();
         var2.addItem(var8.o8());
      }

      return var2;
   }
}
