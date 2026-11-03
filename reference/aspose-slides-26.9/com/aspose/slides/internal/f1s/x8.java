package com.aspose.slides.internal.f1s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class x8 {
   private final Dictionary<x8$l6, x8$n5> n5 = new Dictionary<>();

   public static boolean n5(com.aspose.slides.internal.w0.l6 var0) {
      return 2 == var0.n5();
   }

   public final void n5() {
      this.n5.clear();
   }

   public final boolean n5(com.aspose.slides.internal.w0.l6 var1, com.aspose.slides.internal.w0.c8 var2) {
      return this.n5.containsKey(k5(var1, var2));
   }

   public final void n5(com.aspose.slides.internal.w0.l6 var1, s7 var2, com.aspose.slides.internal.w0.c8 var3) {
      if (2 != var1.n5()) {
         throw new NotSupportedException(d1.n5("{0} is not supported for caching.", new Object[]{s3.n5(com.aspose.slides.internal.w0.k5.class, var1.n5())}));
      }

      x8$l6 var4 = k5(var1, var3);
      if (this.n5.containsKey(var4)) {
         throw new ArgumentException("An element with the same key already exists.");
      }

      this.n5.addItem(var4, new x8$n5(var4, var2));
   }

   public final s7 l6(com.aspose.slides.internal.w0.l6 var1, com.aspose.slides.internal.w0.c8 var2) {
      x8$l6 var3 = k5(var1, var2);
      x8$n5 var4 = null;
      x8$n5[] var5 = new x8$n5[]{var4};
      boolean var6 = this.n5.tryGetValue(var3, var5);
      var4 = var5[0];
      return var6 ? var4.n5() : null;
   }

   private static x8$l6 k5(com.aspose.slides.internal.w0.l6 var0, com.aspose.slides.internal.w0.c8 var1) {
      if (2 == var0.n5()) {
         return new x8$k5((com.aspose.slides.internal.w0.y4)var0, var1);
      } else {
         throw new NotSupportedException(d1.n5("{0} is not supported for caching.", new Object[]{s3.n5(com.aspose.slides.internal.w0.k5.class, var0.n5())}));
      }
   }
}
