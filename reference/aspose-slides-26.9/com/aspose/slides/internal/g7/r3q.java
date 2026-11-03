package com.aspose.slides.internal.g7;

public class r3q extends n3c {
   private int[] n5;
   private long l6;
   private long k5;

   public r3q(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.y4();
      var1.y4();
      this.l6 = var1.y4();
      this.k5 = var1.y4();
      this.n5 = new int[(int)this.k5];

      for (int var2 = 0; var2 < (this.k5 & 4294967295L); var2++) {
         this.n5[var2] = var1.n3();
      }

      super.n5(var1);
   }

   @Override
   public int[] n5() {
      return this.n5;
   }

   @Override
   public int n5(int var1) {
      return var1 >= (this.l6 & 4294967295L) && var1 < ((this.l6 & 4294967295L) + (this.k5 & 4294967295L) & 4294967295L)
         ? this.n5[(int)(var1 - (this.l6 & 4294967295L) & 4294967295L)] & 65535
         : 0;
   }
}
