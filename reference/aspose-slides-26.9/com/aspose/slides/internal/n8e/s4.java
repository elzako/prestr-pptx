package com.aspose.slides.internal.n8e;

class s4 {
   private d1 n5;

   s4(d1 var1) {
      this.n5 = var1;
   }

   int[] n5(int var1, int var2) throws Exception {
      int[] var3 = new int[this.n5.n5().size()];
      var3[0] = (int)((var1 & 4294967295L) + (var2 & 4294967295L));
      if (this.n5.n5().size() > 0) {
         int var4 = this.n5.n5().size() / 2 + 1;
         byte[] var5 = this.n5.n5().toByteArray();

         for (int var6 = 0; var6 < var4; var6++) {
            if (var5[var6] != (byte)this.n5.l6().l6()[var6]) {
               b5.n5(150);
            }

            var3[var6] = var5[var6] & 255;
         }

         b5.n5(false);
      }

      return var3;
   }
}
