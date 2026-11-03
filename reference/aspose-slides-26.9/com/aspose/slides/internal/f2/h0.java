package com.aspose.slides.internal.f2;

import com.aspose.slides.internal.e5.t9;
import com.aspose.slides.internal.e5.w1;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class h0 implements a6 {
   protected t9 n5;
   private int l6;
   private k5 k5;

   public h0(w1 var1, int var2) {
      this.n5 = var1.n5();
      this.l6 = var2;
      switch (var2) {
         case 1:
            this.k5 = var1.u3(103).c8();
            break;
         case 2:
            this.k5 = var1.k5(103).c8();
      }
   }

   @Override
   public final int n5() {
      return 1;
   }

   @Override
   public final double l6() {
      return 1.0;
   }

   @Override
   public final int n5(u9 var1) {
      int var2 = 0;
      if (var1 != null) {
         if (this.l6 == 1 || this.l6 == 2) {
            return this.k5.l6(var1);
         }

         var2 = var1.n5(this.l6, this.n5);
      }

      return var2;
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{d1.n5, "[fo=", this.n5.toString(), ",", "baseType=", a3.l6(this.l6), ",", "baseLength=", this.k5, "]"});
   }

   public final k5 k5() {
      return this.k5;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.k5);
      var2 = var1 * var2 + this.l6;
      return var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, h0.class)) {
         return false;
      }

      h0 var2 = (h0)obj;
      return com.aspose.slides.internal.v3.u3.n5(this.k5, var2.k5) && this.l6 == var2.l6 && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }
}
