package com.aspose.slides.internal.z5p;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.k3w.n5$n5;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.z3o.t2;
import java.util.List;

public abstract class n5 implements h0 {
   protected final float n5;
   protected final com.aspose.slides.internal.k3w.a6 l6;
   protected final com.aspose.slides.internal.k3w.u9 k5;
   protected final List<com.aspose.slides.internal.k3w.h0> u3;

   protected n5(com.aspose.slides.internal.k3w.a6 var1) {
      this.n5 = var1.u3() / 2.0F;
      this.l6 = var1;
      this.k5 = var1.h0();
      this.u3 = var1.c8();
   }

   @Override
   public void n5(float var1, float var2) {
      this.k5.k5.n5(var1);
      this.k5.k5.l6(var2);
      this.k5.a6.n5(var1);
      this.k5.a6.l6(var2);
      this.k5.u3.n5(1.0F);
      this.k5.u3.l6(0.0F);
      this.k5.u9.n5(1.0F);
      this.k5.u9.l6(0.0F);
   }

   @Override
   public void l6(float var1, float var2) {
      if (!com.aspose.slides.internal.e3j.u9.n5(this.k5.a6, new w1(var1, var2), 1.0E-6F)) {
         float var3 = var1 - this.k5.a6.l6();
         float var4 = var2 - this.k5.a6.k5();
         if (var3 == 0.0F && var4 == 0.0F) {
            var3 = 1.0F;
         }

         w1 var5 = new w1(var3, var4);

         for (com.aspose.slides.internal.k3w.h0 var7 : this.u3) {
            com.aspose.slides.internal.z3o.a6 var8 = this.n5(var7, var5);
            float var9 = var8.n5;
            float var10 = var8.l6;
            float var11 = var8.k5;
            float var12 = var8.u3;
            var7.t2 = null;
            var7.s7 = null;
            var7.x8 = null;
            var7.n3 = null;
            this.n5(var7, var5, var8);
            if (com.aspose.slides.internal.e3j.u9.n5(var7.t2)) {
               this.l6.k5(var7, var7.t2);
               if (!com.aspose.slides.internal.e3j.u9.n5(var7.t2, var7.s7, 0.0F)) {
                  this.l6(var7, var7.s7.l6(), var7.s7.k5(), 0.0F, 0.0F);
               }
            } else if (this.k5()) {
               this.l6(var7, this.k5.a6.l6(), this.k5.a6.k5(), var9, var10);
            }

            this.l6(var7, var1, var2, var9, var10);
            if (com.aspose.slides.internal.e3j.u9.n5(var7.x8)) {
               this.l6.u3(var7, var7.x8);
               if (!com.aspose.slides.internal.e3j.u9.n5(var7.x8, var7.n3, 0.0F)) {
                  this.k5(var7, var7.n3.l6(), var7.n3.k5(), 0.0F, 0.0F);
               }
            } else {
               this.k5(var7, this.k5.a6.l6(), this.k5.a6.k5(), var11, var12);
            }

            this.k5(var7, var1, var2, var11, var12);
            var8.n5(var7.u3);
         }

         this.k5.u9.n5(var3);
         this.k5.u9.l6(var4);
         this.k5.a6.n5(var1);
         this.k5.a6.l6(var2);
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      float[] var5 = this.k5.c8;
      var5[0] = this.k5.a6.l6();
      var5[1] = this.k5.a6.k5();
      var5[2] = var1;
      var5[3] = var2;
      var5[4] = var3;
      var5[5] = var4;
      float var6 = var5[4];
      float var7 = var5[5];
      float var8 = var5[2] - var5[0];
      float var9 = var5[3] - var5[1];
      float var10 = var5[4] - var5[2];
      float var11 = var5[5] - var5[3];
      if (var8 == 0.0F && var9 == 0.0F || var10 == 0.0F && var11 == 0.0F) {
         var8 = var10 = var5[4] - var5[0];
         var9 = var11 = var5[5] - var5[1];
      }

      if (var8 == 0.0F && var9 == 0.0F) {
         this.l6(var5[0], var5[1]);
      } else {
         if (Math.abs(var8) < 0.1F && Math.abs(var9) < 0.1F) {
            float var12 = (float)Math.sqrt(var8 * var8 + var9 * var9);
            var8 /= var12;
            var9 /= var12;
         }

         if (Math.abs(var10) < 0.1F && Math.abs(var11) < 0.1F) {
            float var22 = (float)Math.sqrt(var10 * var10 + var11 * var11);
            var10 /= var22;
            var11 /= var22;
         }

         w1 var23 = new w1(var8, var9);

         for (com.aspose.slides.internal.k3w.h0 var14 : this.u3) {
            com.aspose.slides.internal.z3o.a6 var15 = this.n5(var14, var23);
            this.n5(var14, var23, var15);
         }

         int var24 = n5(this.k5.h0, var5, this.k5.t2, 6, this.n5);
         n5$n5 var25 = this.k5.h0.n5(var5, 6, this.k5.t2, var24);
         byte var26 = 0;
         Object var16 = null;
         Object var17 = null;

         while (var25.n5()) {
            int var18 = var25.l6();

            for (com.aspose.slides.internal.k3w.h0 var20 : this.u3) {
               t2 var21 = var20.n5.n5(var5, var18);
               var16 = var21.l6;
               var17 = var21.k5;
               this.l6.l6(var20, (float)((float[])var16)[0], (float)((float[])var16)[1]);
               switch (var21.n5) {
                  case QUAD:
                     this.l6.n5(var20, (float)((float[])var16)[2], (float)((float[])var16)[3], (float)((float[])var16)[4], (float)((float[])var16)[5]);
                     this.l6.l6(var20, (float)((float[])var17)[0], (float)((float[])var17)[1], (float)((float[])var17)[2], (float)((float[])var17)[3]);
                     var26 = 6;
                     break;
                  case LINE:
                     this.l6.l6(var20, (float)((float[])var16)[2], (float)((float[])var16)[3]);
                     this.l6.k5(var20, (float)((float[])var17)[0], (float)((float[])var17)[1]);
                     var26 = 4;
               }

               this.l6.k5(var20, (float)((float[])var17)[var26 - 2], (float)((float[])var17)[var26 - 1]);
            }
         }

         for (com.aspose.slides.internal.k3w.h0 var30 : this.u3) {
            var30.n5.l6(var10, var11).n5(var30.u3);
         }

         this.k5.u9.n5(var10);
         this.k5.u9.l6(var11);
         this.k5.a6.n5(var6);
         this.k5.a6.l6(var7);
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var7 = this.k5.c8;
      var7[0] = this.k5.a6.l6();
      var7[1] = this.k5.a6.k5();
      var7[2] = var1;
      var7[3] = var2;
      var7[4] = var3;
      var7[5] = var4;
      var7[6] = var5;
      var7[7] = var6;
      float var8 = var7[6];
      float var9 = var7[7];
      float var10 = var7[2] - var7[0];
      float var11 = var7[3] - var7[1];
      float var12 = var7[6] - var7[4];
      float var13 = var7[7] - var7[5];
      boolean var14 = var10 == 0.0F && var11 == 0.0F;
      boolean var15 = var12 == 0.0F && var13 == 0.0F;
      if (var14) {
         var10 = var7[4] - var7[0];
         var11 = var7[5] - var7[1];
         if (var10 == 0.0F && var11 == 0.0F) {
            var10 = var7[6] - var7[0];
            var11 = var7[7] - var7[1];
         }
      }

      if (var15) {
         var12 = var7[6] - var7[2];
         var13 = var7[7] - var7[3];
         if (var12 == 0.0F && var13 == 0.0F) {
            var12 = var7[6] - var7[0];
            var13 = var7[7] - var7[1];
         }
      }

      if (var10 == 0.0F && var11 == 0.0F) {
         this.l6(var7[0], var7[1]);
      } else {
         if (Math.abs(var10) < 0.1F && Math.abs(var11) < 0.1F) {
            float var16 = (float)Math.sqrt(var10 * var10 + var11 * var11);
            var10 /= var16;
            var11 /= var16;
         }

         if (Math.abs(var12) < 0.1F && Math.abs(var13) < 0.1F) {
            float var26 = (float)Math.sqrt(var12 * var12 + var13 * var13);
            var12 /= var26;
            var13 /= var26;
         }

         w1 var27 = new w1(var10, var11);

         for (com.aspose.slides.internal.k3w.h0 var18 : this.u3) {
            com.aspose.slides.internal.z3o.a6 var19 = this.n5(var18, var27);
            this.n5(var18, var27, var19);
         }

         int var28 = n5(this.k5.h0, var7, this.k5.t2, 8, this.n5);
         Object var29 = null;
         Object var31 = null;
         byte var20 = 0;
         n5$n5 var21 = this.k5.h0.n5(var7, 8, this.k5.t2, var28);

         while (var21.n5()) {
            int var22 = var21.l6();

            for (com.aspose.slides.internal.k3w.h0 var24 : this.u3) {
               com.aspose.slides.internal.z3o.l6 var25 = var24.n5.l6(var7, var22);
               var29 = var25.l6;
               var31 = var25.k5;
               this.l6.l6(var24, (float)((float[])var29)[0], (float)((float[])var29)[1]);
               this.l6.k5(var24, (float)((float[])var31)[0], (float)((float[])var31)[1]);
               switch (var25.n5) {
                  case LINE:
                     this.l6.l6(var24, (float)((float[])var29)[2], (float)((float[])var29)[3]);
                     this.l6.k5(var24, (float)((float[])var31)[0], (float)((float[])var31)[1]);
                     var20 = 4;
                     break;
                  case CURVE:
                     this.l6
                        .n5(
                           var24,
                           (float)((float[])var29)[2],
                           (float)((float[])var29)[3],
                           (float)((float[])var29)[4],
                           (float)((float[])var29)[5],
                           (float)((float[])var29)[6],
                           (float)((float[])var29)[7]
                        );
                     this.l6
                        .l6(
                           var24,
                           (float)((float[])var31)[0],
                           (float)((float[])var31)[1],
                           (float)((float[])var31)[2],
                           (float)((float[])var31)[3],
                           (float)((float[])var31)[4],
                           (float)((float[])var31)[5]
                        );
                     var20 = 8;
               }

               this.l6.k5(var24, (float)((float[])var31)[var20 - 2], (float)((float[])var31)[var20 - 1]);
            }
         }

         for (com.aspose.slides.internal.k3w.h0 var34 : this.u3) {
            var34.n5.l6(var12, var13).n5(var34.u3);
         }

         this.k5.u9.n5(var12);
         this.k5.u9.l6(var13);
         this.k5.a6.n5(var8);
         this.k5.a6.l6(var9);
      }
   }

   @Override
   public void l6() {
      this.n5(true);
      this.l6.t2();
   }

   protected void n5(boolean var1) {
      this.l6.n5(var1);
   }

   protected abstract void n5(com.aspose.slides.internal.k3w.h0 var1, w1 var2, com.aspose.slides.internal.z3o.a6 var3);

   protected void l6(com.aspose.slides.internal.k3w.h0 var1, w1 var2, com.aspose.slides.internal.z3o.a6 var3) {
      this.n5(var1, this.k5.a6.l6(), this.k5.a6.k5(), var3.n5, var3.l6);
      var2.n5(this.k5.u3);
      var3.n5(var1.k5);
   }

   protected boolean k5() {
      return true;
   }

   private com.aspose.slides.internal.z3o.a6 n5(com.aspose.slides.internal.k3w.h0 var1, w1 var2) {
      com.aspose.slides.internal.z3o.a6 var3 = null;
      if (this.l6.u9()) {
         var3 = new com.aspose.slides.internal.z3o.a6();
      } else {
         com.aspose.slides.internal.z3o.a6 var4 = this.k5.l6.l6(var2.l6(), var2.k5());
         a6$n5 var5 = var4.n5(this.k5.a6.l6(), this.k5.a6.k5(), var2.l6(), var2.k5());
         if (this.k5.n5 == null) {
            this.k5.n5 = var5;
         }

         if (this.k5.n5 == var5 || this.k5.n5 != a6$n5.n5 && this.k5.n5 != a6$n5.l6 || var5 != a6$n5.n5 && var5 != a6$n5.l6) {
            if (this.k5.l6 == var1.n5) {
               var3 = var4;
            } else {
               var3 = var1.n5.l6(var2.l6(), var2.k5());
            }
         } else {
            var3 = var1.n5.n5(var2.l6(), var2.k5());
         }
      }

      if (var1.h0 == null) {
         a6$n5[] var7 = this.n5(this.k5.a6, var2, var3);
         var1.h0 = var7[0];
         var1.c8 = var7[1];
      }

      return var3;
   }

   private a6$n5[] n5(w1 var1, w1 var2, com.aspose.slides.internal.z3o.a6 var3) {
      float var4 = var1.l6() + var3.n5;
      float var5 = var1.k5() + var3.l6;
      float var6 = var1.l6() + var3.k5;
      float var7 = var1.k5() + var3.u3;
      w1 var8 = new w1(var1.l6() + var2.l6(), var1.k5() + var2.k5());
      a6$n5 var9 = com.aspose.slides.internal.e3j.a6.n5(var1, var8, new w1(var4, var5));
      a6$n5 var10 = com.aspose.slides.internal.e3j.a6.n5(var1, var8, new w1(var6, var7));
      return new a6$n5[]{var9, var10};
   }

   protected void n5(com.aspose.slides.internal.k3w.h0 var1, float var2, float var3, float var4, float var5) {
      if (this.l6.u9()) {
         var5 = 0.0F;
         var4 = 0.0F;
      }

      this.l6.n5(var1, var2 + var4, var3 + var5);
   }

   protected void l6(com.aspose.slides.internal.k3w.h0 var1, float var2, float var3, float var4, float var5) {
      if (this.l6.u9()) {
         var5 = 0.0F;
         var4 = 0.0F;
      }

      this.l6.l6(var1, var2 + var4, var3 + var5);
   }

   protected void k5(com.aspose.slides.internal.k3w.h0 var1, float var2, float var3, float var4, float var5) {
      if (this.l6.u9()) {
         var5 = 0.0F;
         var4 = 0.0F;
      }

      this.l6.k5(var1, var2 + var4, var3 + var5);
   }

   protected void n5(com.aspose.slides.internal.k3w.h0 var1) {
      this.l6.l6(var1);
   }

   private static int n5(com.aspose.slides.internal.k3w.n5 var0, float[] var1, float[] var2, int var3, float var4) {
      float var5 = var1[2] - var1[0];
      float var6 = var1[3] - var1[1];
      if (var6 != 0.0F && var5 != 0.0F) {
         float var7 = (float)Math.sqrt(var5 * var5 + var6 * var6);
         float var8 = var5 / var7;
         float var9 = var6 / var7;
         float var10 = var8 * var1[0] + var9 * var1[1];
         float var11 = var8 * var1[1] - var9 * var1[0];
         float var12 = var8 * var1[2] + var9 * var1[3];
         float var13 = var8 * var1[3] - var9 * var1[2];
         float var14 = var8 * var1[4] + var9 * var1[5];
         float var15 = var8 * var1[5] - var9 * var1[4];
         switch (var3) {
            case 6:
               var0.n5(var10, var11, var12, var13, var14, var15);
               break;
            case 8:
               float var16 = var8 * var1[6] + var9 * var1[7];
               float var17 = var8 * var1[7] - var9 * var1[6];
               var0.n5(var10, var11, var12, var13, var14, var15, var16, var17);
         }
      } else {
         var0.n5(var1, var3);
      }

      int var18 = 0;
      var18 += var0.l6(var2, var18);
      var18 += var0.k5(var2, var18);
      if (var3 == 8) {
         var18 += var0.u3(var2, var18);
      }

      var18 += var0.n5(var2, var18, var4, 1.0E-4F);
      var18 = com.aspose.slides.internal.k3w.l6.n5(var2, 0, var18, 1.0E-4F, 0.9999F);
      com.aspose.slides.internal.k3w.l6.n5(var2, 0, var18);
      return var18;
   }
}
