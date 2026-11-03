package com.aspose.slides.internal.o8m;

public final class h6 extends s4 {
   private y8 n5 = new y8();

   @Override
   protected void n5(boolean var1) {
      super.n5(var1);
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      this.u3 = 1;
      this.n5.n5(var1, var2, var3);
   }

   @Override
   protected byte[] c8() {
      this.u3 = 0;
      return this.n5.n5();
   }

   @Override
   public void t2() {
      this.n5.l6();
   }
}
