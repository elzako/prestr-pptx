package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.j3;

@j3
public class e2 {
   private Hashtable l6;
   private long k5;
   static e2$n5 n5 = new e2$n5(null);

   public e2() {
      this.l6 = new Hashtable(n5, n5);
      this.k5 = 1L;
   }

   public long n5(Object var1, boolean[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("obj");
      } else {
         Object var3 = this.l6.get_Item(var1);
         if (var3 != null) {
            var2[0] = false;
            return (Long)var3;
         } else {
            var2[0] = true;
            this.l6.addItem(var1, this.k5);
            return this.k5++;
         }
      }
   }

   public long n5() {
      return this.k5++;
   }
}
