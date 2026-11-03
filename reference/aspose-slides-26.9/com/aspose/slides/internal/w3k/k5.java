package com.aspose.slides.internal.w3k;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.q1;

class k5 implements c8 {
   private final int n5;
   private final double l6;
   private final com.aspose.slides.internal.y2o.l6 k5;
   private final com.aspose.slides.internal.l4o.n5 u3;
   private int a6;
   private int u9;
   private e2 h0;

   public k5(com.aspose.slides.internal.l4o.n5 var1, com.aspose.slides.internal.y2o.l6 var2) {
      this.u3 = var1;
      this.k5 = var2;
      this.u9 = 0;
      this.a6 = 0;
      this.l6 = (1 << (var1.l6() & 255)) - 1;
      if (this.u3.k5() == 3) {
         this.n5 = this.u3.t2().n5() - 1;
      } else {
         this.n5 = 255;
      }
   }

   public void n5(byte var1) {
      this.h0.writeByte(var1);
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      this.h0 = new e2();
      this.u9 = 0;
      this.a6 = 0;
      this.k5.n5(new j5(var1.k5(), var1.u3(), this.u3.u3(var1.a6()), var1.u9()), this.n5(var1.n3(), var2), var3.u3(), var4.u3());
   }

   private int n5(int var1) {
      return (int)q1.k5(var1 * this.l6 / this.n5 + 0.5);
   }

   private void n5(int var1, int var2) {
      if (var2 == 0) {
         throw new Exception("Attempt to write 0 bits");
      }

      int var3 = var1;
      int var4 = this.u9;
      var3 &= (1 << var2) - 1;
      var4 += var2;
      var3 <<= 24 - var4;
      var3 |= this.a6;

      while (var4 >= 8) {
         int var5 = var3 >> 16 & 0xFF;
         this.n5((byte)var5);
         var3 <<= 8;
         var4 -= 8;
      }

      this.a6 = var3;
      this.u9 = var4;
   }

   private void n5() {
      this.n5(0, 7);
      this.a6 = 0;
      this.u9 = 0;
   }

   private byte[] n5(j5 var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.u9(); var3++) {
         int var4 = var3 * var1.a6();

         for (int var5 = 0; var5 < var1.a6(); var5++) {
            this.n5(this.n5(var2[var4 + var5] & 255), this.u3.l6() & 255);
         }

         this.n5();
      }

      return this.h0.toArray();
   }
}
