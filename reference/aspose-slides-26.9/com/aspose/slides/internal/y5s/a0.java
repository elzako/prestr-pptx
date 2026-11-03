package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentNullException;

public class a0 extends s7 {
   private final com.aspose.slides.internal.z0k.t4 n5;
   private final boolean l6;
   private final long k5;

   public a0(com.aspose.slides.internal.z0k.t4 var1) {
      this(var1, false);
   }

   public a0(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = this.n5.getPosition();
   }

   public long n5() {
      this.t2();
      return this.n5.getPosition() - this.k5;
   }

   public void n5(long var1) {
      this.t2();
      this.n5.setPosition(var1 + this.k5);
   }

   public com.aspose.slides.internal.z0k.t4 l6() {
      this.t2();
      return this.n5;
   }

   public long k5() {
      this.t2();
      return this.n5.getLength() - this.k5;
   }

   public void l6(long var1) {
      this.t2();
      this.n5.setLength(var1 + this.k5);
   }

   public void n5(byte[] var1) {
      this.t2();
      if (var1 == null) {
         throw new ArgumentNullException("bytes");
      }

      this.n5.write(var1, 0, var1.length);
   }

   public void n5(byte var1) {
      this.t2();
      this.n5.writeByte(var1);
   }

   public int l6(byte[] var1) {
      this.t2();
      if (var1 == null) {
         throw new ArgumentNullException("bytes");
      } else {
         return this.n5.read(var1, 0, var1.length);
      }
   }

   public int n5(byte[] var1, int var2, int var3) {
      this.t2();
      return this.n5.read(var1, var2, var3);
   }

   public int u3() {
      this.t2();
      return this.n5.readByte();
   }

   public long n5(long var1, int var3) {
      this.t2();
      if (var3 == 0) {
         this.n5.seek(var1 + this.k5, var3);
      } else {
         this.n5.seek(var1, var3);
      }

      return this.n5();
   }

   public void a6() {
      this.t2();
      this.n5.seek(this.k5, 0);
   }

   public void l6(byte[] var1, int var2, int var3) {
      this.t2();
      this.n5.write(var1, var2, var3);
   }

   protected void s7() {
   }

   protected void x8() {
   }

   @Override
   protected void u9() {
      try {
         this.n3();
      } finally {
         super.u9();
      }
   }

   private void n3() {
      if (this.l6) {
         this.x8();

         try {
            this.n5.dispose();
         } finally {
            this.s7();
         }
      }
   }
}
