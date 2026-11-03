package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class f7x {
   Dictionary<Integer, com.aspose.slides.internal.e1x.t1> n5;
   private com.aspose.slides.internal.e1x.v4 l6;
   private com.aspose.slides.internal.e1x.i1 k5;

   public f7x(com.aspose.slides.internal.e1x.i1 var1) {
      this.k5 = var1;
      this.l6 = new com.aspose.slides.internal.e1x.v4(var1, false);
   }

   public final void n5(String var1) {
      this.l6.n5(var1);
   }

   public final com.aspose.slides.internal.e1x.t1 n5(int var1) {
      int var2 = this.l6.n5(var1);
      this.n5 = this.l6.n5();
      com.aspose.slides.internal.e1x.t1 var3 = null;
      com.aspose.slides.internal.e1x.t1[] var4 = new com.aspose.slides.internal.e1x.t1[]{var3};
      boolean var5 = !this.n5.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         var3 = this.n5.get_Item(0);
      }

      return var3;
   }

   public final com.aspose.slides.internal.o9b.f2 n5(int var1, float var2) {
      com.aspose.slides.internal.e1x.t1 var3 = this.n5(var1);
      return new com.aspose.slides.internal.o9b.f2((var3.k5() + var3.n5()) * var2 / this.k5.t2(), (var3.u3() + var3.l6()) * var2 / this.k5.t2() + var2 / 10.0F);
   }
}
