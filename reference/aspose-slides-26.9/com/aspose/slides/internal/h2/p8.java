package com.aspose.slides.internal.h2;

import com.aspose.slides.exceptions.ArgumentException;

public class p8 extends z3 {
   private int[] h0 = null;
   private int[] c8 = null;

   public p8(h2 var1) {
      super(var1);
   }

   public final void n5(int[] var1) {
      if (var1 != null && var1.length == 4) {
         this.h0 = var1;
      } else {
         throw new ArgumentException();
      }
   }

   public final void l6(int[] var1) {
      if (var1 != null && var1.length == 4) {
         this.c8 = var1;
      } else {
         throw new ArgumentException();
      }
   }

   @Override
   public a5 l6(com.aspose.slides.internal.e5.w1 var1) {
      return var1.n5().q_().t4() ? this.a6(var1) : this.u3(var1);
   }

   public final a5 u3(com.aspose.slides.internal.e5.w1 var1) {
      com.aspose.slides.internal.e5.w1 var2 = this.k5(var1);
      if (var2 == null) {
         return null;
      }

      com.aspose.slides.internal.f2.u3 var3 = this.n5(this.h0, var1).u9();
      com.aspose.slides.internal.f2.u3 var4 = this.n5(this.c8, var1).u9();
      int var5 = var2.n5(this.h0[0], this.h0[1], this.h0[2], this.h0[3]);
      int var6 = var2.n5(this.c8[0], this.c8[1], this.c8[2], this.c8[3]);
      a5 var7 = var1.n5(var5);
      a5 var8 = var1.n5(var6);
      int var9 = var2.n5(this.l6, this.k5, this.u3, this.a6);
      if (var1.n5(var9) == null && var7 == null && var8 == null) {
         a5 var12 = var1.l6(this.n5.n5);
         if (var12 == null) {
            for (com.aspose.slides.internal.e5.w1 var16 = var1.k5(); var16 != null; var16 = var16.k5()) {
               var12 = var16.l6(this.n5.n5);
               if (var12 != null) {
                  break;
               }
            }
         }

         return var12;
      } else {
         com.aspose.slides.internal.f2.u3 var10 = var1.u3(var9).u9();
         com.aspose.slides.internal.f2.u3 var11 = j5.n5;
         if (!var1.n5().j5()) {
            var11 = com.aspose.slides.internal.b3.m1.n5(var11, var1.k5(this.n5.n5).u9());
         }

         var11 = com.aspose.slides.internal.b3.m1.n5(var11, var10);
         var11 = com.aspose.slides.internal.b3.m1.n5(var11, var3);
         var11 = com.aspose.slides.internal.b3.m1.n5(var11, var4);
         return (a5)var11;
      }
   }

   private static boolean u9(com.aspose.slides.internal.e5.w1 var0) {
      if (!var0.n5().q_().t4()) {
         return true;
      }

      com.aspose.slides.internal.e5.t2 var1 = var0.n5().s_();
      return !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e5.t9.class) || !((com.aspose.slides.internal.e5.t9)var1).j5();
   }

   public final a5 a6(com.aspose.slides.internal.e5.w1 var1) {
      com.aspose.slides.internal.e5.w1 var2 = this.k5(var1);
      if (var2 == null) {
         return null;
      }

      com.aspose.slides.internal.f2.u3 var3 = this.n5(this.h0, var1).u9();
      com.aspose.slides.internal.f2.u3 var4 = this.n5(this.c8, var1).u9();
      int var5 = var2.n5(this.l6, this.k5, this.u3, this.a6);
      boolean var6 = false;

      for (com.aspose.slides.internal.e5.w1 var7 = var1.k5(); var7 != null && var7.l6(this.n5.n5) == null; var7 = var7.k5()) {
         if (var7.n5(var5) != null) {
            var6 = true;
            break;
         }
      }

      if (var1.n5(var5) == null) {
         a5 var10 = var1.l6(this.n5.n5);
         if (var10 == null) {
            return !u9(var1) && var6 ? j5.n5 : null;
         } else {
            return var10;
         }
      } else {
         com.aspose.slides.internal.f2.u3 var8 = var1.u3(var5).u9();
         com.aspose.slides.internal.f2.u3 var9 = j5.n5;
         if (u9(var1)) {
            var9 = com.aspose.slides.internal.b3.m1.n5(var9, var1.k5(this.n5.n5).u9());
         }

         var9 = com.aspose.slides.internal.b3.m1.n5(var9, var8);
         var9 = com.aspose.slides.internal.b3.m1.n5(var9, var3);
         var9 = com.aspose.slides.internal.b3.m1.n5(var9, var4);
         return (a5)var9;
      }
   }

   private a5 n5(int[] var1, com.aspose.slides.internal.e5.w1 var2) {
      com.aspose.slides.internal.e5.w1 var3 = this.k5(var2);
      if (var3 != null) {
         int var4 = var3.n5(var1[0], var1[1], var1[2], var1[3]);
         return var2.u3(var4);
      } else {
         return null;
      }
   }
}
