package com.aspose.slides.internal.k0r;

public class a1 extends e6r {
   private byte n5;
   private short l6;
   private byte k5;
   private short u3;

   a1() {
      this.w1().n5(4114);
      this.w1().n5((short)1);
      this.w1().n5((byte)1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
      this.l6 = (short)((var1.z1() & 255) * 60 + (var1.z1() & 255));
      var1.z1();
      this.k5 = var1.z1();
      this.u3 = (short)((var1.z1() & 255) * 60 + (var1.z1() & 255));
      var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5((byte)(this.l6 / 60));
      var1.n5((byte)(this.l6 % 60));
      var1.n5((byte)0);
      var1.n5(this.u3());
      var1.n5((byte)(this.u3 / 60));
      var1.n5((byte)(this.u3 % 60));
      var1.n5((byte)0);
   }

   public final byte l6() {
      return this.n5;
   }

   public final short k5() {
      return this.l6;
   }

   public final byte u3() {
      return this.k5;
   }

   public final short a6() {
      return this.u3;
   }

   @Override
   public int n5() {
      return 8;
   }
}
