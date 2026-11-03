package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

abstract class x8<TLocalData, TEffectiveData extends x8<TLocalData, TEffectiveData>> extends g8<TLocalData, TEffectiveData> implements q6z {
   private q1v k5;
   q6z n5;
   ColorFormat l6;
   private long u3;
   private long a6;
   private long u9;
   private FontScheme h0;
   private h3k c8 = null;

   x8(TLocalData var1) {
      this.k5 = (q1v)var1;
      this.u3 = 4294967295L;
      this.a6 = 4294967295L;
   }

   x8(q6z var1) {
      this.n5 = var1;
      this.u3 = 4294967295L;
   }

   final TLocalData W_() {
      return (TLocalData)this.k5;
   }

   final IBaseSlide X_() {
      return n5(this.k5);
   }

   static IBaseSlide n5(q1v var0) {
      if (var0 == null) {
         return null;
      }

      ISlideComponent var1 = com.aspose.slides.internal.v6g.k5.n5(var0.getParent_IPresentationComponent(), ISlideComponent.class);
      return var1 != null ? var1.getSlide() : null;
   }

   @Override
   public final long k5() {
      return this.u3;
   }

   final ColorFormat u3() {
      return this.l6;
   }

   boolean n5(boolean var1) {
      return false;
   }

   final void n5(Class<TEffectiveData> var1) {
      if (this.n5 != null) {
         ((x8)this.n5).n5(var1);
      } else {
         if (this.k5 == null) {
            throw new ArgumentNullException();
         }

         x8 var2 = n3.n5(var1, this.W_());
         boolean var3 = false;
         long var4 = 0L;
         var4 = (this.k5.getVersion() & 4294967295L) + ((var2.n5 == null ? var2.k5() : var2.n5.k5()) & 4294967295L) & 4294967295L;
         var3 = (var4 & 4294967295L) != (this.u3 & 4294967295L);
         if ((var4 & 4294967295L) != (this.u3 & 4294967295L)) {
            this.n5(var2, this.W_());
         }

         var3 |= this.n5(var3);
         boolean var6 = this.n5((TEffectiveData)var2);
         boolean var7 = this.u9();
         if (var3 || var6 || var7) {
            IBaseSlide var8 = this.X_();
            w6a var9 = this.l6 != null ? new w6a(this.l6.n5(var8), this.l6) : w6a.n5;
            this.n5(var8, var9);
         }

         if (this.h0() || var3) {
            this.n5(this.X_());
         }

         this.u3 = var4;
      }
   }

   final boolean n5(x8<TLocalData, TEffectiveData> var1) {
      ColorFormat var2 = l9h.n5(this.k5);
      ColorFormat var3 = var2 != null && var2.getColorType() != -1 ? var2 : var1.l6;
      boolean var4 = n5(var3, this.l6);
      this.l6 = var3;
      return var4;
   }

   private boolean u9() {
      if (com.aspose.slides.internal.v6g.k5.l6(this, s8u.class)) {
         return false;
      }

      if (this.X_() == null) {
         return false;
      }

      long var1 = ((q6z)this.X_().createThemeEffective()).k5();
      boolean var3 = (this.u9 & 4294967295L) != (var1 & 4294967295L);
      this.u9 = var1;
      return var3;
   }

   private boolean h0() {
      if (com.aspose.slides.internal.v6g.k5.l6(this, s8u.class)) {
         return false;
      }

      if (this.X_() == null) {
         return true;
      }

      FontScheme var1 = ((s8u)this.X_().createThemeEffective()).n5();
      long var2 = var1 != null ? var1.u3() : 0L;
      boolean var4 = this.h0 != var1 || (this.a6 & 4294967295L) != (var2 & 4294967295L);
      this.h0 = var1;
      this.a6 = var2;
      return var4;
   }

   static boolean n5(q1v var0, q1v var1) {
      boolean var2;
      if (var1 == null && var0 == null) {
         var2 = false;
      } else if (var1 == var0 && var1.getVersion() == var0.getVersion()) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   static <TEffectiveData extends x8, TLocalData> TEffectiveData n5(
      Class<TEffectiveData> var0, TEffectiveData[] var1, TLocalData var2, com.aspose.slides.internal.f3.a6<TLocalData, TEffectiveData, TEffectiveData> var3
   ) {
      if (var1[0] == null) {
         x8 var4 = n5(var0, var2, var3);
         if (var4 != null) {
            return (TEffectiveData)var4;
         }

         var1[0] = (TEffectiveData)var3.n5(var2, null);
      }

      return (TEffectiveData)var1[0];
   }

   static <TEffectiveData extends x8, TLocalData> TEffectiveData n5(
      Class<TEffectiveData> var0, TLocalData var1, com.aspose.slides.internal.f3.a6<TLocalData, TEffectiveData, TEffectiveData> var2
   ) {
      PVIObject var3 = com.aspose.slides.internal.v6g.k5.n5(var1, PVIObject.class);
      if (var3 != null && var3.getSlide() != null) {
         Presentation var4 = var3.getPresentation();
         if (var4 == null) {
            return null;
         }

         x8 var5 = n3.n5(var0, var1);
         boolean var6 = var5.W_() != null && !var3.z3() && !n3.n5(var3) && !n3.l6(var3);
         x8 var7 = null;
         if (var6) {
            ColorFormat var8 = l9h.n5(var3);
            var8 = var8 != null && var8.getColorType() != -1 ? var8 : var5.u3();
            r0s var9 = var8 != null ? var8.n5((com.aspose.slides.IBaseSlide)var3.getSlide()) : null;
            h3k var10 = var5.a6();
            p1s var11 = new p1s();
            var11.n5 = var5.k5();
            var11.l6 = var8;
            var11.k5 = var9;
            var7 = (x8)var10.n5(var11.n5());
            if (var7 == null) {
               w6a var12 = var8 != null ? new w6a(var9, var8) : w6a.n5;
               var7 = (x8)var2.n5(var1, (TEffectiveData)var5);
               var7.n5(var7.X_(), var12);
               var7.n5(var7.X_());
               var7.u3 = (var5.k5() & 4294967295L) + 1L & 4294967295L;
               var10.n5(var11.n5(), var7);
            }
         }

         return (TEffectiveData)var7;
      } else {
         return null;
      }
   }

   h3k a6() {
      if (this.c8 == null) {
         this.c8 = new h3k();
      }

      return this.c8;
   }
}
