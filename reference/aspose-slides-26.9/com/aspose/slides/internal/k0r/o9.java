package com.aspose.slides.internal.k0r;

public class o9 extends e6r {
   private long n5;
   private long l6;
   private long k5;
   private long u3;

   o9() {
      super(61726, (byte)0);
   }

   public o9(long var1, long var3, long var5, long var7) {
      super(61726, (byte)0);
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
      this.u3 = var7;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.n5(this.u3);
   }

   @Override
   public int n5() {
      return 16;
   }
}
