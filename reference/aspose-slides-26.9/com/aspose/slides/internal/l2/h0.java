package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.n2d.m3;

public class h0 implements IGenericEnumerable<u9> {
   private final m3<u9> n5 = new m3<>(false);

   public final void n5(u9 var1) {
      this.n5.addItem(var1.n5(), var1);
   }

   public final u9 n5(String var1) {
      Object var2 = null;
      u9[] var3 = new u9[]{(u9)var2};
      this.n5.tryGetValue(var1, var3);
      return var3[0];
   }

   @Override
   public final IGenericEnumerator<u9> iterator() {
      return this.n5.getValues().iterator();
   }
}
