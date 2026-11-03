package com.aspose.slides.internal.n5;

public class z8 extends u3 {
   public a0 l6;

   public z8(a0 var1, r4 var2) {
      super(var2);
      this.n5(var1);
   }

   @Override
   public void n5() {
      super.n5();
      if (this.l6 != null) {
         this.l6.u3(0);
      }
   }

   @Override
   protected Object n5(e2 var1) {
      return ((a0)var1).u9(1);
   }

   @Override
   protected Object n5(e2 var1, w1 var2, int var3, a6 var4) {
      String var5 = null;
      if (var3 == -1) {
         var5 = "<missing EOF>";
      } else {
         var5 = "<missing " + this.u9()[var3] + ">";
      }

      t2 var6 = new t2(var3, var5);
      y2 var7 = ((a0)var1).u9(1);
      if (var7.n5() == -1) {
         var7 = ((a0)var1).u9(-1);
      }

      var6.l6 = var7.k5();
      var6.k5 = var7.u3();
      var6.u3 = 0;
      return var6;
   }

   public void n5(a0 var1) {
      this.l6 = null;
      this.n5();
      this.l6 = var1;
   }
}
