package com.aspose.slides.internal.s5;

public class n5 {
   private final byte[] n5;
   private final int l6;
   private final int k5;
   private final int u3;

   public n5(com.aspose.slides.internal.j9e.n5 var1) {
      this.u3 = var1.l6();
      this.l6 = var1.n5();
      this.k5 = var1.a6();
      int var2 = var1.a6() * var1.n5();
      this.n5 = new byte[var2];
      com.aspose.slides.internal.e3m.n5.n5(var1.u3(), this.n5, 0, var2);
   }

   public final byte[] n5() {
      return this.n5;
   }

   public final int l6() {
      return this.u3;
   }

   public final int k5() {
      return this.l6;
   }

   public final int u3() {
      return this.k5;
   }
}
