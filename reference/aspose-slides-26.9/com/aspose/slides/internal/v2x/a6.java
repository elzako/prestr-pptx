package com.aspose.slides.internal.v2x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.x8;

public class a6 extends com.aspose.slides.internal.e2l.n5 {
   public static final byte n5 = (byte)(com.aspose.slides.internal.v6g.k5.u3((byte)12, 6) + 3);
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private byte[] s7 = new byte[]{32};

   public a6() {
   }

   public a6(int var1, int var2, int var3, int var4, byte var5, byte var6, byte var7, byte var8, byte[] var9) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
      this.c8 = var7;
      this.t2 = var8;
      this.s7 = var9;
   }

   @Override
   public void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var1.writeByte((byte)33);
      var1.writeByte((byte)1);
      var1.writeByte((byte)12);
      byte[] var2 = new byte[2];
      var2 = x8.n5(this.l6);
      var1.write(var2, 0, 2);
      var2 = x8.n5(this.k5);
      var1.write(var2, 0, 2);
      var2 = x8.n5(this.u3);
      var1.write(var2, 0, 2);
      var2 = x8.n5(this.a6);
      var1.write(var2, 0, 2);
      var1.writeByte(this.u9);
      var1.writeByte(this.h0);
      var1.writeByte(this.c8);
      var1.writeByte(this.t2);
      com.aspose.slides.internal.e2l.a6.n5(this.s7, var1);
   }
}
