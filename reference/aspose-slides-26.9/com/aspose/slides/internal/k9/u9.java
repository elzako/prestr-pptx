package com.aspose.slides.internal.k9;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.ms.System.o0;

public final class u9 implements com.aspose.slides.internal.t4r.l6 {
   private t4 n5;
   private byte[] l6;
   private final String k5;
   private boolean u3;

   public u9(t4 var1, byte[] var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = this.h0();
   }

   public u9(byte[] var1) {
      this.l6 = var1;
      this.k5 = this.h0();
   }

   public u9(t4 var1) {
      this.n5 = var1;
      this.k5 = this.h0();
   }

   public u9(t4 var1, boolean var2) {
      this.n5 = var1;
      this.u3 = var2;
      this.k5 = this.h0();
   }

   public final boolean n5() {
      return this.u3;
   }

   public final boolean l6() {
      return this.n5 != null;
   }

   public final t4 k5() {
      if (!this.l6()) {
         throw new InvalidOperationException();
      } else {
         return this.n5;
      }
   }

   public final void n5(t4 var1) {
      this.n5 = var1;
   }

   public final boolean u3() {
      return this.l6 != null;
   }

   public final byte[] a6() {
      if (!this.u3()) {
         throw new InvalidOperationException();
      } else {
         return this.l6;
      }
   }

   public final String u9() {
      return this.k5;
   }

   private String h0() {
      return o0.l6().n5("N");
   }

   @Override
   public final long getWeight() {
      if (this.u3()) {
         return com.aspose.slides.internal.v6g.k5.h0(this.l6.length, 9);
      } else {
         return this.l6() ? com.aspose.slides.internal.v6g.k5.h0(this.n5.h0() * this.n5.e2(), 9) : 0L;
      }
   }
}
