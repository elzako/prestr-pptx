package com.aspose.slides.internal.u2w;

class n5$l6 extends n5$n5 {
   private final byte[] n5;

   public n5$l6(int[] var1, double[] var2) {
      super(var1, var2);
      this.n5 = new byte[var1.length];
   }

   @Override
   public void l6() {
      for (int var1 = 0; var1 < this.n5.length; var1++) {
         this.n5[var1] = 0;
      }

      super.l6();
   }

   @Override
   protected int n5(int var1) {
      return this.n5[var1] & 0xFF;
   }

   @Override
   protected void n5(int var1, byte var2) {
      this.n5[var1] = var2;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3, int var4) {
      int[] var5 = new int[]{var2};
      this.n5(null, var1, var5, var3, var4);
      var2 = var5[0];
   }
}
