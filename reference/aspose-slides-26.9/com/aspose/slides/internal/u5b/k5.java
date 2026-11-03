package com.aspose.slides.internal.u5b;

import com.aspose.slides.internal.r5t.r4;

final class k5 extends r4 {
   // $VF: synthetic field
   final l6 n5;
   // $VF: synthetic field
   final com.aspose.slides.internal.k9m.n5 l6;

   k5(l6 var1, com.aspose.slides.internal.k9m.n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(Object var1) {
      try {
         this.n5.beginInvoke();
      } catch (RuntimeException var6) {
         this.n5.getDelegate().setException(var6);
      } finally {
         this.l6.u3();
      }
   }
}
