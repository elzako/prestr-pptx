package com.aspose.slides.internal.u2w;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.j8;

public class t2 {
   private int n5;
   private int l6;

   public t2() {
   }

   public t2(int var1, int var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final double k5() {
      return (double)this.l6 / this.n5;
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{d2.n5(this.k5(), "F2"), " (", a3.l6(this.l6), "/", a3.l6(this.n5), ')'});
   }

   public static boolean n5(t2 var0, t2 var1) {
      boolean var2;
      if (!j8.l6(var0, null) && !j8.l6(var1, null)) {
         var2 = var0.l6 == var1.l6 && var0.n5 == var1.n5;
      } else {
         var2 = j8.l6(var0, null) && j8.l6(var1, null);
      }

      return var2;
   }

   @Override
   public boolean equals(Object obj) {
      return n5(this, com.aspose.slides.internal.v6g.k5.n5(obj, t2.class));
   }

   @Override
   public int hashCode() {
      return this.l6 ^ this.n5;
   }
}
