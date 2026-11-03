package com.aspose.slides.internal.n1g;

import java.awt.Rectangle;

public final class u9 {
   public Rectangle n5;
   boolean l6 = false;
   boolean k5 = false;
   public short u3;

   public int n5(byte[] var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      int var3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      if (var3 != -1698247209) {
         throw new com.aspose.slides.internal.p7x.l6("Error reading WMFPlaceableHeader");
      }

      short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      short var5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var4 = (short)(var4 ^ var5);
      var2 += 2;
      this.n5 = com.aspose.slides.internal.l1b.k5.h0(var1, var2);
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      if (this.n5.width < 0) {
         this.n5.x = this.n5.x + this.n5.width;
         this.n5.width = -this.n5.width;
         this.l6 = true;
      }

      if (this.n5.height < 0) {
         this.n5.y = this.n5.y + this.n5.height;
         this.n5.height = -this.n5.height;
         this.k5 = true;
      }

      this.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var4 = (short)(var4 ^ this.u3);
      var2 += 2;
      if (this.u3 < 1) {
         this.u3 = 1440;
      }

      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 2;
      var4 = (short)(var4 ^ com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      if (var4 != 0) {
         throw new com.aspose.slides.internal.p7x.l6("Error reading WMFPlaceableHeader");
      }

      var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      return 22;
   }
}
