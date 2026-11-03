package com.aspose.slides.internal.g7;

import com.aspose.slides.ms.System.IDisposable;

class h2 implements IDisposable {
   private com.aspose.slides.internal.z0k.t4 n5;
   private boolean l6;

   public h2(com.aspose.slides.internal.z0k.t4 var1) {
      this(var1, true);
   }

   public h2(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5(long var1) {
      this.n5.seek(var1, 0);
   }

   public final void n5(byte var1) {
      this.n5.writeByte(var1);
   }

   public final void n5(int var1) {
      this.n5.writeByte((byte)(com.aspose.slides.internal.v6g.k5.k5(var1, 8) >> 8));
      this.n5.writeByte(com.aspose.slides.internal.v6g.k5.n5((Object)(var1), 8));
   }

   public final void l6(byte var1) {
      this.n5.writeByte(var1);
   }

   public final void n5(int var1, int var2) {
      int var3 = var1;

      while (var3-- > 0) {
         this.n5.writeByte((byte)(var2 >> 8 * (var3 + 1)));
      }
   }

   public final void n5(byte[] var1) {
      this.n5.write(var1, 0, var1.length);
   }

   @Override
   public final void dispose() {
      if (this.l6) {
         this.n5.close();
      }
   }
}
