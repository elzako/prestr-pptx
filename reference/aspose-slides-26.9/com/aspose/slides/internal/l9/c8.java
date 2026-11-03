package com.aspose.slides.internal.l9;

import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.g9.n3;
import com.aspose.slides.internal.g9.t4;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.internal.v2.y4;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class c8 extends u3 {
   private com.aspose.slides.internal.o9b.l6 n5;
   private byte[] l6;
   private int k5 = -1;
   private int u3;
   private int a6;
   private int u9;
   private byte[] h0;
   private byte[] c8;
   private int t2;

   public c8(s7 var1, com.aspose.slides.internal.e7.t2 var2) {
      super(var1, var2);
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      if (this.n5 != null) {
         return this.n5;
      }

      try {
         s7 var1 = this.t9();
         this.l6 = var1.n5();
         if (this.l6.length == 0) {
            return null;
         }

         x8 var2 = var1.l6();
         com.aspose.slides.internal.v1.u9 var3 = var2.u9();
         String var4 = var3.l6().u3(com.aspose.slides.internal.v2.c8.b2);
         if (d1.n5(var4)
            || !d1.a6(var4, com.aspose.slides.internal.v2.c8.q7.n5())
               && !d1.a6(var4, com.aspose.slides.internal.v2.c8.u5.n5())
               && !d1.a6(var4, com.aspose.slides.internal.v2.c8.q8.n5())) {
            com.aspose.slides.internal.v2.n5 var5 = this.n3();
            this.k5 = -1;
            this.u3 = this.u9();
            this.a6 = this.a6();
            this.u9 = this.s7();
            if (var5 == null) {
               var5 = new com.aspose.slides.internal.v2.n5();
               float var6 = (float)q1.a6(2.0, this.u9);
               float[] var7 = new float[]{0.0F, var6 - 1.0F};
               var5.n5(var7);
            }

            com.aspose.slides.internal.g9.a6 var39 = this.h0();
            if (var39 == null) {
               return null;
            }

            this.h0 = null;
            this.c8 = null;
            this.t2 = 0;
            e2 var41 = new e2();
            if (this.n5(var39, true) < 0) {
               if (com.aspose.slides.internal.v6g.k5.l6(var39, com.aspose.slides.internal.g9.e2.class)) {
                  com.aspose.slides.internal.g9.e2 var43 = com.aspose.slides.internal.v6g.k5.n5(var39, com.aspose.slides.internal.g9.e2.class);
                  this.n5 = this.n5(var2, var5, this.u3, this.a6);
                  this.n5 = var43.n5(this.n5);
                  u3 var45 = this.u3();
                  if (var45 != null) {
                     float[] var47 = this.n5(var45);
                     this.n5 = this.n5(this.n5, true, var47);
                  }

                  this.n5.n5(var41, com.aspose.slides.internal.j9e.x8.s7());
                  this.l6 = var41.toArray();
                  var41.close();
                  return this.n5;
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var39, t4.class)) {
                  t4 var8 = com.aspose.slides.internal.v6g.k5.n5(var39, t4.class);
                  com.aspose.slides.internal.g9.a6 var9 = var8.l6();
                  int var10 = var9.a6();
                  com.aspose.slides.internal.j0.l6 var11 = var8.u9();
                  boolean var12 = var5 != null && var5.u3(0) == 1;
                  int var13 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(2.0, this.u9), 14) - 1;
                  byte[] var14 = new byte[this.u3 * this.a6 * var10];
                  int var15 = this.u3 * var10;
                  float[] var16 = new float[1];

                  for (int var17 = 0; var17 < this.a6; var17++) {
                     int var18 = var17 * var15;

                     for (int var19 = 0; var19 < this.u3; var19++) {
                        int var20 = var17 * this.u3 + var19;
                        byte var21 = this.l6[var20];
                        int var22 = ((var21 & 255) + 256) % 256;
                        if (var12) {
                           var16[0] = 1 - var22 / var13;
                        } else {
                           var16[0] = var22 / var13;
                        }

                        float[] var23 = var11.n5(var16);
                        int var24 = var19 * var10;

                        for (int var25 = 0; var25 < var10; var25++) {
                           float var26 = var23[var25];
                           var14[var18 + var24 + var25] = com.aspose.slides.internal.v6g.k5.n5((Object)(var26 * var13), (int)(13));
                        }
                     }
                  }

                  this.l6 = var14;
               }
            }

            t2 var42 = new t2(var41);
            if (var5 != null && this.u9 == 1) {
               int var44 = var5.u3(0);
               int var46 = var5.u3(1);
               if (var44 == 1 && var46 == 0) {
                  for (int var48 = 0; var48 < this.l6.length; var48++) {
                     this.l6[var48] = (byte)(this.l6[var48] & 0xFF ^ 255);
                  }
               }
            }

            var42.n5(this.u3, this.a6, this.u9, this.k5);
            if (this.c8 != null) {
               var42.n5(this.c8);
            }

            if (this.h0 != null) {
               var42.l6(this.h0);
            }

            var42.n5(this.l6, this.t2);
            var42.n5();
            this.l6 = var41.toArray();
            var41.close();
         }

         e2 var38 = new e2(this.l6);

         try {
            this.n5 = new com.aspose.slides.internal.o9b.l6(var38);
            this.n5 = this.n5(this.n5, true, (float[])null);
            e2 var40 = new e2();

            try {
               this.n5.n5(var40, com.aspose.slides.internal.j9e.x8.s7());
               this.l6 = var40.toArray();
            } finally {
               if (var40 != null) {
                  var40.dispose();
               }
            }

            return this.n5;
         } finally {
            if (var38 != null) {
               var38.dispose();
            }
         }
      } catch (RuntimeException var37) {
         return null;
      }
   }

   private com.aspose.slides.internal.o9b.l6 n5(x8 var1, com.aspose.slides.internal.v2.n5 var2, int var3, int var4) {
      com.aspose.slides.internal.z0k.t4 var5 = var1.u3();
      var5.seek(0L, 0);
      com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var3, var4, 196865);
      com.aspose.slides.internal.j9e.n5 var7 = var6.n5(new y2(0, 0, var3, var4), 2, 196865);

      try {
         int var8 = q1.n5(var7.a6());
         int var9 = (var3 + 7) / 8;
         byte[] var10 = new byte[var9];
         byte[] var11 = new byte[var8 * var4];
         boolean var12 = var2.u3(0) > var2.u3(1);

         for (int var13 = 0; var13 < var4; var13++) {
            int var14 = var5.read(var10, 0, var9);
            if (var14 != var9) {
               break;
            }

            int var15 = var13 * var8;

            for (int var16 = 0; var16 < var9; var16++) {
               var11[var15 + var16] = var12 ? (byte)(~(var10[var16] & 255)) : var10[var16];
            }
         }

         com.aspose.slides.internal.e3m.n5.n5(var11, 0, var7.u3(), var11.length);
      } finally {
         var6.n5(var7);
      }

      return var6;
   }

   private int n5(com.aspose.slides.internal.v2.e2 var1, boolean var2) {
      com.aspose.slides.internal.v2.c8 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.v2.c8.class);
      if (var1 == null && this.u9 == 1) {
         this.t2 = (this.u3 * this.u9 + 7) / 8;
         this.k5 = 0;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.s7.class) || var3 == com.aspose.slides.internal.v2.c8.y9) {
         this.t2 = (this.u3 * this.u9 + 7) / 8;
         this.k5 = 0;
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, n3.class) && var3 != com.aspose.slides.internal.v2.c8.w3) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, t4.class)
            && (
               com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.n5.class)
                  || com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.n5.class)
            )) {
            com.aspose.slides.internal.v2.n5 var4;
            if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.n5.class)) {
               var4 = ((com.aspose.slides.internal.g9.n5)var1).n5();
            } else {
               var4 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.v2.n5.class);
            }

            com.aspose.slides.internal.v2.s7 var5 = var4.l6(0);
            com.aspose.slides.internal.v2.c8 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.v2.c8.class);
            if (var6 == com.aspose.slides.internal.v2.c8.a3) {
               this.t2 = (this.u3 * this.u9 + 7) / 8;
               this.k5 = 0;
            } else if (var6 == com.aspose.slides.internal.v2.c8.p3) {
               if (this.u9 == 8 || this.u9 == 16) {
                  this.t2 = (this.u3 * this.u9 * 3 + 7) / 8;
                  this.k5 = 2;
               }
            } else if (var6 == com.aspose.slides.internal.v2.c8.e8) {
               x8 var7 = (x8)var4.l6(1);
               int var8 = var7.t2(com.aspose.slides.internal.v2.c8.v1);
               if (var8 == 1) {
                  this.t2 = (this.u3 * this.u9 + 7) / 8;
                  this.k5 = 0;
                  com.aspose.slides.internal.z0k.t4 var9 = var7.u3();
                  byte[] var10 = com.aspose.slides.internal.d4.l6.n5(var9);
                  var9.dispose();
                  this.c8 = var10;
               } else if (var8 == 3) {
                  this.t2 = (this.u3 * this.u9 * 3 + 7) / 8;
                  this.k5 = 2;
                  com.aspose.slides.internal.z0k.t4 var14 = var7.u3();
                  byte[] var16 = com.aspose.slides.internal.d4.l6.n5(var14);
                  var14.dispose();
                  this.c8 = var16;
               }
            } else if (var2 && var6 == com.aspose.slides.internal.v2.c8.x1) {
               com.aspose.slides.internal.v2.s7 var12 = var4.l6(1);
               this.n5(var12, false);
               if (this.k5 == 2) {
                  com.aspose.slides.internal.v2.s7 var13 = var4.l6(3);
                  if (com.aspose.slides.internal.v6g.k5.l6(var13, y4.class)) {
                     this.h0 = ((y4)var13).n5();
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var13, x8.class)) {
                     x8 var15 = com.aspose.slides.internal.v6g.k5.n5(var13, x8.class);
                     com.aspose.slides.internal.z0k.t4 var17 = var15.u3();
                     byte[] var11 = com.aspose.slides.internal.d4.l6.n5(var17);
                     var17.dispose();
                     this.h0 = var11;
                  }

                  this.t2 = (this.u3 * this.u9 + 7) / 8;
                  this.k5 = 3;
               }
            }
         }
      } else if (this.u9 == 8 || this.u9 == 16) {
         this.t2 = (this.u3 * this.u9 * 3 + 7) / 8;
         this.k5 = 2;
      }

      return this.k5;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5();
      if (this.n5 != null) {
         var1.write(this.l6, 0, this.l6.length);
      }
   }
}
