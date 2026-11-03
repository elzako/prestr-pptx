package com.aspose.slides.internal.q5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class t2$u9 implements Comparable<t2$u9> {
   protected int n5;
   protected int l6;
   protected int k5;
   protected int u3;

   public t2$u9(int var1, int var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final int n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final int u3() {
      return this.u3;
   }

   @Override
   public final String toString() {
      a5 var1 = new a5();
      var1.n5("P=");
      var1.k5(this.n5);
      var1.n5(", E=0x");
      var1.n5(d1.n5("{0:x}", new Object[]{this.l6}));
      var1.n5(", L=0x");
      var1.n5(d1.n5("{0:x}", new Object[]{this.k5}));
      var1.n5(", N=");
      var1.k5(this.u3);
      return var1.toString();
   }

   public final int n5(t2$u9 var1) {
      if (this.n5 != var1.n5) {
         return this.n5 - var1.n5;
      } else if (this.l6 != var1.l6) {
         return this.l6 - var1.l6;
      } else {
         return this.k5 != var1.k5 ? this.k5 - var1.k5 : this.u3 - var1.u3;
      }
   }

   public final boolean l6(t2$u9 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != com.aspose.slides.internal.v6g.k5.n5(t2$u9.class) ? false : this.l6((t2$u9)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.l6 & 63) << 26 | (this.u3 & 63) << 16 | (this.n5 & 15) << 12 | this.k5 & 0xFF;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(t2$u9 bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
