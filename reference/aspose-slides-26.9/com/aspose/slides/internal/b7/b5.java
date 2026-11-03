package com.aspose.slides.internal.b7;

public class b5 extends x2 {
   public b5(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = u3(0.0, var1, 2.0);
      double var5 = u3(this.u9().l6().n5(), var1, 2.0);
      double var7 = u3(var1, var5, 2.0);
      double var9 = u3(var5, this.u9().l6().n5(), 2.0);
      double var11 = l6(this.u9().l6().l6(), this.l6().n5("adj2"), 100000.0);
      double var13 = u3(0.0, var11, 2.0);
      double var15 = u3(0.0, var13, 2.0);
      double var17 = u3(var13, var11, 2.0);
      double var19 = u3(this.u9().l6().l6(), var11, 2.0);
      c2 var21 = new c2(this.u9());
      var21.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var21.a6(0.0, 0.0);
      var21.n5(new k0(var3, 0.0), new k0(var1, var15), new k0(var1, var13));
      var21.n5(new k0(var1, var17), new k0(var7, var11), new k0(var5, var11));
      var21.n5(new k0(var9, var11), new k0(this.u9().l6().n5(), var19), new k0(this.u9().l6().n5(), this.u9().l6().l6()));
      var21.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var21;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
   }
}
