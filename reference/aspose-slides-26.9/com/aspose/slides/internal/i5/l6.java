package com.aspose.slides.internal.i5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.c5.e2;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o1.u3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r6.k5;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.w0.y4;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;
import com.aspose.slides.ms.System.x9;

public class l6 extends com.aspose.slides.internal.o1.l6 {
   private u9 u9;

   public l6(com.aspose.slides.internal.d9.n5 var1, u3 var2) {
      super(var1, var2);
      com.aspose.slides.internal.r6.n5 var3 = new com.aspose.slides.internal.r6.n5();
      this.u9 = new u9(var3);
      this.u9.h0 = new l6$1(this);
      this.u9.n5(new k5(var1.x8().n5().x8() & 65535));
      this.u9.t4().n5(0L, var1);
   }

   @Override
   protected void n5(m1 var1, u9 var2) {
      t2 var3 = var2.n5();
      var2.n5(new com.aspose.slides.internal.o9b.l6(1, 1));
   }

   public final t2 n5(f2 var1, y1 var2) {
      t2 var3 = new t2();
      m1 var4 = new m1();
      var4.n5(var1.l6() / var2.s7(), var1.k5() / var2.k5());
      var4.l6(-this.l6().E_(), -this.l6().F_(), 0);
      var3.n5(com.aspose.slides.internal.p1.n5.n5(var4));
      t2 var5 = new t2();
      var3.n5(var5);
      this.n5(var5, var4);
      return var3;
   }

   @Override
   public void n5(Object var1, m1 var2) {
      this.u9.n5(this.k5());
      this.u9.n5(var1);
      this.n5(var2, this.u9);
      IGenericEnumerator var3 = this.l6().n5().iterator();

      try {
         while (var3.hasNext()) {
            s9 var4 = (s9)var3.next();
            if (!com.aspose.slides.internal.u7.l6.n5(var4, this.u9)) {
               throw new com.aspose.slides.internal.p5.n5(d1.n5(new String[]{"Player for ", s3.n5(e2.class, var4.c4()), " was not found."}));
            }

            if (var4.c4() == 14L) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (this.u9.z7() != null) {
         this.u9.z7().dispose();
         this.u9.n5((com.aspose.slides.internal.o9b.l6)null);
      }
   }

   private static void l6(u9 var0, long var1, y2 var3, byte[] var4) {
      if (var0 != null) {
         if (var4 != null && var4.length != 0) {
            com.aspose.slides.internal.o9b.l6 var5 = null;
            com.aspose.slides.internal.o9b.l6 var6 = null;

            try {
               com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2(var4);

               try {
                  var5 = new com.aspose.slides.internal.o9b.l6(var7);
               } finally {
                  if (var7 != null) {
                     var7.dispose();
                  }
               }

               var6 = n5(var5, (int)var1);
               if (var6 != null) {
                  com.aspose.slides.internal.z0k.e2 var9 = new com.aspose.slides.internal.z0k.e2();

                  byte[] var8;
                  try {
                     var6.n5(var9, x8.s7());
                     var8 = var9.toArray();
                  } finally {
                     if (var9 != null) {
                        var9.dispose();
                     }
                  }

                  y4 var10 = new y4(var8, 0);
                  r4 var11 = r4.n5(y1.n5(var3).y4());
                  var11.n5(var10);
                  t2 var12 = new t2();
                  var12.n5(var11);
                  var12.n5(com.aspose.slides.internal.p1.n5.n5(var0.x9()));
                  var0.<n3>n5().n5(var12);
                  return;
               }
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }

               if (var5 != null) {
                  var5.dispose();
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      if (var0.s7() != 196865) {
         return null;
      }

      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0(), 2498570);
      com.aspose.slides.internal.j9e.n5 var3 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, 196865);
      com.aspose.slides.internal.j9e.n5 var4 = var2.n5(new y2(0, 0, var2.e2(), var2.h0()), 2, 2498570);
      long var5 = var3.u3().l6();
      long var7 = var4.u3().l6();
      int var9 = var3.a6();
      int var10 = var4.a6();
      byte[] var11 = new byte[var9];
      int[] var12 = new int[var4.l6()];

      for (int var13 = 0; var13 < var0.h0(); var13++) {
         com.aspose.slides.internal.e3m.n5.n5(new x9(var5), var11, 0, var11.length);
         com.aspose.slides.internal.e3m.n5.n5(new x9(var7), var12, 0, var12.length);

         for (int var14 = 0; var14 < var0.e2(); var14++) {
            int var15 = (var11[var14 >> 3] & 255) >> 7 - (var14 & 7) & 1;
            int var16 = var15 == 1 ? -1 : 33554431;
            var12[var14] = var1 & var16;
         }

         com.aspose.slides.internal.e3m.n5.n5(var12, 0, new x9(var7), var12.length);
         var5 += var9;
         var7 += var10;
      }

      var0.n5(var3);
      var2.n5(var4);
      return var2;
   }

   // $VF: synthetic method
   static void n5(u9 var0, long var1, y2 var3, byte[] var4) {
      l6(var0, var1, var3, var4);
   }
}
