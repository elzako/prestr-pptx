package com.aspose.slides.internal.k4d;

public class l6 {
   public boolean n5 = false;
   public int l6 = 40;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public long h0;
   public long c8;
   public int t2;
   public int s7;
   public long x8;
   public long n3;

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.m3();
      switch (this.l6) {
         case 12:
            this.l6 = 40;
            this.k5 = var1.r4() & 65535;
            this.u3 = var1.r4() & 65535;
            this.a6 = var1.r4();
            this.u9 = var1.r4();
            break;
         case 19:
            var1.m3();
            var1.m3();
            var1.r4();
            var1.r4();
            var1.c4();
            var1.c4();
            var1.m3();
            var1.m3();
            var1.c4();
            var1.c4();
            this.n5 = true;
            break;
         case 40:
         default:
            this.k5 = var1.m3();
            this.u3 = var1.m3();
            this.a6 = var1.r4();
            this.u9 = var1.r4();
            this.h0 = var1.c4();
            this.c8 = var1.c4();
            this.t2 = var1.m3();
            this.s7 = var1.m3();
            this.x8 = var1.c4();
            this.n3 = var1.c4();
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.l6);
      var1.l6(this.k5);
      var1.l6(this.u3);
      var1.n5((short)this.a6);
      var1.n5((short)this.u9);
      var1.l6((int)this.h0);
      var1.l6((int)this.c8);
      var1.l6(this.t2);
      var1.l6(this.s7);
      var1.l6((int)this.x8);
      var1.l6((int)this.n3);
   }

   public final int n5() {
      if ((this.u9 & 65535) == 32) {
         return (this.h0 & 4294967295L) == 3L ? 12 : 0;
      }

      if ((this.u9 & 65535) == 24) {
         return 0;
      }

      int var1 = (this.x8 & 4294967295L) != 0L ? (int)this.x8 : 1 << (this.u9 & 65535);
      byte var2 = 4;
      return var1 * 4;
   }
}
