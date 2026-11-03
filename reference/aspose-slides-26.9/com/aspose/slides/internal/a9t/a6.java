package com.aspose.slides.internal.a9t;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public class a6 extends k5 {
   private String n5;
   private String l6 = p8.u9();

   public a6() {
      super(1);
      this.n5 = p8.l6();
      this.n5(45575);
   }

   public void n5(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      if ("".equals(var1)) {
         this.n5(this.n5() & -4097);
      } else {
         this.n5(this.n5() | 4096);
      }

      this.l6 = var1;
   }

   public void l6(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      if ("".equals(var1)) {
         this.n5(this.n5() & -8193);
      } else {
         this.n5(this.n5() | 8192);
      }

      this.n5 = var1;
   }

   @Override
   protected void n5(byte[] var1) {
      super.n5(var1);
      this.n5(com.aspose.slides.internal.v6g.k5.u3(x8.l6(var1, 12), 10));
      int var2 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 16), 8);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 20), 8);
      this.l6 = j5.e2().l6(var1, var3, var2);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 24), 8);
      this.n5 = j5.e2().l6(var1, 32, var4);
   }

   @Override
   public byte[] k5() {
      short var1 = com.aspose.slides.internal.v6g.k5.l6(this.l6.length(), 9);
      short var2 = com.aspose.slides.internal.v6g.k5.l6(this.n5.length(), 9);
      byte[] var3 = this.l6(32 + var1 + var2);
      var3[12] = (byte)this.n5();
      var3[13] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6((long)this.n5(), 10) >> 8, 10)), 10
      );
      var3[14] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6((long)this.n5(), 10) >> 16, 10)), 10
      );
      var3[15] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6((long)this.n5(), 10) >> 24, 10)), 10
      );
      short var4 = com.aspose.slides.internal.v6g.k5.l6(32 + var2, 9);
      var3[16] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1), 7);
      var3[17] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 8), 9);
      var3[18] = var3[16];
      var3[19] = var3[17];
      var3[20] = com.aspose.slides.internal.v6g.k5.n5((Object)(var4), 7);
      var3[21] = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 >> 8), 9);
      var3[24] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2), 7);
      var3[25] = com.aspose.slides.internal.v6g.k5.n5((Object)(var2 >> 8), 9);
      var3[26] = var3[24];
      var3[27] = var3[25];
      var3[28] = 32;
      var3[29] = 0;
      byte[] var5 = j5.e2().u3(d1.l6(this.n5, com.aspose.slides.internal.x7n.l6.k5()));
      y4.n5(var5, 0, var3, 32, var5.length);
      byte[] var6 = j5.e2().u3(d1.l6(this.l6, com.aspose.slides.internal.x7n.l6.k5()));
      y4.n5(var6, 0, var3, var4, var6.length);
      return var3;
   }
}
