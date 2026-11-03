package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class c8 extends z1 {
   private s7 a6;
   private List<Byte> u9;

   public c8(u7 var1, z1 var2) {
      super(var1, var2);
      super.l6 = new byte[0][];
      super.n5 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("for")};
   }

   public final s7 n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.a6 = new s7();
      this.u9 = new List<>();
      super.k5();
   }

   @Override
   protected boolean n5(int var1, byte[][] var2, int[] var3) {
      var3[0] = -1;
      var2[0] = null;
      if (g9.n5(this.u3, var1)) {
         var3[0] = var1;
         var2[0] = new byte[0];
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void n5(int var1) {
      this.u9.addItem(this.u3[var1]);
      super.n5(var1);
   }

   @Override
   protected void z_() {
      this.a6.n5(this.u9.toArray(new Byte[0]));
      this.a6.l6(1);
      this.n5(false);
      super.z_();
   }
}
