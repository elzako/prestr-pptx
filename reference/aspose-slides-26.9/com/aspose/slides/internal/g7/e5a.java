package com.aspose.slides.internal.g7;

public class e5a extends n3c {
   private byte[] n5;

   public e5a(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.n3();
      var1.n3();
      this.n5 = new byte[256];

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         this.n5[var2] = var1.x8();
      }

      super.n5(var1);
   }

   @Override
   public int[] n5() {
      int[] var1 = new int[this.n5.length / 2];

      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = var2 * 2;
         var1[var2] = (this.n5[var3] & 255) << 8 | this.n5[var3 + 1] & 255;
      }

      return var1;
   }

   @Override
   public int n5(int var1) {
      return (var1 >= 0 && var1 <= 255 ? this.n5[var1] : 0) & 0xFF;
   }
}
