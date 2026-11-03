package com.aspose.slides.internal.k0r;

public abstract class z4 extends r4 {
   protected z4() {
      this.w1().n5(5002);
      this.w1().n5((short)0);
   }

   final void n5(int var1) {
      z1 var2 = new z1("___PPT10", (short)0);
      var2.w1().n5((byte)0);
      this.e2().addItem(var2);
      h0 var3 = null;
      switch (var1) {
         case 0:
            this.l6(true);
            var3 = new p2();
            break;
         case 1:
         case 2:
            var3 = new g4();
      }

      var3.n5(var1);
      var3.w1().n5((byte)0);
      var3.w1().n5((short)0);
      this.e2().addItem(var3);
   }

   final h0 l6() {
      return (h0)this.k5(5003);
   }
}
