package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

class e7 extends a1k {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public int x8;
   public int n3;
   public int y4;
   private int z1;
   private int t4;

   public final void n5(int var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3(26, 8), (int)var1);
      this.z1 = var1;
   }

   public final void l6(int var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u3(28, 8), (int)var1);
      this.t4 = var1;
   }

   public e7(byte[] var1) {
      super("maxp", var1);
      t4 var2 = new t4(var1);
      this.n5 = var2.a6();
      if (this.n5 != 20480 && this.n5 != 65536) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5("Version of 'maxp' table is incorrect: {0}, expected {1} for v0.5 or {2} for v1.0", this.n5, 20480, 65536)
         );
      }

      this.l6 = var2.u9();
      if (this.n5 == 65536) {
         this.k5 = var2.u9();
         this.u3 = var2.u9();
         this.a6 = var2.u9();
         this.u9 = var2.u9();
         this.h0 = var2.u9();
         this.c8 = var2.u9();
         this.t2 = var2.u9();
         this.s7 = var2.u9();
         this.x8 = var2.u9();
         this.n3 = var2.u9();
         this.z1 = var2.u9();
         this.t4 = var2.u9();
         this.y4 = var2.u9();
      }

      if (var1.length != var2.n5()) {
         throw new InvalidOperationException("Incorrect length of 'maxp' table");
      }
   }
}
