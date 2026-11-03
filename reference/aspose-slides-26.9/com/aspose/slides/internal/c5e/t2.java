package com.aspose.slides.internal.c5e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CRC32;

class t2 extends InputStream {
   private final InputStream l6;
   private final CRC32 k5;
   private boolean u3 = true;
   private int a6;
   private byte[] u9 = new byte[4];
   private int h0 = 0;
   private boolean c8 = false;
   private long t2;
   List<t2$n5> n5 = new ArrayList<>();

   t2(InputStream var1, int var2, long var3) {
      this.t2 = var3;
      this.l6 = var1;
      this.a6 = var2;
      this.h0 = var2;
      System.arraycopy(com.aspose.slides.internal.f7v.n5.k5, 0, this.u9, 0, 4);
      this.k5 = new CRC32();
      this.k5.update(this.u9, 0, 4);
      this.n5.add(new t2$n5(this.a6, var3 - 8L, null));
      if (this.a6 == 0) {
         this.h0();
      }
   }

   @Override
   public void close() throws IOException {
      super.close();
   }

   private void h0() {
      do {
         int var1 = com.aspose.slides.internal.c5e.h0.l6(this.l6);
         this.t2 += 4L;
         if (this.u3) {
            int var2 = (int)this.k5.getValue();
            if (this.a6 > 0 && var1 != var2) {
               throw new y4("error reading idat; offset: " + this.t2);
            }

            this.k5.reset();
         }

         this.a6 = com.aspose.slides.internal.c5e.h0.l6(this.l6);
         if (this.a6 < 0) {
            this.c8 = true;
         } else {
            this.h0 = this.a6;
            com.aspose.slides.internal.c5e.h0.n5(this.l6, this.u9, 0, 4);
            this.t2 += 8L;
            this.c8 = !Arrays.equals(this.u9, com.aspose.slides.internal.f7v.n5.k5);
            if (!this.c8) {
               this.n5.add(new t2$n5(this.a6, this.t2 - 8L, null));
               if (this.u3) {
                  this.k5.update(this.u9, 0, 4);
               }
            }
         }
      } while (this.a6 == 0 && !this.c8);
   }

   void n5() {
      if (!this.c8) {
         byte[] var1 = new byte[this.h0];
         com.aspose.slides.internal.c5e.h0.n5(this.l6, var1, 0, this.h0);
         if (this.u3) {
            this.k5.update(var1, 0, this.h0);
         }

         this.h0();
      }
   }

   @Override
   public int read(byte[] b, int off, int len) throws IOException {
      if (this.c8) {
         return -1;
      }

      if (this.h0 == 0) {
         throw new t9("this should not happen");
      }

      int var4 = this.l6.read(b, off, len >= this.h0 ? this.h0 : len);
      if (var4 > 0) {
         if (this.u3) {
            this.k5.update(b, off, var4);
         }

         this.t2 += var4;
         this.h0 -= var4;
      }

      if (this.h0 == 0) {
         this.h0();
      }

      return var4;
   }

   @Override
   public int read(byte[] b) throws IOException {
      return this.read(b, 0, b.length);
   }

   @Override
   public int read() throws IOException {
      byte[] var1 = new byte[1];
      int var2 = this.read(var1, 0, 1);
      return var2 < 0 ? -1 : var1[0];
   }

   int l6() {
      return this.a6;
   }

   byte[] k5() {
      return this.u9;
   }

   long u3() {
      return this.t2;
   }

   boolean a6() {
      return this.c8;
   }

   void u9() {
      this.u3 = false;
   }
}
