package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class m3 extends y1 {
   private byte[] u9;
   static byte[] n5;
   static Object l6 = new Object();
   private char[] h0;
   static char[] k5;
   private com.aspose.slides.internal.l7h.j5 c8;
   private com.aspose.slides.internal.l7h.u9 t2;
   private a5 s7;
   private t4 x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;
   private boolean z1;
   public static m3 u3 = new m3$n5();
   private boolean t4;

   private m3() {
   }

   public m3(t4 var1) {
      this(var1, com.aspose.slides.internal.l7h.j5.z3(), true, 1024);
   }

   public m3(t4 var1, boolean var2) {
      this(var1, com.aspose.slides.internal.l7h.j5.z3(), var2, 1024);
   }

   public m3(t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      this(var1, var2, true, 1024);
   }

   public m3(t4 var1, com.aspose.slides.internal.l7h.j5 var2, boolean var3, int var4) {
      this.n5(var1, var2, var3, var4);
   }

   public m3(String var1) {
      this(var1, com.aspose.slides.internal.l7h.j5.z3(), true, 4096);
   }

   public m3(String var1, boolean var2) {
      this(var1, com.aspose.slides.internal.l7h.j5.z3(), var2, 4096);
   }

   public m3(String var1, com.aspose.slides.internal.l7h.j5 var2) {
      this(var1, var2, true, 4096);
   }

   public m3(String var1, com.aspose.slides.internal.l7h.j5 var2, boolean var3, int var4) {
      if (null == var1) {
         throw new ArgumentNullException("path");
      }

      if (d1.a6(d1.n5, var1)) {
         throw new ArgumentException("Empty path not allowed");
      }

      if (null == var2) {
         throw new ArgumentNullException("encoding");
      }

      if (var4 <= 0) {
         throw new ArgumentOutOfRangeException("bufferSize", "The minimum size of the buffer must be positive");
      }

      n3 var5 = com.aspose.slides.internal.z0k.u9.u3(var1);
      this.n5(var5, var2, var3, var4);
   }

   void n5(t4 var1, com.aspose.slides.internal.l7h.j5 var2, boolean var3, int var4) {
      if (null == var1) {
         throw new ArgumentNullException("stream");
      }

      if (null == var2) {
         throw new ArgumentNullException("encoding");
      }

      if (!var1.canRead()) {
         throw new ArgumentException("Cannot read stream");
      }

      if (var4 <= 0) {
         throw new ArgumentOutOfRangeException("bufferSize", "The minimum size of the buffer must be positive");
      }

      if (var4 < 128) {
         var4 = 128;
      }

      int var5 = var2.l6(var4) + 1;
      if (var4 <= 1024 && n5 != null) {
         synchronized (l6) {
            if (n5 != null) {
               this.u9 = n5;
               n5 = null;
            }

            if (k5 != null && var5 <= k5.length) {
               this.h0 = k5;
               k5 = null;
            }
         }
      }

      if (this.u9 == null) {
         this.u9 = new byte[var4];
      } else {
         com.aspose.slides.ms.System.u3.n5(this.u9, 0, var4);
      }

      if (this.h0 == null) {
         this.h0 = new char[var5];
      } else {
         com.aspose.slides.ms.System.u3.n5(this.h0, 0, var5);
      }

      this.x8 = var1;
      this.e2 = var4;
      this.c8 = var2;
      this.t2 = var2.l6();
      byte[] var9 = var2.c8();
      this.t9 = var3 ? 1 : 0;
      this.t9 += var9.length == 0 ? 0 : 2;
      this.n3 = 0;
      this.y4 = 0;
   }

   public t4 n5() {
      return this.x8;
   }

   public com.aspose.slides.internal.l7h.j5 l6() {
      if (this.c8 == null) {
         throw new RuntimeException();
      } else {
         return this.c8;
      }
   }

   public boolean k5() {
      return this.a6() < 0;
   }

   @Override
   public void u3() {
      this.n5(true);
   }

   @Override
   protected void n5(boolean var1) {
      if (var1 && this.x8 != null) {
         this.x8.close();
      }

      if (this.u9 != null && this.u9.length == 1024 && n5 == null) {
         synchronized (l6) {
            if (n5 == null) {
               n5 = this.u9;
            }

            if (k5 == null) {
               k5 = this.h0;
            }
         }
      }

      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = null;
      this.x8 = null;
      super.n5(var1);
   }

   private int n5(int var1) {
      if ((this.t9 & 2) == 2) {
         byte[] var2 = this.c8.c8();
         int var3 = var2.length;
         if (var1 >= var3) {
            int var4 = 0;

            while (var4 < var3 && this.u9[var4] == var2[var4]) {
               var4++;
            }

            if (var4 == var3) {
               return var4;
            }
         }
      }

      if ((this.t9 & 1) == 1) {
         if (var1 < 2) {
            return 0;
         }

         if ((this.u9[0] & 255) == 254 && (this.u9[1] & 255) == 255) {
            this.c8 = com.aspose.slides.internal.l7h.j5.t4();
            return 2;
         }

         if ((this.u9[0] & 255) == 255 && (this.u9[1] & 255) == 254 && var1 < 4) {
            this.c8 = com.aspose.slides.internal.l7h.j5.z1();
            return 2;
         }

         if (var1 < 3) {
            return 0;
         }

         if ((this.u9[0] & 255) == 239 && (this.u9[1] & 255) == 187 && (this.u9[2] & 255) == 191) {
            this.c8 = com.aspose.slides.internal.l7h.j5.z3();
            return 3;
         }

         if (var1 < 4) {
            if ((this.u9[0] & 255) == 255 && (this.u9[1] & 255) == 254 && this.u9[2] != 0) {
               this.c8 = com.aspose.slides.internal.l7h.j5.z1();
               return 2;
            }

            return 0;
         }

         if (this.u9[0] == 0 && this.u9[1] == 0 && (this.u9[2] & 255) == 254 && (this.u9[3] & 255) == 255) {
            this.c8 = com.aspose.slides.internal.l7h.j5.m3();
            return 4;
         }

         if ((this.u9[0] & 255) == 255 && (this.u9[1] & 255) == 254) {
            if (this.u9[2] == 0 && this.u9[3] == 0) {
               this.c8 = com.aspose.slides.internal.l7h.j5.k7();
               return 4;
            }

            this.c8 = com.aspose.slides.internal.l7h.j5.z1();
            return 2;
         }
      }

      return 0;
   }

   private int t2() {
      this.y4 = 0;
      int var1 = 0;
      this.n3 = 0;
      int var2 = 0;

      do {
         var1 = this.x8.read(this.u9, 0, this.e2);
         if (var1 <= 0) {
            return 0;
         }

         this.z1 = var1 < this.e2;
         if (this.t9 > 0) {
            com.aspose.slides.internal.l7h.j5 var3 = this.c8;
            var2 = this.n5(var1);
            if (var3 != this.c8) {
               int var4 = var3.l6(this.e2) + 1;
               int var5 = this.c8.l6(this.e2) + 1;
               if (var4 != var5) {
                  this.h0 = new char[var5];
               }

               this.t2 = this.c8.l6();
            }

            this.t9 = 0;
            var1 -= var2;
         }

         this.n3 = this.n3 + this.t2.n5(this.u9, var2, var1, this.h0, 0);
         var2 = 0;
      } while (this.n3 == 0);

      return this.n3;
   }

   @Override
   public int a6() {
      this.x8();
      return this.y4 >= this.n3 && this.t2() == 0 ? -1 : this.h0[this.y4];
   }

   @Override
   public int u9() {
      this.x8();
      return this.y4 >= this.n3 && this.t2() == 0 ? -1 : this.h0[this.y4++];
   }

   @Override
   public int n5(char[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("index", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "< 0");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("index + count > buffer.Length");
      }

      this.x8();
      int var4 = 0;

      while (var3 > 0) {
         if (this.y4 >= this.n3 && this.t2() == 0) {
            return var4 > 0 ? var4 : 0;
         }

         int var5 = Math.min(this.n3 - this.y4, var3);
         com.aspose.slides.ms.System.u3.n5(this.h0, this.y4, var1, var2, var5);
         this.y4 += var5;
         var2 += var5;
         var3 -= var5;
         var4 += var5;
         if (this.z1) {
            break;
         }
      }

      return var4;
   }

   private int s7() {
      char var1 = '\u0000';

      while (this.y4 < this.n3) {
         var1 = this.h0[this.y4];
         if (var1 == '\n') {
            this.y4++;
            int var2 = this.t4 ? this.y4 - 2 : this.y4 - 1;
            if (var2 < 0) {
               var2 = 0;
            }

            this.t4 = false;
            return var2;
         }

         if (this.t4) {
            this.t4 = false;
            if (this.y4 == 0) {
               return -2;
            }

            return this.y4 - 1;
         }

         this.t4 = var1 == '\r';
         this.y4++;
      }

      return -1;
   }

   @Override
   public String h0() {
      this.x8();
      if (this.y4 >= this.n3 && this.t2() == 0) {
         return null;
      }

      int var1 = this.y4;
      int var2 = this.s7();
      if (var2 < this.n3 && var2 >= var1) {
         return d1.n5(this.h0, var1, var2 - var1);
      }

      if (var2 == -2) {
         return this.s7.n5(0, this.s7.l6());
      }

      if (this.s7 == null) {
         this.s7 = new a5();
      } else {
         this.s7.n5(0);
      }

      do {
         if (this.t4) {
            this.n3--;
         }

         this.s7.n5(this.h0, var1, this.n3 - var1);
         if (this.t2() == 0) {
            if (this.s7.n5() > 32768) {
               a5 var5 = this.s7;
               this.s7 = null;
               return var5.n5(0, var5.l6());
            }

            return this.s7.n5(0, this.s7.l6());
         }

         var1 = this.y4;
         var2 = this.s7();
         if (var2 < this.n3 && var2 >= var1) {
            this.s7.n5(this.h0, var1, var2 - var1);
            if (this.s7.n5() > 32768) {
               a5 var3 = this.s7;
               this.s7 = null;
               return var3.n5(0, var3.l6());
            }

            return this.s7.n5(0, this.s7.l6());
         }
      } while (var2 != -2);

      return this.s7.n5(0, this.s7.l6());
   }

   @Override
   public String c8() {
      this.x8();
      a5 var1 = new a5();
      int var2 = this.h0.length;
      char[] var3 = new char[var2];

      int var4;
      while ((var4 = this.n5(var3, 0, var2)) > 0) {
         var1.n5(var3, 0, var4);
      }

      return var1.toString();
   }

   private void x8() {
      if (this.x8 == null) {
         throw new ObjectDisposedException("StreamReader", "Cannot read from a closed StreamReader");
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/z0k/z8;)V -> ()V
   m3(com.aspose.slides.internal.z0k.z8 recoveredArg0) {
      this();
   }
}
