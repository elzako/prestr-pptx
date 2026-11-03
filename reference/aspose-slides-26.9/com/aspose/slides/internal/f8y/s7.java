package com.aspose.slides.internal.f8y;

import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.s4;

public class s7 {
   private long n5 = 0L;
   private long l6 = 0L;
   private boolean k5 = false;

   public static s7 n5() {
      s7 var0 = new s7();
      var0.u9();
      return var0;
   }

   public static long l6() {
      return j5.s7().n3();
   }

   public final s4 k5() {
      return s4.n5(this.a6());
   }

   public final long u3() {
      return (long)this.k5().h0();
   }

   public final long a6() {
      return this.k5 ? l6() - this.l6 + this.n5 : this.n5;
   }

   public final void u9() {
      if (!this.k5) {
         this.l6 = l6();
         this.k5 = true;
      }
   }

   public final void h0() {
      if (this.k5) {
         this.n5 = this.n5 + (l6() - this.l6);
         this.k5 = false;
      }
   }
}
