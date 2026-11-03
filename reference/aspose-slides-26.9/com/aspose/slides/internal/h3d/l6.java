package com.aspose.slides.internal.h3d;

import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.ms.System.d1;

abstract class l6 {
   protected t4 n5;
   protected t4 l6;
   public l6 k5;
   public l6 u3;

   public l6(t4 var1, t4 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public boolean n5(z1 var1, boolean var2) {
      if (this.n5.k5() && this.l6.n5()) {
         this.n5(var1);
         return true;
      }

      if (var2) {
         if (!this.n5.k5()) {
            throw new SerializationException(d1.n5(new Object[]{"An object with ID ", this.n5.u3, " was included in a fixup, but it has not been registered"}));
         } else if (!this.l6.k5()) {
            throw new SerializationException(d1.n5(new Object[]{"An object with ID ", this.l6.u3, " was included in a fixup, but it has not been registered"}));
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected abstract void n5(z1 var1);
}
