package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.j3;

@j3
public class j5 extends a0 {
   private com.aspose.slides.internal.l7h.j5 a6;
   private t4 u9;
   private byte[] h0;
   private char[] c8;
   private int t2;
   private int s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   public static j5 n5 = new j5(t4.Null, com.aspose.slides.internal.l7h.j5.m1(), 1);

   public j5(t4 var1) {
      this(var1, com.aspose.slides.internal.l7h.j5.m1(), 1024);
   }

   public j5(t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      this(var1, var2, 1024);
   }

   void n5(com.aspose.slides.internal.l7h.j5 var1, int var2) {
      this.a6 = var1;
      this.s7 = this.t2 = 0;
      int var3 = Math.max(var2, 256);
      this.c8 = new char[var3];
      this.h0 = new byte[var1.n5(var3)];
      if (this.u9.canSeek() && this.u9.getPosition() > 0L) {
         this.y4 = true;
      }
   }

   public j5(t4 var1, com.aspose.slides.internal.l7h.j5 var2, int var3) {
      if (null == var1) {
         throw new ArgumentNullException("stream");
      }

      if (null == var2) {
         throw new ArgumentNullException("encoding");
      }

      if (var3 <= 0) {
         throw new ArgumentOutOfRangeException("bufferSize");
      }

      if (!var1.canWrite()) {
         throw new ArgumentException("Can not write to stream");
      }

      this.u9 = var1;
      this.n5(var2, var3);
   }

   public j5(String var1) {
      this(var1, false, com.aspose.slides.internal.l7h.j5.m1(), 4096);
   }

   public j5(String var1, boolean var2) {
      this(var1, var2, com.aspose.slides.internal.l7h.j5.m1(), 4096);
   }

   public j5(String var1, boolean var2, com.aspose.slides.internal.l7h.j5 var3) {
      this(var1, var2, var3, 4096);
   }

   public j5(String var1, boolean var2, com.aspose.slides.internal.l7h.j5 var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (null == var3) {
         throw new ArgumentNullException("encoding");
      }

      if (var4 <= 0) {
         throw new ArgumentOutOfRangeException("bufferSize");
      }

      byte var5;
      if (var2) {
         var5 = 6;
      } else {
         var5 = 2;
      }

      this.u9 = new n3(var1, var5, 2, 1);
      if (var2) {
         this.u9.setPosition(this.u9.getLength());
      } else {
         this.u9.setLength(0L);
      }

      this.n5(var3, var4);
   }

   public void n5(boolean var1) {
      this.x8 = var1;
      if (this.x8) {
         this.k5();
      }
   }

   public t4 n5() {
      return this.u9;
   }

   @Override
   public com.aspose.slides.internal.l7h.j5 l6() {
      return this.a6;
   }

   @Override
   protected void l6(boolean var1) {
      RuntimeException var2 = null;
      if (!this.n3 && var1 && this.u9 != null) {
         try {
            this.k5();
         } catch (RuntimeException var4) {
            var2 = var4;
         }

         this.n3 = true;

         try {
            this.u9.close();
         } catch (RuntimeException var5) {
            if (var2 == null) {
               var2 = var5;
            }
         }
      }

      this.u9 = null;
      this.h0 = null;
      this.a6 = null;
      this.c8 = null;
      if (var2 != null) {
         throw var2;
      }
   }

   @Override
   public void k5() {
      this.h0();
      this.u9();
      if (this.t2 > 0) {
         this.a6();
         this.u9.flush();
      }
   }

   private void a6() {
      if (!this.y4 && this.t2 > 0) {
         byte[] var1 = this.a6.c8();
         if (var1.length > 0) {
            this.u9.write(var1, 0, var1.length);
         }

         this.y4 = true;
      }

      this.u9.write(this.h0, 0, this.t2);
      this.t2 = 0;
   }

   private void u9() {
      if (this.t2 > 0) {
         this.a6();
      }

      if (this.s7 > 0) {
         int var1 = this.a6.n5(this.c8, 0, this.s7, this.h0, this.t2);
         this.t2 += var1;
         this.s7 = 0;
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
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

      this.h0();
      this.l6(var1, var2, var3);
      if (this.x8) {
         this.k5();
      }
   }

   private void l6(char[] var1, int var2, int var3) {
      while (var3 > 0) {
         int var4 = this.c8.length - this.s7;
         if (var4 == 0) {
            this.u9();
            var4 = this.c8.length;
         }

         if (var4 > var3) {
            var4 = var3;
         }

         com.aspose.slides.ms.System.y4.n5(var1, var2 * 2, this.c8, this.s7 * 2, var4 * 2);
         var3 -= var4;
         var2 += var4;
         this.s7 += var4;
      }
   }

   private void u3(String var1) {
      int var2 = var1.length();
      int var3 = 0;

      while (var2 > 0) {
         int var4 = this.c8.length - this.s7;
         if (var4 == 0) {
            this.u9();
            var4 = this.c8.length;
         }

         if (var4 > var2) {
            var4 = var2;
         }

         for (int var5 = 0; var5 < var4; var5++) {
            this.c8[var5 + this.s7] = var1.charAt(var5 + var3);
         }

         var2 -= var4;
         var3 += var4;
         this.s7 += var4;
      }
   }

   @Override
   public void n5(char var1) {
      this.h0();
      if (this.s7 >= this.c8.length) {
         this.u9();
      }

      this.c8[this.s7++] = var1;
      if (this.x8) {
         this.k5();
      }
   }

   @Override
   public void n5(char[] var1) {
      this.h0();
      if (var1 != null) {
         this.l6(var1, 0, var1.length);
      }

      if (this.x8) {
         this.k5();
      }
   }

   @Override
   public void n5(String var1) {
      this.h0();
      if (var1 != null) {
         this.u3(var1);
      }

      if (this.x8) {
         this.k5();
      }
   }

   @Override
   public void u3() {
      this.l6(true);
   }

   private void h0() {
      if (this.n3) {
         throw new ObjectDisposedException("StreamWriter");
      }
   }
}
