package com.aspose.slides.internal.i4;

public class d1 extends y2 {
   private y2 u3;
   private y1 a6;

   @Override
   public int s7() {
      return 0;
   }

   public final y1 x8() {
      return this.a6;
   }

   @Override
   public boolean h0() {
      return true;
   }

   @Override
   public boolean u9() {
      return this.u3.u9();
   }

   @Override
   public void u3(boolean var1) {
   }

   @Override
   public y2 t2() {
      d1 var1 = new d1(this.a6(), this.n5(), this, this.x8());
      var1.k5 = this.u3();
      var1.l6 = this.k5();
      var1.n5 = this.l6();
      return var1;
   }

   @Override
   public g7 n5(y1 var1) {
      return this.u3.n5(var1);
   }

   @Override
   public void n5(y1 var1, g7 var2) {
      this.u3.n5(var1, var2);
   }

   public d1(y1 var1, String var2, y2 var3, y1 var4) {
      super(var1, var2);
      if (var3.h0()) {
         d1 var5 = com.aspose.slides.internal.v6g.k5.n5(var3, d1.class);
         this.u3 = var5.u3;
         this.a6 = var5.a6;
      } else {
         this.u3 = var3;
      }

      this.n5 = true;
      this.k5 = true;
      this.l6 = true;
      this.a6 = var4;
   }
}
