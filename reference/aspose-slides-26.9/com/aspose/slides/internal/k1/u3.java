package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class u3 extends k5 {
   private int n5;
   private int l6;

   public final int u3() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final int u9() {
      return this.l6;
   }

   public final void u3(int var1) {
      this.l6 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5());
      var1.n5(this.n5);
      var1.n5(this.l6);
      var1.n5(this.l6());
      var1.n5(this.k5() & 65535);
   }

   @Override
   public String toString() {
      return d1.n5("{0}, Width: {1}, Height: {2}",new Object[]{ super.toString(), this.n5, this.l6});
   }

   protected final boolean n5(u3 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.l6() == var1.l6() && this.k5() == var1.k5() && this.n5() == var1.n5();
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((u3)obj);
      }
   }

   @Override
   public int hashCode() {
      return c3.n5(this.n5) * 397 ^ c3.n5(this.l6);
   }
}
