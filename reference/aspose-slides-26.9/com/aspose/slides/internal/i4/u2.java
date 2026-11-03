package com.aspose.slides.internal.i4;

public class u2 extends y2 {
   private g7 u3;

   @Override
   public int s7() {
      return 0;
   }

   @Override
   public boolean h0() {
      return false;
   }

   @Override
   public y2 t2() {
      u2 var1 = new u2(this.a6(), this.n5(), this.u3);
      var1.n5(this.l6());
      var1.l6(this.k5());
      var1.k5(this.u3());
      return var1;
   }

   @Override
   public g7 n5(y1 var1) {
      return this.u3 == null ? l5.n5 : this.u3;
   }

   @Override
   public void n5(y1 var1, g7 var2) {
      if (!this.u3()) {
         throw new j3("This property is not writable");
      }

      this.u3 = var2;
   }

   public u2(y1 var1, String var2) {
      super(var1, var2);
      this.n5(true);
      this.k5(true);
      this.l6(true);
   }

   public u2(y1 var1, String var2, g7 var3) {
      this(var1, var2);
      this.n5(null, var3);
   }
}
