package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class q3 extends l0 {
   protected i4 n5;
   protected Object l6;

   public q3(i4 var1, Object var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public ICollection n5(n2 var1) {
      return var1.n5(this.n5);
   }

   @Override
   public void n5(p7 var1, n2 var2, c5 var3) {
      l0 var4 = null;
      IEnumerator var5 = this.n5(var2).iterator();

      try {
         while (var5.hasNext()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), int.class);
            if (var2.n5(var6) != this.l6) {
               var2.n5(false);
            }

            a8 var7 = new a8(var3.n5(var6, this.l6));
            if (var4 == null) {
               var4 = var7;
            } else {
               n3 var8 = new n3();
               var8.n5(var4);
               var8.l6(var7);
               var4 = var8;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      if (var1.l6() == this) {
         var1.n5(var4);
      } else {
         var1.l6(var4);
      }
   }

   @Override
   public void n5(s7 var1, s7 var2, s7[] var3) {
      throw new InvalidOperationException();
   }

   @Override
   public boolean n5() {
      throw new InvalidOperationException();
   }
}
