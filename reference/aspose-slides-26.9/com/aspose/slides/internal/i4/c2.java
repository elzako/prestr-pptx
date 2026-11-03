package com.aspose.slides.internal.i4;

public class c2 extends y2 {
   private j9 u3;
   private u6 a6;
   private u6 u9;

   @Override
   public int s7() {
      return 1;
   }

   public final u6 x8() {
      return this.a6;
   }

   public final void n5(u6 var1) {
      this.a6 = var1;
   }

   public final u6 n3() {
      return this.u9;
   }

   public final void l6(u6 var1) {
      this.u9 = var1;
   }

   @Override
   public boolean h0() {
      return false;
   }

   @Override
   public y2 t2() {
      c2 var1 = new c2(this.u3, this.a6(), this.n5());
      var1.n5(this.l6());
      var1.l6(this.k5());
      var1.k5(this.u3());
      var1.n5(this.x8());
      var1.l6(this.n3());
      return var1;
   }

   @Override
   public g7 n5(y1 var1) {
      this.u3.s7().n5(this.x8(), var1, g7.k5);
      return this.u3.s7().h0();
   }

   @Override
   public void n5(y1 var1, g7 var2) {
      if (this.n3() == null) {
         throw new n1(this.u3.m3().s7());
      }

      this.u3.s7().n5(this.n3(), var1, new g7[]{var2});
   }

   public c2(j9 var1, y1 var2, String var3) {
      super(var2, var3);
      this.u3 = var1;
      this.n5(false);
   }
}
