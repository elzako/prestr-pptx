package com.aspose.slides.internal.h2;

public class t4 extends h2 implements Cloneable {
   private h2[] h0 = new h2[11];
   private h2 c8 = null;

   public t4(int var1) {
      super(var1);
   }

   @Override
   public void n5(h2 var1) {
      super.n5(var1);
      t4 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, t4.class);
      if (var2 != null) {
         for (int var3 = 0; var3 < 11; var3++) {
            h2 var4 = var2.h0[var3];
            if (var4 != null) {
               this.l6((h2)var4.clone());
            }
         }
      }
   }

   @Override
   public void l6(h2 var1) {
      var1.n5 &= -512;
      var1.n5 = var1.n5 | this.n5;
      this.h0[k5(var1.l6())] = var1;
      if (this.c8 == null && var1.u3) {
         this.c8 = var1;
      }
   }

   @Override
   public h2 a_(int var1) {
      return this.h0[k5(var1)];
   }

   private static int k5(int var0) {
      return ((var0 & -512) >> 9) - 1;
   }

   @Override
   public a5 n5(String var1) {
      a5 var2 = null;
      if (this.c8 != null) {
         var2 = this.c8.n5(var1);
      }

      if (var2 == null) {
         var2 = super.n5(var1);
      }

      return var2;
   }

   @Override
   public a5 n5(int var1, com.aspose.slides.internal.e5.w1 var2, boolean var3, boolean var4) {
      a5 var5 = super.n5(var1, var2, var3, var4);
      if (var1 != 0 && var5 != null) {
         var5 = this.n5(var5, var1);
      }

      return var5;
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      var1 = this.c8.l6(var1, var2, var3);
      if (var1 != null) {
         a5 var4 = this.k5(var2);
         com.aspose.slides.internal.f2.l6 var5 = (com.aspose.slides.internal.f2.l6)var4.g_();

         for (int var6 = 0; var6 < 11; var6++) {
            h2 var7 = this.h0[var6];
            if (var7 != null && var7.u3) {
               var5.n5(var7.l6() & -512, var1, false);
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1) {
      return this.l6 != null ? this.n5(var1, this.l6, var1.l6()) : this.k5(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      a5 var4 = super.n5(var1, var2, var3);
      return this.l6(var4, var1, var3);
   }

   @Override
   public a5 n5(a5 var1, int var2, com.aspose.slides.internal.e5.w1 var3, String var4, com.aspose.slides.internal.e5.t9 var5) {
      if (var1 == null) {
         var1 = this.k5(var3);
      }

      h2 var6 = this.a_(var2);
      if (var6 != null) {
         a5 var7 = var6.n5(var3, var4, var5);
         if (var7 != null) {
            return this.n5(var1, var2 & -512, var7);
         }
      }

      return var1;
   }

   protected final a5 k5(com.aspose.slides.internal.e5.w1 var1) {
      a5 var2 = this.n5();
      com.aspose.slides.internal.f2.l6 var3 = (com.aspose.slides.internal.f2.l6)var2.g_();

      for (int var4 = 0; var4 < 11; var4++) {
         h2 var5 = this.h0[var4];
         if (var5 != null) {
            a5 var6 = var5.n5(var1);
            var3.n5(var5.l6() & -512, var6, true);
         }
      }

      return var2;
   }
}
