package com.aspose.slides.internal.c5q;

import com.aspose.slides.internal.y4u.v3;

class k5 extends v3 {
   public void n5(byte var1, byte var2, byte var3, byte[] var4, int var5) {
      var4[var5] = (byte)(this.z8[(var1 & 255) + 0] + this.z8[(var2 & 255) + 256] + this.z8[(var3 & 255) + 512] >> 16);
      var4[var5 + 1] = (byte)(this.z8[(var1 & 255) + 768] + this.z8[(var2 & 255) + 1024] + this.z8[(var3 & 255) + 1280] >> 16);
      var4[var5 + 2] = (byte)(this.z8[(var1 & 255) + 1280] + this.z8[(var2 & 255) + 1536] + this.z8[(var3 & 255) + 1792] >> 16);
   }
}
