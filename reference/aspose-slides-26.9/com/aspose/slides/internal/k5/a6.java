package com.aspose.slides.internal.k5;

import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public abstract class a6 implements q0 {
   private com.aspose.slides.internal.h0.q0 n5;
   private q0 l6;
   private short k5;

   public a6(com.aspose.slides.internal.h0.q0 var1, q0 var2, short var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final short n5() {
      return this.k5;
   }

   @Override
   public abstract String l6();

   public final com.aspose.slides.internal.h0.q0 a_() {
      return this.n5;
   }

   @Override
   public final j5 u3() {
      return this.n5;
   }

   @Override
   public final q0 a6() {
      return this.l6;
   }

   public final boolean n5(a6 var1) {
      return j8.n5(this.l6(), var1.l6()) && this.k5 == var1.k5;
   }

   @Override
   public int hashCode() {
      String var1 = this.l6();
      return (var1 != null ? var1.hashCode() : 0) * 397 ^ f0.n5(this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((a6)obj);
      }
   }
}
