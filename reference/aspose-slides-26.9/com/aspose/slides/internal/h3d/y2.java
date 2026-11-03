package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.y8;

public final class y2 implements IEnumerator {
   private IEnumerator n5;

   y2(ArrayList var1) {
      this.n5 = var1.iterator();
   }

   public w1 n5() {
      return (w1)this.n5.next();
   }

   public String l6() {
      return this.n5().n5();
   }

   public y8 k5() {
      return this.n5().l6();
   }

   public Object u3() {
      return this.n5().k5();
   }

   @Override
   public boolean hasNext() {
      return this.n5.hasNext();
   }

   @Override
   public void reset() {
      this.n5.reset();
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1 next() {
      return this.n5();
   }

}
