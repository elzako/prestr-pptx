package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

abstract class w9s<TLocalData, TEffectiveData extends w9s<TLocalData, TEffectiveData>> implements IEffectEffectiveData, q6z, t9f {
   private Class<TLocalData> n5;
   private Class<TEffectiveData> l6;
   private final q1v k5;
   ColorFormat u3;
   long a6;
   private long u9;

   w9s(TLocalData var1, Class<TLocalData> var2, Class<TEffectiveData> var3) {
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = (q1v)var1;
      this.a6 = 4294967295L;
   }

   @Override
   public String n5() {
      return com.aspose.slides.ms.System.j8.n5(this).s7();
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
      return this.a6;
   }

   @Override
   public final int hashCode() {
      return 23454;
   }

   @Override
   public final boolean equals(Object obj) {
      w9s var2 = com.aspose.slides.internal.v6g.k5.n5(obj, this.l6);
      return var2 == null ? false : this.n5((TEffectiveData)var2);
   }

   abstract boolean n5(TEffectiveData var1);

   abstract void n5(i7b var1, TLocalData var2);

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
   }

   final void n5(Class<TEffectiveData> var1) {
      if (this.k5 == null) {
         throw new ArgumentNullException();
      }

      w9s var2 = (w9s)h0i.n5(var1);
      if (var2 == null) {
         throw new RuntimeException("Cannot get value from the cache.");
      }

      boolean var3 = false;
      long var4 = 0L;
      var4 = (this.k5.getVersion() & 4294967295L) + (var2.a6 & 4294967295L) & 4294967295L;
      var3 = (var4 & 4294967295L) != (this.a6 & 4294967295L);
      if ((var4 & 4294967295L) != (this.a6 & 4294967295L)) {
         this.n5(var2, (TLocalData)this.k5);
      }

      ColorFormat var6 = l9h.n5(this.k5);
      ColorFormat var7 = var6 != null && var6.getColorType() != -1 ? var6 : var2.u3;
      boolean var8 = n5(var7, this.u3);
      this.u3 = var7;
      IBaseSlide var9 = n5(this.k5);
      boolean var10;
      if (var9 == null) {
         var10 = false;
      } else {
         long var11 = ((q6z)var9.createThemeEffective()).k5();
         var10 = (this.u9 & 4294967295L) != (var11 & 4294967295L);
         this.u9 = var11;
      }

      if (var3 || var8 || var10) {
         w6a var13 = this.u3 != null ? new w6a(this.u3.n5(var9), this.u3) : w6a.n5;
         this.n5(var9, var13);
      }

      this.a6 = var4;
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
}
