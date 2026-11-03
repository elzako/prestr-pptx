package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

class w2 {
   private List<Integer> n5 = new List<>();
   private com.aspose.slides.internal.z0k.e2 l6;
   private int k5 = 0;
   private byte u3 = 0;

   public w2(byte var1) {
      this.l6 = new com.aspose.slides.internal.z0k.e2();
      this.u3 = var1;
   }

   public final void n5(byte[] var1) {
      if (this.n5.size() == 0) {
         this.n5.addItem(0);
      }

      this.l6.write(var1, 0, var1.length);
      this.k5 += var1.length;
      this.n5.addItem(this.k5);
   }

   public final j8 n5() {
      j8 var1 = new j8();
      this.l6.close();
      var1.n5(this.l6.toArray());
      var1.n5(this.n5.size() - 1);
      var1.n5(t2.l6(this.n5));
      var1.n5(this.u3);
      return var1;
   }
}
