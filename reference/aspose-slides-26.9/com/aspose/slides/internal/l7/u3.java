package com.aspose.slides.internal.l7;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class u3 {
   private int k5;
   private int u3;
   private boolean a6;
   private int u9;
   private boolean h0;
   private long c8;
   private boolean t2;
   public static final u3$n5 n5 = new u3$n5();
   public static final u3$l6 l6 = new u3$l6();

   public u3(int var1, long var2, int var4, int var5) {
      this.k5 = var1;
      this.c8 = var2;
      this.t2 = true;
      this.u3 = var4;
      this.a6 = true;
      this.u9 = var5;
      this.h0 = true;
   }

   public u3(int var1, int var2) {
      this.k5 = var1;
      this.c8 = 0L;
      this.t2 = false;
      this.u3 = 0;
      this.a6 = false;
      this.u9 = var2;
      this.h0 = true;
   }

   public final boolean n5(u3 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : var1.k5 == this.k5;
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != com.aspose.slides.internal.v6g.k5.n5(u3.class) ? false : this.n5((u3)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.k5;
   }

   public final int n5() {
      return this.k5;
   }

   public final int l6() {
      return this.u3;
   }

   public final int k5() {
      return this.u9;
   }

   public final long u3() {
      return this.c8;
   }

   @Override
   public final String toString() {
      a5 var1 = new a5();
      var1.n5("[");
      var1.n5(com.aspose.slides.internal.x6.k5.l6(this.k5));
      var1.n5(", ");
      var1.n5(d1.n5("{0:x}", new Object[]{this.c8}));
      var1.n5(", ");
      var1.n5(d1.n5("{0:x}", new Object[]{this.u3}));
      var1.n5(", ");
      var1.n5(d1.n5("{0:x}", new Object[]{this.u9}));
      var1.n5("]");
      return var1.toString();
   }

   // $VF: synthetic method
   static int l6(u3 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static int k5(u3 var0) {
      return var0.k5;
   }
}
