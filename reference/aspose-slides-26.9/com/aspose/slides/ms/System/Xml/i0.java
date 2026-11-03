package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public abstract class i0 implements IEnumerable, IDisposable {
   public abstract l0 n5(int var1);

   public abstract int n5();

   @Override
   public abstract IEnumerator iterator();

   public l0 k5(int var1) {
      return this.n5(var1);
   }

   @Override
   public final void dispose() {
      this.k5();
   }

   protected void k5() {
   }
}
