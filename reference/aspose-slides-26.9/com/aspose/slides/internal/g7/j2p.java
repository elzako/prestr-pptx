package com.aspose.slides.internal.g7;

import com.aspose.slides.ms.System.IDisposable;

public class j2p implements IDisposable {
   private com.aspose.slides.internal.z0k.t4 n5;
   private boolean l6;

   public j2p(com.aspose.slides.internal.z0k.t4 var1) {
      this(var1, true);
   }

   public j2p(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final long n5() {
      return this.n5.getPosition();
   }

   public final void n5(long var1) {
      this.n5.setPosition(var1);
   }

   public final void n5(byte var1) {
      this.n5.writeByte(var1);
   }

   public final void l6(byte var1) {
      this.n5(var1);
   }

   public final void n5(byte[] var1) {
      this.n5.write(var1, 0, var1.length);
   }

   public final void n5(byte[] var1, int var2) {
      this.n5.write(var1, 0, var2);
   }

   public final int n5(String var1) {
      byte[] var2 = com.aspose.slides.internal.l7h.j5.e2().u3(var1);
      this.n5.write(var2, 0, var2.length);
      return var2.length;
   }

   public final int n5(String var1, String var2) {
      byte[] var3 = z8.n5(var2).u3(var1);
      this.n5.write(var3, 0, var3.length);
      return var3.length;
   }

   public final int n5(short var1) {
      this.n5.writeByte((byte)(var1 >> 8));
      this.n5.writeByte((byte)var1);
      return 2;
   }

   public final int n5(short[] var1) {
      int var2 = 0;

      for (short var6 : var1) {
         var2 += this.n5(var6);
      }

      return var2;
   }

   public final int n5(int var1) {
      this.n5.writeByte((byte)((var1 & 65535) >> 8));
      this.n5.writeByte((byte)var1);
      return 2;
   }

   public final int n5(int[] var1) {
      int var2 = 0;

      for (int var6 : var1) {
         var2 += this.n5(var6);
      }

      return var2;
   }

   public final int l6(int var1) {
      this.n5.writeByte((byte)(var1 >> 24));
      this.n5.writeByte((byte)(var1 >> 16));
      this.n5.writeByte((byte)(var1 >> 8));
      this.n5.writeByte((byte)var1);
      return 4;
   }

   public final int l6(long var1) {
      this.n5.writeByte((byte)((var1 & 4294967295L) >> 24 & 4294967295L));
      this.n5.writeByte((byte)((var1 & 4294967295L) >> 16 & 4294967295L));
      this.n5.writeByte((byte)((var1 & 4294967295L) >> 8 & 4294967295L));
      this.n5.writeByte((byte)var1);
      return 4;
   }

   public final int k5(long var1) {
      this.n5.writeByte((byte)((var1 & 4294967295L) >> 24 & 4294967295L));
      this.n5.writeByte((byte)((var1 & 4294967295L) >> 16 & 4294967295L));
      this.n5.writeByte((byte)((var1 & 4294967295L) >> 8 & 4294967295L));
      this.n5.writeByte((byte)var1);
      return 4;
   }

   public final int u3(long var1) {
      this.n5.writeByte((byte)(var1 >> 56));
      this.n5.writeByte((byte)(var1 >> 48));
      this.n5.writeByte((byte)(var1 >> 40));
      this.n5.writeByte((byte)(var1 >> 32));
      this.n5.writeByte((byte)(var1 >> 24));
      this.n5.writeByte((byte)(var1 >> 16));
      this.n5.writeByte((byte)(var1 >> 8));
      this.n5.writeByte((byte)var1);
      return 8;
   }

   public final int n5(float var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.l6(var1, 13));
      this.n5(com.aspose.slides.internal.v6g.k5.l6((var1 - com.aspose.slides.internal.v6g.k5.l6(var1, 13)) * 65536.0F, 13));
      return 2;
   }

   public final int n5(double var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.ms.System.q1.u3(var1 * 16384.0), 14));
      return 1;
   }

   public final int n5(com.aspose.slides.ms.System.j5 var1) {
      com.aspose.slides.ms.System.j5 var2 = new com.aspose.slides.ms.System.j5(1904, 1, 1);
      double var3 = com.aspose.slides.ms.System.j5.t2(var1, var2).t2();
      this.u3(com.aspose.slides.internal.v6g.k5.u9(var3, 14));
      return 8;
   }

   public final int l6(short var1) {
      return this.n5(var1);
   }

   public final int k5(int var1) {
      return this.n5(var1);
   }

   @Override
   public final void dispose() {
      if (this.l6) {
         this.n5.close();
      }
   }
}
