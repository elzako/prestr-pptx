package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public class n5 {
   private short n5;
   private int l6;
   private short k5;
   private short u3;
   private int a6;

   public n5() {
      this.n5((short)19778);
   }

   public final short n5() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final short k5() {
      return this.k5;
   }

   public final short u3() {
      return this.u3;
   }

   public final int a6() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5());
      var1.l6(this.l6());
      var1.n5(this.k5());
      var1.n5(this.u3());
      var1.l6(this.a6());
   }

   protected final boolean n5(n5 var1) {
      return this.n5() == var1.n5() && this.l6() == var1.l6() && this.k5() == var1.k5() && this.u3() == var1.u3() && this.a6() == var1.a6();
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((n5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = f0.n5(this.n5());
      var1 = var1 * 397 ^ this.l6();
      var1 = var1 * 397 ^ f0.n5(this.k5());
      var1 = var1 * 397 ^ f0.n5(this.u3());
      return var1 * 397 ^ this.a6();
   }
}
