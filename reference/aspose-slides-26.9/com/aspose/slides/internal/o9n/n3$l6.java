package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

class n3$l6 extends com.aspose.slides.internal.t6g.n5 {
   private final com.aspose.slides.internal.v6s.u3 n5;
   private final long[][] l6;
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
   private int z1 = 1;

   public n3$l6(n3 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      this.x8 = var4.u3();
      this.s7 = var4.u9();
      this.k5 = var3;
      this.n5 = var2;
      this.t9 = var1;
      long[] var5 = var1.c8().x8(273);
      this.z1 = var1.c8().s3() & 65535;
      int var6 = var5.length / this.z1;
      int[][] var7 = com.aspose.slides.internal.u2w.n5.l6(var1.c8());
      this.u9 = var1.n5(var1.c8(), var7, var4.n3(), this.n5());
      this.t2 = var1.c8().t1();
      this.a6 = (this.t2 * var1.u9() + 7) / 8 / this.z1;
      this.h0 = com.aspose.slides.internal.o9n.n3.n5(var1);
      this.n3 = (this.t2 * var1.u9() - 1) / 8 / this.z1;
      if (this.h0 != null && this.h0.n5() != 0) {
         this.c8 = this.h0.l6().h0();
      }

      this.u3 = new com.aspose.slides.internal.h9s.n5(var1.h0(), var5.length / this.z1, var1.s7());
      if (var5.length % this.z1 != 0) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid strip offsets value {0} for samples count {1}",new Object[]{ var5.length, var1.c8().s3()}));
      }

      this.l6 = new long[this.z1][];
      long[] var8 = var1.c8().x8(273);

      for (int var9 = 0; var9 < this.z1; var9++) {
         var5 = new long[var6];
         com.aspose.slides.ms.System.u3.n5(var8, var9 * var6, var5, 0, var6);
         this.l6[var9] = var5;
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
            com.aspose.slides.internal.o9n.n3.l6(this.t9, var4, 0, var4.length);
         }

         this.y4 = var3;
         ((com.aspose.slides.internal.b8u.y4)this.k5).n5(var1.n3(), var4, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      } else {
         int[] var6 = com.aspose.slides.internal.v6g.k5.k5(var2, int[].class);
         if (this.h0 == null || this.h0.k5()) {
            this.n5(this.t9.c8(), var6, var1.n3(), this.h0);
         }

         if (this.t9.a6()) {
            com.aspose.slides.internal.o9n.n3.l6(this.t9, var6, 0, var6.length);
         }

         this.y4 = var3;
         this.k5.n5(var1.n3(), var6, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
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
            var9 += var11.n5(var8);
         }
      }

      this.t9.n5(var9);
      if (com.aspose.slides.internal.o9n.n3.x8() > 0 && var8 > com.aspose.slides.internal.o9n.n3.x8()) {
         throw new OutOfMemoryException();
      }

      int var38 = 0;
      Object var12;
      if (this.n5()) {
         var12 = new long[var8];
      } else {
         var12 = new int[var8];
      }

      if (this.y4 == var6) {
         int[] var13 = new int[]{0};
         this.u9.n5(var12, var8, var13);
         var38 = var13[0];
      }

      boolean var39 = true;
      int[] var14 = this.t9.c8().k7();

      for (int var15 = 0; var15 < var14.length; var15++) {
         if ((var14[var15] & 65535) != 16) {
            var39 = false;
            break;
         }
      }

      if (var38 < var8) {
         int var40 = (this.t2 * (var3 + var38) >> 3) / this.z1;
         int var16 = (this.t2 * var5 - 1 >> 3) / this.z1;
         int var17 = var16 - var40 + 1;
         int var18 = 0;
         if (var6 > 0) {
            var18 = this.u3.l6(var6);
         }

         int var19 = var6;

         while (var38 < var8 && var19 < var7) {
            if (var19 == this.u3.n5(var18 + 1) && this.s7 == var5) {
               var18++;
            }

            if (var19 < this.e2) {
               int var41 = var2 * (this.e2 - var6);
               int[] var21 = new int[]{var38};
               this.n5(var12, var8, var41, var21);
               var38 = var21[0];
               var19 = var38 / var2 + var6;
            } else {
               if (var3 == this.x8) {
                  this.u9.n5(var3, var19);
               }

               int var20 = 1;
               if (var40 == 0 && var16 == this.n3) {
                  var20 = q1.l6(this.u3.n5(var18 + 1) - var19, var4);
               }

               long var22 = (var19 + var20 - var6) * var2;
               long var24 = var20 * var17;
               com.aspose.slides.internal.r1x.u9[] var26 = this.n5(this.z1);
               com.aspose.slides.internal.h9s.a6[] var27 = new com.aspose.slides.internal.h9s.a6[this.z1];

               for (int var28 = 0; var28 < this.z1; var28++) {
                  long var29 = this.l6[var28][var18] & 4294967295L;
                  long var31 = (var19 - this.u3.n5(var18)) * this.a6;
                  long var33 = var29 + var31 + var40;
                  var27[var28] = new com.aspose.slides.internal.h9s.a6(this.n5, var33, var24);
               }

               do {
                  for (int var42 = 0; var42 < this.z1; var42++) {
                     var27[var42].n5().n5(var26[var42]);
                  }

                  boolean var43 = com.aspose.slides.ms.System.u3.k5(var26, new y4(this));
                  if (!var43) {
                     if (this.h0 == null || this.h0.n5() == 0) {
                        int var47 = com.aspose.slides.ms.System.u3.l6(var26, new e2(this));
                        throw new com.aspose.slides.internal.h6t.u3(d1.n5(new String[]{"Failed to decode the image strip ", a3.l6(var18), ". Details: ", var26[var47].u3}));
                     }

                     this.e2 = this.u3.n5(var18 + 1);
                     int var46 = var2 * (this.e2 - var6);
                     int[] var51 = new int[]{var38};
                     this.n5(var12, var8, var46, var51);
                     var38 = var51[0];
                     break;
                  }

                  byte[] var35 = com.aspose.slides.internal.d9r.u9.n5(0).n5((int)(var24 * this.z1));
                  if (var39) {
                     int var36 = 0;

                     for (long var44 = 0L; var44 < var24; var44 += 2L) {
                        for (int var37 = 0; var37 < this.z1; var37++) {
                           var35[var36++] = var26[var37].n5[(int)var44];
                           var35[var36++] = var26[var37].n5[(int)(var44 + 1L)];
                        }
                     }
                  } else {
                     int var49 = 0;

                     for (long var45 = 0L; var45 < var24; var45++) {
                        for (int var52 = 0; var52 < this.z1; var52++) {
                           var35[var49++] = var26[var52].n5[(int)var45];
                        }
                     }
                  }

                  int[] var50 = new int[]{var38};
                  this.u9.n5(var35, var35.length, var12, var8, var50);
                  var38 = var50[0];
               } while (var38 < var22);

               var19 += var20;
            }
         }
      }

      return var12;
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
      int var9 = this.t9.c8().t9()[0] & 65535;
      int var10 = this.t9.c8().t9()[1] & 65535;
      int var11 = (int)this.t9.c8().v4() / var9;
      int var12 = var3 / var9;
      int var13 = q1.n5(var3, var5 - 1) / var9;
      long var14 = var8 * com.aspose.slides.internal.v6g.k5.n5(9);
      com.aspose.slides.internal.b8u.n3 var16 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.b8u.n3.class);
      if (var16 != null) {
         var14 += var16.n5(var8);
      }

      this.t9.n5(var14);
      if (com.aspose.slides.internal.o9n.n3.x8() > 0 && var8 > com.aspose.slides.internal.o9n.n3.x8()) {
         throw new OutOfMemoryException();
      }

      int var17 = 0;
      int[] var18 = new int[var8];
      if (this.y4 == var6) {
         int[] var19 = new int[]{0};
         this.u9.n5(var18, var8, var19);
         var17 = var19[0];
      }

      if (var17 < var8) {
         int var53 = this.t2 * (var3 + var17) / 8 / this.z1;
         int var20 = (this.t2 * var5 - 1) / 8 / this.z1;
         int var21 = var20 - var53 + 1;
         int var22 = 0;
         if (var6 > 0) {
            var22 = this.u3.l6(var6);
         }

         int var23 = var6;

         while (var17 < var8 && var23 < var7) {
            if (var23 == this.u3.n5(var22 + 1) && this.s7 == var5) {
               var22++;
            }

            if (var23 < this.e2) {
               int var54 = var2 * (this.e2 - var6);
               int[] var55 = new int[]{var17};
               this.n5(var18, var8, var54, var55);
               var17 = var55[0];
               var23 = var17 / var2 + var6;
            } else {
               if (var3 == this.x8) {
                  this.u9.n5(var3, var23);
               }

               int var24 = var23 / var10;
               int var25 = 1;
               boolean var26 = false;
               if (var53 == 0 && var20 == this.n3) {
                  var25 = q1.l6(this.u3.n5(var22 + 1) - var23, var4);
                  var26 = true;
               }

               int var27 = (var23 + var25 - 1) / var10;
               int var28 = (var13 - var12 + 1) * var9;
               int var29 = (var27 - var24 + 1) * var10;
               long var30 = (var23 + var25 - var6) * var2;
               long var32 = var25 * var21;
               com.aspose.slides.internal.r1x.u9[] var34 = this.n5(this.z1);
               com.aspose.slides.internal.h9s.a6[] var35 = new com.aspose.slides.internal.h9s.a6[this.z1];

               for (int var36 = 0; var36 < this.z1; var36++) {
                  if (var36 != 1 && var36 != 2) {
                     long var58 = this.l6[var36][var22] & 4294967295L;
                     long var59 = (var23 - this.u3.n5(var22)) * this.a6;
                     long var61 = var58 + var59 + var53;
                     var35[var36] = new com.aspose.slides.internal.h9s.a6(this.n5, var61, var32);
                  } else {
                     long var37 = this.l6[var36][var22] & 4294967295L;
                     long var39 = var37 + (var24 * var11 + var12) - var11 * this.u3.n5(var22) / var10;
                     long var41 = var28 * var29;
                     var35[var36] = new com.aspose.slides.internal.h9s.a6(this.n5, var39, var41);
                  }
               }

               do {
                  for (int var56 = 0; var56 < this.z1; var56++) {
                     var35[var56].n5().n5(var34[var56]);
                  }

                  boolean var57 = com.aspose.slides.ms.System.u3.k5(var34, new t9(this));
                  if (!var57) {
                     if (this.h0 == null || this.h0.n5() == 0) {
                        int var65 = com.aspose.slides.ms.System.u3.l6(var34, new z1(this));
                        throw new com.aspose.slides.internal.h6t.u3(d1.n5(new String[]{"Failed to decode the image strip ", a3.l6(var22), ". Details: ", var34[var65].u3}));
                     }

                     this.e2 = this.u3.n5(var22 + 1);
                     int var64 = var2 * (this.e2 - var6);
                     int[] var67 = new int[]{var17};
                     this.n5(var18, var8, var64, var67);
                     var17 = var67[0];
                     break;
                  }

                  byte[][] var43 = new byte[this.z1][];

                  for (int var44 = 0; var44 < this.z1; var44++) {
                     if (var44 != 1 && var44 != 2) {
                        var43[var44] = var34[var44].n5;
                     } else {
                        com.aspose.slides.internal.o7p.c8 var45 = new com.aspose.slides.internal.o7p.c8(this.t9.c8(), var28, var29);
                        byte[] var46 = var45.l6(var34[var44].n5);
                        long var62 = var26 ? var32 : var21;
                        int var47 = var26 ? 1 : var25;
                        boolean var48 = var26 && var46.length == var62;
                        byte[] var49 = var48 ? var46 : new byte[(int)(var62 * var47)];
                        if (!var48) {
                           for (int var50 = 0; var50 < var47; var50++) {
                              long var51 = (var23 + var50 - var24 * var10) * var28 + var3 - var12 * var9;
                              com.aspose.slides.ms.System.u3.n5(var46, (int)var51, var49, (int)(var50 * var62), (int)var62);
                           }
                        }

                        var43[var44] = var49;
                     }
                  }

                  byte[] var66 = com.aspose.slides.internal.d9r.u9.n5(0).n5((int)(var32 * this.z1));

                  for (long var60 = 0L; var60 < var32; var60++) {
                     for (long var63 = 0L; var63 < this.z1; var63++) {
                        var66[(int)(var60 * this.z1 + var63)] = var43[(int)var63][(int)var60];
                     }
                  }

                  int[] var68 = new int[]{var17};
                  this.u9.n5(var66, var66.length, var18, var8, var68);
                  var17 = var68[0];
               } while (var17 < var30);

               var23 += var25;
            }
         }
      }

      return var18;
   }

   private com.aspose.slides.internal.r1x.u9[] n5(int var1) {
      com.aspose.slides.internal.r1x.u9[] var2 = new com.aspose.slides.internal.r1x.u9[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = new com.aspose.slides.internal.r1x.u9();
      }

      return var2;
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

   static {
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.r1x.u9.class, new t4());
   }
}
