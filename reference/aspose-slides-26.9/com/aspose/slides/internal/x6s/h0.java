package com.aspose.slides.internal.x6s;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.v4;

public abstract class h0 implements IEnumerable, v4 {
   public int k5 = -1;

   public abstract h0 n5();

   public abstract boolean l6();

   public abstract a6 k5();

   public abstract int u3();

   public int a6() {
      if (this.k5 == -1) {
         h0 var1 = this.n5();

         while (var1.l6()) {
         }

         this.k5 = var1.u3();
      }

      return this.k5;
   }

   @Override
   public IEnumerator iterator() {
      return new h0$n5(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h0 deepClone() {
      return this.n5();
   }

}
