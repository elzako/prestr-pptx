package com.aspose.slides.internal.v8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class u9 implements Cloneable {
   public static final u9 n5 = n5(0);
   public int l6;
   public int k5;
   public int u3;

   @Override
   public final Object clone() {
      return this.t2();
   }

   public static u9 n5(int var0, int var1, int var2) {
      if (var0 > var1) {
         throw new ArgumentException(d1.n5(new String[]{"min (", a3.l6(var0), ") > opt (", a3.l6(var1), ")"}));
      } else if (var2 < var1) {
         throw new ArgumentException(d1.n5(new String[]{"max (", a3.l6(var2), ") < opt (", a3.l6(var1), ")"}));
      } else {
         return new u9(var0, var1, var2);
      }
   }

   public static u9 n5(int var0) {
      return new u9(var0, var0, var0);
   }

   private u9(int var1, int var2, int var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   public final int n5() {
      return this.l6;
   }

   public final int l6() {
      return this.k5;
   }

   public final int k5() {
      return this.u3;
   }

   public final int u3() {
      return this.k5 - this.l6;
   }

   public final int a6() {
      return this.u3 - this.k5;
   }

   public final u9 n5(u9 var1) {
      return new u9(this.l6 + var1.l6, this.k5 + var1.k5, this.u3 + var1.u3);
   }

   public final u9 l6(int var1) {
      return new u9(this.l6 + var1, this.k5 + var1, this.u3 + var1);
   }

   public final u9 l6(u9 var1) {
      this.n5(this.u3(), var1.u3(), "shrink");
      this.n5(this.a6(), var1.a6(), "stretch");
      return new u9(this.l6 - var1.l6, this.k5 - var1.k5, this.u3 - var1.u3);
   }

   private void n5(int var1, int var2, String var3) {
      if (var1 < var2) {
         throw new ArithmeticException(
            d1.n5(new String[]{"Cannot subtract a MinOptMax from another MinOptMax that has less ", var3, " (", a3.l6(var1), " < ", a3.l6(var2), ")"})
         );
      }
   }

   public final u9 k5(int var1) {
      return n5(this.l6 - var1, this.k5, this.u3);
   }

   public final u9 u3(int var1) {
      return n5(this.l6, this.k5, this.u3 + var1);
   }

   public final u9 a6(int var1) {
      if (var1 < 0) {
         throw new ArgumentException(d1.n5(new String[]{"factor < 0; was: ", a3.l6(var1)}));
      } else {
         return var1 == 1 ? this : n5(this.l6 * var1, this.k5 * var1, this.u3 * var1);
      }
   }

   public final boolean u9() {
      return this.l6 != 0 || this.u3 != 0;
   }

   public final boolean h0() {
      return this.l6 == this.u3;
   }

   public final boolean c8() {
      return this.l6 != this.k5 || this.k5 != this.u3;
   }

   public final u9 u9(int var1) {
      if (this.l6 < var1) {
         int var2 = q1.n5(var1, this.k5);
         int var3 = q1.n5(var2, this.u3);
         return n5(var1, var2, var3);
      } else {
         return this;
      }
   }

   public final u9 h0(int var1) {
      if (this.u3 < var1) {
         int var2 = this.u3 == this.k5 ? var1 : this.k5;
         return n5(this.l6, var2, var1);
      } else {
         return this;
      }
   }

   public final u9 c8(int var1) {
      if (this.k5 < var1) {
         int var2 = this.u3 > var1 ? this.u3 : var1;
         return n5(this.l6, var1, var2);
      } else {
         return this;
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      } else if (obj != null && j8.n5(this) == j8.n5(obj)) {
         u9 var2 = (u9)obj;
         return this.k5 == var2.k5 && this.u3 == var2.u3 && this.l6 == var2.l6;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.l6;
      var1 = 31 * var1 + this.k5;
      return 31 * var1 + this.u3;
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{"MinOptMax[min = ", a3.l6(this.l6), ", opt = ", a3.l6(this.k5), ", max = ", a3.l6(this.u3), "]"});
   }

   protected Object t2() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
