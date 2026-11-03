package com.aspose.slides.internal.q9r;

public class e2 {
   private final int[] n5;
   private final byte[] l6;
   private final int k5;
   private final t9 u3;
   private final short a6;

   public e2(t9 var1) {
      this.u3 = var1;
      this.k5 = this.u3.l6() & 65535;
      this.a6 = this.u3.k5();
      this.n5 = this.u3.n5(this.a6, this.k5 + 1);
      this.l6 = this.u3.u3().n5(this.n5[this.k5] - 1);
   }

   public final byte[] n5() {
      return this.l6;
   }
}
