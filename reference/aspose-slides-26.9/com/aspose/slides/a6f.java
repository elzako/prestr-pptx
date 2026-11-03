package com.aspose.slides;

class a6f extends u1 {
   public a6f(u1 var1) {
      super(var1);
   }

   @Override
   public int l6() {
      int var1;
      do {
         var1 = super.l6();
      } while (var1 >= 128 && (var1 & 192) != 192 && var1 != 65536);

      if (var1 >= 128 && var1 != 65536) {
         if ((var1 & 240) == 240) {
            int var2 = var1 & 7;
            var1 = super.l6();
            int var3 = var1 & 63;
            var1 = super.l6();
            int var4 = var1 & 63;
            var1 = super.l6();
            int var5 = var1 & 63;
            var1 = ((var2 << 6 | var3) << 6 | var4) << 6 | var5;
         } else if ((var1 & 224) == 224) {
            int var12 = var1 & 15;
            var1 = super.l6();
            int var14 = var1 & 63;
            var1 = super.l6();
            int var16 = var1 & 63;
            var1 = (var12 << 6 | var14) << 6 | var16;
         } else if ((var1 & 192) == 192) {
            int var13 = var1 & 31;
            var1 = super.l6();
            int var15 = var1 & 63;
            var1 = var13 << 6 | var15;
         }
      }

      return var1;
   }
}
