package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

class x2 {
   public byte n5;
   public int l6;
   public int k5;
   public int u3;

   public x2(byte[] var1) {
      this.n5 = var1[0];
      byte var2 = 3;
      if (com.aspose.slides.internal.v6g.k5.u3(this.n5, 6) != com.aspose.slides.internal.v6g.k5.u3((byte)3, 6)) {
         throw new InvalidOperationException("Version number must be 3. Maybe data is corrupted");
      }

      this.l6 = com.aspose.slides.internal.v6g.k5.u3(var1[1], 6) << 16
         | com.aspose.slides.internal.v6g.k5.u3(var1[2], 6) << 8
         | com.aspose.slides.internal.v6g.k5.u3(var1[3], 6);
      this.k5 = com.aspose.slides.internal.v6g.k5.u3(var1[4], 6) << 16
         | com.aspose.slides.internal.v6g.k5.u3(var1[5], 6) << 8
         | com.aspose.slides.internal.v6g.k5.u3(var1[6], 6);
      this.u3 = com.aspose.slides.internal.v6g.k5.u3(var1[7], 6) << 16
         | com.aspose.slides.internal.v6g.k5.u3(var1[8], 6) << 8
         | com.aspose.slides.internal.v6g.k5.u3(var1[9], 6);
      if (this.k5 > this.u3) {
         throw new InvalidOperationException("Offset of second block is more than offset of third block. Maybe data is corrupted");
      }

      if (this.u3 > var1.length) {
         throw new InvalidOperationException("Offset of third block is more total file length. Maybe data is corrupted");
      }
   }
}
