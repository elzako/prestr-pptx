package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

public class m1 implements IGenericEnumerator<com.aspose.slides.internal.j3.z8> {
   private com.aspose.slides.internal.d1.a6 n5;
   private com.aspose.slides.internal.j3.z8 l6;

   public m1(com.aspose.slides.internal.d1.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("treeWalker");
      }

      this.n5 = var1;
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
      this.n5 = null;
   }

   @Override
   public final boolean hasNext() {
      this.l6 = this.n5.a6();
      return this.l6 != null;
   }

   @Override
   public final void reset() {
      this.n5.n5(this.n5.n5());
   }

   public final com.aspose.slides.internal.j3.z8 n5() {
      return this.n5.l6();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.j3.z8 next() {
      return this.n5();
   }

}
