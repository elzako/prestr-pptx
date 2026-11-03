package com.aspose.slides;

class u2t {
   static final int[] n5 = new int[]{61440, 61568, 61696};
   private final int[] l6;
   private final float[] k5;

   public u2t(int[] var1, float[] var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public final float n5(char var1) {
      int var2 = 0;
      if (var1 >= '\uf000' && j5u.t4()) {
         var2 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(n5)), Integer.valueOf(var1));
      } else {
         var2 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), Integer.valueOf(var1));
      }

      if (var2 < 0) {
         var2 = ~var2 - 1;
      }

      return this.k5[var2];
   }

   public final String n5(String var1, int[] var2) {
      int var3 = var2[0];
      if (var2[0] >= var1.length()) {
         return "";
      }

      float var4 = this.n5(var1.charAt(var2[0]));
      var2[0]++;
      if (com.aspose.slides.ms.System.n1.k5(var4)) {
         while (var2[0] < var1.length() && com.aspose.slides.ms.System.n1.k5(this.n5(var1.charAt(var2[0])))) {
            var2[0]++;
         }
      } else {
         while (var2[0] < var1.length() && var4 == this.n5(var1.charAt(var2[0]))) {
            var2[0]++;
         }
      }

      return var3 == 0 && var2[0] == var1.length() ? var1 : com.aspose.slides.ms.System.d1.l6(var1, var3, var2[0] - var3);
   }
}
