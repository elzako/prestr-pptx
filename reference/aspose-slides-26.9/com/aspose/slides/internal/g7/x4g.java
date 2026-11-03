package com.aspose.slides.internal.g7;

public class x4g extends n3c {
   private int n5;
   private int l6;
   private int[] k5;

   public x4g(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.n3();
      var1.n3();
      this.n5 = var1.n3();
      this.l6 = var1.n3();
      this.k5 = new int[this.l6 & 65535];

      for (int var2 = 0; var2 < (this.l6 & 65535); var2++) {
         this.k5[var2] = var1.n3();
      }

      super.n5(var1);
   }

   @Override
   public int[] n5() {
      return this.k5;
   }

   @Override
   public int n5(int var1) {
      return var1 >= (this.n5 & 65535) && var1 < (this.n5 & 65535) + (this.l6 & 65535) ? this.k5[var1 - (this.n5 & 65535)] & 65535 : 0;
   }
}
