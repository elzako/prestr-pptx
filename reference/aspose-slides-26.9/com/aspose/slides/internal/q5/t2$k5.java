package com.aspose.slides.internal.q5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;

public class t2$k5 {
   public t2$u9 n5;
   protected int l6;
   protected byte[] k5;

   protected t2$k5() {
   }

   protected t2$k5(t2$u9 var1, byte[] var2) {
      this.n5 = var1;
      this.k5 = var2;
   }

   public t2$k5(int var1, int var2, int var3, int var4, byte[] var5) {
      this(new t2$u9(var1, var2, var3, var4), var5);
   }

   public final int n5() {
      return this.n5.n5();
   }

   public final int l6() {
      return this.n5.l6();
   }

   public final byte[] k5() {
      return this.k5;
   }

   public final String u3() {
      return t2.n5(this.k5, this.n5(), this.l6());
   }

   @Override
   public final String toString() {
      a5 var1 = new a5();
      var1.n5("[");
      var1.n5(this.n5);
      var1.n5(", \"");
      var1.n5(this.u3());
      var1.n5("\"]");
      return var1.toString();
   }

   public final boolean n5(t2$k5 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : j8.n5(var1.n5, this.n5) && var1.l6 == this.l6 && j8.n5(var1.k5, this.k5);
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != com.aspose.slides.internal.v6g.k5.n5(t2$k5.class) ? false : this.n5((t2$k5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5.hashCode();

      for (int var2 = 0; var2 < this.k5.length; var2 += 4) {
         for (int var3 = 0; var3 < 4 && var3 + var2 < this.k5.length; var3++) {
            var1 |= (this.k5[var3] & 255) << var3 * 8;
         }
      }

      return var1;
   }
}
