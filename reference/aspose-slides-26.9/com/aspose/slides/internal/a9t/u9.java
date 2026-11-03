package com.aspose.slides.internal.a9t;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o8m.i9;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public class u9 extends k5 {
   private byte[] n5 = new byte[8];
   private String l6;
   private byte[] k5;

   public u9() {
      super(2);
      i9 var1 = i9.n5();
      var1.n5(this.n5);
      this.n5(33281);
   }

   public u9(byte[] var1) {
      super(2);
      this.n5(var1);
   }

   @Override
   protected void finalize() throws Throwable {
      if (this.n5 != null) {
         com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.n5.length);
      }

      super.finalize();
   }

   public byte[] u3() {
      return com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).deepClone(), byte[].class);
   }

   public String a6() {
      return this.l6;
   }

   public byte[] u9() {
      return com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).deepClone(), byte[].class);
   }

   @Override
   protected void n5(byte[] var1) {
      super.n5(var1);
      this.n5(com.aspose.slides.internal.v6g.k5.u3(x8.l6(var1, 20), 10));
      y4.n5(var1, 24, this.n5, 0, 8);
      int var2 = x8.n5(var1, 12);
      int var3 = x8.n5(var1, 16);
      if (com.aspose.slides.internal.v6g.k5.k5(var2, 8) > 0) {
         if ((this.n5() & 2) != 0) {
            this.l6 = j5.e2().l6(var1, com.aspose.slides.internal.v6g.k5.u3(var3, 8), com.aspose.slides.internal.v6g.k5.u3(var2, 8));
         } else {
            this.l6 = j5.z1().l6(var1, com.aspose.slides.internal.v6g.k5.u3(var3, 8), com.aspose.slides.internal.v6g.k5.u3(var2, 8));
         }
      }

      if (var1.length >= 48) {
         int var4 = x8.n5(var1, 40);
         int var5 = x8.n5(var1, 44);
         if (com.aspose.slides.internal.v6g.k5.k5(var4, 8) > 0) {
            this.k5 = new byte[com.aspose.slides.internal.v6g.k5.k5(var4, 8)];
            y4.n5(var1, com.aspose.slides.internal.v6g.k5.u3(var5, 8), this.k5, 0, com.aspose.slides.internal.v6g.k5.u3(var4, 8));
         }
      }
   }

   @Override
   public byte[] k5() {
      byte[] var1 = this.l6(40);
      short var2 = com.aspose.slides.internal.v6g.k5.l6(var1.length, 9);
      var1[16] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2), 7);
      var1[17] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 8), 9);
      var1[20] = (byte)this.n5();
      var1[21] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6((long)this.n5(), 10) >> 8, 10)), 10
      );
      var1[22] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6((long)this.n5(), 10) >> 16, 10)), 10
      );
      var1[23] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6((long)this.n5(), 10) >> 24, 10)), 10
      );
      y4.n5(this.n5, 0, var1, 24, this.n5.length);
      return var1;
   }
}
