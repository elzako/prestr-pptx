package com.aspose.slides.internal.f3h;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;
import java.util.ArrayList;

class h0 extends com.aspose.slides.internal.z0k.t4 {
   u3 n5 = null;
   int l6 = 2;
   int k5;
   int u3;
   int a6;
   int u9;
   boolean h0;
   byte[] c8;
   int t2 = 16384;
   byte[] s7 = new byte[1];
   com.aspose.slides.internal.z0k.t4 x8;
   int n3 = 0;
   private com.aspose.slides.internal.v2o.n5 t4;
   String y4;
   String e2;
   j5 t9 = new j5();
   int z1;
   private boolean q0 = false;

   int n5() {
      return this.t4 == null ? 0 : this.t4.l6();
   }

   public h0(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3, int var4, boolean var5) {
      this.k5 = 0;
      this.x8 = var1;
      this.h0 = var5;
      this.a6 = var2;
      this.u3 = var4;
      this.u9 = var3;
      if (var4 == 1952) {
         this.t4 = new com.aspose.slides.internal.v2o.n5();
      }
   }

   boolean l6() {
      return this.a6 == 0;
   }

   private u3 k5() {
      if (this.n5 == null) {
         boolean var1 = this.u3 == 1950;
         this.n5 = new u3();
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
         throw new a6("Cannot Write after Reading.");
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
               throw new a6(d1.n5(new String[]{this.l6() ? "de" : "in", "flating: ", this.n5.t2}));
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
                  String var11 = d1.n5(new String[]{this.l6() ? "de" : "in", "flating"});
                  if (this.n5.t2 == null) {
                     throw new a6(d1.n5("{0}: (rc = {1})",new Object[]{ var11, var2}));
                  }

                  throw new a6(d1.n5(new String[]{var11, ": ", this.n5.t2}));
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
                  throw new a6("Writing with decompression is not supported.");
               }

               int var8 = this.t4.l6();
               this.x8.write(com.aspose.slides.ms.System.x8.l6(var8), 0, 4);
               int var3 = (int)(this.t4.n5() & 4294967295L);
               this.x8.write(com.aspose.slides.ms.System.x8.l6(var3), 0, 4);
            }
         } else if (this.l6 == 1 && this.u3 == 1952) {
            if (this.l6()) {
               throw new a6("Reading with compression is not supported.");
            }

            if (this.n5.c8 == 0L) {
               return;
            }

            byte[] var7 = new byte[8];
            if (this.n5.k5 < 8) {
               System.arraycopy(this.n5.n5, this.n5.l6, var7, 0, this.n5.k5);
               int var9 = 8 - this.n5.k5;
               int var12 = this.x8.read(var7, this.n5.k5, var9);
               if (var9 != var12) {
                  throw new a6("Missing or incomplete GZIP trailer. Expected 8 bytes, got " + this.n5.k5 + var12 + ".");
               }
            } else {
               System.arraycopy(this.n5.n5, this.n5.l6, var7, 0, var7.length);
            }

            int var10 = com.aspose.slides.ms.System.x8.a6(var7, 0);
            int var13 = this.t4.l6();
            int var4 = com.aspose.slides.ms.System.x8.a6(var7, 4);
            int var5 = (int)(this.n5.c8 & 4294967295L);
            if (var13 != var10) {
               throw new a6("Bad CRC32 in GZIP trailer. (actual(" + var13 + ")!=expected(" + var10 + "))");
            }

            if (var5 != var4) {
               throw new a6("Bad size in GZIP trailer. (actual(" + var5 + ")!=expected(" + var4 + "))");
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
      ArrayList var1 = new ArrayList();
      boolean var2 = false;

      do {
         int var3 = this.x8.read(this.s7, 0, 1);
         if (var3 != 1) {
            throw new a6("Unexpected EOF reading GZIP header.");
         }

         if (this.s7[0] == 0) {
            var2 = true;
         } else {
            var1.add(this.s7[0]);
         }
      } while (!var2);

      byte[] var5 = new byte[var1.size()];

      for (int var4 = 0; var4 < var1.size(); var4++) {
         var5[var4] = (Byte)var1.get(var4);
      }

      return com.aspose.slides.internal.f3h.k5.u3.l6(var5, 0, var5.length);
   }

   private int c8() {
      int var1 = 0;
      byte[] var2 = new byte[10];
      int var3 = this.x8.read(var2, 0, var2.length);
      if (var3 == 0) {
         return 0;
      }

      if (var3 != 10) {
         throw new a6("Not a valid GZIP stream.");
      }

      if (var2[0] == 31 && (var2[1] & 255) == 139 && var2[2] == 8) {
         int var4 = com.aspose.slides.ms.System.x8.a6(var2, 4);
         com.aspose.slides.internal.f3h.k5.k5.a6(var4).u3(this.t9);
         var1 += var3;
         if ((var2[3] & 255 & 4) == 4) {
            var3 = this.x8.read(var2, 0, 2);
            var1 += var3;
            short var5 = (short)((var2[0] & 255) + (var2[1] & 255) * 256);
            byte[] var6 = new byte[var5];
            var3 = this.x8.read(var6, 0, var6.length);
            if (var3 != var5) {
               throw new a6("Unexpected end-of-file reading GZIP header.");
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
         throw new a6("Bad GZIP header.");
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.l6 == 2) {
         if (!this.x8.canRead()) {
            throw new a6("The stream is not readable.");
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
         throw new a6("Cannot Read after Writing.");
      }

      if (count == 0) {
         return 0;
      }

      if (this.q0 && this.l6()) {
         return 0;
      }

      if (buffer == null) {
         throw new IllegalArgumentException("buffer");
      }

      if (count < 0) {
         throw new IllegalArgumentException("Parameter name: count");
      }

      if (offset < 0) {
         throw new IllegalArgumentException("Parameter name: offset");
      }

      if (offset + count > buffer.length) {
         throw new IllegalArgumentException("Parameter name: count");
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
            throw new a6(d1.n5("{0}flating:  rc={1}  msg={2}",new Object[]{ this.l6() ? "de" : "in", var4, this.n5.t2}));
         }
      } while ((!this.q0 && var4 != 1 || this.n5.h0 != count) && this.n5.h0 > 0 && !this.q0 && var4 == 0);

      if (this.n5.h0 > 0) {
         if (var4 == 0 && this.n5.k5 == 0) {
         }

         if (this.q0 && this.l6()) {
            var4 = this.n5.l6(4);
            if (var4 != 0 && var4 != 1) {
               throw new a6(d1.n5("Deflating:  rc={0}  msg={1}",new Object[]{ var4, this.n5.t2}));
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
      throw new NotImplementedException();
   }

   @Override
   public void setPosition(long value) {
      throw new NotImplementedException();
   }
}
