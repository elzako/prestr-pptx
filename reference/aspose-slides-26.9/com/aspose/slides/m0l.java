package com.aspose.slides;

class m0l {
   static final com.aspose.slides.internal.n8e.k8<Integer, Byte> n5 = new com.aspose.slides.internal.n8e.k8<>();
   private com.aspose.slides.internal.k4y.x8 l6;
   private final byte[] k5 = new byte[12];
   private boolean u3;
   private long a6;

   m0l() {
      this(false);
   }

   m0l(boolean var1) {
      this.u3 = var1;
      this.k5[0] = 1;
      this.k5[1] = 0;
      this.k5[2] = 3;
      this.k5[3] = 2;
      this.k5[4] = 4;
      this.k5[5] = 5;
      this.k5[6] = 6;
      this.k5[7] = 7;
      this.k5[8] = 8;
      this.k5[9] = 9;
      this.k5[10] = 10;
      this.k5[11] = 11;
   }

   public final boolean n5() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      if (this.u3 != var1) {
         this.u3 = var1;
         this.u3();
      }
   }

   final com.aspose.slides.internal.k4y.x8 l6() {
      return this.l6;
   }

   final void n5(com.aspose.slides.internal.k4y.x8 var1) {
      this.l6 = var1;
   }

   public final byte n5(int var1) {
      return var1 > 11 ? n5.l6(var1) : this.k5[var1 - 0];
   }

   public final void n5(int var1, byte var2) {
      if (var1 <= 11) {
         this.k5[var1 - 0] = var2;
         this.u3();
      }
   }

   public final void n5(m0l var1) {
      if (var1 != null && var1.u3) {
         this.u3 = true;
         System.arraycopy(var1.k5, 0, this.k5, 0, this.k5.length);
         this.u3();
      } else {
         this.u3 = false;
      }
   }

   private void u3() {
      this.a6++;
   }

   final long k5() {
      return this.a6;
   }

   static {
      n5.n5(12, (byte)4);
      n5.n5(13, (byte)0);
      n5.n5(14, (byte)1);
      n5.n5(15, (byte)2);
      n5.n5(16, (byte)3);
      n5.n5(4, (byte)4);
      n5.n5(5, (byte)5);
      n5.n5(6, (byte)6);
      n5.n5(7, (byte)7);
      n5.n5(8, (byte)8);
      n5.n5(9, (byte)9);
      n5.n5(10, (byte)10);
      n5.n5(11, (byte)11);
   }
}
