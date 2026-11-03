package com.aspose.slides.internal.k9;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 extends k5 {
   private final int n5;

   public n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      n5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, n5.class);
      return var2 == null ? false : super.equals(obj) && a3.l6(this.n5, var2.n5);
   }

   @Override
   public int hashCode() {
      int var1 = -324743029 + a3.n5(this.n5);
      return var1 * 486187739 + super.hashCode();
   }

   @Override
   public String toString() {
      return d1.n5("{0}ImageCacheDerivedDarkerLighterKey, multiplier: {1}",new Object[]{ super.toString(), this.n5});
   }
}
