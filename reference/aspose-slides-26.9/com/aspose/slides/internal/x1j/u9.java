package com.aspose.slides.internal.x1j;

import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;

final class u9 implements h0 {
   private final h0 l6;
   private final int k5;
   private int u3;
   private final int a6;
   private boolean u9 = false;
   private w1 h0 = new w1(0.0F, 0.0F);
   private int c8;
   private int t2;
   private final float s7;
   private final float[][] x8 = new float[3][2];
   private final float[] n3 = new float[2];
   private final float y4;
   private int e2;
   private float t9;
   private float z1;
   private float t4;
   private float q0;
   private float z3;
   private float m1;
   private float k7;
   private float m3;
   private float z8;
   private float j5;
   private float w1;
   private float r4;
   private w1 c4;
   private w1 y2;
   private w1 y1;
   private w1 a0;
   private w1 d2;
   private w1 d5;
   private final com.aspose.slides.internal.e6q.u3 s3;
   private final float[] p8 = new float[16];
   private final float[] f2 = new float[8];
   private final float[] i1 = new float[8];
   private final float[] e5 = new float[10];
   private static k5 b3 = new k5();
   // $VF: synthetic field
   static final boolean n5 = !u9.class.desiredAssertionStatus();

   public u9(h0 var1, float var2, int var3, int var4, int var5, float var6, int var7) {
      this.l6 = var1;
      this.s3 = com.aspose.slides.internal.e6q.a6.n5(var2, var1, var3, var4, var7);
      this.s7 = var2 / 2.0F;
      this.k5 = var5;
      this.u3 = var7;
      this.a6 = this.u3;
      this.c8 = var3;
      this.t2 = var4;
      float var8 = var6 * this.s7;
      this.y4 = var8 * var8;
      this.e2 = 2;
   }

   private void k5(float var1, float var2) {
      this.t9 = var1;
      this.z1 = var2;
      this.z3 = var1;
      this.m1 = var2;
      if (this.c4 == null) {
         this.c4 = new w1(var1, var2);
         this.y1 = new w1(var1, var2);
      }
   }

   private void u3(float var1, float var2) {
      if (this.y2 == null) {
         this.y2 = new w1(var1, var2);
      }

      this.y1 = new w1(var1, var2);
      this.a0 = new w1(this.z3, this.m1);
      this.z3 = var1;
      this.m1 = var2;
   }

   private void a6(float var1, float var2) {
      this.z8 = var1;
      this.j5 = var2;
      if (this.d2 == null) {
         this.d2 = new w1(var1, var2);
      }
   }

   private void u9(float var1, float var2) {
      this.w1 = var1;
      this.r4 = var2;
      this.d5 = new w1(var1, var2);
   }

   @Override
   public void n5(float var1, float var2) {
      if (this.e2 == 1) {
         this.h0();
      }

      this.k5(var1, var2);
      this.k7 = this.t4 = 1.0F;
      this.m3 = this.q0 = 0.0F;
      this.e2 = 0;
   }

   private void h0(float var1, float var2) {
      float var3 = var1 - this.z3;
      float var4 = var2 - this.m1;
      if (var3 == 0.0F && var4 == 0.0F) {
         var3 = 1.0F;
      }

      this.l6();
      n5(var3, var4, this.s7, this.x8[0]);
      float var5 = this.x8[0][0];
      float var6 = this.x8[0][1];
      this.u9(var5, var6);
      this.k7 = var3;
      this.m3 = var4;
      this.u3(var1, var2);
      this.e2 = 1;
   }

   private void c8(float var1, float var2) {
      float var3 = var1;
      float var4 = var2;
      float var5 = var1 - this.z3;
      float var6 = var2 - this.m1;
      if (var5 == 0.0F && var6 == 0.0F) {
         var5 = 1.0F;
      }

      this.k5();
      n5(var5, var6, this.s7, this.x8[0]);
      float var7 = this.x8[0][0];
      float var8 = this.x8[0][1];
      this.n5(this.k7, this.m3, this.z3, this.m1, var5, var6, this.w1, this.r4, var7, var8);
      float var9 = this.z3;
      float var10 = this.m1;
      float var11 = var9 - var7;
      float var12 = var9 + var7;
      float var13 = var1 - var7;
      float var14 = var1 + var7;
      float var15 = var10 - var8;
      float var16 = var10 + var8;
      float var17 = var2 - var8;
      float var18 = var2 + var8;
      this.l6();
      float[] var19 = new float[]{this.k7, this.m3, this.z3, this.m1, var5, var6, this.w1, this.r4, var7, var8};
      this.n5(this.k7, this.m3, this.z3, this.m1, var5, var6, this.w1, this.r4, var7, var8);
      this.l6();
      n5(var5, var6, this.s7, this.x8[0]);
      var7 = this.x8[0][0];
      var8 = this.x8[0][1];
      this.n5(var19[0], var19[1], var19[2], var19[3], var19[4], var19[5], var19[6], var19[7], var19[8], var19[9]);
      double var20 = com.aspose.slides.internal.c9b.a6.k5(new w1(var9, var10), new w1(var1, var2));
      double var22 = var8 * var8 + var7 * var7;
      double var24 = Math.pow(var22, 0.5);
      float var26 = (float)(var24 * Math.cos(var20));
      float var27 = (float)(var24 * Math.sin(var20));
      float var28 = 1.5F;
      float var29 = var12;
      float var30 = var16;
      w1 var31 = com.aspose.slides.internal.c9b.a6.n5(new w1(var9, var10), var20 + Math.PI, this.s7 * var28);
      float var32 = var31.l6();
      float var33 = var31.k5();
      var31 = com.aspose.slides.internal.c9b.a6.n5(new w1(var9, var10), var20 + (Math.PI / 2), this.s7);
      float var34 = var31.l6();
      float var35 = var31.k5();
      float var36 = 1.0F;
      float var37 = com.aspose.slides.internal.c9b.a6.n5(var9, var10, var1, var2);
      if (Math.abs(var37) < var24 * var36) {
         var1 = (float)(var1 + var5 * var24 * var36 / Math.abs(var37));
         var2 = (float)(var2 + var6 * var24 * var36 / Math.abs(var37));
         var13 = var1 - var7;
         var14 = var1 + var7;
         var17 = var2 - var8;
         var18 = var2 + var8;
      }

      this.n5(var29, var30, var32, var33, var34, var35, false);
      this.s7(var12, var16);
      this.s7(var14 - var26 * var36, var18 - var27 * var36);
      this.n5(var11, var15, true);
      this.n5(var13 - var26 * var36, var17 - var27 * var36, true);
      var29 = var13 - var26 * var36;
      var30 = var17 - var27 * var36;
      var31 = com.aspose.slides.internal.c9b.a6.n5(new w1(var1 - var26 * var36, var2 - var27 * var36), var20, this.s7 * var28);
      var32 = var31.l6();
      var33 = var31.k5();
      var31 = com.aspose.slides.internal.c9b.a6.n5(new w1(var1 - var26 * var36, var2 - var27 * var36), var20 - (Math.PI / 2), this.s7);
      var34 = var31.l6();
      var35 = var31.k5();
      this.n5(var29, var30, var32, var33, var34, var35, true);
      this.u9(var7, var8);
      this.k7 = var5;
      this.m3 = var6;
      this.u3(var3, var4);
      this.e2 = 1;
      this.u3();
   }

   private void k5() {
      this.u9 = true;
   }

   private void u3() {
      this.u3 = this.a6;
   }

   @Override
   public void l6(float var1, float var2) {
      float var3 = var1;
      float var4 = var2;
      float var5 = var1 - this.z3;
      float var6 = var2 - this.m1;
      if (var5 == 0.0F && var6 == 0.0F) {
         var5 = 1.0F;
      }

      n5(var5, var6, this.s7, this.x8[0]);
      float var7 = this.x8[0][0];
      float var8 = this.x8[0][1];
      if (this.u3 != 2 || (Math.abs(this.k7) == 1.0F || this.k7 == 0.0F) && this.m3 == 0.0F) {
         this.n5(this.k7, this.m3, this.z3, this.m1, var5, var6, this.w1, this.r4, var7, var8);
         float var39 = this.z3;
         float var10 = this.m1;
         float var11 = var39 - var7;
         float var12 = var39 + var7;
         float var13 = var1 - var7;
         float var14 = var1 + var7;
         float var15 = var10 - var8;
         float var16 = var10 + var8;
         float var17 = var2 - var8;
         float var18 = var2 + var8;
         if (this.u3 == 0) {
            this.s7(var12, var16);
            this.s7(var14, var18);
            this.n5(var11, var15, true);
            this.n5(var13, var17, true);
         } else if (this.u3 == 2) {
            double var19 = com.aspose.slides.internal.c9b.a6.k5(new w1(var39, var10), new w1(var1, var2));
            double var21 = var8 * var8 + var7 * var7;
            double var23 = Math.pow(var21, 0.5);
            float var25 = (float)(var23 * Math.cos(var19));
            float var26 = (float)(var23 * Math.sin(var19));
            float var27 = 1.5F;
            float var28 = var12;
            float var29 = var16;
            w1 var30 = com.aspose.slides.internal.c9b.a6.n5(new w1(var39, var10), var19 + Math.PI, this.s7 * var27);
            float var31 = var30.l6();
            float var32 = var30.k5();
            var30 = com.aspose.slides.internal.c9b.a6.n5(new w1(var39, var10), var19 + (Math.PI / 2), this.s7);
            float var33 = var30.l6();
            float var34 = var30.k5();
            float var35 = 1.0F;
            float var36 = com.aspose.slides.internal.c9b.a6.n5(var39, var10, var1, var2);
            if (var36 != 0.0F) {
               if (Math.abs(var36) < var23 * var35) {
                  var1 = (float)(var1 + var5 * var23 * var35 / Math.abs(var36));
                  var2 = (float)(var2 + var6 * var23 * var35 / Math.abs(var36));
                  var13 = var1 - var7;
                  var14 = var1 + var7;
                  var17 = var2 - var8;
                  var18 = var2 + var8;
               }

               this.n5(var28, var29, var31, var32, var33, var34, false);
               this.s7(var12, var16);
               this.s7(var14 - var25 * var35, var18 - var26 * var35);
               this.n5(var11, var15, true);
               this.n5(var13 - var25 * var35, var17 - var26 * var35, true);
               var28 = var13 - var25 * var35;
               var29 = var17 - var26 * var35;
               this.u3();
               var30 = com.aspose.slides.internal.c9b.a6.n5(new w1(var1 - var25 * var35, var2 - var26 * var35), var19, this.s7 * var27);
               var31 = var30.l6();
               var32 = var30.k5();
               var30 = com.aspose.slides.internal.c9b.a6.n5(new w1(var1 - var25 * var35, var2 - var26 * var35), var19 - (Math.PI / 2), this.s7);
               var33 = var30.l6();
               var34 = var30.k5();
               this.n5(var28, var29, var31, var32, var33, var34, true);
            }
         } else if (this.u3 == 3) {
            double var40 = com.aspose.slides.internal.c9b.a6.k5(new w1(var39, var10), new w1(var1, var2));
            double var41 = Math.pow(var8 * var8 + var7 * var7, 0.5);
            float var37 = (float)(var41 * Math.cos(var40));
            float var38 = (float)(var41 * Math.sin(var40));
            byte var42 = 2;
            float var43 = com.aspose.slides.internal.c9b.a6.n5(var39, var10, var1, var2);
            if (Math.abs(var43) < var41 * var42) {
               var1 = (float)(var1 + var5 * var41 * var42 / Math.abs(var43));
               var2 = (float)(var2 + var6 * var41 * var42 / Math.abs(var43));
               var13 = var1 - var7;
               var14 = var1 + var7;
               var17 = var2 - var8;
               var18 = var2 + var8;
            }

            this.s7(var39 - var37, var10 - var38);
            this.s7(var12, var16);
            this.s7(var14 - var37 * var42, var18 - var38 * var42);
            this.s7(var1 - var37 * var42 / 2.0F, var2 - var38 * var42 / 2.0F);
            this.n5(var39 - var37, var10 - var38, true);
            this.n5(var11, var15, true);
            this.n5(var13 - var37 * var42, var17 - var38 * var42, true);
            this.n5(var1 - var37 * var42 / 2.0F, var2 - var38 * var42 / 2.0F, true);
         }

         this.u3();
         this.u9(var7, var8);
         this.k7 = var5;
         this.m3 = var6;
         this.u3(var3, var4);
         this.e2 = 1;
         this.h0 = new w1(var1, var2);
      } else {
         float var9 = this.h0 != null ? com.aspose.slides.internal.c9b.a6.n5(var1, var2, this.h0.l6(), this.h0.k5()) : 0.0F;
         if (var9 > this.s7 * 2.0F) {
            this.c8(var1, var2);
         } else {
            this.h0(var1, var2);
         }

         this.h0 = new w1(var1, var2);
      }
   }

   @Override
   public void n5() {
      if (this.e2 != 2) {
         if (this.e2 == 0) {
            this.a6();
         } else {
            this.u9();
         }

         this.h0();
         this.e2 = 2;
      }
   }

   private void a6() {
      this.t2(this.z3, this.m1 - this.s7);
      this.a6(0.0F, -this.s7);
      this.u9(0.0F, -this.s7);
      this.k7 = this.t4 = 1.0F;
      this.m3 = this.q0 = 0.0F;
   }

   private void u9() {
      if (this.z3 != this.t9 || this.m1 != this.z1) {
         this.l6(this.t9, this.z1);
      }

      this.n5(this.k7, this.m3, this.z3, this.m1, this.t4, this.q0, this.w1, this.r4, this.z8, this.j5);
      this.s7(this.t9 + this.z8, this.z1 + this.j5);
      this.t2(this.t9 - this.z8, this.z1 - this.j5);
   }

   @Override
   public void l6() {
      this.s3.n5(this.c4, this.y2, this.y1, this.a0, this.d2, this.d5);
      this.c4 = this.y2 = null;
      this.y1 = this.a0 = null;
      this.d2 = this.d5 = null;
      this.l6.l6();
      this.e2 = 2;
   }

   private void t2(float var1, float var2) {
      this.s3.k5(var1, var2);
   }

   private void s7(float var1, float var2) {
      this.s3.u3(var1, var2);
   }

   private void n5(float var1, float var2, boolean var3) {
      if (var3) {
         this.s3.a6(var1, var2);
      } else {
         this.s3.u3(var1, var2);
      }
   }

   private void n5(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      if (var7) {
         this.s3.l6(var1, var2, var3, var4, var5, var6);
      } else {
         this.s3.n5(var1, var2, var3, var4, var5, var6);
      }
   }

   private void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, boolean var9) {
      if (var9) {
         this.s3.l6(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         this.s3.n5(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   private void h0() {
      this.s3.n5();
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.u3();
      this.p8[0] = this.z3;
      this.p8[1] = this.m1;
      this.p8[2] = var1;
      this.p8[3] = var2;
      this.p8[4] = var3;
      this.p8[5] = var4;
      this.p8[6] = var5;
      this.p8[7] = var6;
      float var7 = this.p8[6];
      float var8 = this.p8[7];
      float var9 = this.p8[2] - this.p8[0];
      float var10 = this.p8[3] - this.p8[1];
      float var11 = this.p8[6] - this.p8[4];
      float var12 = this.p8[7] - this.p8[5];
      boolean var13 = var9 == 0.0F && var10 == 0.0F;
      boolean var14 = var11 == 0.0F && var12 == 0.0F;
      if (var13) {
         var9 = this.p8[4] - this.p8[0];
         var10 = this.p8[5] - this.p8[1];
         if (var9 == 0.0F && var10 == 0.0F) {
            var9 = this.p8[6] - this.p8[0];
            var10 = this.p8[7] - this.p8[1];
         }
      }

      if (var14) {
         var11 = this.p8[6] - this.p8[2];
         var12 = this.p8[7] - this.p8[3];
         if (var11 == 0.0F && var12 == 0.0F) {
            var11 = this.p8[6] - this.p8[0];
            var12 = this.p8[7] - this.p8[1];
         }
      }

      if (var9 == 0.0F && var10 == 0.0F) {
         this.l6(this.p8[0], this.p8[1]);
      } else {
         if (Math.abs(var9) < 0.1F && Math.abs(var10) < 0.1F) {
            float var15 = (float)Math.sqrt(var9 * var9 + var10 * var10);
            var9 /= var15;
            var10 /= var15;
         }

         if (Math.abs(var11) < 0.1F && Math.abs(var12) < 0.1F) {
            float var21 = (float)Math.sqrt(var11 * var11 + var12 * var12);
            var11 /= var21;
            var12 /= var21;
         }

         n5(var9, var10, this.s7, this.x8[0]);
         float var22 = this.x8[0][0];
         float var16 = this.x8[0][1];
         this.n5(this.k7, this.m3, this.z3, this.m1, var9, var10, this.w1, this.r4, var22, var16);
         int var17 = n5(this.p8, this.e5, 8, this.s7);
         int var18 = 0;

         for (Iterator var19 = com.aspose.slides.internal.x1j.k5.n5(this.p8, 8, this.e5, var17);
            var19.hasNext();
            this.n5(this.i1[var18 - 2], this.i1[var18 - 1], true)
         ) {
            int var20 = (Integer)var19.next();
            var18 = this.l6(this.p8, var20, this.f2, this.i1);
            this.s7(this.f2[0], this.f2[1]);
            switch (var18) {
               case 4:
                  this.s7(this.f2[2], this.f2[3]);
                  this.n5(this.i1[0], this.i1[1], true);
                  break;
               case 8:
                  this.n5(this.f2[0], this.f2[1], this.f2[2], this.f2[3], this.f2[4], this.f2[5], this.f2[6], this.f2[7], false);
                  this.n5(this.i1[0], this.i1[1], this.i1[2], this.i1[3], this.i1[4], this.i1[5], this.i1[6], this.i1[7], true);
            }
         }

         this.u9((this.f2[var18 - 2] - this.i1[var18 - 2]) / 2.0F, (this.f2[var18 - 1] - this.i1[var18 - 1]) / 2.0F);
         this.k7 = var11;
         this.m3 = var12;
         this.u3(var7, var8);
         this.e2 = 1;
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.u3();
      this.p8[0] = this.z3;
      this.p8[1] = this.m1;
      this.p8[2] = var1;
      this.p8[3] = var2;
      this.p8[4] = var3;
      this.p8[5] = var4;
      float var5 = this.p8[4];
      float var6 = this.p8[5];
      float var7 = this.p8[2] - this.p8[0];
      float var8 = this.p8[3] - this.p8[1];
      float var9 = this.p8[4] - this.p8[2];
      float var10 = this.p8[5] - this.p8[3];
      if (var7 == 0.0F && var8 == 0.0F || var9 == 0.0F && var10 == 0.0F) {
         var7 = var9 = this.p8[4] - this.p8[0];
         var8 = var10 = this.p8[5] - this.p8[1];
      }

      if (var7 == 0.0F && var8 == 0.0F) {
         this.l6(this.p8[0], this.p8[1]);
      } else {
         if (Math.abs(var7) < 0.1F && Math.abs(var8) < 0.1F) {
            float var11 = (float)Math.sqrt(var7 * var7 + var8 * var8);
            var7 /= var11;
            var8 /= var11;
         }

         if (Math.abs(var9) < 0.1F && Math.abs(var10) < 0.1F) {
            float var17 = (float)Math.sqrt(var9 * var9 + var10 * var10);
            var9 /= var17;
            var10 /= var17;
         }

         n5(var7, var8, this.s7, this.x8[0]);
         float var18 = this.x8[0][0];
         float var12 = this.x8[0][1];
         this.n5(this.k7, this.m3, this.z3, this.m1, var7, var8, this.w1, this.r4, var18, var12);
         int var13 = n5(this.p8, this.e5, 6, this.s7);
         int var14 = 0;

         for (Iterator var15 = com.aspose.slides.internal.x1j.k5.n5(this.p8, 6, this.e5, var13);
            var15.hasNext();
            this.n5(this.i1[var14 - 2], this.i1[var14 - 1], true)
         ) {
            int var16 = (Integer)var15.next();
            var14 = this.n5(this.p8, var16, this.f2, this.i1);
            this.s7(this.f2[0], this.f2[1]);
            switch (var14) {
               case 4:
                  this.s7(this.f2[2], this.f2[3]);
                  this.n5(this.i1[0], this.i1[1], true);
                  break;
               case 6:
                  this.n5(this.f2[0], this.f2[1], this.f2[2], this.f2[3], this.f2[4], this.f2[5], false);
                  this.n5(this.i1[0], this.i1[1], this.i1[2], this.i1[3], this.i1[4], this.i1[5], true);
            }
         }

         this.u9((this.f2[var14 - 2] - this.i1[var14 - 2]) / 2.0F, (this.f2[var14 - 1] - this.i1[var14 - 1]) / 2.0F);
         this.k7 = var9;
         this.m3 = var10;
         this.u3(var5, var6);
         this.e2 = 1;
      }
   }

   private static void n5(float var0, float var1, float var2, float[] var3) {
      float var4 = (float)Math.sqrt(var0 * var0 + var1 * var1);
      if (var4 == 0.0F) {
         var3[0] = var3[1] = 0.0F;
      } else {
         var3[0] = var1 * var2 / var4;
         var3[1] = -(var0 * var2) / var4;
      }
   }

   private void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (this.e2 != 1) {
         this.t2(var3 + var9, var4 + var10);
         this.t4 = var5;
         this.q0 = var6;
         this.a6(var9, var10);
      } else {
         boolean var11 = var1 * var6 <= var2 * var5;
         if (this.k5 == 0) {
            this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
         } else if (this.k5 == 1) {
            this.n5(var3, var4, var7, var8, var9, var10, var11, 0.015258789F);
         }
      }

      this.e2 = 1;
   }

   private void n5(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7, float var8) {
      if ((var3 != 0.0F || var4 != 0.0F) && (var5 != 0.0F || var6 != 0.0F)) {
         float var9 = var3 - var5;
         float var10 = var4 - var6;
         float var11 = var9 * var9 + var10 * var10;
         if (!(var11 < var8)) {
            if (var7) {
               var3 = -var3;
               var4 = -var4;
               var5 = -var5;
               var6 = -var6;
            }

            this.l6(var1, var2, var3, var4, var5, var6, var7);
         }
      }
   }

   private void l6(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      double var8 = var3 * var5 + var4 * var6;
      int var10 = var8 >= 0.0 ? 1 : 2;
      switch (var10) {
         case 1:
            this.k5(var1, var2, var3, var4, var5, var6, var7);
            break;
         case 2:
            float var11 = var6 - var4;
            float var12 = var3 - var5;
            float var13 = (float)Math.sqrt(var11 * var11 + var12 * var12);
            float var14 = this.s7 / var13;
            float var15 = var11 * var14;
            float var16 = var12 * var14;
            if (var7) {
               var15 = -var15;
               var16 = -var16;
            }

            this.k5(var1, var2, var3, var4, var15, var16, var7);
            this.k5(var1, var2, var15, var16, var5, var6, var7);
      }
   }

   private void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, boolean var11) {
      if ((var9 != var7 || var10 != var8) && (var1 != 0.0F || var2 != 0.0F) && (var5 != 0.0F || var6 != 0.0F)) {
         if (var11) {
            var7 = -var7;
            var8 = -var8;
            var9 = -var9;
            var10 = -var10;
         }

         this.n5(
            var3 - var1 + var7, var4 - var2 + var8, var3 + var7, var4 + var8, var5 + var3 + var9, var6 + var4 + var10, var3 + var9, var4 + var10, this.n3, 0
         );
         float var12 = (this.n3[0] - var3) * (this.n3[0] - var3) + (this.n3[1] - var4) * (this.n3[1] - var4);
         if (var12 < this.y4) {
            this.n5(this.n3[0], this.n3[1], var11);
         }
      }
   }

   private void k5(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      float var8 = (var3 * var5 + var4 * var6) / (2.0F * this.s7 * this.s7);
      float var9 = (float)(1.3333333333333333 * Math.sqrt(0.5 - var8) / (1.0 + Math.sqrt(var8 + 0.5)));
      if (var7) {
         var9 = -var9;
      }

      float var10 = var1 + var3;
      float var11 = var2 + var4;
      float var12 = var10 - var9 * var4;
      float var13 = var11 + var9 * var3;
      float var14 = var1 + var5;
      float var15 = var2 + var6;
      float var16 = var14 + var9 * var6;
      float var17 = var15 - var9 * var5;
      this.n5(var10, var11, var12, var13, var16, var17, var14, var15, var7);
   }

   private void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float[] var9, int var10) {
      float var11 = var3 - var1;
      float var12 = var4 - var2;
      float var13 = var7 - var5;
      float var14 = var8 - var6;
      float var15 = var11 * var14 - var13 * var12;
      float var16 = var13 * (var2 - var6) - var14 * (var1 - var5);
      var16 /= var15;
      var9[var10++] = var1 + var16 * var11;
      var9[var10] = var2 + var16 * var12;
   }

   private static int n5(float[] var0, float[] var1, int var2, float var3) {
      float var4 = var0[2] - var0[0];
      float var5 = var0[3] - var0[1];
      if (var5 != 0.0F && var4 != 0.0F) {
         float var6 = (float)Math.sqrt(var4 * var4 + var5 * var5);
         float var7 = var4 / var6;
         float var8 = var5 / var6;
         float var9 = var7 * var0[0] + var8 * var0[1];
         float var10 = var7 * var0[1] - var8 * var0[0];
         float var11 = var7 * var0[2] + var8 * var0[3];
         float var12 = var7 * var0[3] - var8 * var0[2];
         float var13 = var7 * var0[4] + var8 * var0[5];
         float var14 = var7 * var0[5] - var8 * var0[4];
         switch (var2) {
            case 6:
               b3.n5(var9, var10, var11, var12, var13, var14);
               break;
            case 8:
               float var15 = var7 * var0[6] + var8 * var0[7];
               float var16 = var7 * var0[7] - var8 * var0[6];
               b3.n5(var9, var10, var11, var12, var13, var14, var15, var16);
         }
      } else {
         b3.n5(var0, var2);
      }

      int var17 = 0;
      var17 += b3.l6(var1, var17);
      var17 += b3.k5(var1, var17);
      if (var2 == 8) {
         var17 += b3.u3(var1, var17);
      }

      var17 += b3.n5(var1, var17, var3, 1.0E-4F);
      var17 = com.aspose.slides.internal.x1j.a6.n5(var1, 0, var17, 1.0E-4F, 0.9999F);
      com.aspose.slides.internal.x1j.a6.l6(var1, 0, var17);
      return var17;
   }

   private int n5(float[] var1, int var2, float[] var3, float[] var4) {
      float var5 = var1[var2 + 0];
      float var6 = var1[var2 + 1];
      float var7 = var1[var2 + 2];
      float var8 = var1[var2 + 3];
      float var9 = var1[var2 + 4];
      float var10 = var1[var2 + 5];
      float var11 = var9 - var7;
      float var12 = var10 - var8;
      float var13 = var7 - var5;
      float var14 = var8 - var6;
      n5(var13, var14, this.s7, this.x8[0]);
      n5(var11, var12, this.s7, this.x8[1]);
      var3[0] = var5 + this.x8[0][0];
      var3[1] = var6 + this.x8[0][1];
      var3[4] = var9 + this.x8[1][0];
      var3[5] = var10 + this.x8[1][1];
      var4[0] = var5 - this.x8[0][0];
      var4[1] = var6 - this.x8[0][1];
      var4[4] = var9 - this.x8[1][0];
      var4[5] = var10 - this.x8[1][1];
      float var15 = var3[0];
      float var16 = var3[1];
      float var17 = var3[4];
      float var18 = var3[5];
      this.n5(var15, var16, var15 + var13, var16 + var14, var17, var18, var17 - var11, var18 - var12, var3, 2);
      float var19 = var3[2];
      float var20 = var3[3];
      if (n5(var19) && n5(var20)) {
         var4[2] = 2.0F * var7 - var19;
         var4[3] = 2.0F * var8 - var20;
         return 6;
      } else {
         var15 = var4[0];
         var16 = var4[1];
         var17 = var4[4];
         var18 = var4[5];
         this.n5(var15, var16, var15 + var13, var16 + var14, var17, var18, var17 - var11, var18 - var12, var4, 2);
         var19 = var4[2];
         var20 = var4[3];
         if (n5(var19) && n5(var20)) {
            var3[2] = 2.0F * var7 - var19;
            var3[3] = 2.0F * var8 - var20;
            return 6;
         } else {
            this.n5(var5, var6, var9, var10, var3, var4);
            return 4;
         }
      }
   }

   private void n5(float var1, float var2, float var3, float var4, float[] var5, float[] var6) {
      n5(var3 - var1, var4 - var2, this.s7, this.x8[0]);
      var5[0] = var1 + this.x8[0][0];
      var5[1] = var2 + this.x8[0][1];
      var5[2] = var3 + this.x8[0][0];
      var5[3] = var4 + this.x8[0][1];
      var6[0] = var1 - this.x8[0][0];
      var6[1] = var2 - this.x8[0][1];
      var6[2] = var3 - this.x8[0][0];
      var6[3] = var4 - this.x8[0][1];
   }

   private int l6(float[] var1, int var2, float[] var3, float[] var4) {
      float var5 = var1[var2 + 0];
      float var6 = var1[var2 + 1];
      float var7 = var1[var2 + 2];
      float var8 = var1[var2 + 3];
      float var9 = var1[var2 + 4];
      float var10 = var1[var2 + 5];
      float var11 = var1[var2 + 6];
      float var12 = var1[var2 + 7];
      float var13 = var11 - var9;
      float var14 = var12 - var10;
      float var15 = var7 - var5;
      float var16 = var8 - var6;
      boolean var17 = n5(var5, var6, var7, var8, 6.0F * com.aspose.slides.internal.x1j.a6.n5(var8));
      boolean var18 = n5(var9, var10, var11, var12, 6.0F * com.aspose.slides.internal.x1j.a6.n5(var12));
      if (var17 && var18) {
         this.n5(var5, var6, var11, var12, var3, var4);
         return 4;
      }

      if (var17) {
         var15 = var9 - var5;
         var16 = var10 - var6;
      } else if (var18) {
         var13 = var11 - var7;
         var14 = var12 - var8;
      }

      float var19 = var15 * var13 + var16 * var14;
      var19 *= var19;
      float var20 = var15 * var15 + var16 * var16;
      float var21 = var13 * var13 + var14 * var14;
      if (com.aspose.slides.internal.x1j.a6.n5(var19, var20 * var21, 4.0F * com.aspose.slides.internal.x1j.a6.n5(var19))) {
         this.n5(var5, var6, var11, var12, var3, var4);
         return 4;
      } else {
         float var22 = 0.125F * (var5 + 3.0F * (var7 + var9) + var11);
         float var23 = 0.125F * (var6 + 3.0F * (var8 + var10) + var12);
         float var24 = var9 + var11 - var5 - var7;
         float var25 = var10 + var12 - var6 - var8;
         n5(var15, var16, this.s7, this.x8[0]);
         n5(var24, var25, this.s7, this.x8[1]);
         n5(var13, var14, this.s7, this.x8[2]);
         float var26 = var5 + this.x8[0][0];
         float var27 = var6 + this.x8[0][1];
         float var28 = var22 + this.x8[1][0];
         float var29 = var23 + this.x8[1][1];
         float var30 = var11 + this.x8[2][0];
         float var31 = var12 + this.x8[2][1];
         float var32 = 4.0F / (3.0F * (var15 * var14 - var16 * var13));
         float var33 = 2.0F * var28 - var26 - var30;
         float var34 = 2.0F * var29 - var27 - var31;
         float var35 = var32 * (var14 * var33 - var13 * var34);
         float var36 = var32 * (var15 * var34 - var16 * var33);
         float var37 = var26 + var35 * var15;
         float var38 = var27 + var35 * var16;
         float var39 = var30 + var36 * var13;
         float var40 = var31 + var36 * var14;
         var3[0] = var26;
         var3[1] = var27;
         var3[2] = var37;
         var3[3] = var38;
         var3[4] = var39;
         var3[5] = var40;
         var3[6] = var30;
         var3[7] = var31;
         var26 = var5 - this.x8[0][0];
         var27 = var6 - this.x8[0][1];
         var28 -= 2.0F * this.x8[1][0];
         var29 -= 2.0F * this.x8[1][1];
         var30 = var11 - this.x8[2][0];
         var31 = var12 - this.x8[2][1];
         var33 = 2.0F * var28 - var26 - var30;
         var34 = 2.0F * var29 - var27 - var31;
         var35 = var32 * (var14 * var33 - var13 * var34);
         var36 = var32 * (var15 * var34 - var16 * var33);
         var37 = var26 + var35 * var15;
         var38 = var27 + var35 * var16;
         var39 = var30 + var36 * var13;
         var40 = var31 + var36 * var14;
         var4[0] = var26;
         var4[1] = var27;
         var4[2] = var37;
         var4[3] = var38;
         var4[4] = var39;
         var4[5] = var40;
         var4[6] = var30;
         var4[7] = var31;
         return 8;
      }
   }

   private static boolean n5(float var0, float var1, float var2, float var3, float var4) {
      assert var4 > 0.0F : "";
      return com.aspose.slides.internal.x1j.a6.n5(var0, var2, var4) && com.aspose.slides.internal.x1j.a6.n5(var1, var3, var4);
   }

   private static boolean n5(float var0) {
      return Float.NEGATIVE_INFINITY < var0 && var0 < Float.POSITIVE_INFINITY;
   }
}
