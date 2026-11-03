package com.aspose.slides.internal.i4;

public class b5 extends z8 {
   private u6 u3;
   private u6 a6;
   private u6 u9;
   private u6 h0;
   private u6 c8;

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.u3 = new u8(var1, "toString", var2);
      this.a6 = new u8(var1, "toLocaleString", var2);
      this.u9 = new u8(var1, "toFixed", var2);
      this.h0 = new u8(var1, "toExponential", var2);
      this.c8 = new u8(var1, "toPrecision", var2);
      var2.n5("toString", this.u3, 2);
      var2.n5("toLocaleString", this.a6, 2);
      var2.n5("toFixed", this.u9, 2);
      var2.n5("toExponential", this.h0, 2);
      var2.n5("toPrecision", this.c8, 2);
   }

   public final k8 n5(double var1) {
      return new k8(var1, this.z1());
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      if (var2 != null && com.aspose.slides.internal.v6g.k5.n5(var2, j9.class) != var1.u3()) {
         if (var3.length > 0) {
            var2.n5(var3[0].l6());
         } else {
            var2.n5(Integer.valueOf(0));
         }

         return var1.l6(var2);
      } else {
         return var3.length > 0 ? var1.l6(this.n5(var3[0].l6())) : var1.l6(this.n5(0.0));
      }
   }

   public b5(j9 var1) {
      super(var1);
      this.h0("Number");
      this.n5("prototype", var1.n3().n5(this), 7);
      this.l6("MAX_VALUE", this.n5(Double.MAX_VALUE));
      this.l6("MIN_VALUE", this.n5(-Double.MAX_VALUE));
      this.l6("NaN", this.n5(Double.NaN));
      this.l6("POSITIVE_INFINITY", this.n5(Double.POSITIVE_INFINITY));
      this.l6("NEGATIVE_INFINITY", this.n5(Double.NEGATIVE_INFINITY));
   }
}
