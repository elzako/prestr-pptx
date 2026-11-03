package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.InvalidOperationException;

class u1 {
   public x2 n5;
   public byte[] l6;
   public byte[] k5;
   public byte[] u3;

   public u1(byte[] var1) {
      this.n5 = new x2(var1);
      if (com.aspose.slides.internal.v6g.k5.u3(this.n5.n5, 6) != 3) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"Mtx font version is incorrect. Supported '3' but was ", com.aspose.slides.ms.System.e2.l6(this.n5.n5)})
         );
      }

      if (this.n5.u3 <= this.n5.k5) {
         throw new InvalidOperationException("Incorrect structure of Mtx font. CodeBlockOffset less or equal to DataBlockOffset.");
      }

      this.l6 = new byte[this.n5.k5 - com.aspose.slides.internal.v6g.k5.u3((byte)10, 6)];
      this.k5 = new byte[this.n5.u3 - this.n5.k5];
      this.u3 = new byte[var1.length - this.n5.u3];
      com.aspose.slides.ms.System.y4.n5(
         com.aspose.slides.ms.System.u3.n5(var1),
         com.aspose.slides.internal.v6g.k5.u3((byte)10, 6),
         com.aspose.slides.ms.System.u3.n5(this.l6),
         0,
         this.l6.length
      );
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5(var1), this.n5.k5, com.aspose.slides.ms.System.u3.n5(this.k5), 0, this.k5.length);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5(var1), this.n5.u3, com.aspose.slides.ms.System.u3.n5(this.u3), 0, this.u3.length);
   }
}
