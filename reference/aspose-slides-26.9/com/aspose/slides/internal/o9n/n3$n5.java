package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

class n3$n5 extends com.aspose.slides.internal.t6g.n5 {
   private final com.aspose.slides.internal.v6s.u3 n5;
   private final long[] l6;
   private final com.aspose.slides.internal.b8u.x8 k5;
   private final com.aspose.slides.internal.h9s.n5 u3;
   private final int a6;
   private final com.aspose.slides.internal.h9s.u3 u9;
   private final d2 h0;
   private int c8 = com.aspose.slides.internal.r1x.l6.n5();
   private final int t2;
   private final int s7;
   private final int x8;
   private final int n3;
   private int y4;
   private int e2;
   private final n3 t9;

   public n3$n5(n3 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      this.x8 = var4.u3();
      this.s7 = var4.u9();
      this.k5 = var3;
      this.n5 = var2;
      this.t9 = var1;
      this.l6 = var1.c8().x8(273);
      this.u3 = new com.aspose.slides.internal.h9s.n5(var1.h0(), this.l6.length, var1.s7());
      int[][] var5 = com.aspose.slides.internal.u2w.n5.l6(var1.c8());
      this.u9 = var1.n5(var1.c8(), var5, var4.n3(), this.n5());
      this.t2 = var1.c8().t1();
      this.a6 = (this.t2 * var1.u9() + 7) / 8;
      this.h0 = com.aspose.slides.internal.o9n.n3.n5(var1);
      this.n3 = (this.t2 * var1.u9() - 1) / 8;
      if (this.h0 != null && this.h0.n5() != 0) {
         this.c8 = this.h0.l6().h0();
      }
   }

   private boolean n5() {
      boolean var1 = false;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.b8u.y4.class)) {
         var1 = true;
         int[] var2 = this.t9.u3().e5().k7();

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
      Object var2 = null;
      int var3 = var1.c8();
      if (this.t9.c8().y2() == 6 && this.t9.t2() != 7 && this.t9.t2() != 6) {
         var2 = this.k5(var1.n3());
      } else {
         var2 = this.l6(var1.n3());
      }

      if (this.n5()) {
         long[] var4 = com.aspose.slides.internal.v6g.k5.k5(var2, long[].class);
         if (this.h0 != null && this.h0.k5()) {
         }

         if (this.t9.a6()) {
            com.aspose.slides.internal.o9n.n3.n5(this.t9, var4, 0, var4.length);
         }

         this.y4 = var3;
         ((com.aspose.slides.internal.b8u.y4)this.k5).n5(var1.n3(), var4, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      } else {
         int[] var6 = com.aspose.slides.internal.v6g.k5.k5(var2, int[].class);
         if (this.h0 == null || this.h0.k5()) {
            this.n5(this.t9.c8(), var6, var1.n3(), this.h0);
         }

         if (this.t9.a6()) {
            com.aspose.slides.internal.o9n.n3.n5(this.t9, var6, 0, var6.length);
         }

         this.y4 = var3;
         this.k5.n5(var1.n3(), var6, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      }
   }

   private void n5(Object var1, int var2, int var3, int[] var4) {
      int var5 = q1.l6(var2 - var4[0], var3 - var4[0]);
      int[] var6 = com.aspose.slides.internal.v6g.k5.n5(var1, int[].class);
      if (var6 != null) {
         int var7 = this.c8;

         for (int var8 = 0; var8 < var5; var8++) {
            var6[var4[0]++] = var7;
         }
      } else {
         long[] var12 = com.aspose.slides.internal.v6g.k5.n5(var1, long[].class);
         if (var12 != null) {
            long var9 = com.aspose.slides.internal.r1x.l6.n5(this.c8);

            for (int var11 = 0; var11 < var5; var11++) {
               var12[var4[0]++] = var9;
            }
         }
      }
   }

   private Object l6(y2 var1) {
      int var2 = var1.t2();
      int var3 = var1.u3();
      int var4 = var1.l6();
      int var5 = var1.u9();
      int var6 = var1.c8();
      int var7 = var1.n5();
      int var8 = var2 * var4;
      long var9;
      if (this.n5()) {
         var9 = var8 * com.aspose.slides.internal.v6g.k5.n5(11);
      } else {
         var9 = var8 * com.aspose.slides.internal.v6g.k5.n5(9);
         com.aspose.slides.internal.b8u.n3 var11 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.b8u.n3.class);
         if (var11 != null) {
            long var12 = var11.n5(var8);
            var9 += var12;
         }
      }

      this.t9.n5(var9);
      if (com.aspose.slides.internal.o9n.n3.x8() > 0 && var8 > com.aspose.slides.internal.o9n.n3.x8()) {
         throw new OutOfMemoryException();
      }

      int var37 = 0;
      Object var14;
      if (this.n5()) {
         var14 = new long[var8];
      } else {
         var14 = new int[var8];
      }

      if (this.y4 == var6) {
         int[] var15 = new int[]{0};
         this.u9.n5(var14, var8, var15);
         var37 = var15[0];
      }

      if (var37 < var8) {
         int var38 = this.t2 * (var3 + var37) / 8;
         int var16 = (this.t2 * var5 - 1) / 8;
         int var17 = var16 - var38 + 1;
         int var18 = 0;
         if (var6 > 0) {
            var18 = this.u3.l6(var6);
         }

         int var19 = var6;

         while (var37 < var8 && var19 < var7) {
            if (var19 == this.u3.n5(var18 + 1) && this.s7 == var5) {
               var18++;
            }

            if (var19 < this.e2) {
               int var20 = var2 * (this.e2 - var6);
               int[] var21 = new int[]{var37};
               this.n5(var14, var8, var20, var21);
               var37 = var21[0];
               var19 = var37 / var2 + var6;
            } else {
               if (var3 == this.x8) {
                  this.u9.n5(var3, var19);
               }

               long var22 = this.l6[var18] & 4294967295L;
               long var24 = (var19 - this.u3.n5(var18)) * this.a6;
               long var26 = var22 + var24 + var38;
               int var28 = 1;
               if (var38 == 0 && var16 == this.n3) {
                  var28 = q1.l6(this.u3.n5(var18 + 1) - var19, var4);
               }

               long var29 = (var19 + var28 - var6) * var2;
               long var31 = var28 * var17;
               com.aspose.slides.internal.h9s.a6 var33 = new com.aspose.slides.internal.h9s.a6(this.n5, var26, var31);

               do {
                  com.aspose.slides.internal.r1x.u9 var34 = var33.n5().n5();
                  if (var34.k5 != 0) {
                     if (this.h0 == null || this.h0.n5() == 0) {
                        throw new com.aspose.slides.internal.h6t.u3(d1.n5("Failed to decode the image strip ", a3.l6(var18), ". Details: ", var34.u3));
                     }

                     this.e2 = this.u3.n5(var18 + 1);
                     int var39 = var2 * (this.e2 - var6);
                     int[] var36 = new int[]{var37};
                     this.n5(var14, var8, var39, var36);
                     var37 = var36[0];
                     break;
                  }

                  int[] var35 = new int[]{var37};
                  this.u9.n5(var34.n5, var34.l6, var14, var8, var35);
                  var37 = var35[0];
               } while (var37 < var29);

               var19 += var28;
            }
         }
      }

      return var14;
   }

   private Object k5(y2 var1) {
      if (this.n5()) {
         throw new NotImplementedException("Upsampling 16-bit TIFF image data is not supported at the moment.");
      }

      int var2 = var1.t2();
      int var3 = var1.u3();
      int var4 = var1.l6();
      int var5 = var1.u9();
      int var6 = var1.c8();
      int var7 = var1.n5();
      int var8 = var2 * var4;
      int var9 = this.t9.c8().s3() & 65535;
      int var10 = this.t9.c8().t9()[0] & 65535;
      int var11 = this.t9.c8().t9()[1] & 65535;
      int var12 = (int)this.t9.c8().v4() / var10;
      int var13 = var3 / var10;
      int var14 = q1.n5(var3, var5 - 1) / var10;
      long var15;
      if (this.n5()) {
         var15 = var8 * com.aspose.slides.internal.v6g.k5.n5(11);
      } else {
         var15 = var8 * com.aspose.slides.internal.v6g.k5.n5(9);
         com.aspose.slides.internal.b8u.n3 var17 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.b8u.n3.class);
         if (var17 != null) {
            var15 += var17.n5(var8);
         }
      }

      this.t9.n5(var15);
      if (com.aspose.slides.internal.o9n.n3.x8() > 0 && var8 > com.aspose.slides.internal.o9n.n3.x8()) {
         throw new OutOfMemoryException();
      }

      int var60 = 0;
      Object var18;
      if (this.n5()) {
         var18 = new long[var8];
      } else {
         var18 = new int[var8];
      }

      if (this.y4 == var6) {
         int[] var19 = new int[]{0};
         this.u9.n5(var18, var8, var19);
         var60 = var19[0];
      } else {
         var18 = new int[var8];
      }

      if (this.y4 == var6) {
         int[] var61 = new int[]{var60};
         this.u9.n5(var18, var8, var61);
         var60 = var61[0];
      }

      if (var60 < var8) {
         int var62 = this.t2 * (var3 + var60) / 8;
         int var20 = (this.t2 * var5 - 1) / 8;
         int var21 = var20 - var62 + 1;
         int var22 = 0;
         if (var6 > 0) {
            var22 = this.u3.l6(var6);
         }

         int var23 = var6;

         while (var60 < var8 && var23 < var7) {
            if (var23 == this.u3.n5(var22 + 1) && this.s7 == var5) {
               var22++;
            }

            if (var23 < this.e2) {
               int var63 = var2 * (this.e2 - var6);
               int[] var25 = new int[]{var60};
               this.n5(var18, var8, var63, var25);
               var60 = var25[0];
               var23 = var60 / var2 + var6;
            } else {
               if (var3 == this.x8) {
                  this.u9.n5(var3, var23);
               }

               int var24 = var23 / var11;
               long var26 = this.l6[var22] & 4294967295L;
               long var28 = (var23 - this.u3.n5(var22)) * this.a6;
               long var30 = var26 + var28 + var62;
               int var32 = q1.l6(q1.n5(var6, var7 - 1) + 1 - var23, (var24 + 1) * var11 - var23);
               boolean var33 = false;
               if (var62 == 0 && var20 == this.n3) {
                  var32 = q1.l6(this.u3.n5(var22 + 1) - var23, var4);
                  var33 = true;
               }

               int var34 = (var23 + var32 - 1) / var11;
               int var35 = (var14 - var13 + 1) * var10;
               int var36 = (var34 - var24 + 1) * var11;
               com.aspose.slides.internal.o7p.l6 var37 = com.aspose.slides.internal.o7p.c8.l6(this.t9.c8(), var35, var36);
               int var38 = var37.n5();
               long var39 = var26 + (var24 * var12 + var13) * var38 - this.u3.n5(var22) * this.a6;
               long var41 = var35 * var36 * var38;
               long var43 = (var23 + var32 - var6) * var2;
               long var45 = var32 * var21;
               com.aspose.slides.internal.h9s.a6 var47 = new com.aspose.slides.internal.h9s.a6(this.n5, var39, var41);

               do {
                  com.aspose.slides.internal.r1x.u9 var48 = var47.n5().n5();
                  if (var48.k5 != 0) {
                     if (this.h0 == null || this.h0.n5() == 0) {
                        throw new com.aspose.slides.internal.h6t.u3(d1.n5("Failed to decode the image strip ", a3.l6(var22), ". Details: ", var48.u3));
                     }

                     this.e2 = this.u3.n5(var22 + 1);
                     int var64 = var2 * (this.e2 - var6);
                     int[] var50 = new int[]{var60};
                     this.n5(var18, var8, var64, var50);
                     var60 = var50[0];
                     break;
                  }

                  byte[] var49 = var37.n5(var48.n5);
                  long var51 = var33 ? var45 : var21;
                  int var53 = var33 ? 1 : var32;
                  boolean var54 = var33 && var49.length == var51;
                  byte[] var55 = var54 ? var49 : new byte[(int)var51];
                  if (var54) {
                     int[] var56 = new int[]{var60};
                     this.u9.n5(var55, var55.length, var18, var8, var56);
                     var60 = var56[0];
                  } else {
                     for (int var65 = 0; var65 < var53; var65++) {
                        long var57 = ((var23 + var65 - var24 * var11) * var35 + var3 - var13 * var10) * var9;
                        com.aspose.slides.ms.System.u3.n5(var49, (int)var57, var55, 0, var55.length);
                        int[] var59 = new int[]{var60};
                        this.u9.n5(var55, var55.length, var18, var8, var59);
                        var60 = var59[0];
                     }
                  }
               } while (var60 < var43);

               var23 += var32;
            }
         }
      }

      return var18;
   }
}
