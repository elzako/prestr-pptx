package com.aspose.slides.internal.m9;

import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.internal.z0k.m3;

public class k5 {
   private long n5;
   private boolean l6;
   private m3 k5;

   public k5(m3 var1) {
      this.k5 = var1;
   }

   public k5(m3 var1, int var2) {
      this(var1);
      this.n5 = var2;
      this.l6 = true;
   }

   public final m3 n5() {
      return this.k5;
   }

   public final int l6() {
      if (this.l6 && this.k5.n5().getPosition() >= this.n5) {
         return -1;
      }

      byte var1 = (byte)this.n5().n5().readByte();
      return var1 & 0xFF;
   }

   public final long k5() {
      return this.k5.n5().getPosition();
   }

   public final int u3() {
      return 65535 & (this.l6() << 8 | this.l6());
   }

   public final long a6() {
      return 4294967295L & this.h0();
   }

   public final int u9() {
      long var1 = this.a6();
      if ((var1 & 2147483648L) == 2147483648L) {
         throw new ArithmeticException("Long value too large to fit into an integer.");
      } else {
         return (int)((int)var1 & 2147483647L & 4294967295L);
      }
   }

   public final int h0() {
      return this.l6() << 24 | this.l6() << 16 | this.l6() << 8 | this.l6();
   }

   public final int c8() {
      return this.h0();
   }

   public final long n5(long var1) {
      this.n5().n5().setPosition(this.n5().n5().getPosition() + var1);
      return var1;
   }
}
