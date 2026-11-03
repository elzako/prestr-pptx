package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.EndOfStreamException;

public class j9 extends a4 {
   private v0 n5;
   private p9 l6;

   @Override
   public i2 n5(n2 var1) {
      try {
         this.l6 = var1.k5()[0];
         this.n5 = new v0(var1);
         this.n5();
      } catch (EndOfStreamException var3) {
         if (r6.n5().k5() != 1) {
            throw new g7("Unexpected font parsing exception", var3);
         }
      } catch (l0 var4) {
         throw var4;
      } catch (RuntimeException var5) {
         throw new g7("Unexpected font parsing exception", var5);
      }

      return this.n5;
   }

   private void n5() {
      a5 var1 = new a5(this.l6.k5(), this.l6.k5().a6());

      try {
         d1 var2 = new d1(var1, this.n5);
         this.n5 = var2.n5();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
