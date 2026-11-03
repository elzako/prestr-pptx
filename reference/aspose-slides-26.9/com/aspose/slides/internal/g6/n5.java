package com.aspose.slides.internal.g6;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.j5;

public class n5 {
   private j5 n5 = new j5(new e2());
   private byte l6;
   private int k5;

   public n5() {
      this.n5.n5(true);
      this.k5 = 0;
      this.l6 = 0;
   }

   public final void n5(int var1) {
      this.l6 = (byte)(this.l6 & 0xFF | (byte)(var1 << 7 - this.k5) & 0xFF);
      this.k5++;
      if (this.k5 == 8) {
         this.n5.n5().writeByte(this.l6);
         this.l6 = 0;
         this.k5 = 0;
      }
   }

   public final void n5(boolean var1) {
      this.n5(var1 ? 1 : 0);
   }

   public final void n5(int var1, int var2) {
      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         this.n5(var1 >> var3 & 1);
      }
   }

   public final void n5() {
      if (this.k5 > 0) {
         this.n5.n5().writeByte(this.l6);
         this.l6 = 0;
         this.k5 = 0;
      }
   }

   public final byte[] l6() {
      return ((e2)this.n5.n5()).toArray();
   }
}
