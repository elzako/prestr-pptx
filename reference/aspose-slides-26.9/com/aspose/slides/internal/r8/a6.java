package com.aspose.slides.internal.r8;

import com.aspose.slides.internal.j3.z8;

class a6 {
   static boolean n5(z8 var0, int var1) {
      if ((var1 & com.aspose.slides.internal.d1.u9.n5) == com.aspose.slides.internal.d1.u9.n5) {
         return true;
      } else if ((var1 & 1) == 1 && var0.n3() == 1) {
         return true;
      } else if ((var1 & 2) == 2 && var0.n3() == 2) {
         return true;
      } else if ((var1 & 4) == 4 && var0.n3() == 3) {
         return true;
      } else if ((var1 & 8) == 8 && var0.n3() == 4) {
         return true;
      } else if ((var1 & 16) == 16 && var0.n3() == 5) {
         return true;
      } else if ((var1 & 32) == 32 && var0.n3() == 6) {
         return true;
      } else if ((var1 & 64) == 64 && var0.n3() == 7) {
         return true;
      } else if ((var1 & 128) == 128 && var0.n3() == 8) {
         return true;
      } else if ((var1 & 256) == 256 && var0.n3() == 9) {
         return true;
      } else if ((var1 & 512) == 512 && var0.n3() == 10) {
         return true;
      } else {
         return (var1 & 1024) == 1024 && var0.n3() == 11 ? true : (var1 & 2048) == 2048 && var0.n3() == 12;
      }
   }
}
