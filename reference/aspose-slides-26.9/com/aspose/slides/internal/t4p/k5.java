package com.aspose.slides.internal.t4p;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.z3o.a6;
import com.aspose.slides.internal.z3o.u9;

class k5 implements com.aspose.slides.internal.k3w.k5, com.aspose.slides.internal.t9z.k5 {
   private final l6 n5;
   private final float l6;
   private final int k5;
   private final com.aspose.slides.internal.x2o.n5 u3;
   private float a6;
   private float u9;
   private float h0;
   private float c8;
   private u9 t2;
   private u9 s7;
   private boolean x8 = true;

   k5(l6 var1) {
      this.n5 = var1;
      m3 var2 = var1.n5.l6().n5();
      this.l6 = var2.q0() / 2.0F;
      this.k5 = var2.x8();
      this.u3 = com.aspose.slides.internal.m5k.l6.n5(var2, var1.x8);
   }

   @Override
   public void n5(float var1, float var2) {
      this.a6 = this.h0 = var1;
      this.u9 = this.c8 = var2;
   }

   @Override
   public void l6(float var1, float var2) {
      float[] var3 = this.n5.s7.n5(this.h0, this.c8, var1, var2);
      if (this.n5.n3 == null) {
         a6 var4 = this.n5.x8.l6(var3[0], var3[1]);
         this.n5.n3 = var4.n5(this.h0, this.c8, var3[0], var3[1]);
      }

      if (this.t2 == null) {
         this.t2 = com.aspose.slides.internal.z3o.u9.n5(this.n5.x8, this.a6, this.u9, var3[0], var3[1]);
      }

      this.s7 = com.aspose.slides.internal.z3o.u9.n5(this.n5.x8, var1, var2, var3[2], var3[3]);
      this.h0 = var1;
      this.c8 = var2;
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      float[] var5 = this.n5.s7.n5(this.h0, this.c8, var1, var2, var3, var4);
      if (this.n5.n3 == null) {
         a6 var6 = this.n5.x8.l6(var5[0], var5[1]);
         this.n5.n3 = var6.n5(this.h0, this.c8, var5[0], var5[1]);
      }

      if (this.t2 == null) {
         this.t2 = com.aspose.slides.internal.z3o.u9.n5(this.n5.x8, this.a6, this.u9, var5[0], var5[1]);
      }

      this.s7 = com.aspose.slides.internal.z3o.u9.n5(this.n5.x8, var3, var4, var5[2], var5[3]);
      this.h0 = var3;
      this.c8 = var4;
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var7 = this.n5.s7.n5(this.h0, this.c8, var1, var2, var3, var4, var5, var6);
      if (this.n5.n3 == null) {
         a6 var8 = this.n5.x8.l6(var7[0], var7[1]);
         this.n5.n3 = var8.n5(this.h0, this.c8, var7[0], var7[1]);
      }

      if (this.t2 == null) {
         this.t2 = com.aspose.slides.internal.z3o.u9.n5(this.n5.x8, this.a6, this.u9, var7[0], var7[1]);
      }

      this.s7 = com.aspose.slides.internal.z3o.u9.n5(this.n5.x8, var5, var6, var7[2], var7[3]);
      this.h0 = var5;
      this.c8 = var6;
   }

   @Override
   public void n5() {
   }

   @Override
   public void l6() {
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.u3 var1, boolean var2) {
      this.l6(var1, var2);
   }

   public void l6(com.aspose.slides.internal.k3w.u3 var1, boolean var2) {
      if (this.x8) {
         if (this.k5()) {
            this.n5(var1);
         }

         this.x8 = false;
      } else {
         this.n5(var1);
      }

      if (var2) {
         if (this.u3()) {
            this.l6(var1);
         }
      } else {
         this.l6(var1);
      }

      this.t2 = null;
      this.s7 = null;
   }

   protected boolean k5() {
      return this.n5(this.n5.k5, this.n5.a6, this.a6, this.u9);
   }

   protected boolean u3() {
      return this.n5(this.n5.u3, this.n5.u9, this.h0, this.c8);
   }

   private boolean n5(int var1, u9 var2, float var3, float var4) {
      if (this.n5.l6) {
         return this.k5 != 0;
      } else if ((var1 & 240) != 0) {
         return true;
      } else if (var2 != null) {
         double var5 = com.aspose.slides.internal.e3j.u9.k5(var2.l6.l6(), var2.l6.k5(), var3, var4);
         return var5 >= this.l6;
      } else {
         return false;
      }
   }

   protected void n5(com.aspose.slides.internal.k3w.u3 var1) {
      if (this.u3 != null && this.t2 != null && (this.k5 != 0 || this.n5.k5 == 16)) {
         if (!this.n5.n5.a6() && var1.k5()) {
            this.u3.n5(var1, this.t2, this.n5.n3);
         } else {
            this.u3.n5(this.n5.t2, this.t2, this.n5.n3);
         }
      }
   }

   protected void l6(com.aspose.slides.internal.k3w.u3 var1) {
      if (this.u3 != null && this.s7 != null && (this.k5 != 0 || this.n5.u3 == 16)) {
         if (!this.n5.n5.a6() && var1.k5()) {
            this.u3.l6(var1, this.s7, this.n5.n3);
         } else {
            this.u3.l6(this.n5.t2, this.s7, this.n5.n3);
         }
      }
   }
}
