package com.aspose.slides.internal.v7u;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;

public abstract class n5 implements IDisposable {
   protected com.aspose.slides.internal.u1n.k5 n5;

   public y4[] n5() {
      if (this.n5 == null) {
         throw new ArgumentException("Parameter is not valid");
      }

      synchronized (this.n5) {
         return this.n5.l6();
      }
   }

   @Override
   public void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   protected void n5(boolean var1) {
   }

   public com.aspose.slides.internal.u1n.k5 l6() {
      return this.n5;
   }
}
