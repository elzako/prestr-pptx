package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidCastException;

final class u3$h0 extends u3$l6 {
   private u3$h0(Object var1, boolean var2) {
      super(var1, 1, var2);
   }

   @Override
   protected u3$n5 n5(int var1, int var2) {
      return new u3$c8(this, var1, var2);
   }

   @Override
   protected Object n5(int var1) {
      return this.n5(new int[]{var1});
   }

   @Override
   protected Object n5(int... var1) {
      int var2 = var1[0];
      return u3.n5(this.k5(), this.n5(), var2);
   }

   @Override
   protected void l6(Object var1, int var2) {
      this.n5(var1, new int[]{var2});
   }

   @Override
   protected void n5(Object var1, int... var2) {
      int var3 = var2[0];
      Class var4 = u3$u3.n5(this.l6());
      if (var1 == null && var4.isPrimitive()) {
         var1 = com.aspose.slides.internal.v6g.k5.k5(var4);
      }

      if (var1 == null
         || com.aspose.slides.internal.t9p.n5.n5(var1.getClass(), var4)
         || !var4.isPrimitive() && com.aspose.slides.internal.t9p.n5.l6(var4) == null) {
         try {
            u3.n5(this.k5(), this.n5(), var3, var1);
         } catch (ArgumentOutOfRangeException var6) {
            throw var6;
         } catch (Exception var7) {
            throw new InvalidCastException("Cannot save value in this array");
         }
      } else {
         throw new ArgumentException(
            "Cannot widen from source type to target type either because the source type is a not a primitive type or the conversion cannot be accomplished"
         );
      }
   }

   // $VF: synthetic method
   u3$h0(Object var1, boolean var2, a6 var3) {
      this(var1, var2);
   }
}
