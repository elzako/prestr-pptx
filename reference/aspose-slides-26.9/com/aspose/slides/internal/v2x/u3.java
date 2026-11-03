package com.aspose.slides.internal.v2x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.x8;

public class u3 extends com.aspose.slides.internal.e2l.n5 {
   private int n5;
   private byte l6;
   private byte k5;

   public u3() {
   }

   public u3(byte var1, int var2, byte var3) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = var3;
   }

   public u3(int var1, boolean var2, byte var3, boolean var4, int var5) {
      this.l6 = n5(var2, var4, var5);
      this.n5 = var1;
      this.k5 = var3;
   }

   public int n5() {
      return this.n5;
   }

   public byte l6() {
      return this.k5;
   }

   public boolean k5() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.l6, 6) & 1;
      return var1 > 0;
   }

   public void l6(boolean var1) {
      byte var2 = this.l6;
      if (var1) {
         var2 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var2, 6) | 1);
      } else {
         var2 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var2, 6) & 254);
      }

      if (com.aspose.slides.internal.v6g.k5.u3(this.l6, 6) != com.aspose.slides.internal.v6g.k5.u3(var2, 6)) {
         this.l6 = var2;
         this.n5(true);
      }
   }

   public static byte n5(boolean var0, boolean var1, int var2) {
      byte var3 = 0;
      if (var0) {
         var3 = 1;
      }

      if (var1) {
         var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) | 2);
      }

      byte var4 = (byte)var2;
      if (com.aspose.slides.internal.v6g.k5.u3(var4, 6) > 7) {
         throw new ArgumentOutOfRangeException("disposalMethod", "The disposal method value is not supported.");
      } else {
         return (byte)(
            com.aspose.slides.internal.v6g.k5.u3(var3, 6)
               | com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(var4, 6) << 2), 9), 6)
         );
      }
   }

   @Override
   public void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var1.writeByte((byte)33);
      var1.writeByte((byte)-7);
      var1.writeByte((byte)4);
      var1.writeByte(this.l6);
      byte[] var2 = x8.n5(this.n5);
      var1.write(var2, 0, var2.length);
      var1.writeByte(this.k5);
      var1.writeByte((byte)0);
   }
}
