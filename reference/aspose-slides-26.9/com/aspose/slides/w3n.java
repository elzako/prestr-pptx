package com.aspose.slides;

final class w3n extends w4 implements l8k {
   private d2k l6 = new d2k();
   private final d2k k5 = new d2k();
   private final e9 u3;
   private boolean a6 = true;

   public w3n(e9 var1, IShape var2, d2k var3, d2k var4) {
      super(var2);
      this.u3 = var1;
      var3.n5(this.l6);
      var4.n5(this.k5);
   }

   @Override
   public final void n5(float var1) {
      if (this.a6) {
         this.a6 = false;
         d2k var2 = new d2k();
         d2k[] var3 = new d2k[]{var2};
         boolean var4 = this.u3.n5(this.n5, var3);
         var3[0].n5(var2);
         if (var4) {
            var2.n5(this.l6);
         }
      }

      d2k var5 = d2k.n5(this.l6, d2k.n5(d2k.l6(this.k5, this.l6), var1)).u3();
      this.u3.n5(this.n5, var5.u3());
   }

   @Override
   public final void n5() {
      this.u3.n5(this.n5, this.k5.u3());
   }
}
