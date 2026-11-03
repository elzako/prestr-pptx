package com.aspose.slides.internal.w4s;

import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.internal.n2d.m1;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x8;

public final class n5 {
   private int n5;
   private boolean l6 = false;
   private final int k5;
   private final double u3;
   private final l6 a6;
   private final n5$n5 u9 = new n5$n5(null);
   private final n5$n5 h0 = new n5$n5(null);
   private final n5$n5 c8 = new n5$n5(null);
   private int[] t2;
   private static final int[] s7 = u3();
   private long x8 = (t4.n5(137224) & 4294967295L) / 8L & 4294967295L;

   public final void n5(String var1, String var2, String var3) {
      this.u9.u9 = var2;
      this.h0.u9 = var1;
      this.c8.u9 = var3;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public n5(l6 var1) {
      this(var1, 1);
   }

   public n5(l6 var1, int var2) {
      this.k5 = var1.n5();
      this.u3 = var1.l6();
      this.a6 = var1;
      this.n5 = var2;
   }

   public final boolean n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      if (var1.e2() == var2.e2() && var1.h0() == var2.h0()) {
         if (var1.e2() >= 1 && var1.h0() >= 1) {
            this.l6(var1, var2);
            this.n5(this.u9.n5, this.u9.l6);
            this.n5(this.u9, 0);
            this.n5(this.h0, 1);
            boolean var3 = true;

            for (int var4 = 0; var4 < (this.u9.l6 & 4294967295L); var4++) {
               for (int var5 = 0; var5 < (this.u9.n5 & 4294967295L); var5++) {
                  if (!this.a6.n5(var5, var4)) {
                     if (this.n5 != 0) {
                        this.n5(var5, var4, (byte)-1);
                     }
                  } else if (!this.n5(var5, var4, 0, this.h0) || !this.n5(var5, var4, 1, this.u9)) {
                     if (this.n5 == 0) {
                        return false;
                     }

                     var3 = false;
                     this.n5(var5, var4, (byte)127);
                     if (!this.l6) {
                        for (int var6 = q1.n5(0, var5 - 1); var6 <= q1.k5(var5 + 1, (this.u9.n5 & 4294967295L) - 1L & 4294967295L); var6++) {
                           for (int var7 = q1.n5(0, var4 - 1); var7 <= q1.k5(var4 + 1, (this.u9.l6 & 4294967295L) - 1L & 4294967295L); var7++) {
                              if ((var6 != var5 || var7 != var4) && var6 > 0 && var7 > 0 && (this.n5(var6, var7) & 255) == 0) {
                                 this.n5(var6, var7, (byte)63);
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (this.n5 == 1 || this.n5 == 2 && !var3) {
               if (this.l6) {
                  this.k5();
               }

               this.l6();
            }

            this.n5();
            return var3;
         } else {
            throw new ApplicationException(d1.n5("Wrong image size ({0}x{1})\n{2}", var1.e2(), var1.h0(), this.u9.u9));
         }
      } else {
         throw new ApplicationException(
            d1.n5("Wrong image size ({0}x{1} / {2}x{3})\n{4}\n{5}", var1.e2(), var1.h0(), var2.e2(), var2.h0(), this.u9.u9, this.h0.u9)
         );
      }
   }

   private void n5(n5$n5 var1) {
      var1.n5 = com.aspose.slides.ms.System.x8.l6(var1.a6, 18);
      var1.l6 = com.aspose.slides.ms.System.x8.l6(var1.a6, 22);
      var1.k5 = var1.n5 * this.x8;
      if (var1.k5 % 4L > 0L) {
         var1.k5 = var1.k5 + (4L - var1.k5 % 4L);
      }

      var1.u3 = com.aspose.slides.ms.System.x8.l6(var1.a6, 10) + (var1.l6 - 1L) * var1.k5;
   }

   private void n5(long var1, long var3) {
      this.c8.n5 = var1;
      this.c8.l6 = var3;
      this.c8.k5 = var1;
      this.c8.u3 = 54L + ((s7.length & 4294967295L) * 4L & 4294967295L) & 4294967295L;
      if (((this.c8.k5 & 4294967295L) % 4L & 4294967295L) > 0L) {
         this.c8.k5 = (this.c8.k5 & 4294967295L) + (4L - ((this.c8.k5 & 4294967295L) % 4L & 4294967295L) & 4294967295L) & 4294967295L;
      }

      long var5 = (this.c8.u3 & 4294967295L) + ((var3 & 4294967295L) * (this.c8.k5 & 4294967295L) & 4294967295L) & 4294967295L;
      this.c8.a6 = new byte[(int)(var5 & 4294967295L)];
      byte[] var7 = com.aspose.slides.ms.System.x8.l6(19778);
      System.arraycopy(var7, 0, this.c8.a6, 0, var7.length);
      var7 = com.aspose.slides.ms.System.x8.n5(var5);
      System.arraycopy(var7, 0, this.c8.a6, 2, var7.length);
      var7 = com.aspose.slides.ms.System.x8.n5(this.c8.u3 & 4294967295L);
      System.arraycopy(var7, 0, this.c8.a6, 10, var7.length);
      this.c8.a6[14] = 40;
      var7 = com.aspose.slides.ms.System.x8.n5(var1);
      System.arraycopy(var7, 0, this.c8.a6, 18, var7.length);
      var7 = com.aspose.slides.ms.System.x8.n5(var3);
      System.arraycopy(var7, 0, this.c8.a6, 22, var7.length);
      this.c8.a6[26] = 1;
      this.c8.a6[28] = 8;
      var7 = com.aspose.slides.ms.System.x8.l6(3780);
      System.arraycopy(var7, 0, this.c8.a6, 38, var7.length);
      var7 = com.aspose.slides.ms.System.x8.l6(3780);
      System.arraycopy(var7, 0, this.c8.a6, 42, var7.length);
      var7 = com.aspose.slides.ms.System.x8.n5(s7.length & 4294967295L);
      System.arraycopy(var7, 0, this.c8.a6, 46, var7.length);
      var7 = com.aspose.slides.ms.System.x8.n5(s7.length & 4294967295L);
      System.arraycopy(var7, 0, this.c8.a6, 50, var7.length);

      for (int var8 = 0; var8 < s7.length; var8++) {
         var7 = com.aspose.slides.ms.System.x8.l6(s7[var8]);
         System.arraycopy(var7, 0, this.c8.a6, 54 + var8 * 4, var7.length);
      }

      this.c8.u3 = (var5 & 4294967295L) - (this.c8.k5 & 4294967295L) & 4294967295L;
   }

   private static boolean n5(com.aspose.slides.internal.o9b.l6[] var0, int var1) {
      if (var0[0] != null && var0[0].s7() != var1) {
         com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var0[0].e2(), var0[0].h0(), var1);
         var2.n5(m1.n5(var0[0]), m1.l6(var0[0]));
         z1 var3 = z1.n5(var2);

         try {
            var3.n5(var0[0], 0, 0);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         var0[0].dispose();
         var0[0] = var2;
         return true;
      } else {
         return false;
      }
   }

   private void l6(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      com.aspose.slides.internal.o9b.l6[] var3 = new com.aspose.slides.internal.o9b.l6[]{var1};
      n5(var3, 137224);
      var1 = var3[0];
      com.aspose.slides.internal.o9b.l6[] var4 = new com.aspose.slides.internal.o9b.l6[]{var2};
      n5(var4, 137224);
      var2 = var4[0];
      e2 var5 = new e2();

      try {
         var1.n5(var5, com.aspose.slides.internal.j9e.x8.k5());
         this.u9.a6 = var5.toArray();
         var5.close();
      } finally {
         if (var5 != null) {
            var5.dispose();
         }

         if (var1 != null) {
            var1.dispose();
         }
      }

      e2 var6 = new e2();

      try {
         var2.n5(var6, com.aspose.slides.internal.j9e.x8.k5());
         this.h0.a6 = var6.toArray();
         var6.close();
      } finally {
         if (var6 != null) {
            var6.dispose();
         }

         if (var2 != null) {
            var2.dispose();
         }
      }

      this.n5(this.u9);
      this.n5(this.h0);
   }

   private byte[] n5(n5$n5 var1, int var2, int var3) {
      long var4 = var1.u3 - var1.k5 * var3 + var2 * this.x8;
      return new byte[]{var1.a6[(int)(var4 + 2L)], var1.a6[(int)(var4 + 1L)], var1.a6[(int)var4]};
   }

   private byte n5(int var1, int var2) {
      long var3 = this.c8.u3 - this.c8.k5 * var2 + var1;
      return var3 > this.c8.a6.length - 1 ? this.c8.a6[this.c8.a6.length - 1] : this.c8.a6[(int)var3];
   }

   private void n5(int var1, int var2, byte var3) {
      long var4 = this.c8.u3 - this.c8.k5 * var2 + var1;
      if (var4 < this.c8.a6.length) {
         this.c8.a6[(int)var4] = var3;
      }
   }

   private void n5() {
      this.c8.l6();
      this.u9.l6();
      this.h0.l6();
   }

   private void l6() {
      this.c8.n5();
      this.u9.n5();
      this.h0.n5();
   }

   private void k5() {
      for (int var1 = 0; var1 < (this.u9.l6 & 4294967295L); var1++) {
         for (int var2 = 0; var2 < (this.u9.n5 & 4294967295L); var2++) {
            if (!this.a6.n5(var2, var1)) {
               this.n5(var2, var1, (byte)-1);
            } else {
               byte[] var3 = this.n5(this.u9, var2, var1);
               byte[] var4 = this.n5(this.h0, var2, var1);
               int var5 = (q1.n5((var3[0] & 255) - (var4[0] & 255)) + q1.n5((var3[1] & 255) - (var4[1] & 255)) + q1.n5((var3[2] & 255) - (var4[2] & 255))) / 6;
               if (this.n5(var3) > this.n5(var4)) {
                  this.n5(var2, var1, (byte)var5);
               } else {
                  this.n5(var2, var1, (byte)(var5 + 128));
               }
            }
         }
      }
   }

   private float n5(byte[] var1) {
      byte var2 = (byte)Math.min(var1[0] & 255, Math.min(var1[1] & 255, var1[2] & 255));
      byte var3 = (byte)Math.max(var1[0] & 255, Math.max(var1[1] & 255, var1[2] & 255));
      return ((var3 & 255) + (var2 & 255)) / 510.0F;
   }

   private boolean n5(int var1, int var2, int var3, n5$n5 var4) {
      if (this.n5(var3, var4, var1, var2, var1, var2)) {
         return true;
      }

      int var5 = (int)var4.n5;
      int var6 = (int)var4.l6;

      for (int var7 = 1; var7 <= this.k5; var7++) {
         int var8 = var1 + var7;
         if (var8 > var5) {
            var8 = var5 - 1;
         }

         if (var2 - var7 >= 0) {
            int var9 = var2 - var7;
            int var10 = var1 - var7;
            if (var10 < 0) {
               var10 = 0;
            }

            while (var10 < var8) {
               if (this.n5(var3, var4, var1, var2, var10, var9)) {
                  return true;
               }

               var10++;
            }
         }

         if (var2 + var7 < var6) {
            int var12 = var2 + var7;
            int var15 = var1 - var7;
            if (var15 < 0) {
               var15 = 0;
            }

            while (var15 < var8) {
               if (this.n5(var3, var4, var1, var2, var15, var12)) {
                  return true;
               }

               var15++;
            }
         }

         if (var1 - var7 >= 0) {
            int var13 = var1 - var7;
            int var16 = var2 + var7 - 1;
            if (var16 >= var6) {
               var16 = var6 - 1;
            }

            if (var13 < 0) {
               var13 = 0;
            }

            int var11 = var2 - var7 + 1;
            if (var11 < 0) {
               var11 = 0;
            }

            while (var11 < var16) {
               if (this.n5(var3, var4, var1, var2, var13, var11)) {
                  return true;
               }

               var11++;
            }
         }

         if (var1 + var7 < var5) {
            int var14 = var1 + var7;
            int var17 = var2 + var7 + 1;
            if (var17 >= var6) {
               var17 = var6 - 1;
            }

            int var18 = var2 - var7;
            if (var18 < 0) {
               var18 = 0;
            }

            while (var18 < var17) {
               if (this.n5(var3, var4, var1, var2, var14, var18)) {
                  return true;
               }

               var18++;
            }
         }
      }

      return false;
   }

   private void n5(n5$n5 var1, int var2) {
      if (this.t2 == null) {
         this.t2 = new int[(int)(var1.n5 * var1.l6) * 3];
      }

      byte var3 = 24;
      int var4 = (int)(255.0 * this.u3 / 3.0);
      float var5 = (float)this.u3 * 4.0F + 1.0F;

      for (int var6 = 0; var6 < var1.n5; var6++) {
         for (int var7 = 0; var7 < var1.l6; var7++) {
            byte[] var8 = this.n5(var1, var6, var7);
            int var9;
            int var10;
            int var11 = var10 = var9 = var8[0] & 255;
            int var12 = var11 * 12;
            int var13;
            int var14;
            int var15 = var14 = var13 = var8[1] & 255;
            int var16 = var15 * 12;
            int var17;
            int var18;
            int var19 = var18 = var17 = var8[2] & 255;
            int var20 = var19 * 12;
            if (var6 > 0) {
               var8 = this.n5(var1, var6 - 1, var7);
               int var21 = var8[0] & 255;
               int var22 = var8[1] & 255;
               int var23 = var8[2] & 255;
               var12 += var21 * 2;
               var16 += var22 * 2;
               var20 += var23 * 2;
               if (var10 > var21) {
                  var10 = var21;
               }

               if (var9 < var21) {
                  var9 = var21;
               }

               if (var14 > var22) {
                  var14 = var22;
               }

               if (var13 < var22) {
                  var13 = var22;
               }

               if (var18 > var23) {
                  var18 = var23;
               }

               if (var17 < var23) {
                  var17 = var23;
               }
            } else {
               var12 += var11 * 2;
               var16 += var15 * 2;
               var20 += var19 * 2;
            }

            if (var7 > 0) {
               var8 = this.n5(var1, var6, var7 - 1);
               int var63 = var8[0] & 255;
               int var70 = var8[1] & 255;
               int var77 = var8[2] & 255;
               var12 += var63 * 2;
               var16 += var70 * 2;
               var20 += var77 * 2;
               if (var10 > var63) {
                  var10 = var63;
               }

               if (var9 < var63) {
                  var9 = var63;
               }

               if (var14 > var70) {
                  var14 = var70;
               }

               if (var13 < var70) {
                  var13 = var70;
               }

               if (var18 > var77) {
                  var18 = var77;
               }

               if (var17 < var77) {
                  var17 = var77;
               }
            } else {
               var12 += var11 * 2;
               var16 += var15 * 2;
               var20 += var19 * 2;
            }

            if (var6 < var1.n5 - 1L) {
               var8 = this.n5(var1, var6 + 1, var7);
               int var64 = var8[0] & 255;
               int var71 = var8[1] & 255;
               int var78 = var8[2] & 255;
               var12 += var64 * 2;
               var16 += var71 * 2;
               var20 += var78 * 2;
               if (var10 > var64) {
                  var10 = var64;
               }

               if (var9 < var64) {
                  var9 = var64;
               }

               if (var14 > var71) {
                  var14 = var71;
               }

               if (var13 < var71) {
                  var13 = var71;
               }

               if (var18 > var78) {
                  var18 = var78;
               }

               if (var17 < var78) {
                  var17 = var78;
               }
            } else {
               var12 += var11 * 2;
               var16 += var15 * 2;
               var20 += var19 * 2;
            }

            if (var7 < var1.l6 - 1L) {
               var8 = this.n5(var1, var6, var7 + 1);
               int var65 = var8[0] & 255;
               int var72 = var8[1] & 255;
               int var79 = var8[2] & 255;
               var12 += var65 * 2;
               var16 += var72 * 2;
               var20 += var79 * 2;
               if (var10 > var65) {
                  var10 = var65;
               }

               if (var9 < var65) {
                  var9 = var65;
               }

               if (var14 > var72) {
                  var14 = var72;
               }

               if (var13 < var72) {
                  var13 = var72;
               }

               if (var18 > var79) {
                  var18 = var79;
               }

               if (var17 < var79) {
                  var17 = var79;
               }
            } else {
               var12 += var11 * 2;
               var16 += var15 * 2;
               var20 += var19 * 2;
            }

            if (var6 > 0 && var7 > 0) {
               var8 = this.n5(var1, var6 - 1, var7 - 1);
               int var66 = var8[0] & 255;
               int var73 = var8[1] & 255;
               int var80 = var8[2] & 255;
               var12 += var66;
               var16 += var73;
               var20 += var80;
               if (var10 > var66) {
                  var10 = var66;
               }

               if (var9 < var66) {
                  var9 = var66;
               }

               if (var14 > var73) {
                  var14 = var73;
               }

               if (var13 < var73) {
                  var13 = var73;
               }

               if (var18 > var80) {
                  var18 = var80;
               }

               if (var17 < var80) {
                  var17 = var80;
               }
            } else {
               var12 += var11;
               var16 += var15;
               var20 += var19;
            }

            if (var6 < var1.n5 - 1L && var7 > 0) {
               var8 = this.n5(var1, var6 + 1, var7 - 1);
               int var67 = var8[0] & 255;
               int var74 = var8[1] & 255;
               int var81 = var8[2] & 255;
               var12 += var67;
               var16 += var74;
               var20 += var81;
               if (var10 > var67) {
                  var10 = var67;
               }

               if (var9 < var67) {
                  var9 = var67;
               }

               if (var14 > var74) {
                  var14 = var74;
               }

               if (var13 < var74) {
                  var13 = var74;
               }

               if (var18 > var81) {
                  var18 = var81;
               }

               if (var17 < var81) {
                  var17 = var81;
               }
            } else {
               var12 += var11;
               var16 += var15;
               var20 += var19;
            }

            if (var6 > 0 && var7 < var1.l6 - 1L) {
               var8 = this.n5(var1, var6 - 1, var7 + 1);
               int var68 = var8[0] & 255;
               int var75 = var8[1] & 255;
               int var82 = var8[2] & 255;
               var12 += var68;
               var16 += var75;
               var20 += var82;
               if (var10 > var68) {
                  var10 = var68;
               }

               if (var9 < var68) {
                  var9 = var68;
               }

               if (var14 > var75) {
                  var14 = var75;
               }

               if (var13 < var75) {
                  var13 = var75;
               }

               if (var18 > var82) {
                  var18 = var82;
               }

               if (var17 < var82) {
                  var17 = var82;
               }
            } else {
               var12 += var11;
               var16 += var15;
               var20 += var19;
            }

            if (var6 < var1.n5 - 1L && var7 < var1.l6 - 1L) {
               var8 = this.n5(var1, var6 + 1, var7 + 1);
               int var69 = var8[0] & 255;
               int var76 = var8[1] & 255;
               int var83 = var8[2] & 255;
               var12 += var69;
               var16 += var76;
               var20 += var83;
               if (var10 > var69) {
                  var10 = var69;
               }

               if (var9 < var69) {
                  var9 = var69;
               }

               if (var14 > var76) {
                  var14 = var76;
               }

               if (var13 < var76) {
                  var13 = var76;
               }

               if (var18 > var83) {
                  var18 = var83;
               }

               if (var17 < var83) {
                  var17 = var83;
               }
            } else {
               var12 += var11;
               var16 += var15;
               var20 += var19;
            }

            var11 = var12 / 24;
            var15 = var16 / 24;
            var19 = var20 / 24;
            int var24 = (int)((var9 - var10) * var5 / 2.0F) + var4;
            int var25 = (int)((var13 - var14) * var5 / 2.0F) + var4;
            int var26 = (int)((var17 - var18) * var5 / 2.0F) + var4;
            if (var24 > 255) {
               var24 = 255;
            }

            if (var25 > 255) {
               var25 = 255;
            }

            if (var26 > 255) {
               var26 = 255;
            }

            this.n5(var6, var7, var2, var11 | var15 << 8 | var19 << 16);
            int var27 = this.l6(var6, var7);
            var24 = q1.n5(var27 & 0xFF, var24);
            var25 = q1.n5((var27 & 0xFF00) >> 8, var25);
            var26 = q1.n5((var27 & 0xFF0000) >> 16, var26);
            this.n5(var6, var7, var24 | var25 << 8 | var26 << 16);
         }
      }
   }

   private int l6(int var1, int var2) {
      return this.t2[(int)(((var2 * (this.u9.n5 & 4294967295L) & 4294967295L) + var1) * 3L + 2L)];
   }

   private void n5(int var1, int var2, int var3) {
      this.t2[(int)(((var2 * (this.u9.n5 & 4294967295L) & 4294967295L) + var1) * 3L + 2L)] = var3;
   }

   private int l6(int var1, int var2, int var3) {
      return this.t2[(int)(((var2 * (this.u9.n5 & 4294967295L) & 4294967295L) + var1) * 3L + var3)];
   }

   private void n5(int var1, int var2, int var3, int var4) {
      this.t2[(int)(((var2 * (this.u9.n5 & 4294967295L) & 4294967295L) + var1) * 3L + var3)] = var4;
   }

   private boolean n5(int var1, n5$n5 var2, int var3, int var4, int var5, int var6) {
      byte[] var7 = this.n5(var2, var5, var6);
      int var8 = this.l6(var3, var4, var1);
      int var9 = this.l6(var3, var4);
      int var10 = var8 & 0xFF;
      int var11 = (var8 & 0xFF00) >> 8;
      int var12 = (var8 & 0xFF0000) >> 16;
      int var13 = var9 & 0xFF;
      int var14 = (var9 & 0xFF00) >> 8;
      int var15 = (var9 & 0xFF0000) >> 16;
      return (var7[0] & 255) >= var10 - var13
         && (var7[0] & 255) <= var10 + var13
         && (var7[1] & 255) >= var11 - var14
         && (var7[1] & 255) <= var11 + var14
         && (var7[2] & 255) >= var12 - var15
         && (var7[2] & 255) <= var12 + var15;
   }

   private static int[] u3() {
      int[] var0 = new int[256];

      for (int var1 = 0; var1 < 128; var1++) {
         var0[var1] = com.aspose.slides.internal.o9b.c8.n5(255, 255 - var1 * 2, 255 - var1 * 2).h0();
         var0[var1 + 128] = com.aspose.slides.internal.o9b.c8.n5(255 - var1 * 2, 255 - var1 * 2, 255).h0();
      }

      return var0;
   }

   static {
      u3();
   }
}
