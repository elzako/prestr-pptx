package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;

public class l6 extends t4 {
   protected int n5 = 8192;
   protected byte[] l6;
   protected t4 k5;
   private n5 u3;
   private final boolean a6;
   private final int u9;
   private final boolean h0;
   private boolean c8;
   private e2 t2;

   public l6(t4 var1, int var2, boolean var3, boolean var4) {
      this.k5 = var1;
      this.a6 = var4;
      this.u9 = var2;
      this.h0 = var3;
      if (this.h0) {
         this.u3 = new n5();
      }
   }

   @Override
   public boolean canRead() {
      return this.k5.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.k5.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.k5.canWrite();
   }

   @Override
   public long getLength() {
      return this.k5.getLength();
   }

   @Override
   public long getPosition() {
      throw new NotImplementedException();
   }

   @Override
   public void setPosition(long value) {
      throw new NotImplementedException();
   }

   private e2 n5() {
      if (this.t2 == null) {
         this.t2 = new e2();
         this.t2.x8 = 0;
         this.t2.n5(this.u9, this.h0);
      }

      return this.t2;
   }

   private byte[] l6() {
      if (this.l6 == null) {
         this.l6 = new byte[this.n5];
      }

      return this.l6;
   }

   @Override
   public void close() {
      if (this.k5 != null) {
         try {
            this.k5();
         } finally {
            if (this.n5() != null) {
               this.t2.k5();
            }

            if (!this.a6) {
               this.k5.close();
            }

            this.k5 = null;
         }
      }
   }

   @Override
   public void flush() {
      this.k5.flush();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      throw new NotImplementedException();
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotImplementedException();
   }

   @Override
   public void setLength(long value) {
      this.k5.setLength(value);
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.u3 != null) {
         this.u3.n5(buffer, offset, count);
      }

      if (count != 0) {
         this.n5().n5 = buffer;
         this.t2.l6 = offset;
         this.t2.k5 = count;

         boolean var5;
         do {
            this.t2.a6 = this.l6();
            this.t2.u9 = 0;
            this.t2.h0 = this.l6.length;
            int var4 = this.t2.n5(false);
            if (var4 != 0 && var4 != 1) {
               throw new com.aspose.slides.internal.z3b.n5("deflating error ");
            }

            this.k5.write(this.l6, 0, this.l6.length - this.t2.h0);
            var5 = this.t2.k5 == 0 && this.t2.h0 != 0;
         } while (!var5);
      }
   }

   @Override
   protected void dispose(boolean disposing) {
      if (!this.c8) {
         if (disposing && this.k5 != null) {
            this.close();
         }

         this.c8 = true;
      }
   }

   private void k5() {
      if (this.t2 != null) {
         boolean var2;
         do {
            this.t2.a6 = this.l6();
            this.t2.u9 = 0;
            this.t2.h0 = this.l6.length;
            int var1 = this.t2.n5(true);
            if (var1 != 1 && var1 != 0) {
               throw new com.aspose.slides.internal.z3b.n5(d1.n5("deflating error.", new Object[]{}));
            }

            if (this.l6.length - this.t2.h0 > 0) {
               this.k5.write(this.l6, 0, this.l6.length - this.t2.h0);
            }

            var2 = this.t2.k5 == 0 && this.t2.h0 != 0;
         } while (!var2);

         this.flush();
         if (this.h0) {
            int var4 = this.u3.n5();
            this.k5.write(com.aspose.slides.ms.System.x8.l6(var4), 0, 4);
            int var3 = (int)(this.u3.l6() & 4294967295L);
            this.k5.write(com.aspose.slides.ms.System.x8.l6(var3), 0, 4);
         }
      }
   }
}
