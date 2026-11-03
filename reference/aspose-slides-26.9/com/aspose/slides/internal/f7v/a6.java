package com.aspose.slides.internal.f7v;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;

public class a6 {
   public final int n5;
   public final byte[] l6 = new byte[4];
   public byte[] k5 = null;
   private int u3 = 0;

   public a6(int var1, byte[] var2, boolean var3) {
      this.n5 = var1;
      System.arraycopy(var2, 0, this.l6, 0, 4);
      if (var3) {
         this.l6();
      }
   }

   private void l6() {
      if (this.k5 == null || this.k5.length < this.n5) {
         this.k5 = new byte[this.n5];
      }
   }

   private int k5() {
      CRC32 var1 = com.aspose.slides.internal.c5e.h0.l6();
      var1.reset();
      var1.update(this.l6, 0, 4);
      if (this.n5 > 0) {
         var1.update(this.k5, 0, this.n5);
      }

      return (int)var1.getValue();
   }

   public int n5(InputStream var1, boolean var2) {
      com.aspose.slides.internal.c5e.h0.n5(var1, this.k5, 0, this.n5);
      this.u3 = com.aspose.slides.internal.c5e.h0.l6(var1);
      if (var2) {
         int var3 = this.k5();
         if (var3 != this.u3) {
            throw new com.aspose.slides.internal.c5e.y4("chunk: " + this + " crc calc=" + var3 + " read=" + this.u3);
         }
      }

      return this.n5 + 4;
   }

   ByteArrayInputStream n5() {
      return new ByteArrayInputStream(this.k5);
   }

   @Override
   public String toString() {
      return "chunkid=" + com.aspose.slides.internal.f7v.n5.n5(this.l6) + " len=" + this.n5;
   }
}
