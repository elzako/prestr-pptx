package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.p6;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

class h0$n5 extends com.aspose.slides.internal.t6g.n5 {
   private final h0 n5;
   private final com.aspose.slides.internal.b8u.x8 l6;
   private final com.aspose.slides.internal.r2q.u9 k5;
   private final int u3;
   private final y2 a6 = new y2();
   private final int u9;
   private final int[][] h0;
   private final d2 c8;
   private int t2;
   private boolean s7;
   private int x8;
   private com.aspose.slides.internal.h9s.u3 n3;
   private com.aspose.slides.internal.o7p.l6 y4;

   public h0$n5(h0 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      var4.u3(this.a6);
      this.l6 = var3;
      this.n5 = var1;
      this.u3 = var1.s7();
      int var5 = this.n5.c8().t1();
      this.u9 = (this.n5.u9() * var5 + 7) / 8;
      this.k5 = new com.aspose.slides.internal.r2q.u9(var2, var1.c8(), var1.h0(), this.u3);
      this.h0 = com.aspose.slides.internal.o9n.h0.l6(var1.c8());
      this.c8 = com.aspose.slides.internal.o9n.h0.n5(var1);
   }

   private boolean n5() {
      boolean var1 = false;
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, com.aspose.slides.internal.b8u.y4.class)) {
         var1 = true;
         int[] var2 = this.n5.u3().e5().k7();

         for (int var3 = 0; var3 < var2.length; var3++) {
            if ((var2[var3] & 65535) != 16) {
               var1 = false;
               break;
            }
         }
      }

      return var1;
   }

   @Override
   public void n5(y2 var1) {
      boolean var2 = this.n5();
      boolean var3 = this.n5.c8().y2() == 6 && this.n5.t2() != 7 && this.n5.t2() != 6;
      if (var2 && var3) {
         throw new NotImplementedException("Upsampling 16-bit TIFF image data is not supported at the moment.");
      }

      int var4 = var1.t2() * var1.l6();
      long var5;
      if (var2) {
         var5 = var4 * com.aspose.slides.internal.v6g.k5.n5(11);
      } else {
         var5 = var4 * com.aspose.slides.internal.v6g.k5.n5(9);
         com.aspose.slides.internal.b8u.n3 var7 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
         if (var7 != null) {
            var5 += var7.n5(var5);
         }
      }

      this.n5.n5(var5);
      if (com.aspose.slides.internal.o9n.h0.n3() > 0 && var4 > com.aspose.slides.internal.o9n.h0.n3()) {
         throw new OutOfMemoryException();
      }

      Object var18;
      if (var2) {
         var18 = new long[var4];
      } else {
         var18 = new int[var4];
      }

      int var8 = 0;
      if (this.n3 != null) {
         int[] var9 = new int[]{0};
         this.n3.n5(var18, var4, var9);
         var8 = var9[0];
      }

      if (var8 < var4) {
         byte[] var19;
         if (var3) {
            this.y4 = com.aspose.slides.internal.o7p.c8.l6(this.n5.c8(), this.n5.u9(), this.u3);
            var19 = com.aspose.slides.internal.d9r.u9.n5(0).n5((int)this.y4.l6());
         } else {
            var19 = com.aspose.slides.internal.d9r.u9.n5(0).n5(this.u9 * this.u3);
         }

         int var10 = this.c8 != null ? this.c8.l6().h0() : com.aspose.slides.internal.o9b.c8.m3().h0();
         long var11 = com.aspose.slides.internal.r1x.l6.n5(var10);

         while (var8 < var4) {
            if (this.n3 != null) {
               int[] var13 = new int[]{var8};
               this.n3.n5(var18, var4, var13);
               var8 = var13[0];
            }

            int var22 = var8 / var1.t2() + var1.c8();
            if (var22 < this.t2) {
               int var24 = (this.t2 - var1.c8()) * var1.t2();
               int var26 = q1.l6(var24 - var8, var4 - var8);
               if (var2) {
                  long[] var29 = com.aspose.slides.internal.v6g.k5.k5(var18, long[].class);

                  for (int var32 = 0; var32 < var26; var32++) {
                     var29[var8++] = var11;
                  }
               } else {
                  int[] var28 = com.aspose.slides.internal.v6g.k5.k5(var18, int[].class);

                  for (int var31 = 0; var31 < var26; var31++) {
                     var28[var8++] = var10;
                  }
               }

               this.s7 = true;
            } else if (var8 < var4) {
               if (this.n3 == null || this.n3.l6() == this.x8 || this.s7) {
                  int var14 = this.k5.u3(var22);
                  this.n5.n5(this.k5);
                  int var15 = q1.l6(this.n5.h0() - var14, this.u3);
                  this.x8 = var15 * this.u9;
                  this.n3 = this.n5.n5(this.n5.c8(), this.h0, this.a6.n3(), var2);
                  this.n3.n5(var14);
                  if (var3) {
                     this.y4 = com.aspose.slides.internal.o7p.c8.l6(this.n5.c8(), this.n5.u9(), var15);
                  }

                  this.s7 = false;
               }

               int var23 = var3 ? (int)this.y4.l6() : q1.l6(this.x8 - this.n3.l6(), var19.length);
               p6 var25 = this.n5.n5(var19, var23).n5();
               if (var3) {
                  if (var25.n5) {
                     byte[] var16 = this.y4.n5(var19);
                     int[] var17 = new int[]{var8};
                     this.n3.n5(var16, var16.length, var18, var4, var17);
                     var8 = var17[0];
                  }
               } else {
                  int var27 = var25.l6;
                  if (var27 > 0) {
                     int[] var30 = new int[]{var8};
                     this.n3.n5(var19, var27, var18, var4, var30);
                     var8 = var30[0];
                  }
               }

               if (!var25.n5) {
                  if (this.c8 == null || this.c8.n5() == 0) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5("The strip ", a3.l6(this.k5.u3()), " has corrupt data and cannot be decoded. Error: ", var25.k5)
                     );
                  }

                  this.t2 = this.k5.k5(var22);
               }
            }
         }
      }

      if (var2) {
         long[] var20 = com.aspose.slides.internal.v6g.k5.k5(var18, long[].class);
         if (this.c8 != null && this.c8.k5()) {
         }

         if (this.n5.a6()) {
            com.aspose.slides.internal.o9n.h0.n5(this.n5, var20, 0, var20.length);
         }

         ((com.aspose.slides.internal.b8u.y4)this.l6).n5(var1.n3(), var20, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      } else {
         int[] var21 = com.aspose.slides.internal.v6g.k5.k5(var18, int[].class);
         if (this.c8 == null || this.c8.k5()) {
            this.n5(this.n5.c8(), var21, var1.n3(), this.c8);
         }

         if (this.n5.a6()) {
            com.aspose.slides.internal.o9n.h0.n5(this.n5, var21, 0, var21.length);
         }

         this.l6.n5(var1.n3(), var21, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      }
   }
}
