package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;

public abstract class b4 implements t7 {
   private boolean k5;
   private z9 u3;
   private long a6;
   private double u9;
   private v2 h0;
   public Dictionary<r9, n8> n5 = new Dictionary<>();
   public d8 l6 = new d8();

   public double n5() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public z9 l6() {
      return this.u3;
   }

   public void n5(z9 var1) {
      this.u3 = var1;
   }

   @Override
   public v2 k5() {
      return this.h0;
   }

   @Override
   public long u3() {
      return this.a6;
   }

   public abstract int k5(r9 var1);

   @Override
   public double n5(r9 var1, r9 var2) {
      Dictionary var3 = null;
      Dictionary[] var4 = new Dictionary[]{var3};
      this.l6.tryGetValue(this.k5(var1), var4);
      var3 = var4[0];
      if (var3 != null) {
         int var5 = this.k5(var2);
         if (var3.containsKey(var5)) {
            return ((u0)var3.get_Item(var5)).l6;
         }
      }

      return 0.0;
   }

   @Override
   public double n5(double var1) {
      return this.n5() / (this.u3() & 4294967295L) * var1;
   }

   public void n5(r9 var1, double var2, z9 var4) {
      n8 var5 = new n8();
      var5.n5 = var2;
      var5.l6 = var4;
      this.n5.set_Item(var1, var5);
   }

   @Override
   public double l6(r9 var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1).n5 : 0.0;
   }

   public void n5(r9 var1, r9 var2, double var3) {
      u0 var5 = new u0();
      var5.n5 = this.k5(var2);
      var5.l6 = var3;
      this.l6.n5(this.k5(var1), var5);
   }
}
