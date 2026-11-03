package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

class f4l {
   public static f4l$n5 n5(int var0) {
      if (var0 <= 127 && var0 >= 0) {
         new f4l$n5();
         f4l$n5 var1;
         if (var0 < 10) {
            var1 = new f4l$n5();
            var1.n5 = 2;
            var1.k5 = 8;
            var1.a6 = com.aspose.slides.internal.v6g.k5.k5(256 * (var0 / 2), 9);
            var1.h0 = var0 % 2 == 0;
         } else if (var0 < 20) {
            var1 = new f4l$n5();
            var1.n5 = 2;
            var1.l6 = 8;
            var1.u3 = com.aspose.slides.internal.v6g.k5.k5((var0 - 10) / 2 * 256, 9);
            var1.u9 = var0 % 2 == 0;
         } else if (var0 < 84) {
            int var2 = com.aspose.slides.internal.v6g.k5.k5((var0 - 20) / 16 * 16 + 1, 9);
            var1 = new f4l$n5();
            var1.n5 = 2;
            var1.l6 = 4;
            var1.k5 = 4;
            var1.u3 = var2;
            var1.a6 = com.aspose.slides.internal.v6g.k5.k5((var0 - 20 - com.aspose.slides.internal.v6g.k5.u3(var2, 8) + 1) / 4 * 16 + 1, 9);
            var1.u9 = var0 % 2 == 0;
            var1.h0 = (var0 - 20) / 2 % 2 == 0;
         } else if (var0 < 120) {
            int var3 = com.aspose.slides.internal.v6g.k5.k5((var0 - 84) / 12 * 256 + 1, 9);
            var1 = new f4l$n5();
            var1.n5 = 3;
            var1.l6 = 8;
            var1.k5 = 8;
            var1.u3 = var3;
            var1.a6 = com.aspose.slides.internal.v6g.k5.k5((var0 - 84 - (com.aspose.slides.internal.v6g.k5.u3(var3, 8) - 1) / 256 * 12) / 4 * 256 + 1, 9);
            var1.u9 = var0 % 2 == 0;
            var1.h0 = (var0 - 84) / 2 % 2 == 0;
         } else if (var0 < 124) {
            var1 = new f4l$n5();
            var1.n5 = 4;
            var1.l6 = 12;
            var1.k5 = 12;
            var1.u9 = var0 % 2 == 0;
            var1.h0 = (var0 - 120) / 2 % 2 == 0;
         } else {
            var1 = new f4l$n5();
            var1.n5 = 5;
            var1.l6 = 16;
            var1.k5 = 16;
            var1.u9 = var0 % 2 == 0;
            var1.h0 = (var0 - 124) / 2 % 2 == 0;
         }

         return var1;
      } else {
         throw new IndexOutOfRangeException("Index must be in range beetween zero and 127");
      }
   }
}
