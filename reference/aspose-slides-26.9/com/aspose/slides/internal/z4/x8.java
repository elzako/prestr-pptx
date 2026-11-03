package com.aspose.slides.internal.z4;

import com.aspose.slides.ms.System.d1;

public class x8 extends a0 {
   private final e2 n5;
   private final String k5;
   private final String u3;
   private final byte[] a6;

   public x8(c8 var1, String var2, String var3, byte[] var4) {
      super(var1);
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.n5 = new e2(this, var1);
   }

   public final e2 n5() {
      return this.n5;
   }

   public final String l6() {
      return d1.n5(new String[]{this.k5, this.u3});
   }

   @Override
   public void n5(t4 var1) {
      this.n5(this.a6, 0, this.a6.length);
      super.n5(var1);
   }
}
