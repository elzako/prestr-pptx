package com.aspose.slides.internal.f5n;

import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.d0e.s7;
import com.aspose.slides.internal.d8v.a6;
import com.aspose.slides.internal.l5.t2;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.ms.System.q1;

public class n5 {
   public static void n5(com.aspose.slides.internal.w9s.u3 var0, com.aspose.slides.internal.d8v.k5 var1, f2 var2) {
      y1 var3 = var1.n5(var0.a6(), var2.a6()).y4();
      if (!var3.u3()) {
         byte[] var4 = var1.n5(var0.l6());
         if (var4 != null) {
            if (var1.f2()) {
               e2 var5 = new e2(var4);

               try {
                  m3 var6 = new m3(var5, j5.z3());

                  try {
                     String var7 = var6.c8();
                     com.aspose.slides.internal.w9s.k5 var8 = new com.aspose.slides.internal.w9s.k5(var0.l6(), var0.k5());
                     s7 var9 = var8.l6(var7);
                     a6 var10 = var9.n5();
                     var10.u3(com.aspose.slides.internal.b3z.a6.l6(100.0F));
                     var10.a6(com.aspose.slides.internal.b3z.a6.l6(100.0F));
                     var10.l6(com.aspose.slides.internal.b3z.a6.k5(0.0F));
                     var10.k5(com.aspose.slides.internal.b3z.a6.k5(0.0F));
                     if (!var1.i1().n5()) {
                        var10.n5((String)null);
                        var10.c8(null);
                        var10.n5(var1.i1());
                     }

                     e2 var11 = var8.n5(
                        var7, var9, com.aspose.slides.internal.v6g.k5.u3(var3.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13), 1.0F
                     );
                     t4 var12 = t4.n5(var11);
                     n5(var12, var0, var1, var3.y4());
                  } finally {
                     if (var6 != null) {
                        var6.dispose();
                     }
                  }
               } finally {
                  if (var5 != null) {
                     var5.dispose();
                  }
               }
            } else {
               e2 var28 = new e2(var4);

               try {
                  t4 var29 = t4.n5(var28);
                  n5(var29, var0, var1, var3.y4());
               } finally {
                  if (var28 != null) {
                     var28.dispose();
                  }
               }
            }
         }
      }
   }

   private static void n5(t4 var0, com.aspose.slides.internal.w9s.u3 var1, com.aspose.slides.internal.d8v.k5 var2, y1 var3) {
      y1 var4 = new y1(0.0F, 0.0F, var0.e2(), var0.h0());
      y1 var5 = y4.n5(var2.i1(), var4.y4(), var3.y4()).y4();
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.l6(var3.y4());
      a0 var7 = var1.n5().l6();
      int var8 = var1.n5().u3();

      try {
         var1.n5().l6(3);
         var1.n5().n5(var3.y4(), 1);
         float var9 = var2.u3();
         t2 var10 = new t2();
         com.aspose.slides.internal.j9e.k5 var11 = new com.aspose.slides.internal.j9e.k5(
            new float[][]{
               {var9, 0.0F, 0.0F, 0.0F, 0.0F},
               {0.0F, var9, 0.0F, 0.0F, 0.0F},
               {0.0F, 0.0F, var9, 0.0F, 0.0F},
               {0.0F, 0.0F, 0.0F, var9, 0.0F},
               {0.0F, 0.0F, 0.0F, 0.0F, var9}
            }
         );
         var10.n5(var11);
         y2 var12 = new y2(
            com.aspose.slides.internal.v6g.k5.u3(q1.u3(var5.x8()), 14),
            com.aspose.slides.internal.v6g.k5.u3(q1.u3(var5.n3()), 14),
            com.aspose.slides.internal.v6g.k5.u3(q1.u3(var5.s7()), 14),
            com.aspose.slides.internal.v6g.k5.u3(q1.u3(var5.k5()), 14)
         );
         var1.n5().n5(new com.aspose.slides.internal.l5.u3(var0), var12.n3(), 0.0F, 0.0F, var4.s7(), var4.k5(), 2, var10);
      } finally {
         var1.n5().l6(var8);
         var1.n5().n5(var7, 0);
      }
   }
}
