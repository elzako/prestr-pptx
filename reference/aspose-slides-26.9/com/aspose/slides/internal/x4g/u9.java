package com.aspose.slides.internal.x4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.v4;

public class u9 implements IDisposable, v4 {
   private boolean s7 = false;
   protected int n5;
   protected float l6;
   protected int k5;
   protected float u3;
   protected int a6;
   protected s7 u9;
   protected s7 h0;
   protected int c8;
   protected int t2;

   u9() {
   }

   public u9(s7 var1, s7 var2) {
      this(var1, var2, 0);
   }

   public u9(s7 var1, s7 var2, int var3) {
      this(var1, var2, var3, 0.0F);
   }

   public u9(s7 var1, s7 var2, int var3, float var4) {
      u9 var5 = this;
      s7 var6 = null;
      s7 var7 = null;
      if (var1 == null && var2 == null) {
         throw new ArgumentException("Values of 'fillPath' and 'strokePath' cannot be null both");
      }

      if (var1 != null && var1.h0() > 0 && var1.h0() <= 2) {
         throw new ArgumentException("Parameter is invalid");
      }

      if (var1 != null && var2 == var1) {
         throw new InvalidOperationException("Object is currently in use elsewhere");
      }

      if (var1 == null || var1.h0() <= 0 || var1.getBounds2D().getMinX() <= 0.0 && var1.getBounds2D().getMinY() < 0.0 && var1.getBounds2D().getMaxX() >= 0.0) {
         if (var1 != null && var1.h0() > 0 && !n5(var1)) {
            throw new NotImplementedException();
         }

         var5.s7();
         if (var1 != null) {
            var6 = (s7)var1.deepClone();
            if (var6 == null) {
               throw new OutOfMemoryException();
            }
         }

         var5.u9 = var6;
         if (var2 != null) {
            var7 = (s7)var2.deepClone();
            if (var7 == null) {
               throw new OutOfMemoryException();
            }
         }

         var5.h0 = var7;
         var5.n5 = var3;
         var5.l6 = var4;
      } else {
         throw new NotImplementedException();
      }
   }

   private static boolean n5(s7 var0) {
      com.aspose.slides.internal.o9b.w1[] var1 = var0.a6();
      byte[] var2 = var0.u9();
      byte var3 = 0;
      byte var4 = 1;
      byte var5 = 0;
      byte var6 = 0;

      for (int var7 = 0; var7 < var1.length && var3 + var4 + var5 + var6 != 4; var7++) {
         if (var1[var7].l6() >= 0.0F) {
            if (var1[var7].k5() >= 0.0F) {
               var3 = 1;
            } else {
               var6 = 1;
            }
         } else if (var1[var7].k5() >= 0.0F) {
            var4 = 1;
         } else {
            var5 = 1;
         }
      }

      if (var3 + var4 + var5 + var6 == 4) {
         return true;
      }

      int var11 = 999999;
      float var8 = 0.5F;
      s7 var9 = (s7)var0.deepClone();
      var9.y4();
      boolean var10 = n5(var9, 0.0F, -var11, 0.0F, var11, var8);
      return var10 && var9.q0() || n5(var9, 0.0F, 0.0F, var11, 0.0F, var8) && var10;
   }

   private static boolean n5(s7 var0, float var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.o9b.w1[] var6 = var0.a6();
      byte[] var7 = var0.u9();
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var1, var2);
      com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var1 + var3, var2 + var4);
      int var10 = 0;
      int var11 = -1;

      for (int var12 = 0; var12 < var6.length; var12++) {
         int var13 = var12 + 1;
         if ((var7[var12] & 128) != 0 && var11 == var12 - 1) {
            var13 = var10;
            var10 = var12 + 1;
            var11 = var12--;
         } else if (var12 == var6.length - 1) {
            if ((var7[var12] & 128) == 0) {
               break;
            }

            var13 = 0;
            var11 = var12;
         } else {
            var11 = var12;
         }

         com.aspose.slides.internal.o9b.w1 var14 = com.aspose.slides.internal.c9b.a6.n5(var6[var11], var6[var13], var9, var8);
         if (var14 != null
            && com.aspose.slides.internal.c9b.a6.l6(var6[var11], var6[var13], var14, var5)
            && com.aspose.slides.internal.c9b.a6.l6(var9, var8, var14, var5)) {
            return true;
         }

         double var15 = com.aspose.slides.internal.c9b.a6.k5(var6[var11], var6[var13]);
         s7 var17 = new s7();
         var17.n5(var6[var11], var6[var13]);
         m1 var18 = new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
         var18.n5((float)(-Math.toDegrees(var15)));
         var17.l6(var18);
         s7 var19 = new s7();
         var19.n5(var8, var9);
         var19.l6(var18);
         if (var19.intersects(
            var17.getBounds2D().getMinX() - var5, var17.getBounds2D().getMinY() - var5, var17.getBounds2D().getWidth() + var5 * 2.0F, var5 * 2.0F
         )) {
            return true;
         }
      }

      return false;
   }

   public int u9() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public int h0() {
      return this.k5;
   }

   public void l6(int var1) {
      this.k5 = var1;
   }

   public float c8() {
      return this.l6;
   }

   public void u3(float var1) {
      this.l6 = var1;
   }

   public float t2() {
      return this.u3;
   }

   public void a6(float var1) {
      this.u3 = var1;
   }

   @Override
   public Object deepClone() {
      com.aspose.slides.internal.v6g.a6 var1 = new com.aspose.slides.internal.v6g.a6(null);
      if (!this.l6(var1)) {
         throw new ArgumentException();
      } else {
         return n5((u9)var1.n5);
      }
   }

   public void n5(int[] var1, int[] var2) {
      if (!this.l6(var1, var2)) {
         throw new ArgumentException();
      }
   }

   public void n5(int var1, int var2) {
      if (!this.l6(var1, var2)) {
         throw new ArgumentException();
      }
   }

   @Override
   public void dispose() {
      this.l6(true);
   }

   protected void l6(boolean var1) {
      if (!this.s7) {
         this.l6();
         this.s7 = true;
      }
   }

   protected void s7() {
      this.n5 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.k5 = 0;
      this.l6 = 0.0F;
      this.u3 = 1.0F;
      this.u9 = null;
      this.h0 = null;
   }

   protected static boolean n5(u9 var0, u9 var1) {
      s7 var2 = null;
      s7 var3 = null;
      if (var0 != null && var1 != null) {
         var1.n5 = var0.n5;
         var1.c8 = var0.c8;
         var1.t2 = var0.t2;
         var1.k5 = var0.k5;
         var1.l6 = var0.l6;
         var1.u3 = var0.u3;
         var1.a6 = var0.a6;
         if (var0.u9 != null) {
            var2 = (s7)var0.u9.deepClone();
         }

         var1.u9 = var2;
         if (var0.h0 != null) {
            var3 = (s7)var0.h0.deepClone();
         }

         var1.h0 = var3;
         return true;
      } else {
         return false;
      }
   }

   public boolean x8() {
      return this.y4() != null;
   }

   public s7 n3() {
      return this.u9;
   }

   public s7 y4() {
      return this.h0;
   }

   private boolean n5(com.aspose.slides.internal.v6g.a6<u9> var1) {
      if (var1 == null) {
         return false;
      }

      u9 var2 = new u9();
      n5(this, var2);
      var1.n5 = var2;
      return true;
   }

   private boolean n5() {
      if (this.u9 != null) {
         this.u9.dispose();
         this.u9 = null;
      }

      if (this.h0 != null) {
         this.h0.dispose();
         this.h0 = null;
      }

      return true;
   }

   private static u9 n5(u9 var0) {
      int var1 = var0.a6;
      switch (var1) {
         case 0:
            u9 var2 = new u9();
            n5(var0, var2);
            return var2;
         case 1:
            return new l6(var0);
         default:
            var0.l6();
            throw new NotImplementedException();
      }
   }

   private boolean l6() {
      return this.n5();
   }

   private boolean l6(com.aspose.slides.internal.v6g.a6<u9> var1) {
      return var1 == null ? false : this.n5(var1);
   }

   private boolean l6(int var1, int var2) {
      this.c8 = var1;
      this.t2 = var2;
      return true;
   }

   private boolean l6(int[] var1, int[] var2) {
      if (var1 != null && var2 != null) {
         var1[0] = this.c8;
         var2[0] = this.t2;
         return true;
      } else {
         return false;
      }
   }
}
