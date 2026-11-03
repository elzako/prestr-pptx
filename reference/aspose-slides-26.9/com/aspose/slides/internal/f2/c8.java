package com.aspose.slides.internal.f2;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class c8 {
   private k5 n5;
   private k5 l6;
   private k5 k5;
   private k5 u3;

   public c8(k5 var1, k5 var2, k5 var3, k5 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   private k5 l6() {
      return this.n5;
   }

   private k5 k5() {
      return this.l6;
   }

   private k5 u3() {
      return this.k5;
   }

   private k5 a6() {
      return this.u3;
   }

   @Override
   public String toString() {
      return d1.n5("rect({0}, {1}, {2}, {3})", this.l6(), this.k5(), this.u3(), this.a6());
   }

   @Override
   public boolean equals(Object obj) {
      c8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, c8.class);
      if (j8.l6(var2, obj)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : this.hashCode() == var2.hashCode();
      }
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = 37 * var1 + this.l6().hashCode();
      var1 = 37 * var1 + this.k5().hashCode();
      var1 = 37 * var1 + this.u3().hashCode();
      return 37 * var1 + this.a6().hashCode();
   }

   public final y1 n5() {
      return y1.n5(this.u3.u3(), this.n5.u3(), this.l6.u3(), this.k5.u3());
   }
}
