package com.aspose.slides.internal.b7;

public class u8 extends x2 {
   public u8(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = l6(this.u9().l6().n5(), this.l6().n5("adj3"), 100000.0);
      double var5 = u3(var1, var3, 2.0);
      double var7 = u3(0.0, var1, 2.0);
      double var9 = u3(var1, var5, 2.0);
      double var11 = u3(var3, var5, 2.0);
      double var13 = u3(var3, this.u9().l6().n5(), 2.0);
      double var15 = l6(this.u9().l6().l6(), this.l6().n5("adj2"), 100000.0);
      double var17 = u3(0.0, var15, 2.0);
      double var19 = u3(0.0, var17, 2.0);
      double var21 = u3(var17, var15, 2.0);
      double var23 = u3(this.u9().l6().l6(), var15, 2.0);
      double var25 = u3(var23, var15, 2.0);
      double var27 = u3(var23, this.u9().l6().l6(), 2.0);
      c2 var29 = new c2(this.u9());
      var29.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var29.a6(0.0, 0.0);
      var29.n5(new k0(var7, 0.0), new k0(var1, var19), new k0(var1, var17));
      var29.n5(new k0(var1, var21), new k0(var9, var15), new k0(var5, var15));
      var29.n5(new k0(var11, var15), new k0(var3, var25), new k0(var3, var23));
      var29.n5(new k0(var3, var27), new k0(var13, this.u9().l6().l6()), new k0(this.u9().l6().n5(), this.u9().l6().l6()));
      var29.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var29;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
      var1.l6("adj3", 50000.0);
   }
}
