package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.p6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

class h0$l6 extends com.aspose.slides.internal.t6g.n5 {
   private final h0 n5;
   private final com.aspose.slides.internal.b8u.x8 l6;
   private final com.aspose.slides.internal.r2q.u9[] k5;
   private final int u3;
   private final y2 a6 = new y2();
   private final int u9;
   private final int[][] h0;
   private final d2 c8;
   private int t2;
   private com.aspose.slides.internal.h9s.u3 s7;
   private int x8;
   private boolean n3;
   private com.aspose.slides.internal.o7p.c8 y4;

   public h0$l6(h0 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      var4.u3(this.a6);
      this.l6 = var3;
      this.n5 = var1;
      long[] var5 = var1.c8().x8(273);
      long[] var6 = var1.c8().x8(279);
      this.u3 = var1.s7();
      int var7 = this.n5.c8().t1();
      this.u9 = (this.n5.u9() * var7 + 7) / 8;
      int var8 = var1.c8().s3() & 65535;
      int var9 = var5.length / var8;
      if (var5.length % var8 != 0) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid strip offsets value {0} for samples count {1}",new Object[]{ var5.length, var1.c8().s3()}));
      }

      if (var6.length % var8 != 0) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid strip bytes count {0} for samples count {1}",new Object[]{ var6.length, var1.c8().s3()}));
      }

      this.k5 = new com.aspose.slides.internal.r2q.u9[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var5 = new long[var9];
         var6 = new long[var9];
         com.aspose.slides.ms.System.u3.n5(var1.c8().x8(273), var10 * var9, var5, 0, var9);
         com.aspose.slides.ms.System.u3.n5(var1.c8().x8(279), var10 * var9, var6, 0, var9);
         this.k5[var10] = new com.aspose.slides.internal.r2q.u9(var2, var1.c8(), var1.h0(), var5, var6, this.u3);
      }

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
      if (this.n5.c8().y2() == 6 && this.n5.t2() != 7 && this.n5.t2() != 6) {
         this.k5(var1.n3());
      } else {
         this.l6(var1.n3());
      }
   }

   private void l6(y2 var1) {
      boolean var2 = this.n5();
      int var3 = var1.t2() * var1.l6();
      if (var2) {
         long var4 = var3 * com.aspose.slides.internal.v6g.k5.n5(11);
      } else {
         long var31 = var3 * com.aspose.slides.internal.v6g.k5.n5(9);
         com.aspose.slides.internal.b8u.n3 var6 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
         if (var6 != null) {
            var31 += var6.n5(var31);
         }

         this.n5.n5(var31);
      }

      if (com.aspose.slides.internal.o9n.h0.n3() > 0 && var3 > com.aspose.slides.internal.o9n.h0.n3()) {
         throw new OutOfMemoryException();
      }

      Object var32;
      if (var2) {
         var32 = new long[var3];
      } else {
         var32 = new int[var3];
      }

      int var7 = this.n5.c8().s3() & 65535;
      int var8 = 0;
      int var9 = 0;
      int var10 = this.u9 * this.u3;
      byte[] var11 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var10);
      byte[][] var12 = new byte[var7][];

      for (int var13 = 0; var13 < var7; var13++) {
         var12[var13] = com.aspose.slides.internal.d9r.u9.n5(0).n5(var10 / var7);
      }

      int var33 = this.c8 != null ? this.c8.l6().h0() : com.aspose.slides.internal.o9b.c8.m3().h0();
      long var14 = com.aspose.slides.internal.r1x.l6.n5(var33);

      while (var8 < var3) {
         int var16 = 0;
         int var17 = var8 / var1.t2() + var1.c8();
         if (var17 >= this.t2) {
            boolean var37 = false;
            if (this.s7 != null) {
               var16 = this.s7.l6();
               var37 = this.s7.u3();
            }

            boolean var38 = false;
            if (this.n3 || var16 == this.x8 * var7 && !var37) {
               var38 = true;
               int var39 = this.k5[0].u3(var17);
               this.s7 = this.n5.n5(this.n5.c8(), this.h0, this.a6.n3(), var2);
               this.x8 = q1.l6(this.n5.h0() - var39, this.u3) * this.u9 / var7;
               this.s7.n5(var39);
               this.n3 = false;
            }

            int[] var40 = new int[]{var8};
            this.s7.n5(var32, var3, var40);
            var8 = var40[0];
            if (var8 < var3) {
               int[] var41 = new int[var7];
               p6[] var43 = this.n5(var7);
               int[] var45 = new int[]{q1.l6(this.s7.l6() / var7 + var12[0].length, this.x8) - this.s7.l6() / var7};

               for (int var24 = 0; var24 < var7; var24++) {
                  if (var38) {
                     this.k5[var24].u3(var17);
                  }

                  this.n5.n5(this.k5[var24]);
                  this.n5.n5(var12[var24], var45[0]).n5(var43[var24]);
                  var41[var24] = var43[var24].l6;
               }

               boolean var46 = com.aspose.slides.ms.System.u3.k5(com.aspose.slides.ms.System.u3.n5((Object)(var41)), new c8(this, var45));
               int[] var25 = new int[]{var45[0]};
               if (!var46) {
                  Integer[] var26 = com.aspose.slides.ms.System.u3.n5(Integer.class, com.aspose.slides.ms.System.u3.n5((Object)(var41)), new t2(this, var45));
                  com.aspose.slides.ms.System.u3.a6(com.aspose.slides.ms.System.u3.n5((Object)(var26)));
                  var25[0] = var26[0];
               }

               boolean var47 = true;
               int[] var27 = this.n5.c8().k7();

               for (int var28 = 0; var28 < var27.length; var28++) {
                  if ((var27[var28] & 65535) != 16) {
                     var47 = false;
                     break;
                  }
               }

               if (var47) {
                  int var49 = 0;

                  for (int var51 = 0; var51 < var25[0]; var51 += 2) {
                     for (int var52 = 0; var52 < var7; var52++) {
                        var11[var49++] = var12[var52][var51];
                        var11[var49++] = var12[var52][var51 + 1];
                     }
                  }
               } else {
                  int var48 = 0;

                  for (int var29 = 0; var29 < var25[0]; var29++) {
                     for (int var30 = 0; var30 < var7; var30++) {
                        var11[var48++] = var12[var30][var29];
                     }
                  }
               }

               var40[0] = var8;
               this.s7.n5(var11, var7 * var45[0], var32, var3, var40);
               var8 = var40[0];
               if (!var46) {
                  var9 = com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var41)), new s7(this, var25));
                  if (this.c8 == null || this.c8.n5() == 0) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5("The strip {0} in {1} colour plane has corrupt data and cannot be decoded. Error: {2}",new Object[]{ this.k5[var9].u3(), var9, var43[var9].k5})
                     );
                  }

                  this.t2 = this.k5[var9].k5(var17);
                  this.n3 = true;
               }
            }
         } else {
            if (this.s7 != null) {
               int[] var18 = new int[]{var8};
               this.s7.n5(var32, var3, var18);
               var8 = var18[0];
               if (var8 == var3) {
                  continue;
               }
            }

            int var36 = this.k5[var9].k5(var17);
            int var19 = (var36 - var1.c8()) * var1.t2();
            int var20 = var3 - var8;
            int var21 = q1.l6(var19 - var8, var20);
            if (var2) {
               long[] var22 = com.aspose.slides.internal.v6g.k5.k5(var32, long[].class);

               for (int var23 = 0; var23 < var21; var23++) {
                  var22[var8++] = var14;
               }
            } else {
               int[] var42 = com.aspose.slides.internal.v6g.k5.k5(var32, int[].class);

               for (int var44 = 0; var44 < var21; var44++) {
                  var42[var8++] = var33;
               }
            }

            this.n3 = true;
         }
      }

      if (var2) {
         long[] var34 = com.aspose.slides.internal.v6g.k5.k5(var32, long[].class);
         if (this.c8 != null && this.c8.k5()) {
         }

         if (this.n5.a6()) {
            com.aspose.slides.internal.o9n.h0.l6(this.n5, var34, 0, var34.length);
         }

         ((com.aspose.slides.internal.b8u.y4)this.l6).n5(var1.n3(), var34, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      } else {
         int[] var35 = com.aspose.slides.internal.v6g.k5.k5(var32, int[].class);
         if (this.c8 == null || this.c8.k5()) {
            this.n5(this.n5.c8(), var35, var1.n3(), this.c8);
         }

         if (this.n5.a6()) {
            com.aspose.slides.internal.o9n.h0.l6(this.n5, var35, 0, var35.length);
         }

         this.l6.n5(var1.n3(), var35, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      }
   }

   private void k5(y2 var1) {
      boolean var2 = this.n5();
      if (var2) {
         throw new NotImplementedException("Upsampling 16-bit TIFF data is not supported at the moment. Please use IPartialArgb32PixelLoader instead.");
      }

      int var3 = var1.t2() * var1.l6();
      long var4 = var3 * com.aspose.slides.internal.v6g.k5.n5(9);
      com.aspose.slides.internal.b8u.n3 var6 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
      if (var6 != null) {
         var4 += var6.n5(var4);
      }

      this.n5.n5(var4);
      if (com.aspose.slides.internal.o9n.h0.n3() > 0 && var3 > com.aspose.slides.internal.o9n.h0.n3()) {
         throw new OutOfMemoryException();
      }

      int[] var7 = new int[var3];
      int var8 = this.n5.c8().s3() & 65535;
      int var9 = 0;
      int var10 = 0;
      int var11 = this.u9 * this.u3;
      byte[] var12 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var11);
      byte[][] var13 = new byte[var8][];

      for (int var14 = 0; var14 < var8; var14++) {
         var13[var14] = com.aspose.slides.internal.d9r.u9.n5(0).n5(var11 / var8);
      }

      while (var9 < var3) {
         int var29 = 0;
         int var15 = var9 / var1.t2() + var1.c8();
         if (var15 >= this.t2) {
            boolean var31 = false;
            if (this.s7 != null) {
               var29 = this.s7.l6();
               var31 = this.s7.u3();
            }

            boolean var32 = false;
            if (this.n3 || var29 == this.x8 * var8 && !var31) {
               var32 = true;
               int var33 = this.k5[0].u3(var15);
               this.s7 = this.n5.n5(this.n5.c8(), this.h0, this.a6.n3(), var2);
               int var35 = q1.l6(this.n5.h0() - var33, this.u3);
               this.x8 = var35 * this.u9 / var8;
               this.s7.n5(var33);
               this.n3 = false;
               this.y4 = new com.aspose.slides.internal.o7p.c8(this.n5.c8(), this.n5.u9(), var35);
            }

            int[] var34 = new int[]{var9};
            this.s7.n5(var7, var3, var34);
            var9 = var34[0];
            if (var9 < var3) {
               int[] var36 = new int[var8];
               int[] var37 = new int[var8];
               p6[] var38 = this.n5(var8);
               int var22 = q1.l6(this.s7.l6() / var8 + var13[0].length, this.x8) - this.s7.l6() / var8;

               for (int var23 = 0; var23 < var8; var23++) {
                  if (var32) {
                     this.k5[var23].u3(var15);
                  }

                  this.n5.n5(this.k5[var23]);
                  var37[var23] = var23 != 1 && var23 != 2 ? var22 : this.y4.k5();
                  this.n5.n5(var13[var23], var37[var23]).n5(var38[var23]);
                  var36[var23] = var38[var23].l6;
               }

               boolean var39 = true;
               int var24 = 0;

               for (int var25 = 0; var25 < var8; var25++) {
                  if (var36[var25] != var37[var25]) {
                     var24 = var25;
                     var39 = false;
                     break;
                  }
               }

               int var40 = var39 ? var22 : var36[var24];
               byte[][] var26 = new byte[var8][];

               for (int var27 = 0; var27 < var8; var27++) {
                  var26[var27] = var27 != 1 && var27 != 2 ? var13[var27] : this.y4.l6(var13[var27]);
               }

               for (int var41 = 0; var41 < var40; var41++) {
                  for (int var28 = 0; var28 < var8; var28++) {
                     var12[var41 * var8 + var28] = var26[var28][var41];
                  }
               }

               var34[0] = var9;
               this.s7.n5(var12, var8 * var22, var7, var3, var34);
               var9 = var34[0];
               if (!var39) {
                  var10 = var24;
                  if (this.c8 == null || this.c8.n5() == 0) {
                     throw new com.aspose.slides.internal.h6t.u3(
                        d1.n5(
                           "The strip {0} in {1} colour plane has corrupt data and cannot be decoded. Error: {2}",new Object[]{ this.k5[var10].u3(), var10, var38[var10].k5
                        })
                     );
                  }

                  this.t2 = this.k5[var10].k5(var15);
                  this.n3 = true;
               }
            }

            if (this.c8 == null || this.c8.k5()) {
               this.n5(this.n5.c8(), var7, var1.n3(), this.c8);
            }

            if (this.n5.a6()) {
               com.aspose.slides.internal.o9n.h0.k5(this.n5, var7, 0, var7.length);
            }

            this.l6.n5(var1.n3(), var7, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
         } else {
            if (this.s7 != null) {
               int[] var16 = new int[]{var9};
               this.s7.n5(var7, var3, var16);
               var9 = var16[0];
               if (var9 == var3) {
                  continue;
               }
            }

            int var30 = this.c8.l6().h0();
            int var17 = this.k5[var10].k5(var15);
            int var18 = (var17 - var1.c8()) * var1.t2();
            int var19 = var3 - var9;
            int var20 = q1.l6(var18 - var9, var19);

            for (int var21 = 0; var21 < var20; var21++) {
               var7[var9++] = var30;
            }

            this.n3 = true;
         }
      }
   }

   private p6[] n5(int var1) {
      p6[] var2 = new p6[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = new p6();
      }

      return var2;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(p6.class, new x8());
   }
}
