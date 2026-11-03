package com.aspose.slides.internal.q5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;

public class l6 implements Comparable<l6> {
   public static final l6 n5 = n5(3, 1);
   public static final l6 l6 = n5(3, 10);
   public static final l6 k5 = n5(1, 0);
   private final int u3;
   private final int a6;

   public static l6 n5(int var0, int var1) {
      return new l6(var0, var1);
   }

   private l6(int var1, int var2) {
      this.u3 = var1;
      this.a6 = var2;
   }

   public final int n5() {
      return this.u3;
   }

   public final int l6() {
      return this.a6;
   }

   public final int n5(l6 var1) {
      return this.hashCode() - var1.hashCode();
   }

   public final boolean l6(l6 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : var1.u3 == this.u3 && var1.a6 == this.a6;
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("pid = ");
      var1.k5(this.u3);
      var1.n5(", eid = ");
      var1.k5(this.a6);
      return var1.toString();
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != com.aspose.slides.internal.v6g.k5.n5(l6.class) ? false : this.l6((l6)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.u3 << 8 | this.a6;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(l6 bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
