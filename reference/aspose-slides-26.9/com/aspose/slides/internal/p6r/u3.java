package com.aspose.slides.internal.p6r;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.b7s.j9;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b8u.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.n5p.h0;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.a6;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.m1;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.t4;
import java.awt.image.BufferedImage;

public class u3 extends n5<com.aspose.slides.internal.a4s.n5> implements e2 {
   public u3(com.aspose.slides.internal.a4s.n5 var1, t9 var2, z6 var3, m1 var4, d2 var5, q0 var6, BufferedImage var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public final void n5(y2 var1) {
      try {
         com.aspose.slides.internal.b7s.t9 var2 = this.u3.c8();
         synchronized (var2.n3().n5()) {
            var2.n3().h0();
            this.u3.n5(this);
            this.u3.n5(var2.n3(), var1.n3(), -1, -1, -1, false);
            this.u3.u9();
            y2.n5(new y2(0, 0, var2.u3().c8() & 65535, var2.u3().t2() & 65535), var1.n3()).u3(var1);
            int var4 = com.aspose.slides.internal.n5p.h0.k5(var2.u3().c8() & 65535, 8 * var2.u3().u3());
            int var5 = 8 * var2.u3().h0();
            int var6 = com.aspose.slides.internal.n5p.h0.n5(var2.u3().t2() & 65535, var5) - 1;
            int var7 = var1.c8();
            int var8 = var1.n5();
            int var9 = var1.c8() / var5;
            int var10 = com.aspose.slides.internal.n5p.h0.n5(var1.n5(), var5) - 1;
            int var11 = var10;
            int var12 = var10 - var9 + 1;
            y2 var13 = new y2();

            while (var7 < var1.n5()) {
               try {
                  var13.k5(var1.u3());
                  var13.u3(var7);
                  var13.l6(var1.t2());
                  var13.n5(var8 - var7);
                  if (com.aspose.slides.internal.r1x.a6.n5() > 0) {
                     long var14 = this.n5(var9, var10, var6, var4, var5, var13.n3());
                     if (var14 > com.aspose.slides.internal.r1x.a6.n5()) {
                        if (var9 != var10) {
                           throw new OutOfMemoryException();
                        }

                        t4.n5(
                           "WARNING: The memory limit {0} bytes is not enough to allocate a JPEG DCT processing buffer {1}x{2} and related structures which require {3} bytes.",
                           com.aspose.slides.internal.r1x.a6.n5(),
                           var4,
                           var5,
                           var14
                        );
                     }
                  }

                  this.n5 = new y2(0, var9 * var5, var4, var12 * var5);
                  var13.u3(this.l6);
                  this.n5(var12, var4, var5);
                  this.u3.n5(var9, var10, var6, var13.n3());
               } catch (OutOfMemoryError var23) {
                  if (this.u3.n5() != null) {
                     for (int var17 = 0; var17 < var2.u3().l6().length; var17++) {
                        if (this.u3.n5()[var17] != null) {
                           this.u3.n5()[var17] = null;
                        }
                     }
                  }

                  if (var12 <= 1) {
                     throw var23;
                  }

                  var12 >>= 1;
                  var10 = var9 + var12 - 1;
                  com.aspose.slides.internal.f8y.n5.n5(var10 <= var11);
                  var8 = q1.l6((var10 + 1) * var5, var1.n5());
                  continue;
               }

               var7 = var8;
               if (var7 < var1.n5()) {
                  var9 = var7 / var5;
                  var10 = var9 + var12 - 1;
                  if (var10 > var11) {
                     var10 = var11;
                     var12 = var11 - var9 + 1;
                  }

                  var8 = q1.l6((var10 + 1) * var5, var1.n5());
               }
            }
         }
      } finally {
         this.u3.l6(this);
      }
   }

   private long n5(int var1, int var2, int var3, int var4, int var5, y2 var6) {
      com.aspose.slides.internal.b7s.t9 var7 = this.u3.c8();
      long var8 = 0L;
      int var10 = var2 - var1 + 1;
      int var11 = var7.u3().l6().length;
      long var12 = var10 * var4 * var5 * var11;
      long var14 = 0L;
      int var16 = 8 * com.aspose.slides.internal.v6g.k5.n5(7);

      for (int var17 = 0; var17 < var7.u3().l6().length; var17++) {
         n3 var18 = var7.u3().l6()[var17];
         int var19 = (var18.n3() & 255) * var10;
         int var20 = (var18.u3() & 255) * var7.t2();
         var14 += var19 * var20 * var16;
      }

      y2 var27 = j9.n5(var1, var3, var7.u3().h0(), var6.n3()).n3();
      y2 var28 = j9.n5(var2, var3, var7.u3().h0(), var6.n3()).n3();
      y2 var29 = new y2(var27.s7(), var27.x8(), var28.t2(), var28.n5() - var27.c8());
      long var21 = var29.t2() * var29.l6() * var11 * com.aspose.slides.internal.v6g.k5.n5(6);
      long var23 = 0L;
      if (this.k5) {
         v4 var25 = this.u3.h0().n5();
         v4 var26 = this.h0.n5();
         var23 = var26.z3() * var21 / var25.z3();
      }

      return var12 + var14 + var21 + var23;
   }

   public final void n5(Object var1, int var2, y2 var3) {
   }

   public final void n5(Object var1, int var2) {
      com.aspose.slides.internal.a4s.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.a4s.n5.class);
      if (var3 != null) {
         try {
            this.l6(var3.n5());
            this.n5(var3.n5());
         } finally {
            for (int var6 = 0; var6 < var3.c8().u3().l6().length; var6++) {
               var3.n5()[var6] = null;
            }
         }
      }
   }

   private void l6(byte[][] var1) {
      com.aspose.slides.internal.b7s.t9 var2 = this.u3.c8();

      for (int var3 = 0; var3 < var2.u3().l6().length; var3++) {
         n3 var4 = var2.u3().l6()[var3];
         var1[var3] = var4.t9().n5(var1[var3], this.n5.t2(), this.n5.l6());
      }
   }

   private void n5(int var1, int var2, int var3) {
      com.aspose.slides.internal.b7s.t9 var4 = this.u3.c8();
      int var5 = var2 * var3 * var1;
      this.u3.n5(new byte[10][]);

      for (int var6 = 0; var6 < var4.u3().l6().length; var6++) {
         this.u3.n5()[var6] = new byte[var5];
         var4.u3().l6()[var6].s7(0);
      }
   }
}
