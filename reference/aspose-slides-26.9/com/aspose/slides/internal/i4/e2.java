package com.aspose.slides.internal.i4;

public class e2 extends z8 {
   private y4 u3;
   private y4 a6;
   private u6 u9;
   private u6 h0;
   private j4 c8;

   public final y4 t2() {
      return this.u3;
   }

   public final void n5(y4 var1) {
      this.u3 = var1;
   }

   public final y4 s7() {
      return this.a6;
   }

   public final void l6(y4 var1) {
      this.a6 = var1;
   }

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.u9 = new t9(var1, "toString", var2);
      this.h0 = new t9(var1, "toLocaleString", var2);
      var2.n5("toString", this.u9, 2);
      var2.n5("toLocaleString", this.h0, 2);
   }

   public final y4 n5(boolean var1) {
      return new y4(var1, this.z1());
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      if (var2 != null && com.aspose.slides.internal.v6g.k5.n5(var2, j9.class) != var1.u3()) {
         if (var3.length > 0) {
            var2.n5(var3[0].n5());
         } else {
            var2.n5(false);
         }

         var1.l6(var2);
      } else {
         var1.l6(var3.length > 0 ? new y4(var3[0].n5(), this.z1()) : new y4(false, this.z1()));
      }

      return var2;
   }

   public e2(j9 var1) {
      super(var1);
      this.n5 = "Boolean";
      this.c8 = var1.n3().n5(this);
      this.n5("prototype", this.c8, 7);
      this.l6(this.n5(true));
      this.n5(this.n5(false));
   }
}
