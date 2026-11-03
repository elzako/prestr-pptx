package com.aspose.slides.internal.k9;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class l6 extends k5 {
   private final float n5;
   private final float l6;

   public l6(float var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      l6 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, l6.class);
      return var2 == null ? false : super.equals(obj) && n1.l6(this.n5, var2.n5) && n1.l6(this.l6, var2.l6);
   }

   @Override
   public int hashCode() {
      int var1 = -324743029 + n1.n5(this.n5);
      var1 = var1 * 486187739 + n1.n5(this.l6);
      return var1 * 486187739 + super.hashCode();
   }

   @Override
   public String toString() {
      return d1.n5("{0}ImageCacheDerivedExtendedKey, width: {1}, height: {2}", super.toString(), this.n5, this.l6);
   }
}
