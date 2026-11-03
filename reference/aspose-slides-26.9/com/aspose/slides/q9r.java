package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class q9r implements Comparable<q9r> {
   private final com.aspose.slides.internal.k4y.f7x n5;

   public final int n5() {
      return this.n5.l6();
   }

   public final String l6() {
      return this.n5.u3();
   }

   public final String k5() {
      return this.n5.k5();
   }

   public final long u3() {
      return this.n5.a6();
   }

   public final String a6() {
      return this.n5.u9();
   }

   public final String u9() {
      return this.n5.h0();
   }

   public q9r(com.aspose.slides.internal.k4y.f7x var1) {
      this.n5 = var1;
   }

   public q9r(int var1) {
      this.n5 = new com.aspose.slides.internal.k4y.f7x();
      this.n5.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.o0.l6().toString()), "}"}));
      this.n5.n5(var1);
      this.n5.u9(com.aspose.slides.ms.System.d1.n5);
      this.n5.k5(com.aspose.slides.ms.System.d1.n5);
      this.n5.u3("0");
      this.n5.a6("0");
   }

   public final void n5(w4c var1, t6w var2) {
      if (var1 == null) {
         throw new ArgumentNullException("point");
      }

      this.n5.l6(var1.u3());
      long var3 = 0L;
      IGenericEnumerator var5 = var2.iterator();

      try {
         while (var5.hasNext()) {
            q9r var6 = (q9r)var5.next();
            if (var6 != this && com.aspose.slides.ms.System.d1.a6(var6.k5(), this.k5()) && var6.n5() == this.n5()) {
               var3++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.n5.n5(var3);
   }

   public final void l6(w4c var1, t6w var2) {
      if (var1 == null) {
         throw new ArgumentNullException("point");
      }

      this.n5.k5(var1.u3());
      long var3 = 0L;
      IGenericEnumerator var5 = var2.iterator();

      try {
         while (var5.hasNext()) {
            q9r var6 = (q9r)var5.next();
            if (var6 != this && com.aspose.slides.ms.System.d1.a6(var6.l6(), this.l6()) && var6.n5() == this.n5()) {
               var3++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.n5.l6(var3);
   }

   public final void n5(w4c var1) {
      if (var1 == null) {
         throw new ArgumentNullException("point");
      }

      this.n5.u3(var1.u3());
      var1.n5(this.n5.n5());
   }

   public final void l6(w4c var1) {
      if (var1 == null) {
         throw new ArgumentNullException("point");
      }

      this.n5.a6(var1.u3());
      var1.n5(this.n5.n5());
   }

   public final void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("layoutId");
      }

      this.n5.u9(var1);
   }

   public final int n5(q9r var1) {
      if ((this.u3() & 4294967295L) > (var1.u3() & 4294967295L)) {
         return 1;
      } else {
         return (this.u3() & 4294967295L) < (var1.u3() & 4294967295L) ? -1 : 0;
      }
   }

   public static com.aspose.slides.internal.k4y.f7x l6(q9r var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(q9r bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
