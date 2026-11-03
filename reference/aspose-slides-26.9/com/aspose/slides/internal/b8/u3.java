package com.aspose.slides.internal.b8;

public class u3 {
   private int n5;
   private int l6;
   private int k5;
   private byte[] u3;

   public u3(byte[] var1) {
      this.u3 = var1;
      this.a6();
   }

   public final void n5() {
      this.k5 = this.k5 + ((byte)this.n5 & 255);
   }

   public final void l6() {
      if (this.h0()) {
         this.u9();
         this.n5(this.u3() + 1);
      } else {
         this.n5 >>= 1;
      }
   }

   public final void k5() {
      if (this.n5 != 128 && this.l6 < this.u3.length) {
         this.u9();
      }
   }

   private void a6() {
      this.n5 = 128;
      this.k5 = 0;
   }

   private void u9() {
      this.u3[this.u3()] = (byte)this.k5;
   }

   public final int u3() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.k5();
      this.a6();
      this.l6 = var1;
   }

   private boolean h0() {
      return this.n5 == 1;
   }
}
