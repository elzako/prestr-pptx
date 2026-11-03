package com.aspose.slides.internal.j7;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.z3;
import com.aspose.slides.ms.System.q1;

public class k5 {
   public static com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.w0.l6 var0) {
      switch (var0.n5()) {
         case 0:
            return n5((com.aspose.slides.internal.w0.n3)var0);
         case 1:
            return n5((com.aspose.slides.internal.w0.a6)var0);
         case 2:
            return n5((com.aspose.slides.internal.w0.y4)var0);
         case 3:
            return n5((com.aspose.slides.internal.w0.h0)var0);
         case 4:
            return n5((com.aspose.slides.internal.w0.t2)var0);
         default:
            throw new InvalidOperationException("Unknown brush type.");
      }
   }

   private static com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.w0.t2 var0) {
      com.aspose.slides.internal.m2.l6 var1 = new com.aspose.slides.internal.m2.l6();
      var1.l6(var0.u9());
      m3 var2 = new m3(var1.l6());
      var2.n5(var0.h0().u3());
      if (var0.t2() != null) {
         var2.n5(var0.t2().n5().o8());
      }

      var2.u3(c8.n5(var0.n3()));
      var2.n5(var0.y4());
      if (var0.u3() != null) {
         var2.n5(n5((com.aspose.slides.internal.w0.u3)var0));
      }

      if (var0.l6() != null) {
         var2.n5(n5(var0, true));
      }

      if (var0.c8() != null) {
         com.aspose.slides.internal.o9b.c8[] var3 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var0.c8().length)
         );

         for (int var4 = 0; var4 < var0.c8().length; var4++) {
            com.aspose.slides.internal.p1s.n5 var5 = var0.c8()[var4];
            var5.n5().n5(var3[var4]);
         }

         var2.n5(var3);
      }

      return var2;
   }

   private static com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.w0.h0 var0) {
      z3 var4;
      if (!var0.s7().n5() && !var0.x8().n5()) {
         w1 var5 = var0.s7().u3();
         w1 var6 = var0.x8().u3();
         if (q1.n5(var5.l6() - var6.l6()) < 0.001F && q1.n5(var5.k5() - var6.k5()) < 0.001F) {
            float var3 = 0.1F;
            var6 = new w1(var6.l6() + var3, var6.k5());
         }

         var4 = new z3(var5.u3(), var6.u3(), var0.u9().n5().o8(), var0.h0().n5().o8());
         var4.k5(new m1());
      } else if (!(q1.n5(var0.a6().k5()) < 0.5) && !(q1.n5(var0.a6().s7()) < 0.5)) {
         var4 = new z3(var0.a6().y4(), var0.u9().n5().o8(), var0.h0().n5().o8(), (float)var0.t2(), var0.c8());
      } else {
         w1 var1 = var0.a6().u9().u3();
         w1 var2 = new w1(var1.l6() + var0.a6().s7(), var1.k5() + var0.a6().k5());
         var4 = new z3(var1.u3(), var2.u3(), var0.u9().n5().o8(), var0.h0().n5().o8());
      }

      var4.u3(c8.n5(var0.n3()));
      var4.n5(var0.y4());
      if (var0.u3() != null) {
         var4.n5(n5((com.aspose.slides.internal.w0.u3)var0));
      }

      if (var0.l6() != null) {
         var4.n5(n5(var0, false));
      }

      return var4;
   }

   private static com.aspose.slides.internal.x4g.a6 n5(com.aspose.slides.internal.w0.u3 var0, boolean var1) {
      com.aspose.slides.internal.o9b.c8[] var2 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var0.l6().length)
      );
      float[] var3 = new float[var0.l6().length];

      for (int var4 = 0; var4 < var0.l6().length; var4++) {
         var0.l6()[var4].n5().n5().n5(var2[var4]);
         var3[var4] = var0.l6()[var4].l6();
      }

      com.aspose.slides.internal.x4g.a6 var5 = new com.aspose.slides.internal.x4g.a6();
      var5.n5(var2);
      var5.n5(var3);
      return var5;
   }

   private static com.aspose.slides.internal.x4g.u3 n5(com.aspose.slides.internal.w0.u3 var0) {
      com.aspose.slides.internal.x4g.u3 var1 = new com.aspose.slides.internal.x4g.u3();
      var1.n5(var0.u3());
      var1.l6(var0.k5());
      return var1;
   }

   private static com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.w0.y4 var0) {
      com.aspose.slides.internal.j9e.t2 var1 = new com.aspose.slides.internal.j9e.t2();
      n5(var0, var1);
      l6(var0, var1);
      t4 var2 = var0.u9();
      y1 var3 = n5(var0, var2).y4();
      u6 var4 = new u6(var2, var3.y4(), var1);

      try {
         var4.k5(c8.n5(var0.n3()));
      } catch (RuntimeException var6) {
      }

      var4.n5(var0.y4());
      return var4;
   }

   private static void n5(com.aspose.slides.internal.w0.y4 var0, com.aspose.slides.internal.j9e.t2 var1) {
      if (var0.u3() != null) {
         com.aspose.slides.internal.j9e.l6[] var2 = new com.aspose.slides.internal.j9e.l6[var0.u3().length / 2];

         for (int var3 = 0; var3 < var2.length; var3++) {
            com.aspose.slides.internal.j9e.l6 var4 = new com.aspose.slides.internal.j9e.l6();
            var4.l6(var0.u3()[var3 * 2].n5().o8());
            var4.n5(var0.u3()[var3 * 2 + 1].n5().o8());
            var2[var3] = var4;
         }

         var1.n5(var2);
      }
   }

   private static void l6(com.aspose.slides.internal.w0.y4 var0, com.aspose.slides.internal.j9e.t2 var1) {
      if (var0.k5() != -Float.MAX_VALUE) {
         com.aspose.slides.internal.j9e.k5 var2 = new com.aspose.slides.internal.j9e.k5();
         var2.n5(3, 3, var0.k5());
         var1.n5(var2, 0, 1);
      }
   }

   private static y1 n5(com.aspose.slides.internal.w0.y4 var0, t4 var1) {
      return y1.k5(var0.a6(), y1.n5) ? new y1(0.0F, 0.0F, var1.e2(), var1.h0()) : var0.a6();
   }

   private static com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.w0.a6 var0) {
      return new com.aspose.slides.internal.x4g.n3(var0.l6(), var0.k5().n5().o8(), var0.u3().n5().o8());
   }

   private static com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.w0.n3 var0) {
      return new i1(var0.l6().n5().o8());
   }
}
