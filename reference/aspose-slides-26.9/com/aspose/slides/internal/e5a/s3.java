package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;

public class s3 extends com.aspose.slides.internal.z0k.t4 {
   public p8 n5 = null;
   public int l6 = 2;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public boolean h0;
   public byte[] c8;
   public int t2 = 8192;
   public byte[] s7 = new byte[1];
   public com.aspose.slides.internal.z0k.t4 x8;
   public int n3 = 0;
   private h0 t4;
   public String y4;
   public String e2;
   public com.aspose.slides.ms.System.j5 t9 = new com.aspose.slides.ms.System.j5();
   public int z1;
   private boolean q0 = false;

   public final int n5() {
      return this.t4 == null ? 0 : this.t4.l6();
   }

   public s3(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3, int var4, boolean var5) {
      this.k5 = 0;
      this.x8 = var1;
      this.h0 = var5;
      this.a6 = var2;
      this.u3 = var4;
      this.u9 = var3;
      if (var4 == 1952) {
         this.t4 = new h0();
      }
   }

   public final boolean l6() {
      return this.a6 == 0;
   }

   private p8 k5() {
      if (this.n5 == null) {
         boolean var1 = this.u3 == 1950;
         this.n5 = new p8();
         if (this.a6 == 1) {
            this.n5.n5(var1);
         } else {
            this.n5.t9 = this.n3;
            this.n5.l6(this.u9, var1);
         }
      }

      return this.n5;
   }

   private byte[] u3() {
      if (this.c8 == null) {
         this.c8 = new byte[this.t2];
      }

      return this.c8;
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.t4 != null) {
         this.t4.n5(buffer, offset, count);
      }

      if (this.l6 == 2) {
         this.l6 = 0;
      } else if (this.l6 != 0) {
         throw new f2("Cannot Write after Reading.");
      }

      if (count != 0) {
         this.k5().n5 = buffer;
         this.n5.l6 = offset;
         this.n5.k5 = count;
         boolean var4 = false;

         do {
            this.n5.a6 = this.u3();
            this.n5.u9 = 0;
            this.n5.h0 = this.c8.length;
            int var5 = this.l6() ? this.n5.l6(this.k5) : this.n5.n5(this.k5);
            if (var5 != 0 && var5 != 1) {
               throw new f2(d1.n5(new String[]{this.l6() ? "de" : "in", "flating: ", this.n5.t2}));
            }

            this.x8.write(this.c8, 0, this.c8.length - this.n5.h0);
            var4 = this.n5.k5 == 0 && this.n5.h0 != 0;
            if (this.u3 == 1952 && !this.l6()) {
               var4 = this.n5.k5 == 8 && this.n5.h0 != 0;
            }
         } while (!var4);
      }
   }

   private void a6() {
      if (this.n5 != null) {
         if (this.l6 == 0) {
            boolean var1 = false;

            do {
               this.n5.a6 = this.u3();
               this.n5.u9 = 0;
               this.n5.h0 = this.c8.length;
               int var2 = this.l6() ? this.n5.l6(4) : this.n5.n5(4);
               if (var2 != 1 && var2 != 0) {
                  throw new f2(d1.n5(this.l6() ? "de" : "in", "flating: ", this.n5.t2));
               }

               if (this.c8.length - this.n5.h0 > 0) {
                  this.x8.write(this.c8, 0, this.c8.length - this.n5.h0);
               }

               var1 = this.n5.k5 == 0 && this.n5.h0 != 0;
               if (this.u3 == 1952 && !this.l6()) {
                  var1 = this.n5.k5 == 8 && this.n5.h0 != 0;
               }
            } while (!var1);

            this.flush();
            if (this.u3 == 1952) {
               if (!this.l6()) {
                  throw new f2("Writing with decompression is not supported.");
               }

               int var8 = this.t4.l6();
               this.x8.write(com.aspose.slides.ms.System.x8.l6(var8), 0, 4);
               int var3 = (int)(this.t4.n5() & 4294967295L);
               this.x8.write(com.aspose.slides.ms.System.x8.l6(var3), 0, 4);
            }
         } else if (this.l6 == 1 && this.u3 == 1952) {
            if (this.l6()) {
               throw new f2("Reading with compression is not supported.");
            }

            if (this.n5.c8 == 0L) {
               return;
            }

            byte[] var7 = new byte[8];
            if (this.n5.k5 != 8) {
               throw new f2(d1.n5("Protocol error. AvailableBytesIn={0}, expected 8", new Object[]{this.n5.k5}));
            }

            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(this.n5.n5)), this.n5.l6, com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0, var7.length
            );
            int var9 = com.aspose.slides.ms.System.x8.a6(var7, 0);
            int var10 = this.t4.l6();
            int var4 = com.aspose.slides.ms.System.x8.a6(var7, 4);
            int var5 = (int)(this.n5.c8 & 4294967295L);
            if (var10 != var9) {
               throw new f2(d1.n5("Bad CRC32 in GZIP stream. (actual({0:X8})!=expected({1:X8}))",new Object[]{ var10, var9}));
            }

            if (var5 != var4) {
               throw new f2(d1.n5("Bad size in GZIP stream. (actual({0})!=expected({1}))",new Object[]{ var5, var4}));
            }
         }
      }
   }

   private void u9() {
      if (this.k5() != null) {
         if (this.l6()) {
            this.n5.l6();
         } else {
            this.n5.n5();
         }

         this.n5 = null;
      }
   }

   @Override
   public void close() {
      if (this.x8 != null) {
         try {
            this.a6();
         } finally {
            this.u9();
            if (!this.h0) {
               this.x8.close();
            }

            this.x8 = null;
         }
      }
   }

   @Override
   public void flush() {
      this.x8.flush();
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotImplementedException();
   }

   @Override
   public void setLength(long value) {
      this.x8.setLength(value);
   }

   private String h0() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      boolean var2 = false;

      do {
         int var3 = this.x8.read(this.s7, 0, 1);
         if (var3 != 1) {
            throw new f2("Unexpected EOF reading GZIP header.");
         }

         if ((this.s7[0] & 255) == 0) {
            var2 = true;
         } else {
            var1.writeByte(this.s7[0]);
         }
      } while (!var2);

      byte[] var4 = var1.toArray();
      return com.aspose.slides.internal.e5a.y4.u3.l6(var4, 0, var4.length);
   }

   private int c8() {
      int var1 = 0;
      byte[] var2 = new byte[10];
      int var3 = this.x8.read(var2, 0, var2.length);
      if (var3 == 0) {
         return 0;
      }

      if (var3 != 10) {
         throw new f2("Not a valid GZIP stream.");
      }

      if ((var2[0] & 255) == 31 && (var2[1] & 255) == 139 && (var2[2] & 255) == 8) {
         int var4 = com.aspose.slides.ms.System.x8.a6(var2, 4);
         com.aspose.slides.internal.e5a.y4.k5.a6(var4).u3(this.t9);
         var1 += var3;
         if ((var2[3] & 255 & 4) == 4) {
            var3 = this.x8.read(var2, 0, 2);
            var1 += var3;
            short var5 = (short)((var2[0] & 255) + (var2[1] & 255) * 256);
            byte[] var6 = new byte[var5];
            var3 = this.x8.read(var6, 0, var6.length);
            if (var3 != var5) {
               throw new f2("Unexpected end-of-file reading GZIP header.");
            }

            var1 += var3;
         }

         if ((var2[3] & 255 & 8) == 8) {
            this.y4 = this.h0();
         }

         if ((var2[3] & 255 & 16) == 16) {
            this.e2 = this.h0();
         }

         if ((var2[3] & 255 & 2) == 2) {
            this.read(this.s7, 0, 1);
         }

         return var1;
      } else {
         throw new f2("Bad GZIP header.");
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.l6 == 2) {
         if (!this.x8.canRead()) {
            throw new f2("The stream is not readable.");
         }

         this.l6 = 1;
         this.k5().k5 = 0;
         if (this.u3 == 1952) {
            this.z1 = this.c8();
            if (this.z1 == 0) {
               return 0;
            }
         }
      }

      if (this.l6 != 1) {
         throw new f2("Cannot Read after Writing.");
      }

      if (count == 0) {
         return 0;
      }

      if (this.q0 && this.l6()) {
         return 0;
      }

      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (offset < com.aspose.slides.ms.System.u3.n5((Object)(buffer)).l6(0)) {
         throw new ArgumentOutOfRangeException("offset");
      }

      if (offset + count > com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6(0)) {
         throw new ArgumentOutOfRangeException("count");
      }

      int var4 = 0;
      this.n5.a6 = buffer;
      this.n5.u9 = offset;
      this.n5.h0 = count;
      this.n5.n5 = this.u3();

      do {
         if (this.n5.k5 == 0 && !this.q0) {
            this.n5.l6 = 0;
            this.n5.k5 = this.x8.read(this.c8, 0, this.c8.length);
            if (this.n5.k5 == 0) {
               this.q0 = true;
            }
         }

         var4 = this.l6() ? this.n5.l6(this.k5) : this.n5.n5(this.k5);
         if (this.q0 && var4 == -5) {
            return 0;
         }

         if (var4 != 0 && var4 != 1) {
            throw new f2(d1.n5("{0}flating:  rc={1}  msg={2}",new Object[]{ this.l6() ? "de" : "in", var4, this.n5.t2}));
         }
      } while ((!this.q0 && var4 != 1 || this.n5.h0 != count) && this.n5.h0 > 0 && !this.q0 && var4 == 0);

      if (this.n5.h0 > 0) {
         if (var4 == 0 && this.n5.k5 == 0) {
         }

         if (this.q0 && this.l6()) {
            var4 = this.n5.l6(4);
            if (var4 != 0 && var4 != 1) {
               throw new f2(d1.n5("Deflating:  rc={0}  msg={1}",new Object[]{ var4, this.n5.t2}));
            }
         }
      }

      var4 = count - this.n5.h0;
      if (this.t4 != null) {
         this.t4.n5(buffer, offset, var4);
      }

      return var4;
   }

   @Override
   public boolean canRead() {
      return this.x8.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.x8.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.x8.canWrite();
   }

   @Override
   public long getLength() {
      return this.x8.getLength();
   }

   @Override
   public long getPosition() {
      return this.x8.getPosition();
   }

   @Override
   public void setPosition(long value) {
      this.x8.setPosition(value);
   }
}
