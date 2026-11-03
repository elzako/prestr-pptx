package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class k2p implements IGenericCloneable<k2p> {
   private final List<z1n> n5 = new List<>();

   public void n5(z1n var1) {
      if (null == var1) {
         throw new ArgumentNullException("tabStop");
      }

      byte var2 = 32;
      if (this.n5.size() == 32) {
         throw new b9("Too many tab stops");
      }

      this.n5.addItem(var1.n5());
   }

   public k2p n5() {
      return new k2p(this);
   }

   private k2p(k2p var1) {
      List$Enumerator var2 = var1.n5.iterator();

      try {
         while (var2.hasNext()) {
            z1n var3 = (z1n)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k2p cloneT() {
      return this.n5();
   }

}
