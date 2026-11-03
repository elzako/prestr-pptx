package com.aspose.slides.internal.k9;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;

public class u3 extends k5 {
   private final double n5;
   private final double l6;

   public u3(double var1, double var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public u3(k5 var1, double var2, double var4) {
      super(var1);
      this.n5 = var2;
      this.l6 = var4;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      u3 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, u3.class);
      return var2 == null ? false : super.equals(obj) && d2.l6(this.n5, var2.n5) && d2.l6(this.l6, var2.l6);
   }

   @Override
   public int hashCode() {
      int var1 = -324743029 + d2.n5(this.n5);
      var1 = var1 * 486187739 + d2.n5(this.l6);
      return var1 * 486187739 + super.hashCode();
   }

   @Override
   public String toString() {
      return d1.n5("{0}ImageCacheDerivedShrinkedKey, widthDivider: {1}, heightDivider: {2}", super.toString(), this.n5, this.l6);
   }
}
