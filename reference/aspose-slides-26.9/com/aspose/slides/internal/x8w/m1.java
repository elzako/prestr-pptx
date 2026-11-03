package com.aspose.slides.internal.x8w;

import com.aspose.slides.internal.o8m.i1;
import com.aspose.slides.internal.o8m.u8;

public class m1 {
   private u8 n5;
   private i1 l6;
   private byte[] k5;
   private int u3;
   private int a6;

   public m1(u8 var1) {
      this.n5 = var1;
      this.n5.k5(1);
      this.u3 = this.n5.c8() >> 3;
      this.n5.u3(new byte[this.u3]);
      this.k5 = new byte[this.u3];
   }

   public void n5(byte[] var1) {
      this.n5.k5(var1);
      if (this.l6 == null) {
         this.l6 = this.n5.t9();
      }

      com.aspose.slides.ms.System.u3.n5(this.k5, 0, this.u3);
      this.a6 = 0;
   }

   public void n5(byte[] var1, int var2, int var3) {
      int var4 = Math.min(this.u3 - this.a6, var3);
      com.aspose.slides.ms.System.u3.n5(var1, var2, this.k5, this.a6, var4);
      this.a6 += var4;
      if (this.a6 == this.u3) {
         this.l6.n5(this.k5, 0, this.u3, this.k5, 0);
         int var5 = (var3 - var4) / this.u3;

         for (int var6 = 0; var6 < var5; var6++) {
            this.l6.n5(var1, var4, this.u3, this.k5, 0);
            var4 += this.u3;
         }

         this.a6 = var3 - var4;
         if (this.a6 > 0) {
            com.aspose.slides.ms.System.u3.n5(var1, var4, this.k5, 0, this.a6);
         }
      }
   }

   public byte[] n5() {
      byte[] var1;
      if (this.a6 <= 0 && (this.n5.y4() == 3 || this.n5.y4() == 1)) {
         var1 = (byte[])this.k5.clone();
      } else {
         var1 = this.l6.n5(this.k5, 0, this.a6);
      }

      if (!this.l6.as_()) {
         this.l6.dispose();
         this.l6 = null;
      }

      return var1;
   }
}
