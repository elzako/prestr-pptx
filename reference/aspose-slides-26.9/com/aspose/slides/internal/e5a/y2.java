package com.aspose.slides.internal.e5a;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.i9;
import java.io.File;

public class y2 {
   private int j5;
   private int w1;
   private q0 r4;
   private w1 c4;
   public c4 n5;
   public com.aspose.slides.ms.System.j5 l6 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 y2 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 y1 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 a0 = new com.aspose.slides.ms.System.j5();
   private boolean d2;
   private boolean d5 = true;
   private boolean s3;
   private boolean p8 = true;
   private boolean f2;
   public String k5;
   private String i1;
   public short u3;
   public short a6;
   public short u9;
   public String h0;
   private boolean e5;
   private byte[] b3;
   public long c8;
   public long t2;
   public long s7;
   public int x8;
   private boolean o0;
   public int n3;
   public byte[] y4;
   private boolean z7;
   private boolean v4;
   private boolean u6;
   private boolean t1;
   private static final com.aspose.slides.internal.l7h.j5 a5 = com.aspose.slides.internal.n2d.x8.n5("IBM437");
   private com.aspose.slides.internal.l7h.j5 h2 = com.aspose.slides.internal.n2d.x8.n5("IBM437");
   private com.aspose.slides.internal.l7h.j5 v0;
   public d2 e2;
   public long t9 = -1L;
   private byte[] f0;
   public long z1;
   private long a3;
   public int t4;
   public int q0;
   private boolean p3;
   private long x9;
   public String z3;
   public int m1 = 0;
   public int k7 = 0;
   public byte[] m3;
   public com.aspose.slides.internal.z0k.t4 z8;
   private com.aspose.slides.internal.z0k.t4 y0;
   private com.aspose.slides.internal.r3q.n5 j9 = new com.aspose.slides.internal.r3q.n5();
   private boolean z6;
   private boolean e9;
   private byte o5;
   private byte j8;
   private boolean w2;
   private int s0;
   private static final com.aspose.slides.ms.System.j5 v8 = new com.aspose.slides.ms.System.j5(1970, 1, 1, 0, 0, 0);
   private short v3;
   private short g7;
   private int j4;
   private short i9;
   private short f5;
   private short j3;
   private int n1;
   private static final com.aspose.slides.internal.r7c.c8 p6 = new com.aspose.slides.internal.r7c.c8("(?i)^(.+)\\.(mp3|png|docx|xlsx|pptx|jpg|zip)$");

   public final com.aspose.slides.ms.System.j5 n5() {
      return this.l6.q0();
   }

   private int y1() {
      return this.e2.l6();
   }

   public final void n5(boolean var1) {
      this.d5 = var1;
      this.z7 = true;
   }

   public final void l6(boolean var1) {
      this.s3 = var1;
      this.z7 = true;
   }

   public final boolean l6() {
      return this.f2;
   }

   public final void k5(boolean var1) {
      if (var1 != this.f2) {
         this.f2 = var1;
         if (this.f2) {
            this.n5((short)0);
         }
      }
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.i1;
   }

   public final void n5(String var1) {
      if (var1 != null && var1.length() != 0) {
         String var2 = d1.n5(n5(var1, null), '\\', '/');
         if (!d1.a6(this.i1, var2)) {
            if (this.e2.w1().containsItem(var2)) {
               throw new a0(d1.n5("Cannot rename {0} to {1}; an entry by that name already exists in the archive.",new Object[]{ this.i1, var2}));
            }

            this.i1 = var2;
            if (this.e2 != null) {
               this.e2.m3();
            }

            this.z7 = true;
         }
      } else {
         throw new a0("The FileName must be non empty and non-null.");
      }
   }

   public final String a6() {
      return this.h0;
   }

   public final byte u9() {
      return this.j8;
   }

   public final short h0() {
      return this.u9;
   }

   public final void n5(short var1) {
      if (var1 != this.u9) {
         if (var1 != 0 && var1 != 8) {
            throw new InvalidOperationException("Unsupported compression method. Specify 8 or 0.");
         }

         if (this.m1 == 3 && this.u6) {
            throw new InvalidOperationException("Cannot change compression method on encrypted entries read from archives.");
         }

         this.u9 = var1;
         this.f2 = this.u9 == 0;
         this.v4 = true;
      }
   }

   public final long c8() {
      return this.c8;
   }

   public final long t2() {
      return this.s7;
   }

   public final double s7() {
      return this.t2() == 0L ? 0.0 : 100.0 * (1.0 - 1.0 * this.c8() / (1.0 * this.t2()));
   }

   public final int x8() {
      return this.n3;
   }

   public final boolean n3() {
      return this.e5;
   }

   public final d2 y4() {
      return this.e2;
   }

   public final boolean e2() {
      return this.t9() != 0;
   }

   public final int t9() {
      return this.k7;
   }

   public final void n5(int var1) {
      if (var1 != this.k7) {
         if (var1 == 4) {
            throw new InvalidOperationException("You may not set Encryption to that value.");
         }

         if (this.m1 == 3 && this.u6) {
            throw new InvalidOperationException("You cannot change the encryption method on encrypted entries read from archives.");
         }

         this.k7 = var1;
         this.v4 = true;
      }
   }

   public final void l6(String var1) {
      this.z3 = var1;
      if (this.z3 == null) {
         this.k7 = 0;
      } else {
         if (this.m1 == 3 && !this.u6) {
            this.v4 = true;
         }

         if (this.t9() == 0) {
            this.k7 = 1;
         }
      }
   }

   public final int z1() {
      return this.j5;
   }

   public final void l6(int var1) {
      this.j5 = var1;
   }

   public final int t4() {
      return this.w1;
   }

   public final void k5(int var1) {
      this.w1 = var1;
   }

   public final boolean q0() {
      return !this.t1;
   }

   public final q0 z3() {
      return this.r4;
   }

   public final void n5(q0 var1) {
      this.r4 = var1;
   }

   public final w1 m1() {
      return this.c4;
   }

   public final void n5(w1 var1) {
      this.c4 = var1;
   }

   public final void n5(com.aspose.slides.internal.l7h.j5 var1) {
      this.h2 = var1;
   }

   public final com.aspose.slides.internal.l7h.j5 k7() {
      return this.v0;
   }

   public static String n5(String var0, String var1) {
      String var2;
      if (var1 == null) {
         var2 = var0;
      } else if (var1 != null && var1.length() != 0) {
         var2 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.internal.z0k.z1.n5(var0));
      } else {
         var2 = com.aspose.slides.internal.z0k.z1.n5(var0);
      }

      var2 = com.aspose.slides.internal.e5a.k7.l6(var2);
      var2 = com.aspose.slides.internal.e5a.k7.n5(var2);

      while (d1.l6(var2, "/")) {
         var2 = d1.k5(var2, 1);
      }

      return var2;
   }

   public static y2 n5(String var0, String var1, boolean var2, com.aspose.slides.internal.z0k.t4 var3) {
      if (var0 != null && var0.length() != 0) {
         y2 var4 = new y2();
         var4.v3 = 45;
         if (var2) {
            var4.m1 = 2;
            var4.y0 = var3;
            com.aspose.slides.ms.System.j5 var5 = com.aspose.slides.ms.System.j5.t2().m3();
            var5.u3(var4.a0);
            var5.u3(var4.y1);
            var5.u3(var4.y2);
         } else {
            var4.m1 = 1;
            File var6 = new File(var0);
            var4.a0 = new com.aspose.slides.ms.System.j5(var6.lastModified());
            var4.d2 = true;
         }

         var4.y2.u3(var4.l6);
         var4.k5 = var2 ? var0 : com.aspose.slides.internal.z0k.z1.k5(var0);
         var4.i1 = d1.n5(var1, '\\', '/');
         return var4;
      } else {
         throw new a0("The entry name must be non-null and non-empty.");
      }
   }

   public final void m3() {
      this.e5 = true;
      if (!d1.k5(this.i1, "/")) {
         this.i1 = d1.n5(this.i1, "/");
      }
   }

   public final void u3(boolean var1) {
      this.w2 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("ZipEntry/{0}", new Object[]{this.u3()});
   }

   private void a0() {
      long var1 = this.y2().getPosition();

      try {
         this.e2.n5(this.z1);
      } catch (IOException var6) {
         String var4 = d1.n5("Exception seeking  entry({0}) offset(0x{1:X8}) len(0x{2:X8})",new Object[]{ this.u3(), this.z1, this.y2().getLength()});
         throw new u9(var4, var6);
      }

      byte[] var3 = new byte[30];
      this.y2().read(var3, 0, var3.length);
      int var7 = (var3[26] & 255) + (var3[27] & 255) * 256 & 65535;
      int var5 = (var3[28] & 255) + (var3[29] & 255) * 256 & 65535;
      this.y2().seek((var7 & 65535) + (var5 & 65535), 1);
      this.t4 = 30 + (var5 & 65535) + (var7 & 65535) + this.z8();
      this.t9 = this.z1 + this.t4;
      this.y2().seek(var1, 0);
   }

   public final int z8() {
      if ((this.a6 & 1) != 1) {
         return 0;
      } else if (this.t9() == 1) {
         return 12;
      } else {
         throw new a0("internal error");
      }
   }

   public final long j5() {
      if (this.t9 == -1L) {
         this.a0();
      }

      return this.t9;
   }

   private int d2() {
      if (this.t4 == 0) {
         this.a0();
      }

      return this.t4;
   }

   public final boolean w1() {
      return this.g7 == 0 && (this.j4 & 16) == 16;
   }

   public final void r4() {
      this.t9 = -1L;
      this.t4 = 0;
   }

   public static y2 n5(d2 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.z8();
      com.aspose.slides.internal.l7h.j5 var2 = var0.n3();
      int var3 = com.aspose.slides.internal.e5a.k7.n5(var1);
      if (u3(var3)) {
         var1.seek(-4L, 1);
         if (!var0.k7() && var3 != 101010256L && var3 != 101075792L && var3 != 67324752) {
            throw new a6(d1.n5("  ZipEntry::ReadDirEntry(): Bad signature (0x{0:X8}) at position 0x{1:X8}", var3, var1.getPosition()));
         } else {
            return null;
         }
      } else {
         int var4 = 46;
         byte[] var5 = new byte[42];
         int var6 = var1.read(var5, 0, var5.length);
         if (var6 != var5.length) {
            return null;
         }

         int var7 = 0;
         y2 var8 = new y2();
         var8.m1 = 3;
         var8.z8 = var1;
         var8.e2 = var0;
         var8.v3 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.u3 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.a6 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.u9 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.x8 = (var5[var7++] & 255) + (var5[var7++] & 255) * 256 + (var5[var7++] & 255) * 256 * 256 + (var5[var7++] & 255) * 256 * 256 * 256;
         com.aspose.slides.internal.e5a.k7.n5(var8.x8).u3(var8.l6);
         var8.s0 |= 1;
         var8.n3 = (var5[var7++] & 255) + (var5[var7++] & 255) * 256 + (var5[var7++] & 255) * 256 * 256 + (var5[var7++] & 255) * 256 * 256 * 256;
         var8.c8 = (var5[var7++] & 255) + (var5[var7++] & 255) * 256 + (var5[var7++] & 255) * 256 * 256 + (var5[var7++] & 255) * 256 * 256 * 256 & 4294967295L;
         var8.s7 = (var5[var7++] & 255) + (var5[var7++] & 255) * 256 + (var5[var7++] & 255) * 256 * 256 + (var5[var7++] & 255) * 256 * 256 * 256 & 4294967295L;
         var8.i9 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.f5 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.j3 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var7 += 2;
         var8.g7 = (short)((var5[var7++] & 255) + (var5[var7++] & 255) * 256);
         var8.j4 = (var5[var7++] & 255) + (var5[var7++] & 255) * 256 + (var5[var7++] & 255) * 256 * 256 + (var5[var7++] & 255) * 256 * 256 * 256;
         var8.z1 = (var5[var7++] & 255) + (var5[var7++] & 255) * 256 + (var5[var7++] & 255) * 256 * 256 + (var5[var7++] & 255) * 256 * 256 * 256 & 4294967295L;
         var8.u3((var8.g7 & 1) == 1);
         var5 = new byte[var8.i9];
         var6 = var1.read(var5, 0, var5.length);
         var4 += var6;
         if ((var8.a6 & 2048) == 2048) {
            var8.k5 = com.aspose.slides.internal.e5a.k7.n5(var5);
         } else {
            var8.k5 = com.aspose.slides.internal.e5a.k7.n5(var5, var2);
         }

         var8.i1 = d1.n5(var8.k5, '\\', '/');
         if (var8.w1()) {
            var8.m3();
         }

         if (d1.k5(var8.k5, "/")) {
            var8.m3();
         }

         var8.t2 = var8.c8;
         if ((var8.a6 & 1) == 1) {
            var8.k7 = 1;
            var8.u6 = true;
         }

         if (var8.f5 > 0) {
            var8.p3 = var8.c8 == 4294967295L || var8.s7 == 4294967295L || var8.z1 == 4294967295L;
            var4 += var8.l6(var8.f5);
            var8.t2 = var8.c8;
         }

         if (var8.k7 == 1) {
            var8.t2 -= 12L;
         }

         if ((var8.a6 & 8) == 8) {
            if (var8.p3) {
               var8.q0 += 24;
            } else {
               var8.q0 += 16;
            }
         }

         if (var8.j3 > 0) {
            var5 = new byte[var8.j3];
            var6 = var1.read(var5, 0, var5.length);
            var4 += var6;
            if ((var8.a6 & 2048) == 2048) {
               var8.h0 = com.aspose.slides.internal.e5a.k7.n5(var5);
            } else {
               var8.h0 = com.aspose.slides.internal.e5a.k7.n5(var5, var2);
            }
         }

         return var8;
      }
   }

   public static boolean u3(int var0) {
      return var0 != 33639248;
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5(null, var1, (String)null);
   }

   public final t2 c4() {
      return this.k5(this.z3 != null ? this.z3 : this.e2.l6);
   }

   private t2 k5(String var1) {
      this.f2();
      this.p8();
      this.c8(var1);
      if (this.m1 != 3) {
         throw new u9("You must call ZipFile.Save before calling OpenReader.");
      }

      com.aspose.slides.internal.z0k.t4 var2 = this.y2();
      this.e2.n5(this.j5());
      com.aspose.slides.internal.z0k.t4 var3 = var2;
      if (this.t9() == 1) {
         var3 = new r4(var2, this.n5, 1);
      }

      return new t2(this.h0() == 8 ? new x8(var3, 1, true) : var3, this.s7);
   }

   public final com.aspose.slides.internal.z0k.t4 y2() {
      if (this.z8 == null && this.e2 != null) {
         this.e2.j5();
         this.z8 = this.e2.z8();
      }

      return this.z8;
   }

   private void n5(long var1, long var3) {
      this.z6 = this.e2.l6(this, var1, var3);
   }

   private void u3(String var1) {
      if (!this.e2.k5) {
         this.z6 = this.e2.n5(this, var1, true);
      }
   }

   private void a6(String var1) {
      if (!this.e2.k5) {
         this.e2.n5(this, var1, false);
      }
   }

   private void u9(String var1) {
      this.z6 = this.e2.n5(this, var1);
   }

   private void l6(long var1, long var3) {
      this.z6 = this.e2.n5(this, var1, var3);
   }

   private static void h0(String var0) {
      com.aspose.slides.internal.z0k.u9.l6(var0);
   }

   private void n5(String var1, com.aspose.slides.internal.z0k.t4 var2, String var3) {
      if (this.e2 == null) {
         throw new u9("This ZipEntry is an orphan.");
      }

      this.e2.j5();
      if (this.m1 != 3) {
         throw new u9("You must call ZipFile.Save before calling any Extract method.");
      }

      this.u3(var1);
      this.z6 = false;
      String var4 = null;
      com.aspose.slides.internal.z0k.t4 var5 = null;
      boolean var6 = false;
      boolean var7 = false;

      try {
         this.f2();
         this.p8();
         String[] var8 = new String[]{var4};
         boolean var9 = this.n5(var1, var2, var8);
         var4 = var8[0];
         if (var9) {
            if (this.e2.t2()) {
               this.e2.y4().l6("extract dir {0}...", var4);
            }

            this.a6(var1);
         } else {
            String var10 = var3 != null ? var3 : (this.z3 != null ? this.z3 : this.e2.l6);
            if (this.e2()) {
               if (var10 == null) {
                  throw new u3();
               }

               this.c8(var10);
            }

            if (var4 != null) {
               if (this.e2.t2()) {
                  this.e2.y4().l6("extract file {0}...", var4);
               }

               if (!com.aspose.slides.internal.z0k.u3.k5(com.aspose.slides.internal.z0k.z1.u9(var4))) {
                  com.aspose.slides.internal.z0k.u3.n5(com.aspose.slides.internal.z0k.z1.u9(var4));
               } else {
                  var7 = this.e2.k5;
               }

               if (com.aspose.slides.internal.z0k.u9.k5(var4)) {
                  var6 = true;
                  int var11 = this.l6(var1, var4);
                  if (var11 == 2) {
                     this.n5(var4, var5, var6);
                     return;
                  }

                  if (var11 == 1) {
                     return;
                  }
               }

               var5 = new com.aspose.slides.internal.z0k.n3(var4, 1);
            } else {
               if (this.e2.t2()) {
                  this.e2.y4().l6("extract entry {0} to stream...", this.u3());
               }

               var5 = var2;
            }

            if (this.z6) {
               this.n5(var4, var5, var6);
            } else {
               int var18 = this.a6(var5);
               if (this.z6) {
                  this.n5(var4, var5, var6);
               } else {
                  if (var18 != this.n3) {
                     throw new k5(
                        d1.n5(new String[]{"CRC error: the file being extracted appears to be corrupted. ", d1.n5("Expected 0x{0:X8}, Actual 0x{1:X8}",new Object[]{ this.n3, var18})})
                     );
                  }

                  if (var4 != null) {
                     var5.close();
                     var5 = null;
                     this.n5(var4, true);
                     if (var7 && d1.u3(this.u3(), '/') != -1) {
                        String var12 = com.aspose.slides.internal.z0k.z1.u9(this.u3());
                        if (this.e2.l6(var12) == null) {
                           this.n5(com.aspose.slides.internal.z0k.z1.u9(var4), false);
                        }
                     }
                  }

                  this.a6(var1);
               }
            }
         }
      } catch (RuntimeException var16) {
         this.z6 = true;
         if (com.aspose.slides.internal.v6g.k5.n5(var16, a0.class) == null) {
            throw new a0("Cannot extract", var16);
         } else {
            throw var16;
         }
      } finally {
         this.n5(var4, var5, var6);
      }
   }

   private void n5(String var1, com.aspose.slides.internal.z0k.t4 var2, boolean var3) {
      if (this.z6 && var1 != null) {
         if (var2 != null) {
            var2.close();
         }

         if (com.aspose.slides.internal.z0k.u9.k5(var1) && (!var3 || this.z1() == 1)) {
            com.aspose.slides.internal.z0k.u9.l6(var1);
         }
      }
   }

   private int l6(String var1, String var2) {
      int var3 = 0;

      while (true) {
         switch (this.z1()) {
            case 0:
            default:
               throw new a0(d1.n5("The file {0} already exists.", new Object[]{var2}));
            case 1:
               if (this.e2.t2()) {
                  this.e2.y4().l6("the file {0} exists; deleting it...", var2);
               }

               h0(var2);
               return 0;
            case 2:
               if (this.e2.t2()) {
                  this.e2.y4().l6("the file {0} exists; not extracting entry...", this.u3());
               }

               this.a6(var1);
               return 1;
            case 3:
         }

         if (var3 > 0) {
            throw new a0(d1.n5("The file {0} already exists.", new Object[]{var2}));
         }

         this.u9(var1);
         if (this.z6) {
            return 2;
         }

         var3++;
      }
   }

   private void a6(int var1) {
      if (var1 == 0) {
         throw new a6(d1.n5("bad read of entry {0} from compressed archive.", new Object[]{this.u3()}));
      }
   }

   private int a6(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.t4 var2 = this.y2();
      this.e2.n5(this.j5());
      byte[] var3 = new byte[this.y1()];
      long var4 = this.h0() == 8 ? this.t2() : this.t2;
      com.aspose.slides.internal.z0k.t4 var6;
      if (this.t9() == 1) {
         var6 = new r4(var2, this.n5, 1);
      } else {
         var6 = var2;
      }

      com.aspose.slides.internal.z0k.t4 var7 = this.h0() == 8 ? new x8(var6, 1, true) : var6;
      long var8 = 0L;
      t2 var10 = new t2(var7);

      int var13;
      try {
         while (var4 > 0L) {
            int var11 = var4 > var3.length ? var3.length : (int)var4;
            int var12 = var10.read(var3, 0, var11);
            this.a6(var12);
            var1.write(var3, 0, var12);
            var4 -= var12;
            var8 += var12;
            this.n5(var8, this.t2());
            if (this.z6) {
               break;
            }
         }

         var13 = var10.l6();
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }

      return var13;
   }

   public final void n5(String var1, boolean var2) {
      if (this.d2) {
         if (var2) {
            if (com.aspose.slides.internal.z0k.u9.k5(var1)) {
               File var3 = new File(var1);
               var3.setLastModified(this.a0.m3().z1());
            }
         } else if (com.aspose.slides.internal.z0k.u3.k5(var1)) {
            File var4 = new File(var1);
            var4.setLastModified(this.a0.m3().z1());
         }
      } else {
         com.aspose.slides.ms.System.j5 var5 = com.aspose.slides.internal.e5a.k7.n5(this.n5().m3()).m3();
      }
   }

   private String d5() {
      String var1;
      switch ((int)this.x9) {
         case 0:
            var1 = "--";
            break;
         case 26113:
            var1 = "DES";
            break;
         case 26114:
            var1 = "RC2";
            break;
         case 26115:
            var1 = "3DES-168";
            break;
         case 26121:
            var1 = "3DES-112";
            break;
         case 26126:
            var1 = "PKWare AES128";
            break;
         case 26127:
            var1 = "PKWare AES192";
            break;
         case 26128:
            var1 = "PKWare AES256";
            break;
         case 26370:
            var1 = "RC2";
            break;
         case 26400:
            var1 = "Blowfish";
            break;
         case 26401:
            var1 = "Twofish";
            break;
         case 26625:
            var1 = "RC4";
            break;
         case 65535:
         default:
            var1 = d1.n5("Unknown (0x{0:X4})", new Object[]{this.x9});
      }

      return var1;
   }

   private String s3() {
      String var1;
      switch (this.u9) {
         case 0:
            var1 = "Store";
            break;
         case 1:
            var1 = "Shrink";
            break;
         case 8:
            var1 = "DEFLATE";
            break;
         case 9:
            var1 = "Deflate64";
            break;
         case 14:
            var1 = "LZMA";
            break;
         case 19:
            var1 = "LZ77";
            break;
         case 98:
            var1 = "PPMd";
            break;
         default:
            var1 = d1.n5("Unknown (0x{0:X4})", new Object[]{this.u9});
      }

      return var1;
   }

   private void p8() {
      if (this.t9() != 1 && this.t9() != 0) {
         if ((this.x9 & 4294967295L) != 0L) {
            throw new a0(d1.n5("Cannot extract: Entry {0} is encrypted with an algorithm not supported by DotNetZip: {1}",new Object[]{ this.u3(), this.d5()}));
         } else {
            throw new a0(d1.n5("Cannot extract: Entry {0} uses an unsupported encryption algorithm ({1:X2})",new Object[]{ this.u3(), this.t9()}));
         }
      }
   }

   private void f2() {
      if (this.h0() != 0 && this.h0() != 8) {
         throw new a0(d1.n5("Entry {0} uses an unsupported compression method (0x{1:X2}, {2})",new Object[]{ this.u3(), this.h0(), this.s3()}));
      }
   }

   private void c8(String var1) {
      if (var1 != null) {
         if (this.t9() == 1) {
            this.e2.n5(this.j5() - 12L);
            this.n5 = com.aspose.slides.internal.e5a.c4.n5(var1, this);
         }
      }
   }

   private boolean n5(String var1, com.aspose.slides.internal.z0k.t4 var2, String[] var3) {
      if (var1 != null) {
         String var4 = this.u3();
         if (d1.l6(var4, "/")) {
            var4 = d1.k5(this.u3(), 1);
         }

         if (this.e2.u3()) {
            var3[0] = com.aspose.slides.internal.z0k.z1.l6(var1, d1.u3(var4, '/') != -1 ? com.aspose.slides.internal.z0k.z1.n5(var4) : var4);
         } else {
            var3[0] = com.aspose.slides.internal.z0k.z1.l6(var1, var4);
         }

         if (!this.n3() && !d1.k5(this.u3(), "/")) {
            return false;
         }

         if (!com.aspose.slides.internal.z0k.u3.k5(var3[0])) {
            com.aspose.slides.internal.z0k.u3.n5(var3[0]);
            this.n5(var3[0], false);
         } else if (this.z1() == 1) {
            this.n5(var3[0], false);
         }

         return true;
      } else if (var2 != null) {
         var3[0] = null;
         return this.n3() || d1.k5(this.u3(), "/");
      } else {
         throw new a0("Cannot extract.", new ArgumentException("Invalid input.", "outstream"));
      }
   }

   private void i1() {
      this.n1++;
      long var1 = this.y2().getPosition();
      this.e2.n5(this.z1);
      byte[] var3 = new byte[30];
      this.y2().read(var3, 0, var3.length);
      int var4 = 26;
      short var5 = (short)((var3[var4++] & 255) + (var3[var4++] & 255) * 256);
      short var6 = (short)((var3[var4++] & 255) + (var3[var4++] & 255) * 256);
      this.y2().seek(var5, 1);
      this.l6(var6);
      this.y2().seek(var1, 0);
      this.n1--;
   }

   private static boolean n5(y2 var0, com.aspose.slides.internal.l7h.j5 var1) {
      int var2 = 0;
      var0.z1 = var0.e2.y2();
      int var3 = com.aspose.slides.internal.e5a.k7.n5(var0.y2());
      var2 += 4;
      if (u9(var3)) {
         var0.y2().seek(-4L, 1);
         if (!var0.y4().k7() && u3(var3) && var3 != 101010256L) {
            throw new a6(d1.n5("  ZipEntry::ReadHeader(): Bad signature (0x{0:X8}) at position  0x{1:X8}", var3, var0.y2().getPosition()));
         } else {
            return false;
         }
      } else {
         byte[] var4 = new byte[26];
         int var5 = var0.y2().read(var4, 0, var4.length);
         if (var5 != var4.length) {
            return false;
         }

         var2 += var5;
         int var6 = 0;
         var0.u3 = (short)((var4[var6++] & 255) + (var4[var6++] & 255) * 256);
         var0.a6 = (short)((var4[var6++] & 255) + (var4[var6++] & 255) * 256);
         var0.u9 = (short)((var4[var6++] & 255) + (var4[var6++] & 255) * 256);
         var0.x8 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256;
         com.aspose.slides.internal.e5a.k7.n5(var0.x8).u3(var0.l6);
         var0.s0 |= 1;
         var0.n3 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256;
         var0.c8 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256 & 4294967295L;
         var0.s7 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256 & 4294967295L;
         if ((var0.c8 & 4294967295L) == 4294967295L || (var0.s7 & 4294967295L) == 4294967295L) {
            var0.p3 = true;
         }

         short var7 = (short)((var4[var6++] & 255) + (var4[var6++] & 255) * 256);
         short var8 = (short)((var4[var6++] & 255) + (var4[var6++] & 255) * 256);
         var4 = new byte[var7];
         var5 = var0.y2().read(var4, 0, var4.length);
         var2 += var5;
         var0.v0 = (var0.a6 & 2048) == 2048 ? com.aspose.slides.internal.l7h.j5.z3() : var1;
         var0.i1 = d1.n5(var0.v0.l6(var4, 0, var4.length), '\\', '/');
         var0.k5 = var0.i1;
         if (d1.k5(var0.k5, "/")) {
            var0.m3();
         }

         var2 += var0.l6(var8);
         var0.q0 = 0;
         if (!d1.k5(var0.k5, "/") && (var0.a6 & 8) == 8) {
            long var9 = var0.y2().getPosition();
            boolean var11 = true;
            long var12 = 0L;
            int var14 = 0;

            while (var11) {
               var14++;
               var0.e2.l6(var0);
               long var15 = com.aspose.slides.internal.e5a.k7.n5(var0.y2(), 134695760);
               if (var15 == -1L) {
                  return false;
               }

               var12 += var15;
               if (var0.p3) {
                  var4 = new byte[20];
                  var5 = var0.y2().read(var4, 0, var4.length);
                  if (var5 != 20) {
                     return false;
                  }

                  var6 = 0;
                  var0.n3 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256;
                  var0.c8 = com.aspose.slides.ms.System.x8.u9(var4, var6);
                  var6 += 8;
                  var0.s7 = com.aspose.slides.ms.System.x8.u9(var4, var6);
                  var6 += 8;
                  var0.q0 += 24;
               } else {
                  var4 = new byte[12];
                  var5 = var0.y2().read(var4, 0, var4.length);
                  if (var5 != 12) {
                     return false;
                  }

                  var6 = 0;
                  var0.n3 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256;
                  var0.c8 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256
                     & 4294967295L;
                  var0.s7 = (var4[var6++] & 255) + (var4[var6++] & 255) * 256 + (var4[var6++] & 255) * 256 * 256 + (var4[var6++] & 255) * 256 * 256 * 256
                     & 4294967295L;
                  var0.q0 += 16;
               }

               var11 = var12 != var0.c8;
               if (var11) {
                  var0.y2().seek(-12L, 1);
                  var12 += 4L;
               }
            }

            var0.y2().seek(var9, 0);
         }

         var0.t2 = var0.c8;
         if ((var0.a6 & 1) == 1) {
            var0.m3 = new byte[12];
            var2 += n5(var0.z8, var0.m3);
            var0.t2 -= 12L;
         }

         var0.t4 = var2;
         var0.a3 = var0.t4 + var0.t2 + var0.q0;
         return true;
      }
   }

   public static int n5(com.aspose.slides.internal.z0k.t4 var0, byte[] var1) {
      int var2 = var0.read(var1, 0, 12);
      if (var2 != 12) {
         throw new a0(d1.n5("Unexpected end of data at position 0x{0:X8}", new Object[]{var0.getPosition()}));
      } else {
         return var2;
      }
   }

   private static boolean u9(int var0) {
      return var0 != 67324752;
   }

   public static y2 n5(d2 var0, boolean var1) {
      com.aspose.slides.internal.z0k.t4 var2 = var0.z8();
      com.aspose.slides.internal.l7h.j5 var3 = var0.n3();
      y2 var4 = new y2();
      var4.m1 = 3;
      var4.e2 = var0;
      var4.z8 = var2;
      var0.n5(true, null);
      if (var1) {
         l6(var2);
      }

      if (!n5(var4, var3)) {
         return null;
      }

      var4.t9 = var4.e2.y2();
      var2.seek(var4.t2 + var4.q0, 1);
      l6(var4);
      var0.l6(var4);
      var0.n5(false, var4);
      return var4;
   }

   public static void l6(com.aspose.slides.internal.z0k.t4 var0) {
      long var1 = com.aspose.slides.internal.e5a.k7.l6(var0) & 4294967295L;
      if ((var1 & 4294967295L) != 808471376L) {
         var0.seek(-4L, 1);
      }
   }

   private static void l6(y2 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.y2();
      long var2 = com.aspose.slides.internal.e5a.k7.l6(var1) & 4294967295L;
      if ((var2 & 4294967295L) == var0.n3) {
         int var4 = com.aspose.slides.internal.e5a.k7.l6(var1);
         if (var4 == var0.c8) {
            var4 = com.aspose.slides.internal.e5a.k7.l6(var1);
            if (var4 != var0.s7) {
               var1.seek(-12L, 1);
            }
         } else {
            var1.seek(-8L, 1);
         }
      } else {
         var1.seek(-4L, 1);
      }
   }

   public final int l6(short var1) {
      int var2 = 0;
      com.aspose.slides.internal.z0k.t4 var3 = this.y2();
      if (var1 > 0) {
         byte[] var4 = this.y4 = new byte[var1];
         var2 = var3.read(var4, 0, var4.length);
         long var5 = var3.getPosition() - var2;
         int var7 = 0;

         while (var7 < var4.length) {
            int var8 = var7;
            int var9 = (var4[var7] & 255) + (var4[var7 + 1] & 255) * 256 & 65535;
            short var10 = (short)((var4[var7 + 2] & 255) + (var4[var7 + 3] & 255) * 256);
            var7 += 4;
            switch (var9) {
               case 1:
                  var7 = this.n5(var4, var7, var10, var5);
                  break;
               case 10:
                  var7 = this.u3(var4, var7, var10, var5);
                  break;
               case 23:
                  var7 = this.n5(var4, var7);
                  break;
               case 21589:
                  var7 = this.k5(var4, var7, var10, var5);
                  break;
               case 22613:
                  var7 = this.l6(var4, var7, var10, var5);
            }

            var7 = var8 + var10 + 4;
         }
      }

      return var2;
   }

   private int n5(byte[] var1, int var2) {
      var2 += 2;
      this.x9 = (var1[var2] & 255) + (var1[var2 + 1] & 255) * 256 & 65535;
      var2 += 2;
      this.k7 = 4;
      return var2;
   }

   private int n5(byte[] var1, int var2, short var3, long var4) {
      this.p3 = true;
      if (var3 > 28) {
         throw new a6(d1.n5("  Inconsistent datasize (0x{0:X4}) for ZIP64 extra field at position 0x{1:X16}",new Object[]{ var3, var4}));
      }

      int var6 = var3;
      if (this.s7 == 4294967295L) {
         if (var6 < 8) {
            throw new a6(d1.n5("  Missing data for ZIP64 extra field (Uncompressed Size) at position 0x{1:X16}", new Object[]{var4}));
         }

         this.s7 = com.aspose.slides.ms.System.x8.u9(var1, var2);
         var2 += 8;
         var6 -= 8;
      }

      if (this.c8 == 4294967295L) {
         if (var6 < 8) {
            throw new a6(d1.n5("  Missing data for ZIP64 extra field (Compressed Size) at position 0x{1:X16}", new Object[]{var4}));
         }

         this.c8 = com.aspose.slides.ms.System.x8.u9(var1, var2);
         var2 += 8;
         var6 -= 8;
      }

      if (this.z1 == 4294967295L) {
         if (var6 < 8) {
            throw new a6(d1.n5("  Missing data for ZIP64 extra field (Relative Offset) at position 0x{1:X16}", new Object[]{var4}));
         }

         this.z1 = com.aspose.slides.ms.System.x8.u9(var1, var2);
         var2 += 8;
         var6 -= 8;
      }

      return var2;
   }

   private int l6(byte[] var1, int var2, short var3, long var4) {
      if (var3 != 12 && var3 != 8) {
         throw new a6(d1.n5("  Unexpected datasize (0x{0:X4}) for InfoZip v1 extra field at position 0x{1:X16}",new Object[]{ var3, var4}));
      }

      int var6 = com.aspose.slides.ms.System.x8.a6(var1, var2);
      v8.a6(var6).u3(this.y2);
      var2 += 4;
      var6 = com.aspose.slides.ms.System.x8.a6(var1, var2);
      v8.a6(var6).u3(this.y1);
      var2 += 4;
      com.aspose.slides.ms.System.j5.t2().u3(this.a0);
      this.d2 = true;
      this.s0 |= 8;
      return var2;
   }

   private int k5(byte[] var1, int var2, short var3, long var4) {
      if (var3 != 13 && var3 != 9 && var3 != 5) {
         throw new a6(d1.n5("  Unexpected datasize (0x{0:X4}) for Extended Timestamp extra field at position 0x{1:X16}",new Object[]{ var3, var4}));
      }

      int var6 = var3;
      if (var3 != 13 && this.n1 <= 1) {
         this.i1();
      } else {
         byte var7 = var1[var2++];
         if ((var7 & 255 & 1) != 0 && --var6 >= 4) {
            int var8 = com.aspose.slides.ms.System.x8.a6(var1, var2);
            v8.a6(var8).u3(this.y2);
            var2 += 4;
            var6 -= 4;
         }

         if ((var7 & 255 & 2) != 0 && var6 >= 4) {
            int var11 = com.aspose.slides.ms.System.x8.a6(var1, var2);
            v8.a6(var11).u3(this.y1);
            var2 += 4;
            var6 -= 4;
         } else {
            com.aspose.slides.ms.System.j5.t2().u3(this.y1);
         }

         if ((var7 & 255 & 4) != 0 && var6 >= 4) {
            int var12 = com.aspose.slides.ms.System.x8.a6(var1, var2);
            v8.a6(var12).u3(this.a0);
            var2 += 4;
            var6 -= 4;
         } else {
            com.aspose.slides.ms.System.j5.t2().u3(this.a0);
         }

         this.s0 |= 4;
         this.d2 = true;
         this.s3 = true;
      }

      return var2;
   }

   private int u3(byte[] var1, int var2, short var3, long var4) {
      if (var3 != 32) {
         throw new a6(d1.n5("  Unexpected datasize (0x{0:X4}) for NTFS times extra field at position 0x{1:X16}",new Object[]{ var3, var4}));
      }

      var2 += 4;
      short var6 = (short)((var1[var2] & 255) + (var1[var2 + 1] & 255) * 256);
      short var7 = (short)((var1[var2 + 2] & 255) + (var1[var2 + 3] & 255) * 256);
      var2 += 4;
      if (var6 == 1 && var7 == 24) {
         long var8 = com.aspose.slides.ms.System.x8.u9(var1, var2);
         com.aspose.slides.ms.System.j5.l6(var8).u3(this.y2);
         var2 += 8;
         var8 = com.aspose.slides.ms.System.x8.u9(var1, var2);
         com.aspose.slides.ms.System.j5.l6(var8).u3(this.y1);
         var2 += 8;
         var8 = com.aspose.slides.ms.System.x8.u9(var1, var2);
         com.aspose.slides.ms.System.j5.l6(var8).u3(this.a0);
         var2 += 8;
         this.d2 = true;
         this.s0 |= 2;
         this.d5 = true;
      }

      return var2;
   }

   public final void k5(com.aspose.slides.internal.z0k.t4 var1) {
      this.u9(var1);
   }

   private void u9(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = new byte[4096];
      int var3 = 0;
      var2[var3++] = 80;
      var2[var3++] = 75;
      var2[var3++] = 1;
      var2[var3++] = 2;
      var2[var3++] = (byte)(this.v3 & 0xFF);
      var2[var3++] = (byte)((this.v3 & '\uff00') >> 8);
      short var4 = (short)(this.j8 == 1 ? 45 : 20);
      var2[var3++] = (byte)(var4 & 0xFF);
      var2[var3++] = (byte)((var4 & '\uff00') >> 8);
      short var5 = this.a6;
      if (this.n3()) {
         var5 = (short)(var5 & -9);
      }

      var2[var3++] = (byte)(var5 & 0xFF);
      var2[var3++] = (byte)((var5 & '\uff00') >> 8);
      var2[var3++] = (byte)(this.h0() & 0xFF);
      var2[var3++] = (byte)((this.h0() & '\uff00') >> 8);
      var2[var3++] = (byte)(this.x8 & 0xFF);
      var2[var3++] = (byte)((this.x8 & 0xFF00) >> 8);
      var2[var3++] = (byte)((this.x8 & 0xFF0000) >> 16);
      var2[var3++] = (byte)((this.x8 & 4278190080L & 4294967295L) >> 24);
      var2[var3++] = (byte)(this.n3 & 0xFF);
      var2[var3++] = (byte)((this.n3 & 0xFF00) >> 8);
      var2[var3++] = (byte)((this.n3 & 0xFF0000) >> 16);
      var2[var3++] = (byte)((this.n3 & 4278190080L & 4294967295L) >> 24);
      int var6 = 0;
      if (this.j8 == 1) {
         for (int var56 = 0; var56 < 8; var56++) {
            var2[var3++] = -1;
         }
      } else {
         var2[var3++] = (byte)(this.c8 & 255L);
         var2[var3++] = (byte)((this.c8 & 65280L) >> 8);
         var2[var3++] = (byte)((this.c8 & 16711680L) >> 16);
         var2[var3++] = (byte)((this.c8 & 4278190080L) >> 24);
         var2[var3++] = (byte)(this.s7 & 255L);
         var2[var3++] = (byte)((this.s7 & 65280L) >> 8);
         var2[var3++] = (byte)((this.s7 & 16711680L) >> 16);
         var2[var3++] = (byte)((this.s7 & 4278190080L) >> 24);
      }

      byte[] var7 = this.b3();
      short var8 = (short)var7.length;
      var2[var3++] = (byte)(var8 & 0xFF);
      var2[var3++] = (byte)((var8 & '\uff00') >> 8);
      this.e9 = this.j8 == 1;
      this.y4 = this.a6(true);
      short var9 = (short)(this.y4 == null ? 0 : this.y4.length);
      var2[var3++] = (byte)(var9 & 0xFF);
      var2[var3++] = (byte)((var9 & '\uff00') >> 8);
      int var10 = this.b3 == null ? 0 : this.b3.length;
      if (var10 + var3 > var2.length) {
         var10 = var2.length - var3;
      }

      var2[var3++] = (byte)(var10 & 0xFF);
      var2[var3++] = (byte)((var10 & 0xFF00) >> 8);
      var2[var3++] = 0;
      var2[var3++] = 0;
      var2[var3++] = (byte)(this.w2 ? 1 : 0);
      var2[var3++] = 0;
      var2[var3++] = (byte)(this.j4 & 0xFF);
      var2[var3++] = (byte)((this.j4 & 0xFF00) >> 8);
      var2[var3++] = (byte)((this.j4 & 0xFF0000) >> 16);
      var2[var3++] = (byte)((this.j4 & 4278190080L & 4294967295L) >> 24);
      if (this.j8 == 1) {
         for (int var57 = 0; var57 < 4; var57++) {
            var2[var3++] = -1;
         }
      } else {
         var2[var3++] = (byte)(this.z1 & 255L);
         var2[var3++] = (byte)((this.z1 & 65280L) >> 8);
         var2[var3++] = (byte)((this.z1 & 16711680L) >> 16);
         var2[var3++] = (byte)((this.z1 & 4278190080L) >> 24);
      }

      for (var6 = 0; var6 < var8; var6++) {
         var2[var3 + var6] = var7[var6];
      }

      var3 += var6;
      if (this.y4 != null) {
         for (var6 = 0; var6 < var9; var6++) {
            var2[var3 + var6] = this.y4[var6];
         }

         var3 += var6;
      }

      if (var10 != 0) {
         for (var6 = 0; var6 < var10 && var3 + var6 < var2.length; var6++) {
            var2[var3 + var6] = this.b3[var6];
         }

         var3 += var6;
      }

      var1.write(var2, 0, var3);
   }

   private byte[] a6(boolean var1) {
      List var2 = new List();
      if (this.e2.u3 != 0) {
         int var3 = 4 + (var1 ? 28 : 16);
         byte[] var4 = new byte[var3];
         int var5 = 0;
         if (this.e9) {
            var4[var5++] = 1;
            var4[var5++] = 0;
         } else {
            var4[var5++] = -103;
            var4[var5++] = -103;
         }

         var4[var5++] = (byte)(var3 - 4);
         var4[var5++] = 0;
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.s7))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var5, 8
         );
         var5 += 8;
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.c8))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var5, 8
         );
         if (var1) {
            var5 += 8;
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.z1))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var5, 8
            );
            var5 += 8;
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(0))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var5, 4
            );
         }

         var2.addItem(var4);
      }

      if (this.d2 && this.d5) {
         byte[] var25 = new byte[36];
         int var10 = 0;
         var25[var10++] = 10;
         var25[var10++] = 0;
         var25[var10++] = 32;
         var25[var10++] = 0;
         var10 += 4;
         var25[var10++] = 1;
         var25[var10++] = 0;
         var25[var10++] = 24;
         var25[var10++] = 0;
         long var6 = this.y2.z1();
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var6))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var25)), var10, 8
         );
         var10 += 8;
         var6 = this.y1.z1();
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var6))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var25)), var10, 8
         );
         var10 += 8;
         var6 = this.a0.z1();
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var6))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var25)), var10, 8
         );
         var10 += 8;
         var2.addItem(var25);
      }

      if (this.d2 && this.s3) {
         byte var23 = 9;
         if (!var1) {
            var23 += 8;
         }

         byte[] var26 = new byte[var23];
         int var35 = 0;
         var26[var35++] = 85;
         var26[var35++] = 84;
         var26[var35++] = (byte)(var23 - 4);
         var26[var35++] = 0;
         var26[var35++] = 7;
         int var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.j5.t2(this.y2, v8).t2(), 14);
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var8))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var26)), var35, 4
         );
         var35 += 4;
         if (!var1) {
            var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.j5.t2(this.y1, v8).t2(), 14);
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var8))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var26)), var35, 4
            );
            var35 += 4;
            var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.j5.t2(this.a0, v8).t2(), 14);
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var8))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var26)), var35, 4
            );
            var35 += 4;
         }

         var2.addItem(var26);
      }

      byte[] var24 = null;
      if (var2.size() > 0) {
         int var44 = 0;
         int var9 = 0;

         for (int var49 = 0; var49 < var2.size(); var49++) {
            var44 += ((byte[])com.aspose.slides.internal.v6g.k5.k5(var2.get_Item(var49), byte[].class)).length;
         }

         var24 = new byte[var44];

         for (int var50 = 0; var50 < var2.size(); var50++) {
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.internal.v6g.k5.k5(var2.get_Item(var50), byte[].class))),
               0,
               com.aspose.slides.ms.System.u3.n5((Object)(var24)),
               var9,
               com.aspose.slides.internal.v6g.k5.k5(var2.get_Item(var50), byte[].class).length
            );
            var9 += ((byte[])com.aspose.slides.internal.v6g.k5.k5(var2.get_Item(var50), byte[].class)).length;
         }
      }

      return var24;
   }

   private com.aspose.slides.internal.l7h.j5 e5() {
      this.b3 = a5.u3(this.h0);
      String var1 = a5.l6(this.b3, 0, this.b3.length);
      if (d1.a6(var1, this.h0)) {
         return a5;
      }

      this.b3 = this.h2.u3(this.h0);
      return this.h2;
   }

   private byte[] b3() {
      String var1 = d1.n5(this.u3(), "\\", "/");
      String var2;
      if (this.p8 && this.u3().length() >= 3 && this.u3().charAt(1) == ':' && var1.charAt(2) == '/') {
         var2 = d1.k5(var1, 3);
      } else if (this.u3().length() >= 4 && var1.charAt(0) == '/' && var1.charAt(1) == '/') {
         int var3 = d1.l6(var1, '/', 2);
         if (var3 == -1) {
            throw new ArgumentException("The path for that entry appears to be badly formatted");
         }

         var2 = d1.k5(var1, var3 + 1);
      } else if (this.u3().length() >= 3 && var1.charAt(0) == '.' && var1.charAt(1) == '/') {
         var2 = d1.k5(var1, 2);
      } else {
         var2 = var1;
      }

      byte[] var6 = a5.u3(var2);
      String var4 = a5.l6(var6, 0, var6.length);
      this.b3 = null;
      if (d1.a6(var4, var2)) {
         if (this.h0 != null && this.h0.length() != 0) {
            com.aspose.slides.internal.l7h.j5 var5 = this.e5();
            if (var5.t9() == 437) {
               this.v0 = a5;
               return var6;
            } else {
               this.v0 = var5;
               return var5.u3(var2);
            }
         } else {
            this.v0 = a5;
            return var6;
         }
      } else {
         var6 = this.h2.u3(var2);
         if (this.h0 != null && this.h0.length() != 0) {
            this.b3 = this.h2.u3(this.h0);
         }

         this.v0 = this.h2;
         return var6;
      }
   }

   private boolean o0() {
      if (this.s7 < 16L) {
         return false;
      } else if (this.u9 == 0) {
         return false;
      } else if (this.e2.h0() == 0) {
         return false;
      } else if (this.c8 < this.s7) {
         return false;
      } else if (this.l6()) {
         return false;
      } else if (this.m1 == 2 && !this.y0.canSeek()) {
         return false;
      } else if (this.n5 != null && this.c8() - 12L <= this.t2()) {
         return false;
      } else {
         return this.z3() != null ? this.z3().n5(this.s7, this.c8, this.u3()) : true;
      }
   }

   private static boolean t2(String var0) {
      return !p6.u3(var0);
   }

   private boolean z7() {
      if (this.k5 != null) {
         return t2(this.k5);
      } else {
         return this.i1 != null ? t2(this.i1) : true;
      }
   }

   private void h0(int var1) {
      if (var1 > 1) {
         this.u9 = 0;
      } else if (this.n3()) {
         this.u9 = 0;
      } else if (this.t9 == -1L) {
         if (this.m1 == 2) {
            if (this.y0 != null && this.y0.canSeek()) {
               long var2 = this.y0.getLength();
               if (var2 == 0L) {
                  this.u9 = 0;
                  return;
               }
            }
         } else {
            com.aspose.slides.internal.z0k.t2 var4 = new com.aspose.slides.internal.z0k.t2(this.k5());
            long var5 = var4.k5();
            if (var5 == 0L) {
               this.u9 = 0;
               return;
            }
         }

         if (!this.f2 && this.e2.h0() != 0) {
            if (this.m1() != null) {
               this.u9 = (short)(this.m1().n5(this.k5(), this.i1) ? 8 : 0);
               return;
            }

            this.u9 = (short)(this.z7() ? 8 : 0);
            return;
         }

         this.u9 = 0;
         return;
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      int var3 = 0;
      c8 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, c8.class);
      this.z1 = var4 != null ? var4.n5() : var1.getPosition();
      byte[] var5 = new byte[512];
      int var6 = 0;
      var5[var6++] = 80;
      var5[var6++] = 75;
      var5[var6++] = 3;
      var5[var6++] = 4;
      if (this.e2.u3 == 0 && (this.z1 & 4294967295L) >= 4294967295L) {
         throw new a0("Offset within the zip archive exceeds 0xFFFFFFFF. Consider setting the UseZip64WhenSaving property on the ZipFile instance.");
      }

      this.e9 = this.e2.u3 == 2 || this.e2.u3 == 1 && !var1.canSeek();
      short var7 = (short)(this.e9 ? 45 : 20);
      var5[var6++] = (byte)(var7 & 0xFF);
      var5[var6++] = (byte)((var7 & '\uff00') >> 8);
      byte[] var8 = this.b3();
      short var9 = (short)var8.length;
      this.a6 = (short)(this.e2() ? 1 : 0);
      if (this.k7().t9() == com.aspose.slides.internal.l7h.j5.z3().t9()) {
         this.a6 = (short)(this.a6 & 65535 | 2048);
      }

      if (!var1.canSeek()) {
         this.a6 = (short)(this.a6 & 65535 | 8);
      }

      short var10 = this.a6;
      if (this.n3()) {
         var10 = (short)(var10 & -9);
      }

      var5[var6++] = (byte)(var10 & 0xFF);
      var5[var6++] = (byte)((var10 & '\uff00') >> 8);
      if (this.t9 == -1L) {
         this.s7 = 0L;
         this.c8 = 0L;
         this.n3 = 0;
         this.o0 = false;
      }

      this.h0(var2);
      var5[var6++] = (byte)(this.h0() & 0xFF);
      var5[var6++] = (byte)((this.h0() & '\uff00') >> 8);
      this.x8 = com.aspose.slides.internal.e5a.k7.k5(this.n5().m3());
      var5[var6++] = (byte)(this.x8 & 0xFF);
      var5[var6++] = (byte)((this.x8 & 0xFF00) >> 8);
      var5[var6++] = (byte)((this.x8 & 0xFF0000) >> 16);
      var5[var6++] = (byte)((this.x8 & 4278190080L & 4294967295L) >> 24);
      var5[var6++] = (byte)(this.n3 & 0xFF);
      var5[var6++] = (byte)((this.n3 & 0xFF00) >> 8);
      var5[var6++] = (byte)((this.n3 & 0xFF0000) >> 16);
      var5[var6++] = (byte)((this.n3 & 4278190080L & 4294967295L) >> 24);
      if (this.e9) {
         for (int var12 = 0; var12 < 8; var12++) {
            var5[var6++] = -1;
         }
      } else {
         var5[var6++] = (byte)(this.c8 & 255L);
         var5[var6++] = (byte)((this.c8 & 65280L) >> 8);
         var5[var6++] = (byte)((this.c8 & 16711680L) >> 16);
         var5[var6++] = (byte)((this.c8 & 4278190080L) >> 24);
         var5[var6++] = (byte)(this.s7 & 255L);
         var5[var6++] = (byte)((this.s7 & 65280L) >> 8);
         var5[var6++] = (byte)((this.s7 & 16711680L) >> 16);
         var5[var6++] = (byte)((this.s7 & 4278190080L) >> 24);
      }

      var5[var6++] = (byte)(var9 & 0xFF);
      var5[var6++] = (byte)((var9 & '\uff00') >> 8);
      this.y4 = this.a6(false);
      short var11 = (short)(this.y4 == null ? 0 : this.y4.length);
      var5[var6++] = (byte)(var11 & 0xFF);
      var5[var6++] = (byte)((var11 & '\uff00') >> 8);

      for (var3 = 0; var3 < var8.length && var6 + var3 < var5.length; var3++) {
         var5[var6 + var3] = var8[var3];
      }

      var6 += var3;
      if (this.y4 != null) {
         for (var3 = 0; var3 < this.y4.length; var3++) {
            var5[var6 + var3] = this.y4[var3];
         }

         var6 += var3;
      }

      this.t4 = var6;
      var1.write(var5, 0, var6);
      this.f0 = new byte[var6];

      for (int var15 = 0; var15 < var6; var15++) {
         this.f0[var15] = var5[var15];
      }
   }

   private int v4() {
      if (!this.o0) {
         com.aspose.slides.internal.z0k.t4 var1;
         if (this.m1 == 2) {
            this.u6();
            var1 = this.y0;
         } else {
            var1 = com.aspose.slides.internal.z0k.u9.n5(this.k5(), 3, 1, 3);
         }

         h0 var2 = new h0();
         this.n3 = var2.n5(var1);
         if (this.y0 == null) {
            var1.close();
         }

         this.o0 = true;
      }

      return this.n3;
   }

   private void u6() {
      if (this.y0 == null) {
         throw new a0(d1.n5("The input stream is null for entry '{0}'.", new Object[]{this.u3()}));
      }

      if (this.j9.n5()) {
         this.y0.setPosition(this.j9.l6());
      } else if (this.y0.canSeek()) {
         this.j9 = new com.aspose.slides.internal.r3q.n5(this.y0.getPosition());
      } else if (this.t9() == 1) {
         throw new a0("It is not possible to use PKZIP encryption on a non-seekable stream");
      }
   }

   public final void n5(y2 var1) {
      this.t9 = var1.t9;
      this.n5(var1.h0());
      this.t2 = var1.t2;
      this.s7 = var1.s7;
      this.a6 = var1.a6;
      this.m1 = var1.m1;
      var1.l6.u3(this.l6);
      var1.y2.u3(this.y2);
      var1.y1.u3(this.y1);
      var1.a0.u3(this.a0);
      this.d2 = var1.d2;
      this.s3 = var1.s3;
      this.d5 = var1.d5;
   }

   private void h0(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.t4 var2 = null;

      try {
         this.t9 = var1.getPosition();
      } catch (RuntimeException var19) {
      }

      t2 var8;
      c8 var9;
      try {
         long var4 = 0L;
         if (this.m1 == 2) {
            this.u6();
            var2 = this.y0;

            try {
               var4 = this.y0.getLength();
            } catch (UnsupportedOperationException var18) {
            }
         } else {
            byte var6 = 3;
            com.aspose.slides.internal.z0k.t2 var7 = new com.aspose.slides.internal.z0k.t2(this.k5());
            var4 = var7.k5();
            var2 = com.aspose.slides.internal.z0k.u9.n5(this.k5(), 3, 1, var6);
         }

         var8 = new t2(var2);
         var9 = new c8(var1);
         com.aspose.slides.internal.z0k.t4 var58 = var9;
         if (this.t9() == 1) {
            var58 = new r4(var9, this.n5, 0);
         }

         boolean var10 = false;
         com.aspose.slides.internal.z0k.t4 var60;
         if (this.h0() == 8 && this.e2.h0() != 0) {
            x8 var11 = new x8(var58, 0, this.e2.h0(), true);
            if (this.e2.k5() > 0) {
               var11.n5(this.e2.k5());
            }

            var11.l6(this.e2.a6());
            var10 = true;
            var60 = var11;
         } else {
            var60 = var58;
         }

         byte[] var65 = new byte[this.y1()];

         int var12;
         while ((var12 = com.aspose.slides.internal.e5a.k7.n5(var8, var65, 0, var65.length, this.u3())) != 0) {
            var60.write(var65, 0, var12);
            this.l6(var8.n5(), var4);
            if (this.z6) {
               break;
            }
         }

         if (var10) {
            var60.close();
         }

         var58.flush();
         var58.close();
         this.q0 = 0;
      } finally {
         if (this.m1 != 2 && var2 != null) {
            var2.close();
         }
      }

      if (!this.z6) {
         this.s7 = var8.n5();
         this.t2 = var9.n5();
         this.c8 = this.t2;
         this.n3 = var8.l6();
         if (this.z3 != null && this.t9() == 1) {
            this.c8 += 12L;
         }

         int var3 = 8;
         this.f0[var3++] = (byte)(this.h0() & 0xFF);
         this.f0[var3++] = (byte)((this.h0() & '\uff00') >> 8);
         var3 = 14;
         this.f0[var3++] = (byte)(this.n3 & 0xFF);
         this.f0[var3++] = (byte)((this.n3 & 0xFF00) >> 8);
         this.f0[var3++] = (byte)((this.n3 & 0xFF0000) >> 16);
         this.f0[var3++] = (byte)((this.n3 & 4278190080L & 4294967295L) >> 24);
         this.o5 = (byte)(this.c8 < 4294967295L && this.s7 < 4294967295L && this.z1 < 4294967295L ? 0 : 1);
         if (this.e2.u3 == 0 && this.o5 == 1) {
            throw new a0(
               "Compressed or Uncompressed size, or offset exceeds the maximum value. Consider setting the UseZip64WhenSaving property on the ZipFile instance."
            );
         }

         this.j8 = (byte)(this.e2.u3 != 2 && this.o5 != 1 ? 0 : 1);
         short var14 = (short)((this.f0[26] & 255) + (this.f0[27] & 255) * 256);
         short var59 = (short)((this.f0[28] & 255) + (this.f0[29] & 255) * 256);
         if (this.j8 == 1) {
            this.f0[4] = 45;
            this.f0[5] = 0;

            for (int var61 = 0; var61 < 8; var61++) {
               this.f0[var3++] = -1;
            }

            var3 = 30 + var14;
            this.f0[var3++] = 1;
            this.f0[var3++] = 0;
            var3 += 2;
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.s7))), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.f0)), var3, 8
            );
            var3 += 8;
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.c8))), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.f0)), var3, 8
            );
         } else {
            this.f0[4] = 20;
            this.f0[5] = 0;
            var3 = 18;
            this.f0[var3++] = (byte)(this.c8 & 255L);
            this.f0[var3++] = (byte)((this.c8 & 65280L) >> 8);
            this.f0[var3++] = (byte)((this.c8 & 16711680L) >> 16);
            this.f0[var3++] = (byte)((this.c8 & 4278190080L) >> 24);
            this.f0[var3++] = (byte)(this.s7 & 255L);
            this.f0[var3++] = (byte)((this.s7 & 65280L) >> 8);
            this.f0[var3++] = (byte)((this.s7 & 16711680L) >> 16);
            this.f0[var3++] = (byte)((this.s7 & 4278190080L) >> 24);
            if (var59 != 0) {
               var3 = 30 + var14;
               short var62 = (short)((this.f0[var3 + 2] & 255) + (this.f0[var3 + 3] & 255) * 256);
               if (var62 == 16) {
                  this.f0[var3++] = -103;
                  this.f0[var3++] = -103;
               }
            }
         }

         if ((this.a6 & 8) != 8) {
            var1.seek(this.z1, 0);
            var1.write(this.f0, 0, this.f0.length);
            c8 var63 = com.aspose.slides.internal.v6g.k5.n5(var1, c8.class);
            if (var63 != null) {
               var63.n5(this.f0.length);
            }

            var1.seek(this.c8, 1);
         } else {
            byte[] var64 = new byte[16 + (this.j8 == 1 ? 8 : 0)];
            int var45 = 0;
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(134695760))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var64)), var45, 4
            );
            var45 += 4;
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.n3))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var64)), var45, 4
            );
            var45 += 4;
            if (this.j8 == 1) {
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.c8))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var64)), var45, 8
               );
               var45 += 8;
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(this.s7))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var64)), var45, 8
               );
               var45 += 8;
            } else {
               var64[var45++] = (byte)(this.c8 & 255L);
               var64[var45++] = (byte)((this.c8 & 65280L) >> 8);
               var64[var45++] = (byte)((this.c8 & 16711680L) >> 16);
               var64[var45++] = (byte)((this.c8 & 4278190080L) >> 24);
               var64[var45++] = (byte)(this.s7 & 255L);
               var64[var45++] = (byte)((this.s7 & 65280L) >> 8);
               var64[var45++] = (byte)((this.s7 & 16711680L) >> 16);
               var64[var45++] = (byte)((this.s7 & 4278190080L) >> 24);
            }

            var1.write(var64, 0, var64.length);
            this.q0 += var64.length;
         }
      }
   }

   private void n5(Exception var1) {
      this.z6 = this.e2.n5(this, var1);
   }

   public final void u3(com.aspose.slides.internal.z0k.t4 var1) {
      boolean var2 = false;
      c8 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, c8.class);

      while (this.m1 != 3 || this.v4) {
         try {
            if (this.n3()) {
               this.n5(var1, 1);
               this.o5 = (byte)(this.z1 >= 4294967295L ? 1 : 0);
               this.j8 = (byte)(this.e2.u3 != 2 && this.o5 != 1 ? 0 : 1);
               return;
            }

            boolean var12 = true;
            int var14 = 0;

            do {
               this.n5(var1, ++var14);
               this.c8(var1);
               if (var14 > 1) {
                  var12 = false;
               } else if (!var1.canSeek()) {
                  var12 = false;
               } else {
                  var12 = this.o0();
               }

               if (var12) {
                  var1.seek(this.z1, 0);
                  var1.setLength(var1.getPosition());
                  if (var3 != null) {
                     var3.n5(this.a3);
                  }
               }
            } while (var12);

            this.t1 = false;
            var2 = true;
         } catch (Exception var11) {
            Exception var4 = var11;
            int var5 = this.t4();
            int var6 = 0;

            while (true) {
               if (this.t4() == 0) {
                  throw var4;
               }

               if (this.t4() == 1 || this.t4() == 2) {
                  if (!var1.canSeek()) {
                     throw var4;
                  }

                  long var7 = var1.getPosition();
                  var1.seek(this.z1, 0);
                  long var9 = var1.getPosition();
                  var1.setLength(var1.getPosition());
                  if (var3 != null) {
                     var3.n5(var7 - var9);
                  }

                  if (this.t4() == 1) {
                     if (this.e2.y4() != null) {
                        this.e2.y4().l6("Skipping file {0} (exception: {1})", this.k5(), var4.toString());
                     }

                     this.t1 = true;
                     var2 = true;
                  } else {
                     this.k5(var5);
                  }
                  break;
               }

               if (var6 > 0) {
                  throw var4;
               }

               if (this.t4() == 3) {
                  this.n5(var4);
                  if (this.z6) {
                     var2 = true;
                     break;
                  }
               }

               var6++;
            }
         }

         if (var2) {
            return;
         }
      }

      this.s7(var1);
   }

   private void c8(com.aspose.slides.internal.z0k.t4 var1) {
      this.t2(var1);
      this.h0(var1);
      this.a3 = this.t4 + this.t2 + this.q0;
   }

   private void t2(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.z3 != null) {
         if (this.t9() == 1) {
            this.n5 = com.aspose.slides.internal.e5a.c4.n5(this.z3);
            i9 var2 = new i9();
            byte[] var3 = new byte[12];
            var2.n5(var3);
            if ((this.a6 & 8) == 8) {
               this.x8 = com.aspose.slides.internal.e5a.k7.k5(this.n5().m3());
               var3[11] = (byte)(this.x8 >> 8 & 0xFF);
            } else {
               this.v4();
               var3[11] = (byte)(this.n3 >> 24 & 0xFF);
            }

            byte[] var4 = this.n5.l6(var3, var3.length);
            var1.write(var4, 0, var4.length);
            this.t4 += var4.length;
         }
      }
   }

   private void s7(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.d2() == 0) {
         throw new u9("Bad header length.");
      }

      t2 var2 = new t2(this.y2());
      boolean var3 = this.z7 || this.p3 && this.e2.x8() == 0 || !this.p3 && this.e2.x8() == 2;
      if (var3) {
         this.n5(var1, var2);
      } else {
         this.l6(var1, var2);
      }

      this.o5 = (byte)(this.c8 < 4294967295L && this.s7 < 4294967295L && this.z1 < 4294967295L ? 0 : 1);
      this.j8 = (byte)(this.e2.u3 != 2 && this.o5 != 1 ? 0 : 1);
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, t2 var2) {
      byte[] var3 = new byte[this.y1()];
      com.aspose.slides.internal.z0k.t4 var4 = this.y2();
      long var5 = this.z1;
      int var7 = this.d2();
      this.n5(var1, 0);
      if (!d1.k5(this.u3(), "/")) {
         long var8 = var5 + var7;
         var8 -= this.z8();
         this.t4 = this.t4 + this.z8();
         this.e2.n5(var8);
         long var10 = this.c8;

         while (var10 > 0L) {
            int var12 = var10 > var3.length ? var3.length : (int)var10;
            int var13 = var2.read(var3, 0, var12);
            var1.write(var3, 0, var13);
            var10 -= var13;
            this.l6(var2.n5(), this.c8);
            if (this.z6) {
               break;
            }
         }

         if ((this.a6 & 8) == 8) {
            byte var17 = 16;
            if (this.p3) {
               var17 += 8;
            }

            byte[] var14 = new byte[var17];
            var4.read(var14, 0, var17);
            if (this.p3 && this.e2.x8() == 0) {
               var1.write(var14, 0, 8);
               if (this.c8 > 4294967295L) {
                  throw new InvalidOperationException("ZIP64 is required");
               }

               var1.write(var14, 8, 4);
               if (this.s7 > 4294967295L) {
                  throw new InvalidOperationException("ZIP64 is required");
               }

               var1.write(var14, 16, 4);
               this.q0 -= 8;
            } else if (!this.p3 && this.e2.x8() == 2) {
               byte[] var15 = new byte[4];
               var1.write(var14, 0, 8);
               var1.write(var14, 8, 4);
               var1.write(var15, 0, 4);
               var1.write(var14, 12, 4);
               var1.write(var15, 0, 4);
               this.q0 += 8;
            } else {
               var1.write(var14, 0, var17);
            }
         }
      }

      this.a3 = this.t4 + this.t2 + this.q0;
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1, t2 var2) {
      byte[] var3 = new byte[this.y1()];
      this.e2.n5(this.z1);
      if (this.a3 == 0L) {
         this.a3 = this.t4 + this.t2 + this.q0;
      }

      c8 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, c8.class);
      this.z1 = var4 != null ? var4.n5() : var1.getPosition();
      long var5 = this.a3;

      while (var5 > 0L) {
         int var7 = var5 > var3.length ? var3.length : (int)var5;
         int var8 = var2.read(var3, 0, var7);
         var1.write(var3, 0, var8);
         var5 -= var8;
         this.l6(var2.n5(), this.a3);
         if (this.z6) {
            break;
         }
      }
   }
}
