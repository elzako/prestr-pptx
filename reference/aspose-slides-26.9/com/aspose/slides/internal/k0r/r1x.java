package com.aspose.slides.internal.k0r;

public class r1x extends e6r {
   private p6w n5 = new p6w();
   private com.aspose.slides.internal.o9b.j5 l6 = new com.aspose.slides.internal.o9b.j5(0, 0);
   private boolean k5;
   private boolean u3;

   r1x() {
      this.w1().n5(1021);
   }

   public final p6w l6() {
      return this.n5;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   final void n5(int var1) {
      switch (var1) {
         case 0:
            this.n5.n5(new f1s(68, 100));
            this.n5.l6(new f1s(68, 100));
            this.l6 = new com.aspose.slides.internal.o9b.j5(-102, -26);
            this.k5 = true;
            this.u3 = false;
            break;
         case 1:
            this.n5.n5(new f1s(100, 100));
            this.n5.l6(new f1s(100, 100));
            this.l6 = new com.aspose.slides.internal.o9b.j5(0, 0);
            this.k5 = false;
            this.u3 = true;
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.n5(var1);
      var1.c8(24);
      this.l6 = new com.aspose.slides.internal.o9b.j5(var1.m3(), var1.m3());
      this.k5 = (var1.z1() & 255) != 0;
      this.u3 = (var1.z1() & 255) != 0;
      var1.k7();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);

      for (int var2 = 0; var2 < 6; var2++) {
         var1.n5(0L);
      }

      var1.l6(this.l6.n5());
      var1.l6(this.l6.l6());
      var1.n5((byte)(this.k5 ? 1 : 0));
      var1.n5((byte)(this.u3 ? 1 : 0));
      var1.n5(0);
   }

   @Override
   public int n5() {
      return 52;
   }
}
