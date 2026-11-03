package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class v3 extends q0 implements com.aspose.slides.internal.b8u.m3 {
   private final com.aspose.slides.internal.z0k.t4 l6;
   private boolean k5;
   protected final long n5;
   private final Object u3 = new Object();
   private static Object a6 = new Object();

   public v3(com.aspose.slides.internal.z0k.t4 var1) {
      this(var1, false);
   }

   public v3(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this(var1, var2, false);
   }

   protected v3(com.aspose.slides.internal.z0k.t4 var1, boolean var2, boolean var3) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      synchronized (a6) {
         this.k5 = var2;
         this.n5 = var1.getPosition();
         this.l6 = com.aspose.slides.internal.v2r.l6.n5(
            com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.b8u.m3.class) ? var1 : i9.n5().n5(var1, var3)
         );
      }
   }

   public v3(com.aspose.slides.internal.z0k.t4 var1, long var2, boolean var4) {
      this(var1, var2, var4, false);
   }

   v3(com.aspose.slides.internal.z0k.t4 var1, long var2, boolean var4, boolean var5) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      synchronized (a6) {
         if (var2 >= 0L && (var2 == 0L || var2 < var1.getLength())) {
            this.k5 = var4;
            this.n5 = var2;
            this.l6 = com.aspose.slides.internal.v2r.l6.n5(
               com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.b8u.m3.class) ? var1 : i9.n5().n5(var1, var5)
            );
         } else {
            throw new ArgumentOutOfRangeException("startPosition");
         }
      }
   }

   @Override
   public Object n5() {
      this.s7();
      return j4.n5(this.k5(), this.u3);
   }

   public long l6() {
      this.s7();
      return this.l6.getPosition() - this.n5;
   }

   public void n5(long var1) {
      this.s7();
      this.l6.setPosition(var1 + this.n5);
   }

   public com.aspose.slides.internal.z0k.t4 k5() {
      this.s7();
      return this.l6;
   }

   public boolean e2() {
      this.s7();
      return this.k5;
   }

   public long u3() {
      this.s7();
      return this.l6.getLength() - this.n5;
   }

   public boolean u9() {
      this.s7();
      return this.l6.canSeek();
   }

   public void n5(byte[] var1) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("bytes");
      }

      this.l6.write(var1, 0, var1.length);
   }

   public void n5(byte var1) {
      this.s7();
      this.l6.writeByte(var1);
   }

   public int l6(byte[] var1) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("bytes");
      } else {
         return this.l6.read(var1, 0, var1.length);
      }
   }

   public byte[] h0() {
      this.s7();
      return com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.v2r.l6.class).k5();
   }

   public byte[] n5(long var1, long var3) {
      this.s7();
      if (var1 < this.u3() && var1 >= 0L) {
         if (var3 > this.u3()) {
            throw new ArgumentOutOfRangeException("bytesCount", "The stream does not contain so many bytes.");
         }

         if (var3 + var1 > this.u3() && var3 > 0L) {
            throw new ArgumentException("Reading so many bytes will cause passing the stream end.");
         }

         if (this.l6.canSeek()) {
            this.n5(var1);
         } else if (this.l6() != var1) {
            throw new com.aspose.slides.internal.z3b.k5("Cannot seek to the desired position. The stream does not support seeking.");
         }

         byte[] var5 = new byte[(int)var3];
         long var6 = 0L;
         byte[] var8 = new byte[4096];

         while (var3 > 0L) {
            int var9 = (int)q1.k5(var8.length, var3);
            if (this.l6.read(var8, 0, var9) != var9) {
               throw new com.aspose.slides.internal.z3b.k5(
                  d1.n5(new String[]{"Copy operation cannot complete. Cannot read ", com.aspose.slides.ms.System.a3.l6(var9), " bytes."})
               );
            }

            System.arraycopy(var8, 0, var5, (int)var6, var9);
            var6 += var9;
            var3 -= var9;
         }

         return var5;
      } else {
         throw new ArgumentOutOfRangeException("position", "The starting position is out of stream bounds.");
      }
   }

   public int n5(byte[] var1, int var2, int var3) {
      this.s7();
      return this.l6.read(var1, var2, var3);
   }

   public int x8() {
      this.s7();
      return this.l6.readByte();
   }

   public long n5(long var1, int var3) {
      this.s7();
      switch (var3) {
         case 0:
            this.l6.seek(var1 + this.n5, 0);
            break;
         case 1:
            this.l6.seek(var1, 1);
            break;
         case 2:
            this.l6.seek(var1, 2);
      }

      return this.l6();
   }

   public void n3() {
      this.s7();
      this.l6.seek(this.n5, 0);
   }

   public void l6(byte[] var1, int var2, int var3) {
      this.s7();
      this.l6.write(var1, var2, var3);
   }

   public void n5(boolean var1) {
      this.k5 = var1;
   }

   protected void t9() {
   }

   protected void z1() {
   }

   @Override
   protected void a6() {
      try {
         this.y4();
      } finally {
         super.a6();
      }
   }

   protected void y4() {
      if (this.k5) {
         this.z1();

         try {
            j4 var1 = com.aspose.slides.internal.v6g.k5.n5(this.l6, j4.class);
            if (var1 == null || !var1.u3()) {
               this.l6.dispose();
               return;
            }
         } finally {
            this.t9();
         }
      }
   }
}
