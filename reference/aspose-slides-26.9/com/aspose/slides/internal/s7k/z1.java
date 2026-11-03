package com.aspose.slides.internal.s7k;

abstract class z1 extends k7 {
   protected boolean n5 = true;
   protected byte l6 = 0;
   protected byte k5 = 0;
   private int t2 = 1061109567;
   private int s7 = 1061109567;
   protected s7[] u3 = null;
   private u9 x8 = null;
   protected s7[] a6 = null;
   private t9 n3 = null;
   protected s7[] u9 = null;

   public s7[] n5() {
      if (this.u3 == null) {
         this.u3 = new s7[!this.n5 ? this.l6 : this.k5];
      }

      return this.u3;
   }

   public u9 n5(byte var1, byte var2) {
      if (this.x8 == null) {
         this.x8 = com.aspose.slides.internal.s7k.u9.n5(this.l6, this.k5, var1, var2);
      }

      return this.x8;
   }

   public s7[] l6() {
      if (this.a6 == null) {
         this.a6 = new s7[this.n5 ? this.l6 : this.k5];
      }

      return this.a6;
   }

   public t9 n5(float[] var1) {
      if (this.n3 == null) {
         this.n3 = new t9(var1);
      }

      return this.n3;
   }

   public s7[] k5() {
      if (this.u9 == null) {
         this.u9 = new s7[this.n5 ? this.l6 : this.k5];
      }

      return this.u9;
   }

   public void n5(int var1, int var2) {
      this.t2 = var1;
      this.s7 = var2;
   }

   public boolean u3() {
      return this.n5;
   }

   public byte a6() {
      return this.k5;
   }

   public s7[] u9() {
      return this.u3;
   }

   public s7[] h0() {
      return this.a6;
   }

   public s7[] c8() {
      return this.u9;
   }

   public u9 t2() {
      return this.x8;
   }

   public t9 s7() {
      return this.n3;
   }

   public boolean x8() {
      return false;
   }
}
