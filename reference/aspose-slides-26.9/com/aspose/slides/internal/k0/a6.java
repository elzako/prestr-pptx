package com.aspose.slides.internal.k0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.g4.x8;
import com.aspose.slides.internal.o9b.y1;

public class a6 implements n5 {
   private final l6 n5;
   private List<com.aspose.slides.internal.g4.h0> l6;

   @Override
   public final List<com.aspose.slides.internal.g4.h0> n5() {
      return this.l6;
   }

   private void n5(List<com.aspose.slides.internal.g4.h0> var1) {
      this.l6 = var1;
   }

   public a6(l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("IOrderer instance can not be null.");
      }

      this.n5 = var1;
      this.n5(new List<>());
   }

   @Override
   public final void n5(String var1, com.aspose.slides.internal.l9.u3 var2, y1 var3, float var4, x8 var5, boolean var6, boolean var7) {
      int var8 = this.n5.n5();
      com.aspose.slides.internal.g4.h0 var9 = new com.aspose.slides.internal.g4.h0(var1, var2, var3.y4(), var8, var5);
      var9.n5(var4);
      var9.n5(var6);
      var9.l6(var7);
      this.n5().addItem(var9);
   }

   @Override
   public final void l6() {
      this.n5().clear();
   }
}
