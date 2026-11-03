package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.b7s.z6;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f5;
import com.aspose.slides.internal.r1x.v3;

class k5$n5 implements com.aspose.slides.internal.b8u.e2 {
   private final com.aspose.slides.internal.b8u.x8 n5;
   private final com.aspose.slides.internal.v6s.u3 l6;
   private final byte[] k5;
   private final int u3;
   private final k5 a6;

   public k5$n5(k5 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, byte[] var4) {
      this.l6 = var2;
      this.n5 = var3;
      this.k5 = var4;
      this.u3 = var1.c8().y2();
      this.a6 = var1;
   }

   @Override
   public final void n5(y2 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < com.aspose.slides.internal.o9n.k5.n5(this.a6).length; var3++) {
         long var4 = com.aspose.slides.internal.o9n.k5.l6(this.a6)[var3] & 4294967295L;
         com.aspose.slides.internal.p5w.n5 var6 = new com.aspose.slides.internal.p5w.n5();
         var6.n5(f5.n5(this.u3));
         if (this.k5 != null) {
            y0 var7 = new y0(new com.aspose.slides.internal.z0k.e2(this.k5), true);

            try {
               y0 var8 = new y0(new com.aspose.slides.internal.z0k.e2(this.k5), true);

               try {
                  com.aspose.slides.internal.b7s.u3[] var9 = com.aspose.slides.internal.l3e.n5.n5(var7);
                  z6[] var10 = com.aspose.slides.internal.l3e.n5.l6(var8);
                  var6.n5(var9);
                  var6.n5(var10);
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         }

         v3 var43 = this.l6.k5(var4);

         try {
            synchronized (var43.n5()) {
               Object var44 = null;
               if (com.aspose.slides.internal.o9n.k5.k5(this.a6) != null) {
                  var44 = com.aspose.slides.internal.o9n.k5.k5(this.a6).u3();
               }

               var6.n5(var44);
               com.aspose.slides.internal.l1f.k5 var45 = com.aspose.slides.internal.l1f.n5.k5(var43, var6);

               try {
                  if (var45.u3().l6() == 2 && this.a6.c8().y1() == 2) {
                     throw new NotSupportedException("Separate planar configuration is not supported for strips compressed with lossless JPEG.");
                  }

                  y2 var11 = new y2(0, var2, var45.n5(), var45.l6());
                  k5$n5$n5 var12 = new k5$n5$n5(new j5(0, var2), this.n5);
                  if (var11.k5(var1.n3())) {
                     y2 var13 = y2.n5(var11.n3(), var1.n3()).n3();
                     y2 var14 = new y2(var13.s7(), var13.a6().l6() - var2, var13.t2(), var13.l6());
                     var45.u3().l6(var14.n3(), var12);
                  }
               } finally {
                  if (var45.c8() != null && var45.c8().a6() != null) {
                     var45.c8().a6().dispose();
                  }

                  if (var45.h0() != null && var45.h0().l6() != null) {
                     var45.h0().l6().dispose();
                  }
               }

               var2 += var45.l6();
            }
         } finally {
            if (var43 != null) {
               var43.dispose();
            }
         }
      }
   }
}
