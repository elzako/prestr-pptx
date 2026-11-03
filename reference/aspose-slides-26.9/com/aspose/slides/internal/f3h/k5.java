package com.aspose.slides.internal.f3h;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.s4;

public class k5 extends com.aspose.slides.internal.z0k.t4 {
   public j5 n5 = j5.l6.m3();
   private int a6;
   h0 l6;
   private boolean u9;
   private boolean h0;
   private String c8;
   private String t2;
   private int s7;
   static j5 k5 = new j5(1970, 1, 1, 0, 0, 0, 1L);
   static com.aspose.slides.internal.l7h.j5 u3 = null;

   public String n5() {
      return this.t2;
   }

   public void n5(String var1) {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      }

      this.t2 = var1;
   }

   public String l6() {
      return this.c8;
   }

   public void l6(String var1) {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      }

      this.c8 = var1;
      if (this.c8 != null) {
         if (this.c8.indexOf("/") != -1) {
            this.c8 = this.c8.replace("/", "\\");
         }

         if (this.c8.endsWith("\\")) {
            throw new RuntimeException("Illegal filename");
         }

         if (this.c8.indexOf("\\") != -1) {
            this.c8 = com.aspose.slides.internal.z0k.z1.n5(this.c8);
         }
      }
   }

   public k5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this(var1, var2, 6, false);
   }

   public k5(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3, boolean var4) {
      this.l6 = new h0(var1, var2, var3, 1952, var4);
   }

   @Override
   protected void dispose(boolean disposing) {
      try {
         if (!this.u9) {
            if (disposing && this.l6 != null) {
               this.l6.close();
               this.s7 = this.l6.n5();
            }

            this.u9 = true;
         }
      } finally {
         super.dispose(disposing);
      }
   }

   @Override
   public boolean canRead() {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      } else {
         return this.l6.x8.canRead();
      }
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      } else {
         return this.l6.x8.canWrite();
      }
   }

   @Override
   public void flush() {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      }

      this.l6.flush();
   }

   @Override
   public long getLength() {
      throw new NotImplementedException();
   }

   @Override
   public long getPosition() {
      if (this.l6.l6 == 0) {
         return this.l6.n5.c8 + this.a6;
      } else {
         return this.l6.l6 == 1 ? this.l6.n5.u3 + this.l6.z1 : 0L;
      }
   }

   @Override
   public void setPosition(long value) {
      throw new NotImplementedException();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      }

      int var4 = this.l6.read(buffer, offset, count);
      if (!this.h0) {
         this.h0 = true;
         this.l6(this.l6.y4);
         this.n5(this.l6.e2);
      }

      return var4;
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotImplementedException();
   }

   @Override
   public void setLength(long value) {
      throw new NotImplementedException();
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.u9) {
         throw new ObjectDisposedException("GZipStream");
      }

      if (this.l6.l6 == 2) {
         if (!this.l6.l6()) {
            throw new IllegalStateException();
         }

         this.a6 = this.k5();
      }

      this.l6.write(buffer, offset, count);
   }

   private int k5() {
      if (u3 == null) {
         u3 = com.aspose.slides.internal.l7h.j5.k5("iso-8859-1");
      }

      byte[] var1 = this.n5() == null ? null : u3.u3(this.n5());
      byte[] var2 = this.l6() == null ? null : u3.u3(this.l6());
      int var3 = this.n5() == null ? 0 : var1.length + 1;
      int var4 = this.l6() == null ? 0 : var2.length + 1;
      int var5 = 10 + var3 + var4;
      byte[] var6 = new byte[var5];
      int var7 = 0;
      var6[var7++] = 31;
      var6[var7++] = -117;
      var6[var7++] = 8;
      byte var8 = 0;
      if (this.n5() != null) {
         var8 = (byte)(var8 ^ 16);
      }

      if (this.l6() != null) {
         var8 = (byte)(var8 ^ 8);
      }

      var6[var7++] = var8;
      if (this.n5.equals(j5.l6)) {
         j5.s7().u3(this.n5);
      }

      s4 var9 = j5.t2(this.n5, k5).n3();
      int var10 = (int)var9.t2();
      System.arraycopy(com.aspose.slides.ms.System.x8.l6(var10), 0, var6, var7, 4);
      var7 += 4;
      var6[var7++] = 0;
      var6[var7++] = -1;
      if (var4 != 0) {
         System.arraycopy(var2, 0, var6, var7, var4 - 1);
         var7 += var4 - 1;
         var6[var7++] = 0;
      }

      if (var3 != 0) {
         System.arraycopy(var1, 0, var6, var7, var3 - 1);
         var7 += var3 - 1;
         var6[var7++] = 0;
      }

      this.l6.x8.write(var6, 0, var6.length);
      return var6.length;
   }
}
